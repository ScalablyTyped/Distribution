package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaFunctionConfiguration extends js.Object {
  
  /**
    * The Amazon S3 bucket event for which to invoke the AWS Lambda function. For more information, see Supported Event Types in the Amazon Simple Storage Service Developer Guide.
    */
  var Events: EventList = js.native
  
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  
  var Id: js.UndefOr[NotificationId] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon S3 invokes when the specified event type occurs.
    */
  var LambdaFunctionArn: typings.awsSdk.s3Mod.LambdaFunctionArn = js.native
}
object LambdaFunctionConfiguration {
  
  @scala.inline
  def apply(Events: EventList, LambdaFunctionArn: LambdaFunctionArn): LambdaFunctionConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], LambdaFunctionArn = LambdaFunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaFunctionConfiguration]
  }
  
  @scala.inline
  implicit class LambdaFunctionConfigurationOps[Self <: LambdaFunctionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("Events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: EventList): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaFunctionArn(value: LambdaFunctionArn): Self = this.set("LambdaFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: NotificationConfigurationFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setId(value: NotificationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
}
