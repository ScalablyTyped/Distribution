package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentKeyValuesFilter extends js.Object {
  /**
    * The name of the filter key.
    */
  var Key: js.UndefOr[DocumentKeyValuesFilterKey] = js.native
  /**
    * The value for the filter key.
    */
  var Values: js.UndefOr[DocumentKeyValuesFilterValues] = js.native
}

object DocumentKeyValuesFilter {
  @scala.inline
  def apply(Key: DocumentKeyValuesFilterKey = null, Values: DocumentKeyValuesFilterValues = null): DocumentKeyValuesFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentKeyValuesFilter]
  }
}

