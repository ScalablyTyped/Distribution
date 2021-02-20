package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialInfo extends StObject {
  
  var createDate: String = js.native
  
  var dateLastModified: String = js.native
  
  var id: Double = js.native
  
  var identity: String = js.native
  
  var name: String = js.native
  
  var providerName: String = js.native
}
object CredentialInfo {
  
  @scala.inline
  def apply(
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
  implicit class CredentialInfoMutableBuilder[Self <: CredentialInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateDate(value: String): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateLastModified(value: String): Self = StObject.set(x, "dateLastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
  }
}
