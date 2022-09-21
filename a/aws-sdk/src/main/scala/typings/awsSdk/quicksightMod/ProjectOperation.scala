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
  
  inline def apply(ProjectedColumns: ProjectedColumnList): ProjectOperation = {
    val __obj = js.Dynamic.literal(ProjectedColumns = ProjectedColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectOperation]
  }
  
  extension [Self <: ProjectOperation](x: Self) {
    
    inline def setProjectedColumns(value: ProjectedColumnList): Self = StObject.set(x, "ProjectedColumns", value.asInstanceOf[js.Any])
    
    inline def setProjectedColumnsVarargs(value: String*): Self = StObject.set(x, "ProjectedColumns", js.Array(value*))
  }
}
