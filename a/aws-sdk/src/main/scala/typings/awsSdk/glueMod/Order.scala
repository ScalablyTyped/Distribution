package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Order extends js.Object {
  /**
    * The name of the column.
    */
  var Column: NameString = js.native
  /**
    * Indicates that the column is sorted in ascending order (== 1), or in descending order (==0).
    */
  var SortOrder: IntegerFlag = js.native
}

object Order {
  @scala.inline
  def apply(Column: NameString, SortOrder: IntegerFlag): Order = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortOrder = SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

