package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminServicesOptions extends StObject {
  
  var databaseFileInfoOptions: js.Array[ServiceOption]
  
  var databaseInfoOptions: js.Array[ServiceOption]
  
  var fileGroupInfoOptions: js.Array[ServiceOption]
}
object AdminServicesOptions {
  
  inline def apply(
    databaseFileInfoOptions: js.Array[ServiceOption],
    databaseInfoOptions: js.Array[ServiceOption],
    fileGroupInfoOptions: js.Array[ServiceOption]
  ): AdminServicesOptions = {
    val __obj = js.Dynamic.literal(databaseFileInfoOptions = databaseFileInfoOptions.asInstanceOf[js.Any], databaseInfoOptions = databaseInfoOptions.asInstanceOf[js.Any], fileGroupInfoOptions = fileGroupInfoOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesOptions]
  }
  
  extension [Self <: AdminServicesOptions](x: Self) {
    
    inline def setDatabaseFileInfoOptions(value: js.Array[ServiceOption]): Self = StObject.set(x, "databaseFileInfoOptions", value.asInstanceOf[js.Any])
    
    inline def setDatabaseFileInfoOptionsVarargs(value: ServiceOption*): Self = StObject.set(x, "databaseFileInfoOptions", js.Array(value :_*))
    
    inline def setDatabaseInfoOptions(value: js.Array[ServiceOption]): Self = StObject.set(x, "databaseInfoOptions", value.asInstanceOf[js.Any])
    
    inline def setDatabaseInfoOptionsVarargs(value: ServiceOption*): Self = StObject.set(x, "databaseInfoOptions", js.Array(value :_*))
    
    inline def setFileGroupInfoOptions(value: js.Array[ServiceOption]): Self = StObject.set(x, "fileGroupInfoOptions", value.asInstanceOf[js.Any])
    
    inline def setFileGroupInfoOptionsVarargs(value: ServiceOption*): Self = StObject.set(x, "fileGroupInfoOptions", js.Array(value :_*))
  }
}
