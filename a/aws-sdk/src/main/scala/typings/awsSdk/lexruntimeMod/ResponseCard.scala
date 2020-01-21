package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseCard extends js.Object {
  /**
    * The content type of the response.
    */
  var contentType: js.UndefOr[ContentType] = js.native
  /**
    * An array of attachment objects representing options.
    */
  var genericAttachments: js.UndefOr[genericAttachmentList] = js.native
  /**
    * The version of the response card format.
    */
  var version: js.UndefOr[String] = js.native
}

object ResponseCard {
  @scala.inline
  def apply(
    contentType: ContentType = null,
    genericAttachments: genericAttachmentList = null,
    version: String = null
  ): ResponseCard = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (genericAttachments != null) __obj.updateDynamic("genericAttachments")(genericAttachments.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCard]
  }
}

