package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDataRepositoryTaskResponse extends js.Object {
  
  /**
    * The description of the data repository task that you just created.
    */
  var DataRepositoryTask: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryTask] = js.native
}
object CreateDataRepositoryTaskResponse {
  
  @scala.inline
  def apply(): CreateDataRepositoryTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataRepositoryTaskResponse]
  }
  
  @scala.inline
  implicit class CreateDataRepositoryTaskResponseOps[Self <: CreateDataRepositoryTaskResponse] (val x: Self) extends AnyVal {
    
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
    def setDataRepositoryTask(value: DataRepositoryTask): Self = this.set("DataRepositoryTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataRepositoryTask: Self = this.set("DataRepositoryTask", js.undefined)
  }
}
