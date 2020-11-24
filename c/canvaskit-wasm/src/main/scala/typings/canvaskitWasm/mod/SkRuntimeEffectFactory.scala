package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkRuntimeEffectFactory extends js.Object {
  
  /**
    * Compiles a SkRuntimeEffect from the given shader code.
    * @param sksl - Source code for a shader written in SkSL
    */
  def Make(sksl: String): SkRuntimeEffect | Null = js.native
}
object SkRuntimeEffectFactory {
  
  @scala.inline
  def apply(Make: String => SkRuntimeEffect | Null): SkRuntimeEffectFactory = {
    val __obj = js.Dynamic.literal(Make = js.Any.fromFunction1(Make))
    __obj.asInstanceOf[SkRuntimeEffectFactory]
  }
  
  @scala.inline
  implicit class SkRuntimeEffectFactoryOps[Self <: SkRuntimeEffectFactory] (val x: Self) extends AnyVal {
    
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
    def setMake(value: String => SkRuntimeEffect | Null): Self = this.set("Make", js.Any.fromFunction1(value))
  }
}
