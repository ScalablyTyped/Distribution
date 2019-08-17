package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreRawEmailMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRawEmail extends _RawEmail {
  /**
    * The raw data of the email.
    */
  @JSName("Data")
  var Data__UnmarshalledRawEmail: js.UndefOr[Uint8Array] = js.undefined
}

object _UnmarshalledRawEmail {
  @scala.inline
  def apply(Data: Uint8Array = null): _UnmarshalledRawEmail = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data)
    __obj.asInstanceOf[_UnmarshalledRawEmail]
  }
}

