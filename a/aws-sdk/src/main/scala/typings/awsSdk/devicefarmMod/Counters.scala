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
  def apply(): Counters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Counters]
  }
  @scala.inline
  implicit class CountersOps[Self <: Counters] (val x: Self) extends AnyVal {
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
    def setErrored(value: Integer): Self = this.set("errored", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrored: Self = this.set("errored", js.undefined)
    @scala.inline
    def setFailed(value: Integer): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailed: Self = this.set("failed", js.undefined)
    @scala.inline
    def setPassed(value: Integer): Self = this.set("passed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassed: Self = this.set("passed", js.undefined)
    @scala.inline
    def setSkipped(value: Integer): Self = this.set("skipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipped: Self = this.set("skipped", js.undefined)
    @scala.inline
    def setStopped(value: Integer): Self = this.set("stopped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopped: Self = this.set("stopped", js.undefined)
    @scala.inline
    def setTotal(value: Integer): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
    @scala.inline
    def setWarned(value: Integer): Self = this.set("warned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarned: Self = this.set("warned", js.undefined)
  }
  
}

