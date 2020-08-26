package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwapEnvironmentCNAMEsMessage extends js.Object {
  /**
    * The ID of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentId with the DestinationEnvironmentId. 
    */
  var DestinationEnvironmentId: js.UndefOr[EnvironmentId] = js.native
  /**
    * The name of the destination environment.  Condition: You must specify at least the DestinationEnvironmentID or the DestinationEnvironmentName. You may also specify both. You must specify the SourceEnvironmentName with the DestinationEnvironmentName. 
    */
  var DestinationEnvironmentName: js.UndefOr[EnvironmentName] = js.native
  /**
    * The ID of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentId, you must specify the DestinationEnvironmentId. 
    */
  var SourceEnvironmentId: js.UndefOr[EnvironmentId] = js.native
  /**
    * The name of the source environment.  Condition: You must specify at least the SourceEnvironmentID or the SourceEnvironmentName. You may also specify both. If you specify the SourceEnvironmentName, you must specify the DestinationEnvironmentName. 
    */
  var SourceEnvironmentName: js.UndefOr[EnvironmentName] = js.native
}

object SwapEnvironmentCNAMEsMessage {
  @scala.inline
  def apply(): SwapEnvironmentCNAMEsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwapEnvironmentCNAMEsMessage]
  }
  @scala.inline
  implicit class SwapEnvironmentCNAMEsMessageOps[Self <: SwapEnvironmentCNAMEsMessage] (val x: Self) extends AnyVal {
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
    def setDestinationEnvironmentId(value: EnvironmentId): Self = this.set("DestinationEnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationEnvironmentId: Self = this.set("DestinationEnvironmentId", js.undefined)
    @scala.inline
    def setDestinationEnvironmentName(value: EnvironmentName): Self = this.set("DestinationEnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationEnvironmentName: Self = this.set("DestinationEnvironmentName", js.undefined)
    @scala.inline
    def setSourceEnvironmentId(value: EnvironmentId): Self = this.set("SourceEnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceEnvironmentId: Self = this.set("SourceEnvironmentId", js.undefined)
    @scala.inline
    def setSourceEnvironmentName(value: EnvironmentName): Self = this.set("SourceEnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceEnvironmentName: Self = this.set("SourceEnvironmentName", js.undefined)
  }
  
}

