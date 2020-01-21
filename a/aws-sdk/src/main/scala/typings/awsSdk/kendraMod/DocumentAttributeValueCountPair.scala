package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttributeValueCountPair extends js.Object {
  /**
    * The number of documents in the response that have the attribute value for the key.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The value of the attribute. For example, "HR."
    */
  var DocumentAttributeValue: js.UndefOr[typings.awsSdk.kendraMod.DocumentAttributeValue] = js.native
}

object DocumentAttributeValueCountPair {
  @scala.inline
  def apply(Count: Int | Double = null, DocumentAttributeValue: DocumentAttributeValue = null): DocumentAttributeValueCountPair = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (DocumentAttributeValue != null) __obj.updateDynamic("DocumentAttributeValue")(DocumentAttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentAttributeValueCountPair]
  }
}

