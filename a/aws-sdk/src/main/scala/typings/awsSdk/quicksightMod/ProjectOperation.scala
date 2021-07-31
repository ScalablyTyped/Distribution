package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectOperation extends StObject {
  
  /**
    * Projected columns.
    */
  var ProjectedColumns: ProjectedColumnList
}
object ProjectOperation {
  
  @scala.inline
  def apply(ProjectedColumns: ProjectedColumnList): ProjectOperation = {
    val __obj = js.Dynamic.literal(ProjectedColumns = ProjectedColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectOperation]
  }
  
  @scala.inline
  implicit class ProjectOperationMutableBuilder[Self <: ProjectOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProjectedColumns(value: ProjectedColumnList): Self = StObject.set(x, "ProjectedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectedColumnsVarargs(value: String*): Self = StObject.set(x, "ProjectedColumns", js.Array(value :_*))
  }
}
