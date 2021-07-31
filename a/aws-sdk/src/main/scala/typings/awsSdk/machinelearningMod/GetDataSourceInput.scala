package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataSourceInput extends StObject {
  
  /**
    * The ID assigned to the DataSource at creation.
    */
  var DataSourceId: EntityId
  
  /**
    * Specifies whether the GetDataSource operation should return DataSourceSchema. If true, DataSourceSchema is returned. If false, DataSourceSchema is not returned.
    */
  var Verbose: js.UndefOr[typings.awsSdk.machinelearningMod.Verbose] = js.undefined
}
object GetDataSourceInput {
  
  @scala.inline
  def apply(DataSourceId: EntityId): GetDataSourceInput = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataSourceInput]
  }
  
  @scala.inline
  implicit class GetDataSourceInputMutableBuilder[Self <: GetDataSourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: Verbose): Self = StObject.set(x, "Verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "Verbose", js.undefined)
  }
}
