package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShaderCodeNode extends StObject {
  
  var additionalDefineKey: js.UndefOr[String] = js.undefined
  
  var additionalDefineValue: js.UndefOr[String] = js.undefined
  
  var children: js.Array[ShaderCodeNode]
  
  def isValid(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean
  
  var line: String
  
  def process(preprocessors: org.scalablytyped.runtime.StringDictionary[String], options: ProcessingOptions): String
}
object ShaderCodeNode {
  
  inline def apply(
    children: js.Array[ShaderCodeNode],
    isValid: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    line: String,
    process: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String
  ): ShaderCodeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isValid = js.Any.fromFunction1(isValid), line = line.asInstanceOf[js.Any], process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[ShaderCodeNode]
  }
  
  extension [Self <: ShaderCodeNode](x: Self) {
    
    inline def setAdditionalDefineKey(value: String): Self = StObject.set(x, "additionalDefineKey", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDefineKeyUndefined: Self = StObject.set(x, "additionalDefineKey", js.undefined)
    
    inline def setAdditionalDefineValue(value: String): Self = StObject.set(x, "additionalDefineValue", value.asInstanceOf[js.Any])
    
    inline def setAdditionalDefineValueUndefined: Self = StObject.set(x, "additionalDefineValue", js.undefined)
    
    inline def setChildren(value: js.Array[ShaderCodeNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ShaderCodeNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setIsValid(value: org.scalablytyped.runtime.StringDictionary[String] => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setProcess(value: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
  }
}
