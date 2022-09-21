package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionRequest extends StObject {
  
  /**
    * The ID of the Data Catalog in which the connection resides. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Allows you to retrieve the connection metadata without returning the password. For instance, the Glue console uses this flag to retrieve the connection, and does not display the password. Set this parameter when the caller might not have permission to use the KMS key to decrypt the password, but it does have permission to access the rest of the connection properties.
    */
  var HidePassword: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the connection definition to retrieve.
    */
  var Name: NameString
}
object GetConnectionRequest {
  
  inline def apply(Name: NameString): GetConnectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectionRequest]
  }
  
  extension [Self <: GetConnectionRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setHidePassword(value: Boolean): Self = StObject.set(x, "HidePassword", value.asInstanceOf[js.Any])
    
    inline def setHidePasswordUndefined: Self = StObject.set(x, "HidePassword", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
