package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataRepositoryTaskResponse extends StObject {
  
  /**
    * The description of the data repository task that you just created.
    */
  var DataRepositoryTask: js.UndefOr[typings.awsSdk.fsxMod.DataRepositoryTask] = js.undefined
}
object CreateDataRepositoryTaskResponse {
  
  @scala.inline
  def apply(): CreateDataRepositoryTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataRepositoryTaskResponse]
  }
  
  @scala.inline
  implicit class CreateDataRepositoryTaskResponseMutableBuilder[Self <: CreateDataRepositoryTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataRepositoryTask(value: DataRepositoryTask): Self = StObject.set(x, "DataRepositoryTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRepositoryTaskUndefined: Self = StObject.set(x, "DataRepositoryTask", js.undefined)
  }
}
