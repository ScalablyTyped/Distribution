package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceLoader extends js.Object {
  
  /**
    * ResourceLoader add context load path.
    *
    * @param   cpath context load path
    * @api     public
    */
  def addLoadPath(cpath: String): Unit = js.native
  
  /**
    * ResourceLoader get config loader.
    *
    * @return  config loader
    * @api     public
    */
  def getConfigLoader(): ConfigLoader = js.native
  
  /**
    * ResourceLoader load metaObjects from context path.
    *
    * @param   cpath context load path
    * @return  metaObjects
    * @api     public
    */
  def load(cpath: String): js.Object = js.native
  
  var loadPathMap: js.Object = js.native
  
  var loadPaths: String = js.native
}
object ResourceLoader {
  
  @scala.inline
  def apply(
    addLoadPath: String => Unit,
    getConfigLoader: () => ConfigLoader,
    load: String => js.Object,
    loadPathMap: js.Object,
    loadPaths: String
  ): ResourceLoader = {
    val __obj = js.Dynamic.literal(addLoadPath = js.Any.fromFunction1(addLoadPath), getConfigLoader = js.Any.fromFunction0(getConfigLoader), load = js.Any.fromFunction1(load), loadPathMap = loadPathMap.asInstanceOf[js.Any], loadPaths = loadPaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceLoader]
  }
  
  @scala.inline
  implicit class ResourceLoaderOps[Self <: ResourceLoader] (val x: Self) extends AnyVal {
    
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
    def setAddLoadPath(value: String => Unit): Self = this.set("addLoadPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConfigLoader(value: () => ConfigLoader): Self = this.set("getConfigLoader", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoad(value: String => js.Object): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadPathMap(value: js.Object): Self = this.set("loadPathMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadPaths(value: String): Self = this.set("loadPaths", value.asInstanceOf[js.Any])
  }
}
