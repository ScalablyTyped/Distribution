package typings.babylonjs

import typings.babylonjs.shaderDefineExpressionMod.ShaderDefineExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shaderDefineIsDefinedOperatorMod {
  
  @JSImport("babylonjs/Engines/Processors/Expressions/Operators/shaderDefineIsDefinedOperator", "ShaderDefineIsDefinedOperator")
  @js.native
  class ShaderDefineIsDefinedOperator protected () extends ShaderDefineExpression {
    def this(define: String) = this()
    def this(define: String, not: Boolean) = this()
    
    var define: String = js.native
    
    var not: Boolean = js.native
  }
}
