package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSParameterProperty
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSParameterProperty_
  extends LVal
     with BaseNode {
  
  var accessibility: public | `private` | `protected` | Null = js.native
  
  var parameter: Identifier_ | AssignmentPattern_ = js.native
  
  var readonly: Boolean | Null = js.native
  
  @JSName("type")
  var type_TSParameterProperty_ : TSParameterProperty = js.native
}
object TSParameterProperty_ {
  
  @scala.inline
  def apply(parameter: Identifier_ | AssignmentPattern_, `type`: TSParameterProperty): TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParameterProperty_]
  }
  
  @scala.inline
  implicit class TSParameterProperty_MutableBuilder[Self <: TSParameterProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    @scala.inline
    def setParameter(value: Identifier_ | AssignmentPattern_): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    @scala.inline
    def setType(value: TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
