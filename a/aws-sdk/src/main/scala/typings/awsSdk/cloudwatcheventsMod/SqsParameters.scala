package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqsParameters extends js.Object {
  
  /**
    * The FIFO message group ID to use as the target.
    */
  var MessageGroupId: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.MessageGroupId] = js.native
}
object SqsParameters {
  
  @scala.inline
  def apply(): SqsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqsParameters]
  }
  
  @scala.inline
  implicit class SqsParametersOps[Self <: SqsParameters] (val x: Self) extends AnyVal {
    
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
    def setMessageGroupId(value: MessageGroupId): Self = this.set("MessageGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageGroupId: Self = this.set("MessageGroupId", js.undefined)
  }
}
