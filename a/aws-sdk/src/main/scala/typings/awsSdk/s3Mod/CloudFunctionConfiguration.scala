package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudFunctionConfiguration extends StObject {
  
  /**
    * Lambda cloud function ARN that Amazon S3 can invoke when it detects events of the specified type.
    */
  var CloudFunction: js.UndefOr[typings.awsSdk.s3Mod.CloudFunction] = js.undefined
  
  var Event: js.UndefOr[typings.awsSdk.s3Mod.Event] = js.undefined
  
  /**
    * Bucket events for which to send notifications.
    */
  var Events: js.UndefOr[EventList] = js.undefined
  
  var Id: js.UndefOr[NotificationId] = js.undefined
  
  /**
    * The role supporting the invocation of the Lambda function
    */
  var InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.undefined
}
object CloudFunctionConfiguration {
  
  @scala.inline
  def apply(): CloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFunctionConfiguration]
  }
  
  @scala.inline
  implicit class CloudFunctionConfigurationMutableBuilder[Self <: CloudFunctionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudFunction(value: CloudFunction): Self = StObject.set(x, "CloudFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudFunctionUndefined: Self = StObject.set(x, "CloudFunction", js.undefined)
    
    @scala.inline
    def setEvent(value: Event): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
    
    @scala.inline
    def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInvocationRole(value: CloudFunctionInvocationRole): Self = StObject.set(x, "InvocationRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationRoleUndefined: Self = StObject.set(x, "InvocationRole", js.undefined)
  }
}
