package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendConnectionErrors extends js.Object {
  /**
    * 
    */
  var ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var OtherCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var TimeoutCount: js.UndefOr[NullableInteger] = js.native
  /**
    * 
    */
  var UnknownHostCount: js.UndefOr[NullableInteger] = js.native
}

object BackendConnectionErrors {
  @scala.inline
  def apply(): BackendConnectionErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendConnectionErrors]
  }
  @scala.inline
  implicit class BackendConnectionErrorsOps[Self <: BackendConnectionErrors] (val x: Self) extends AnyVal {
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
    def setConnectionRefusedCount(value: NullableInteger): Self = this.set("ConnectionRefusedCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionRefusedCount: Self = this.set("ConnectionRefusedCount", js.undefined)
    @scala.inline
    def setHTTPCode4XXCount(value: NullableInteger): Self = this.set("HTTPCode4XXCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTTPCode4XXCount: Self = this.set("HTTPCode4XXCount", js.undefined)
    @scala.inline
    def setHTTPCode5XXCount(value: NullableInteger): Self = this.set("HTTPCode5XXCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHTTPCode5XXCount: Self = this.set("HTTPCode5XXCount", js.undefined)
    @scala.inline
    def setOtherCount(value: NullableInteger): Self = this.set("OtherCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOtherCount: Self = this.set("OtherCount", js.undefined)
    @scala.inline
    def setTimeoutCount(value: NullableInteger): Self = this.set("TimeoutCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutCount: Self = this.set("TimeoutCount", js.undefined)
    @scala.inline
    def setUnknownHostCount(value: NullableInteger): Self = this.set("UnknownHostCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownHostCount: Self = this.set("UnknownHostCount", js.undefined)
  }
  
}

