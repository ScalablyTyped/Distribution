package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSConditionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSConditionalType_
  extends StObject
     with BaseNode
     with TSType
     with TypeScript {
  
  var checkType: TSType
  
  var extendsType: TSType
  
  var falseType: TSType
  
  var trueType: TSType
  
  @JSName("type")
  var type_TSConditionalType_ : TSConditionalType
}
object TSConditionalType_ {
  
  inline def apply(checkType: TSType, extendsType: TSType, falseType: TSType, trueType: TSType): TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSConditionalType")
    __obj.asInstanceOf[TSConditionalType_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSConditionalType_] (val x: Self) extends AnyVal {
    
    inline def setCheckType(value: TSType): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setExtendsType(value: TSType): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setFalseType(value: TSType): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setTrueType(value: TSType): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setType(value: TSConditionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
