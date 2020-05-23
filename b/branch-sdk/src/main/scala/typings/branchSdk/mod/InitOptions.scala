package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends js.Object {
  var branch_match_id: js.UndefOr[String] = js.undefined
  var branch_view_id: js.UndefOr[String] = js.undefined
  var disable_entry_animation: js.UndefOr[Boolean] = js.undefined
  var disable_exit_animation: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[js.Object] = js.undefined
  var no_journeys: js.UndefOr[Boolean] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var retry_delay: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tracking_disabled: js.UndefOr[Boolean] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    branch_match_id: String = null,
    branch_view_id: String = null,
    disable_entry_animation: js.UndefOr[Boolean] = js.undefined,
    disable_exit_animation: js.UndefOr[Boolean] = js.undefined,
    metadata: js.Object = null,
    no_journeys: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    retries: js.UndefOr[Double] = js.undefined,
    retry_delay: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    tracking_disabled: js.UndefOr[Boolean] = js.undefined
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    if (branch_match_id != null) __obj.updateDynamic("branch_match_id")(branch_match_id.asInstanceOf[js.Any])
    if (branch_view_id != null) __obj.updateDynamic("branch_view_id")(branch_view_id.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_entry_animation)) __obj.updateDynamic("disable_entry_animation")(disable_entry_animation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_exit_animation)) __obj.updateDynamic("disable_exit_animation")(disable_exit_animation.get.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(no_journeys)) __obj.updateDynamic("no_journeys")(no_journeys.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_delay)) __obj.updateDynamic("retry_delay")(retry_delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tracking_disabled)) __obj.updateDynamic("tracking_disabled")(tracking_disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

