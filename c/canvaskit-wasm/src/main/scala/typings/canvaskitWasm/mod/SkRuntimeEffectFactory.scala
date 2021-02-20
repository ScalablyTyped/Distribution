package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkRuntimeEffectFactory extends StObject {
  
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
  implicit class SkRuntimeEffectFactoryMutableBuilder[Self <: SkRuntimeEffectFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMake(value: String => SkRuntimeEffect | Null): Self = StObject.set(x, "Make", js.Any.fromFunction1(value))
  }
}
