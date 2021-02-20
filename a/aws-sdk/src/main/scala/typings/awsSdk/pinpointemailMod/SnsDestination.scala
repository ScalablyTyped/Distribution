package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish email events to. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: AmazonResourceName = js.native
}
object SnsDestination {
  
  @scala.inline
  def apply(TopicArn: AmazonResourceName): SnsDestination = {
    val __obj = js.Dynamic.literal(TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnsDestination]
  }
  
  @scala.inline
  implicit class SnsDestinationMutableBuilder[Self <: SnsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicArn(value: AmazonResourceName): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
