package typings.awsSdkClientPinpointBrowser.typesRawEmailMod

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawEmail extends js.Object {
  /**
    * The raw data of the email.
    */
  var Data: js.UndefOr[ArrayBuffer | ArrayBufferView | String] = js.undefined
}

object RawEmail {
  @scala.inline
  def apply(Data: ArrayBuffer | ArrayBufferView | String = null): RawEmail = {
    val __obj = js.Dynamic.literal()
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawEmail]
  }
}

