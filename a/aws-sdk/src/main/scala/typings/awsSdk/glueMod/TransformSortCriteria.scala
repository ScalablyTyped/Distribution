package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformSortCriteria extends StObject {
  
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
  
  @scala.inline
  implicit class TransformSortCriteriaMutableBuilder[Self <: TransformSortCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: TransformSortColumnType): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = StObject.set(x, "SortDirection", value.asInstanceOf[js.Any])
  }
}
