package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRepositoryTaskFilter extends StObject {
  
  /**
    * Name of the task property to use in filtering the tasks returned in the response.   Use file-system-id to retrieve data repository tasks for specific file systems.   Use task-lifecycle to retrieve data repository tasks with one or more specific lifecycle states, as follows: CANCELED, EXECUTING, FAILED, PENDING, and SUCCEEDED.  
    */
  var Name: js.UndefOr[DataRepositoryTaskFilterName] = js.native
  
  /**
    * Use Values to include the specific file system IDs and task lifecycle states for the filters you are using.
    */
  var Values: js.UndefOr[DataRepositoryTaskFilterValues] = js.native
}
object DataRepositoryTaskFilter {
  
  @scala.inline
  def apply(): DataRepositoryTaskFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataRepositoryTaskFilter]
  }
  
  @scala.inline
  implicit class DataRepositoryTaskFilterMutableBuilder[Self <: DataRepositoryTaskFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DataRepositoryTaskFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValues(value: DataRepositoryTaskFilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DataRepositoryTaskFilterValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
