package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataRepositoryTaskFilter extends js.Object {
  
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
  implicit class DataRepositoryTaskFilterOps[Self <: DataRepositoryTaskFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: DataRepositoryTaskFilterName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DataRepositoryTaskFilterValue*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: DataRepositoryTaskFilterValues): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
