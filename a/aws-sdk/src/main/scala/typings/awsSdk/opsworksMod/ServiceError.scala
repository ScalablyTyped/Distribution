package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceError extends StObject {
  
  /**
    * When the error occurred.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * A message that describes the error.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The error ID.
    */
  var ServiceErrorId: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * The error type.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object ServiceError {
  
  @scala.inline
  def apply(): ServiceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceError]
  }
  
  @scala.inline
  implicit class ServiceErrorMutableBuilder[Self <: ServiceError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setServiceErrorId(value: String): Self = StObject.set(x, "ServiceErrorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceErrorIdUndefined: Self = StObject.set(x, "ServiceErrorId", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
