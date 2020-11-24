package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaResource extends js.Object {
  
  /**
    * The array of ARNs for S3Resource objects to trigger the LambdaResource objects associated with this job.
    */
  var EventTriggers: js.UndefOr[EventTriggerDefinitionList] = js.native
  
  /**
    * An Amazon Resource Name (ARN) that represents an AWS Lambda function to be triggered by PUT object actions on the associated local Amazon S3 resource.
    */
  var LambdaArn: js.UndefOr[ResourceARN] = js.native
}
object LambdaResource {
  
  @scala.inline
  def apply(): LambdaResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaResource]
  }
  
  @scala.inline
  implicit class LambdaResourceOps[Self <: LambdaResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventTriggersVarargs(value: EventTriggerDefinition*): Self = this.set("EventTriggers", js.Array(value :_*))
    
    @scala.inline
    def setEventTriggers(value: EventTriggerDefinitionList): Self = this.set("EventTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTriggers: Self = this.set("EventTriggers", js.undefined)
    
    @scala.inline
    def setLambdaArn(value: ResourceARN): Self = this.set("LambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaArn: Self = this.set("LambdaArn", js.undefined)
  }
}
