package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Error extends js.Object {
  /**
    * _Code shape
    */
  var Code: js.UndefOr[String] = js.undefined
  /**
    * _ObjectKey shape
    */
  var Key: js.UndefOr[String] = js.undefined
  /**
    * _Message shape
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * _ObjectVersionId shape
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object _Error {
  @scala.inline
  def apply(Code: String = null, Key: String = null, Message: String = null, VersionId: String = null): _Error = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Error]
  }
}

