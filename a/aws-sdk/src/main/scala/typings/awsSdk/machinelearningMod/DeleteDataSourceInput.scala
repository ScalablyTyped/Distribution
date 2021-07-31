package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataSourceInput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the DataSource.
    */
  var DataSourceId: EntityId
}
object DeleteDataSourceInput {
  
  @scala.inline
  def apply(DataSourceId: EntityId): DeleteDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataSourceInput]
  }
  
  @scala.inline
  implicit class DeleteDataSourceInputMutableBuilder[Self <: DeleteDataSourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
  }
}
