package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVariableRequest extends StObject {
  
  /**
    * The new default value of the variable.
    */
  var defaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The new description.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the variable.
    */
  var name: String
  
  /**
    * The variable type. For more information see Variable types.
    */
  var variableType: js.UndefOr[String] = js.undefined
}
object UpdateVariableRequest {
  
  @scala.inline
  def apply(name: String): UpdateVariableRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVariableRequest]
  }
  
  @scala.inline
  implicit class UpdateVariableRequestMutableBuilder[Self <: UpdateVariableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
