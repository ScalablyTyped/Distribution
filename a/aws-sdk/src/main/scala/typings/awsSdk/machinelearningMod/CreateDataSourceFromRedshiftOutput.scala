package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceFromRedshiftOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the DataSourceID in the request. 
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
}
object CreateDataSourceFromRedshiftOutput {
  
  @scala.inline
  def apply(): CreateDataSourceFromRedshiftOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSourceFromRedshiftOutput]
  }
  
  @scala.inline
  implicit class CreateDataSourceFromRedshiftOutputMutableBuilder[Self <: CreateDataSourceFromRedshiftOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
  }
}
