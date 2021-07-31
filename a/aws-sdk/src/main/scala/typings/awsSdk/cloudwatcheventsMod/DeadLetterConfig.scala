package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeadLetterConfig extends StObject {
  
  /**
    * The ARN of the SQS queue specified as the target for the dead-letter queue.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
}
object DeadLetterConfig {
  
  @scala.inline
  def apply(): DeadLetterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeadLetterConfig]
  }
  
  @scala.inline
  implicit class DeadLetterConfigMutableBuilder[Self <: DeadLetterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
