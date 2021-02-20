package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventSourceResponse extends StObject {
  
  /**
    * The ARN of the partner event source.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The name of the SaaS partner that created the event source.
    */
  var CreatedBy: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the event source was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time that the event source will expire if you do not create a matching event bus.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the partner event source.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The state of the event source. If it is ACTIVE, you have already created a matching event bus for this event source, and that event bus is active. If it is PENDING, either you haven't yet created a matching event bus, or that event bus is deactivated. If it is DELETED, you have created a matching event bus, but the event source has since been deleted.
    */
  var State: js.UndefOr[EventSourceState] = js.native
}
object DescribeEventSourceResponse {
  
  @scala.inline
  def apply(): DescribeEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventSourceResponse]
  }
  
  @scala.inline
  implicit class DescribeEventSourceResponseMutableBuilder[Self <: DescribeEventSourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setExpirationTime(value: Timestamp): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setState(value: EventSourceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
