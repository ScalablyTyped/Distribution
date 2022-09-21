package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRelationalDatabaseParametersRequest extends StObject {
  
  /**
    * The database parameters to update.
    */
  var parameters: RelationalDatabaseParameterList
  
  /**
    * The name of your database for which to update parameters.
    */
  var relationalDatabaseName: ResourceName
}
object UpdateRelationalDatabaseParametersRequest {
  
  inline def apply(parameters: RelationalDatabaseParameterList, relationalDatabaseName: ResourceName): UpdateRelationalDatabaseParametersRequest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelationalDatabaseParametersRequest]
  }
  
  extension [Self <: UpdateRelationalDatabaseParametersRequest](x: Self) {
    
    inline def setParameters(value: RelationalDatabaseParameterList): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: RelationalDatabaseParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
  }
}
