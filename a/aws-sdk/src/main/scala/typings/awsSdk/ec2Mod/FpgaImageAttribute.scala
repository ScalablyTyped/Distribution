package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FpgaImageAttribute extends StObject {
  
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The load permissions.
    */
  var LoadPermissions: js.UndefOr[LoadPermissionList] = js.undefined
  
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
}
object FpgaImageAttribute {
  
  inline def apply(): FpgaImageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImageAttribute]
  }
  
  extension [Self <: FpgaImageAttribute](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFpgaImageId(value: String): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    inline def setFpgaImageIdUndefined: Self = StObject.set(x, "FpgaImageId", js.undefined)
    
    inline def setLoadPermissions(value: LoadPermissionList): Self = StObject.set(x, "LoadPermissions", value.asInstanceOf[js.Any])
    
    inline def setLoadPermissionsUndefined: Self = StObject.set(x, "LoadPermissions", js.undefined)
    
    inline def setLoadPermissionsVarargs(value: LoadPermission*): Self = StObject.set(x, "LoadPermissions", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
  }
}
