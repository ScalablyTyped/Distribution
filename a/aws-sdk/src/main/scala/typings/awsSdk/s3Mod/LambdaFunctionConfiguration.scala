package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LambdaFunctionConfiguration extends StObject {
  
  /**
    * The Amazon S3 bucket event for which to invoke the AWS Lambda function. For more information, see Supported Event Types in the Amazon Simple Storage Service Developer Guide.
    */
  var Events: EventList
  
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.undefined
  
  var Id: js.UndefOr[NotificationId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
    */
  var LambdaFunctionArn: typings.awsSdk.s3Mod.LambdaFunctionArn
}
object LambdaFunctionConfiguration {
  
  @scala.inline
  def apply(Events: EventList, LambdaFunctionArn: LambdaFunctionArn): LambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionConfiguration]
  }
  
  @scala.inline
  implicit class LambdaFunctionConfigurationMutableBuilder[Self <: LambdaFunctionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: EventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "Events", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: NotificationConfigurationFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setId(value: NotificationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLambdaFunctionArn(value: LambdaFunctionArn): Self = StObject.set(x, "LambdaFunctionArn", value.asInstanceOf[js.Any])
  }
}
