package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorRequest extends js.Object {
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.guarddutyMod.ClientToken] = js.native
  /**
    * An object that describes which data sources will be enabled for the detector.
    */
  var DataSources: js.UndefOr[DataSourceConfigurations] = js.native
  /**
    * A Boolean value that specifies whether the detector is to be enabled.
    */
  var Enable: Boolean = js.native
  /**
    * An enum value that specifies how frequently updated findings are exported.
    */
  var FindingPublishingFrequency: js.UndefOr[typings.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
  /**
    * The tags to be added to a new detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateDetectorRequest {
  @scala.inline
  def apply(Enable: Boolean): CreateDetectorRequest = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorRequest]
  }
  @scala.inline
  implicit class CreateDetectorRequestOps[Self <: CreateDetectorRequest] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("Enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: ClientToken): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDataSources(value: DataSourceConfigurations): Self = this.set("DataSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSources: Self = this.set("DataSources", js.undefined)
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = this.set("FindingPublishingFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingPublishingFrequency: Self = this.set("FindingPublishingFrequency", js.undefined)
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

