package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformSortCriteria extends js.Object {
  /**
    * The column to be used in the sorting criteria that are associated with the machine learning transform.
    */
  var Column: TransformSortColumnType = js.native
  /**
    * The sort direction to be used in the sorting criteria that are associated with the machine learning transform.
    */
  var SortDirection: SortDirectionType = js.native
}

object TransformSortCriteria {
  @scala.inline
  def apply(Column: TransformSortColumnType, SortDirection: SortDirectionType): TransformSortCriteria = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortDirection = SortDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformSortCriteria]
  }
}

