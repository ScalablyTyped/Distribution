package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerSessionCreatedParams extends js.Object {
  var ownerUri: String
  var sessionName: String
  var templateName: String
}

object ProfilerSessionCreatedParams {
  @scala.inline
  def apply(ownerUri: String, sessionName: String, templateName: String): ProfilerSessionCreatedParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], sessionName = sessionName.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionCreatedParams]
  }
}

