package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLoader extends js.Object {
  var loadPathMap: js.Object
  var loadPaths: String
  /**
    * ResourceLoader add context load path.
    *
    * @param   cpath context load path
    * @api     public
    */
  def addLoadPath(cpath: String): Unit
  /**
    * ResourceLoader get config loader.
    *
    * @return  config loader
    * @api     public
    */
  def getConfigLoader(): ConfigLoader
  /**
    * ResourceLoader load metaObjects from context path.
    *
    * @param   cpath context load path
    * @return  metaObjects
    * @api     public
    */
  def load(cpath: String): js.Object
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
}

