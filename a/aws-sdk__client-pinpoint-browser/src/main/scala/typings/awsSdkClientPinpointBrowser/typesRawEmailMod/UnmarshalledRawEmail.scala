package typings.awsSdkClientPinpointBrowser.typesRawEmailMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRawEmail extends RawEmail {
  /**
    * The raw data of the email.
    */
  @JSName("Data")
  var Data_UnmarshalledRawEmail: js.UndefOr[Uint8Array] = js.undefined
}

object UnmarshalledRawEmail {
  @scala.inline
  def apply(Data: Uint8Array = null): UnmarshalledRawEmail = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledRawEmail]
  }
}

