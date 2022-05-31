package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderDefineExpression extends StObject {
  
  def isTrue(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean
}
object ShaderDefineExpression {
  
  inline def apply(isTrue: org.scalablytyped.runtime.StringDictionary[String] => Boolean): ShaderDefineExpression = {
    val __obj = js.Dynamic.literal(isTrue = js.Any.fromFunction1(isTrue))
    __obj.asInstanceOf[ShaderDefineExpression]
  }
  
  extension [Self <: ShaderDefineExpression](x: Self) {
    
    inline def setIsTrue(value: org.scalablytyped.runtime.StringDictionary[String] => Boolean): Self = StObject.set(x, "isTrue", js.Any.fromFunction1(value))
  }
}
