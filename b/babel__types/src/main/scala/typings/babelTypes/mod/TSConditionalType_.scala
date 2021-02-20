package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSConditionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSConditionalType_
  extends TSType
     with BaseNode {
  
  var checkType: TSType = js.native
  
  var extendsType: TSType = js.native
  
  var falseType: TSType = js.native
  
  var trueType: TSType = js.native
  
  @JSName("type")
  var type_TSConditionalType_ : TSConditionalType = js.native
}
object TSConditionalType_ {
  
  @scala.inline
  def apply(
    checkType: TSType,
    extendsType: TSType,
    falseType: TSType,
    trueType: TSType,
    `type`: TSConditionalType
  ): TSConditionalType_ = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConditionalType_]
  }
  
  @scala.inline
  implicit class TSConditionalType_MutableBuilder[Self <: TSConditionalType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckType(value: TSType): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsType(value: TSType): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseType(value: TSType): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueType(value: TSType): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSConditionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
