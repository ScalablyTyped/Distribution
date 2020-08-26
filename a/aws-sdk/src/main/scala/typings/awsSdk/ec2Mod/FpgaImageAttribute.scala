package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaImageAttribute extends js.Object {
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
  implicit class FpgaImageAttributeOps[Self <: FpgaImageAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFpgaImageId(value: String): Self = this.set("FpgaImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpgaImageId: Self = this.set("FpgaImageId", js.undefined)
    @scala.inline
    def setLoadPermissionsVarargs(value: LoadPermission*): Self = this.set("LoadPermissions", js.Array(value :_*))
    @scala.inline
    def setLoadPermissions(value: LoadPermissionList): Self = this.set("LoadPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadPermissions: Self = this.set("LoadPermissions", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
  }
  
}

