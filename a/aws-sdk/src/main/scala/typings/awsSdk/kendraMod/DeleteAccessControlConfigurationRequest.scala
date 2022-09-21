package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessControlConfigurationRequest extends StObject {
  
  /**
    * The identifier of the access control configuration you want to delete.
    */
  var Id: AccessControlConfigurationId
  
  /**
    * The identifier of the index for an access control configuration.
    */
  var IndexId: typings.awsSdk.kendraMod.IndexId
}
object DeleteAccessControlConfigurationRequest {
  
  inline def apply(Id: AccessControlConfigurationId, IndexId: IndexId): DeleteAccessControlConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessControlConfigurationRequest]
  }
  
  extension [Self <: DeleteAccessControlConfigurationRequest](x: Self) {
    
    inline def setId(value: AccessControlConfigurationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
  }
}
