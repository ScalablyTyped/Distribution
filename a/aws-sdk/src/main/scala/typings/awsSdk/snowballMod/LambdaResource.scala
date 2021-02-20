package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaResource extends StObject {
  
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
  implicit class LambdaResourceMutableBuilder[Self <: LambdaResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTriggers(value: EventTriggerDefinitionList): Self = StObject.set(x, "EventTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTriggersUndefined: Self = StObject.set(x, "EventTriggers", js.undefined)
    
    @scala.inline
    def setEventTriggersVarargs(value: EventTriggerDefinition*): Self = StObject.set(x, "EventTriggers", js.Array(value :_*))
    
    @scala.inline
    def setLambdaArn(value: ResourceARN): Self = StObject.set(x, "LambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaArnUndefined: Self = StObject.set(x, "LambdaArn", js.undefined)
  }
}
