package typings.awsSdk.mediastoredataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Item extends js.Object {
  /**
    * The length of the item in bytes.
    */
  var ContentLength: js.UndefOr[NonNegativeLong] = js.native
  /**
    * The content type of the item.
    */
  var ContentType: js.UndefOr[typings.awsSdk.mediastoredataMod.ContentType] = js.native
  /**
    * The ETag that represents a unique instance of the item.
    */
  var ETag: js.UndefOr[typings.awsSdk.mediastoredataMod.ETag] = js.native
  /**
    * The date and time that the item was last modified.
    */
  var LastModified: js.UndefOr[TimeStamp] = js.native
  /**
    * The name of the item.
    */
  var Name: js.UndefOr[ItemName] = js.native
  /**
    * The item type (folder or object).
    */
  var Type: js.UndefOr[ItemType] = js.native
}

object Item {
  @scala.inline
  def apply(
    ContentLength: js.UndefOr[NonNegativeLong] = js.undefined,
    ContentType: ContentType = null,
    ETag: ETag = null,
    LastModified: TimeStamp = null,
    Name: ItemName = null,
    Type: ItemType = null
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ContentLength)) __obj.updateDynamic("ContentLength")(ContentLength.get.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

