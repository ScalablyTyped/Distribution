package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRunSortCriteria extends StObject {
  
  /**
    * The column to be used to sort the list of task runs for the machine learning transform.
    */
  var Column: TaskRunSortColumnType = js.native
  
  /**
    * The sort direction to be used to sort the list of task runs for the machine learning transform.
    */
  var SortDirection: SortDirectionType = js.native
}
object TaskRunSortCriteria {
  
  @scala.inline
  def apply(Column: TaskRunSortColumnType, SortDirection: SortDirectionType): TaskRunSortCriteria = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortDirection = SortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRunSortCriteria]
  }
  
  @scala.inline
  implicit class TaskRunSortCriteriaMutableBuilder[Self <: TaskRunSortCriteria] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: TaskRunSortColumnType): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = StObject.set(x, "SortDirection", value.asInstanceOf[js.Any])
  }
}
