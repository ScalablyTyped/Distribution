package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpgaImageAttribute extends StObject {
  
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: js.UndefOr[String] = js.native
  
  /**
    * The load permissions.
    */
  var LoadPermissions: js.UndefOr[LoadPermissionList] = js.native
  
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
}
object FpgaImageAttribute {
  
  @scala.inline
  def apply(): FpgaImageAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImageAttribute]
  }
  
  @scala.inline
  implicit class FpgaImageAttributeMutableBuilder[Self <: FpgaImageAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFpgaImageId(value: String): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageIdUndefined: Self = StObject.set(x, "FpgaImageId", js.undefined)
    
    @scala.inline
    def setLoadPermissions(value: LoadPermissionList): Self = StObject.set(x, "LoadPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadPermissionsUndefined: Self = StObject.set(x, "LoadPermissions", js.undefined)
    
    @scala.inline
    def setLoadPermissionsVarargs(value: LoadPermission*): Self = StObject.set(x, "LoadPermissions", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
  }
}
