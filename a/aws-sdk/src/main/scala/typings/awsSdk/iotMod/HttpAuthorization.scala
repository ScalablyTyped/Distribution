package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpAuthorization extends js.Object {
  /**
    * Use Sig V4 authorization. For more information, see Signature Version 4 Signing Process.
    */
  var sigv4: js.UndefOr[SigV4Authorization] = js.native
}

object HttpAuthorization {
  @scala.inline
  def apply(sigv4: SigV4Authorization = null): HttpAuthorization = {
    val __obj = js.Dynamic.literal()
    if (sigv4 != null) __obj.updateDynamic("sigv4")(sigv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAuthorization]
  }
}

