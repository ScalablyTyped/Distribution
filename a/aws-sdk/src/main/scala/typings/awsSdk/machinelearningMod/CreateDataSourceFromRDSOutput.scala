package typings.awsSdk.machinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceFromRDSOutput extends StObject {
  
  /**
    * A user-supplied ID that uniquely identifies the datasource. This value should be identical to the value of the DataSourceID in the request. 
    */
  var DataSourceId: js.UndefOr[EntityId] = js.undefined
}
object CreateDataSourceFromRDSOutput {
  
  inline def apply(): CreateDataSourceFromRDSOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDataSourceFromRDSOutput]
  }
  
  extension [Self <: CreateDataSourceFromRDSOutput](x: Self) {
    
    inline def setDataSourceId(value: EntityId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "DataSourceId", js.undefined)
  }
}
