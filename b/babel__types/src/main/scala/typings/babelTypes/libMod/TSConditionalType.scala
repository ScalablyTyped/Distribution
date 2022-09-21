package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSConditionalType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var checkType: TSType
  
  var extendsType: TSType
  
  var falseType: TSType
  
  var trueType: TSType
  
  @JSName("type")
  var type_TSConditionalType: typings.babelTypes.babelTypesStrings.TSConditionalType
}
object TSConditionalType {
  
  inline def apply(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): TSConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[TSConditionalType]
  }
  
  extension [Self <: TSConditionalType](x: Self) {
    
    inline def setCheckType(value: TSType): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setExtendsType(value: TSType): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setFalseType(value: TSType): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setTrueType(value: TSType): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSConditionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
