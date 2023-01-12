package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialInfo extends StObject {
  
  var createDate: String
  
  var dateLastModified: String
  
  var id: Double
  
  var identity: String
  
  var name: String
  
  var providerName: String
}
object CredentialInfo {
  
  inline def apply(
    createDate: String,
    dateLastModified: String,
    id: Double,
    identity: String,
    name: String,
    providerName: String
  ): CredentialInfo = {
    val __obj = js.Dynamic.literal(createDate = createDate.asInstanceOf[js.Any], dateLastModified = dateLastModified.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredentialInfo] (val x: Self) extends AnyVal {
    
    inline def setCreateDate(value: String): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
    
    inline def setDateLastModified(value: String): Self = StObject.set(x, "dateLastModified", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
  }
}
