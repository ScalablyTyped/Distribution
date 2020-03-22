package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaLoader extends js.Object {
  var metaObjects: js.Object
  /**
    * MetaLoader get metaObjects.
    *
    * @return  metaObjects
    * @api     public
    */
  def getMetaObjects(): js.Object
  /**
    * MetaLoader load metaObjects from meta path.
    *
    * @param   mpath
    * @return  meta objects
    * @api     public
    */
  def load(mpath: String): js.Object
  /**
    * MetaLoader set metaObject to beanName.
    *
    * @param   beanName
    * @param   metaObject
    * @api     public
    */
  def setMetaObject(beanName: String, metaObject: js.Object): Unit
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
}

