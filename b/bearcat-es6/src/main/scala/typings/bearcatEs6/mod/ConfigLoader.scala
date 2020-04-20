package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigLoader extends js.Object {
  /**
    * ConfigLoader get meta loader.
    *
    * @return  meta loader
    * @api     public
    */
  def getMetaLoader(): MetaLoader
  /**
    * ConfigLoader get recursive scan paths and metaObjects in context.json.
    *
    * @param   cpath context path
    * @param   scanPaths scan paths
    * @param   metaObjects
    * @api     public
    */
  def getRecursiveScanPath(cpath: String, scanPaths: js.Array[String], metaObjects: js.Object): Unit
  /**
    * ConfigLoader get meta objects from context path.
    *
    * @param   cpath context path
    * @return  meta objects
    * @api     public
    */
  def getResources(cpath: String): js.Object
}

object ConfigLoader {
  @scala.inline
  def apply(
    getMetaLoader: () => MetaLoader,
    getRecursiveScanPath: (String, js.Array[String], js.Object) => Unit,
    getResources: String => js.Object
  ): ConfigLoader = {
    val __obj = js.Dynamic.literal(getMetaLoader = js.Any.fromFunction0(getMetaLoader), getRecursiveScanPath = js.Any.fromFunction3(getRecursiveScanPath), getResources = js.Any.fromFunction1(getResources))
    __obj.asInstanceOf[ConfigLoader]
  }
}

