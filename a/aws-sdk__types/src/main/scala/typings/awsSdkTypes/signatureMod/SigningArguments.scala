package typings.awsSdkTypes.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningArguments extends js.Object {
  /**
    * The date and time to be used as signature metadata. This value should be
    * a Date object, a unix (epoch) timestamp, or a string that can be
    * understood by the JavaScript `Date` constructor.If not supplied, the
    * value returned by `new Date()` will be used.
    */
  var signingDate: js.UndefOr[DateInput] = js.native
}

object SigningArguments {
  @scala.inline
  def apply(): SigningArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningArguments]
  }
  @scala.inline
  implicit class SigningArgumentsOps[Self <: SigningArguments] (val x: Self) extends AnyVal {
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
    def setSigningDate(value: DateInput): Self = this.set("signingDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningDate: Self = this.set("signingDate", js.undefined)
  }
  
}

