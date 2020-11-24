package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDataSourceOutput extends js.Object {
  
  /**
    * A user-supplied ID that uniquely identifies the DataSource. This value should be identical to the value of the DataSourceID in the request.
    */
  var DataSourceId: js.UndefOr[EntityId] = js.native
}
object DeleteDataSourceOutput {
  
  @scala.inline
  def apply(): DeleteDataSourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDataSourceOutput]
  }
  
  @scala.inline
  implicit class DeleteDataSourceOutputOps[Self <: DeleteDataSourceOutput] (val x: Self) extends AnyVal {
    
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
    def setDataSourceId(value: EntityId): Self = this.set("DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceId: Self = this.set("DataSourceId", js.undefined)
  }
}
