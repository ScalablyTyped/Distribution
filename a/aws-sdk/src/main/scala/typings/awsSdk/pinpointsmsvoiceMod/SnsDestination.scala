package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnsDestination extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic that you want to publish events to.
    */
  var TopicArn: js.UndefOr[String] = js.native
}
object SnsDestination {
  
  @scala.inline
  def apply(): SnsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnsDestination]
  }
  
  @scala.inline
  implicit class SnsDestinationMutableBuilder[Self <: SnsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
