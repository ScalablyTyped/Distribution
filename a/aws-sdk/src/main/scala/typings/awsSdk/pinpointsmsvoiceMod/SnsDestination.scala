package typings.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnsDestination extends js.Object {
  
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
  implicit class SnsDestinationOps[Self <: SnsDestination] (val x: Self) extends AnyVal {
    
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
    def setTopicArn(value: String): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicArn: Self = this.set("TopicArn", js.undefined)
  }
}
