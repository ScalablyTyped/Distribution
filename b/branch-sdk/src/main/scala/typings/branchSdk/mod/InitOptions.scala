package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  var branch_match_id: js.UndefOr[String] = js.native
  var branch_view_id: js.UndefOr[String] = js.native
  var disable_entry_animation: js.UndefOr[Boolean] = js.native
  var disable_exit_animation: js.UndefOr[Boolean] = js.native
  var metadata: js.UndefOr[js.Object] = js.native
  var no_journeys: js.UndefOr[Boolean] = js.native
  var nonce: js.UndefOr[String] = js.native
  var retries: js.UndefOr[Double] = js.native
  var retry_delay: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tracking_disabled: js.UndefOr[Boolean] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranch_match_id(value: String): Self = this.set("branch_match_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch_match_id: Self = this.set("branch_match_id", js.undefined)
    @scala.inline
    def setBranch_view_id(value: String): Self = this.set("branch_view_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch_view_id: Self = this.set("branch_view_id", js.undefined)
    @scala.inline
    def setDisable_entry_animation(value: Boolean): Self = this.set("disable_entry_animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_entry_animation: Self = this.set("disable_entry_animation", js.undefined)
    @scala.inline
    def setDisable_exit_animation(value: Boolean): Self = this.set("disable_exit_animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable_exit_animation: Self = this.set("disable_exit_animation", js.undefined)
    @scala.inline
    def setMetadata(value: js.Object): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setNo_journeys(value: Boolean): Self = this.set("no_journeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNo_journeys: Self = this.set("no_journeys", js.undefined)
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setRetry_delay(value: Double): Self = this.set("retry_delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_delay: Self = this.set("retry_delay", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTracking_disabled(value: Boolean): Self = this.set("tracking_disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTracking_disabled: Self = this.set("tracking_disabled", js.undefined)
  }
  
}

