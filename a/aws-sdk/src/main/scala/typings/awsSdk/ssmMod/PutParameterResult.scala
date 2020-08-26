package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutParameterResult extends js.Object {
  /**
    * The tier assigned to the parameter.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  /**
    * The new version number of a parameter. If you edit a parameter value, Parameter Store automatically creates a new version and assigns this new version a unique ID. You can reference a parameter version ID in API actions or in Systems Manager documents (SSM documents). By default, if you don't specify a specific version, the system returns the latest parameter value when a parameter is called.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
}

object PutParameterResult {
  @scala.inline
  def apply(): PutParameterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutParameterResult]
  }
  @scala.inline
  implicit class PutParameterResultOps[Self <: PutParameterResult] (val x: Self) extends AnyVal {
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
    def setTier(value: ParameterTier): Self = this.set("Tier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTier: Self = this.set("Tier", js.undefined)
    @scala.inline
    def setVersion(value: PSParameterVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

