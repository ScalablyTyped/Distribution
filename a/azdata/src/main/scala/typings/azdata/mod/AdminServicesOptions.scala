package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminServicesOptions extends StObject {
  
  var databaseFileInfoOptions: js.Array[ServiceOption] = js.native
  
  var databaseInfoOptions: js.Array[ServiceOption] = js.native
  
  var fileGroupInfoOptions: js.Array[ServiceOption] = js.native
}
object AdminServicesOptions {
  
  @scala.inline
  def apply(
    databaseFileInfoOptions: js.Array[ServiceOption],
    databaseInfoOptions: js.Array[ServiceOption],
    fileGroupInfoOptions: js.Array[ServiceOption]
  ): AdminServicesOptions = {
    val __obj = js.Dynamic.literal(databaseFileInfoOptions = databaseFileInfoOptions.asInstanceOf[js.Any], databaseInfoOptions = databaseInfoOptions.asInstanceOf[js.Any], fileGroupInfoOptions = fileGroupInfoOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminServicesOptions]
  }
  
  @scala.inline
  implicit class AdminServicesOptionsMutableBuilder[Self <: AdminServicesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseFileInfoOptions(value: js.Array[ServiceOption]): Self = StObject.set(x, "databaseFileInfoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseFileInfoOptionsVarargs(value: ServiceOption*): Self = StObject.set(x, "databaseFileInfoOptions", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseInfoOptions(value: js.Array[ServiceOption]): Self = StObject.set(x, "databaseInfoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseInfoOptionsVarargs(value: ServiceOption*): Self = StObject.set(x, "databaseInfoOptions", js.Array(value :_*))
    
    @scala.inline
    def setFileGroupInfoOptions(value: js.Array[ServiceOption]): Self = StObject.set(x, "fileGroupInfoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileGroupInfoOptionsVarargs(value: ServiceOption*): Self = StObject.set(x, "fileGroupInfoOptions", js.Array(value :_*))
  }
}
