package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericAttachment extends js.Object {
  /**
    * The URL of an attachment to the response card.
    */
  var attachmentLinkUrl: js.UndefOr[StringUrlWithLength] = js.native
  /**
    * The list of options to show to the user.
    */
  var buttons: js.UndefOr[listOfButtons] = js.native
  /**
    * The URL of an image that is displayed to the user.
    */
  var imageUrl: js.UndefOr[StringUrlWithLength] = js.native
  /**
    * The subtitle shown below the title.
    */
  var subTitle: js.UndefOr[StringWithLength] = js.native
  /**
    * The title of the option.
    */
  var title: js.UndefOr[StringWithLength] = js.native
}

object GenericAttachment {
  @scala.inline
  def apply(
    attachmentLinkUrl: StringUrlWithLength = null,
    buttons: listOfButtons = null,
    imageUrl: StringUrlWithLength = null,
    subTitle: StringWithLength = null,
    title: StringWithLength = null
  ): GenericAttachment = {
    val __obj = js.Dynamic.literal()
    if (attachmentLinkUrl != null) __obj.updateDynamic("attachmentLinkUrl")(attachmentLinkUrl.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericAttachment]
  }
}

