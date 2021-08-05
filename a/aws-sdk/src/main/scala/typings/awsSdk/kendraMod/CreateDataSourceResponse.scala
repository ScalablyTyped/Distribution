package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDataSourceResponse extends StObject {
  
  /**
    * A unique identifier for the data source.
    */
  var Id: DataSourceId
}
object CreateDataSourceResponse {
  
  inline def apply(Id: DataSourceId): CreateDataSourceResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataSourceResponse]
  }
  
  extension [Self <: CreateDataSourceResponse](x: Self) {
    
    inline def setId(value: DataSourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
