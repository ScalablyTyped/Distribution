package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionList extends js.Object {
  /**
    * An array of field-level encryption items.
    */
  var Items: js.UndefOr[FieldLevelEncryptionSummaryList] = js.native
  /**
    * The maximum number of elements you want in the response body. 
    */
  var MaxItems: integer = js.native
  /**
    * If there are more elements to be listed, this element is present and contains the value that you can use for the Marker request parameter to continue listing your configurations where you left off.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * The number of field-level encryption items.
    */
  var Quantity: integer = js.native
}

object FieldLevelEncryptionList {
  @scala.inline
  def apply(
    MaxItems: integer,
    Quantity: integer,
    Items: FieldLevelEncryptionSummaryList = null,
    NextMarker: String = null
  ): FieldLevelEncryptionList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    if (Items != null) __obj.updateDynamic("Items")(Items.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionList]
  }
}

