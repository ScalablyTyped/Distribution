package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderCodeTestNode
  extends StObject
     with ShaderCodeNode {
  
  var testExpression: ShaderDefineExpression
}
object ShaderCodeTestNode {
  
  inline def apply(
    children: js.Array[ShaderCodeNode],
    isValid: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    line: String,
    process: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String,
    testExpression: ShaderDefineExpression
  ): ShaderCodeTestNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isValid = js.Any.fromFunction1(isValid), line = line.asInstanceOf[js.Any], process = js.Any.fromFunction2(process), testExpression = testExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderCodeTestNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShaderCodeTestNode] (val x: Self) extends AnyVal {
    
    inline def setTestExpression(value: ShaderDefineExpression): Self = StObject.set(x, "testExpression", value.asInstanceOf[js.Any])
  }
}
