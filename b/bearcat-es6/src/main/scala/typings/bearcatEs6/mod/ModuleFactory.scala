package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleFactory extends js.Object {
  var factoryMap: js.Object
  var moduleMap: js.Object
  def define(id: String, factory: js.Object): Unit
  def require(id: String): js.Any
}

object ModuleFactory {
  @scala.inline
  def apply(
    define: (String, js.Object) => Unit,
    factoryMap: js.Object,
    moduleMap: js.Object,
    require: String => js.Any
  ): ModuleFactory = {
    val __obj = js.Dynamic.literal(define = js.Any.fromFunction2(define), factoryMap = factoryMap.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], require = js.Any.fromFunction1(require))
  
    __obj.asInstanceOf[ModuleFactory]
  }
}

