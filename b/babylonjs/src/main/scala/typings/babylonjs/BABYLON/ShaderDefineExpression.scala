package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDefineExpression extends StObject {
  
  def isTrue(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
}
object ShaderDefineExpression {
  
  @scala.inline
  def apply(isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean): ShaderDefineExpression = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue))
    __obj.asInstanceOf[ShaderDefineExpression]
  }
  
  @scala.inline
  implicit class ShaderDefineExpressionMutableBuilder[Self <: ShaderDefineExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTrue(value: org.scalablytyped.runtime.StringDictionary[String] => Boolean): Self = StObject.set(x, "isTrue", js.Any.fromFunction1(value))
  }
}
