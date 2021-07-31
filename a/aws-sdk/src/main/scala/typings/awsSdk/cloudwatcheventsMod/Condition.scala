package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * Specifies the key for the condition. Currently the only supported key is aws:PrincipalOrgID.
    */
  var Key: String
  
  /**
    * Specifies the type of condition. Currently the only supported value is StringEquals.
    */
  var Type: String
  
  /**
    * Specifies the value for the key. Currently, this must be the ID of the organization.
    */
  var Value: String
}
object Condition {
  
  @scala.inline
  def apply(Key: String, Type: String, Value: String): Condition = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  
  @scala.inline
  implicit class ConditionMutableBuilder[Self <: Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
