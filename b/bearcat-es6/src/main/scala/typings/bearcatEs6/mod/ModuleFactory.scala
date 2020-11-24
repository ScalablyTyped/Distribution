package typings.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleFactory extends js.Object {
  
  def define(id: String, factory: js.Object): Unit = js.native
  
  var factoryMap: js.Object = js.native
  
  var moduleMap: js.Object = js.native
  
  def require(id: String): js.Any = js.native
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
  
  @scala.inline
  implicit class ModuleFactoryOps[Self <: ModuleFactory] (val x: Self) extends AnyVal {
    
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
    def setDefine(value: (String, js.Object) => Unit): Self = this.set("define", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFactoryMap(value: js.Object): Self = this.set("factoryMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleMap(value: js.Object): Self = this.set("moduleMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire(value: String => js.Any): Self = this.set("require", js.Any.fromFunction1(value))
  }
}
