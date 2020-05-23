package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Counters extends js.Object {
  /**
    * The number of errored entities.
    */
  var errored: js.UndefOr[Integer] = js.native
  /**
    * The number of failed entities.
    */
  var failed: js.UndefOr[Integer] = js.native
  /**
    * The number of passed entities.
    */
  var passed: js.UndefOr[Integer] = js.native
  /**
    * The number of skipped entities.
    */
  var skipped: js.UndefOr[Integer] = js.native
  /**
    * The number of stopped entities.
    */
  var stopped: js.UndefOr[Integer] = js.native
  /**
    * The total number of entities.
    */
  var total: js.UndefOr[Integer] = js.native
  /**
    * The number of warned entities.
    */
  var warned: js.UndefOr[Integer] = js.native
}

object Counters {
  @scala.inline
  def apply(
    errored: js.UndefOr[Integer] = js.undefined,
    failed: js.UndefOr[Integer] = js.undefined,
    passed: js.UndefOr[Integer] = js.undefined,
    skipped: js.UndefOr[Integer] = js.undefined,
    stopped: js.UndefOr[Integer] = js.undefined,
    total: js.UndefOr[Integer] = js.undefined,
    warned: js.UndefOr[Integer] = js.undefined
  ): Counters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errored)) __obj.updateDynamic("errored")(errored.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failed)) __obj.updateDynamic("failed")(failed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passed)) __obj.updateDynamic("passed")(passed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipped)) __obj.updateDynamic("skipped")(skipped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopped)) __obj.updateDynamic("stopped")(stopped.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warned)) __obj.updateDynamic("warned")(warned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counters]
  }
}

