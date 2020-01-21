package typings.awsSdk.worklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteCaSummary extends js.Object {
  /**
    * The time when the CA was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The name to display.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.worklinkMod.DisplayName] = js.native
  /**
    * A unique identifier for the CA.
    */
  var WebsiteCaId: js.UndefOr[Id] = js.native
}

object WebsiteCaSummary {
  @scala.inline
  def apply(CreatedTime: DateTime = null, DisplayName: DisplayName = null, WebsiteCaId: Id = null): WebsiteCaSummary = {
    val __obj = js.Dynamic.literal()
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (WebsiteCaId != null) __obj.updateDynamic("WebsiteCaId")(WebsiteCaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebsiteCaSummary]
  }
}

