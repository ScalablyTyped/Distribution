package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeadLetterConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon SQS queue or Amazon SNS topic.
    */
  var TargetArn: js.UndefOr[ResourceArn] = js.native
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
    def setTargetArn(value: ResourceArn): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
