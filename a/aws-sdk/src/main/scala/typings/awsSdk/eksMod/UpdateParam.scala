package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateParam extends js.Object {
  /**
    * The keys associated with an update request.
    */
  var `type`: js.UndefOr[UpdateParamType] = js.native
  /**
    * The value of the keys submitted as part of an update request.
    */
  var value: js.UndefOr[String] = js.native
}

object UpdateParam {
  @scala.inline
  def apply(`type`: UpdateParamType = null, value: String = null): UpdateParam = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateParam]
  }
}

