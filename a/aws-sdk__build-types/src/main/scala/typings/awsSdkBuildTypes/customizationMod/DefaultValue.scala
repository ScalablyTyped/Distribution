package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultValue extends StObject {
  
  /**
    * A string containing a valid TypeScript expression that evaluates to a
    * valid value for this configuration property.
    *
    * If an imported type is used, it must be referred to as a property of the
    * imported package.
    */
  var expression: String = js.native
  
  var `type`: value = js.native
}
object DefaultValue {
  
  @scala.inline
  def apply(expression: String, `type`: value): DefaultValue = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
