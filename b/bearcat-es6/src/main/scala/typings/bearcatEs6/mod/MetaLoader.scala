package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaLoader extends js.Object {
  var metaObjects: js.Object = js.native
  /**
    * MetaLoader get metaObjects.
    *
    * @return  metaObjects
    * @api     public
    */
  def getMetaObjects(): js.Object = js.native
  /**
    * MetaLoader load metaObjects from meta path.
    *
    * @param   mpath
    * @return  meta objects
    * @api     public
    */
  def load(mpath: String): js.Object = js.native
  /**
    * MetaLoader set metaObject to beanName.
    *
    * @param   beanName
    * @param   metaObject
    * @api     public
    */
  def setMetaObject(beanName: String, metaObject: js.Object): Unit = js.native
}

object MetaLoader {
  @scala.inline
  def apply(
    getMetaObjects: () => js.Object,
    load: String => js.Object,
    metaObjects: js.Object,
    setMetaObject: (String, js.Object) => Unit
  ): MetaLoader = {
    val __obj = js.Dynamic.literal(getMetaObjects = js.Any.fromFunction0(getMetaObjects), load = js.Any.fromFunction1(load), metaObjects = metaObjects.asInstanceOf[js.Any], setMetaObject = js.Any.fromFunction2(setMetaObject))
    __obj.asInstanceOf[MetaLoader]
  }
  @scala.inline
  implicit class MetaLoaderOps[Self <: MetaLoader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetMetaObjects(value: () => js.Object): Self = this.set("getMetaObjects", js.Any.fromFunction0(value))
    @scala.inline
    def setLoad(value: String => js.Object): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def setMetaObjects(value: js.Object): Self = this.set("metaObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetMetaObject(value: (String, js.Object) => Unit): Self = this.set("setMetaObject", js.Any.fromFunction2(value))
  }
  
}

