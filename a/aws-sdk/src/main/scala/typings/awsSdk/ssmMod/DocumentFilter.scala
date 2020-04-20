package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var key: DocumentFilterKey = js.native
  /**
    * The value of the filter.
    */
  var value: DocumentFilterValue = js.native
}

object DocumentFilter {
  @scala.inline
  def apply(key: DocumentFilterKey, value: DocumentFilterValue): DocumentFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFilter]
  }
}

