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
  def apply(
    Description: String = null,
    FpgaImageId: String = null,
    LoadPermissions: LoadPermissionList = null,
    Name: String = null,
    ProductCodes: ProductCodeList = null
  ): FpgaImageAttribute = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FpgaImageId != null) __obj.updateDynamic("FpgaImageId")(FpgaImageId.asInstanceOf[js.Any])
    if (LoadPermissions != null) __obj.updateDynamic("LoadPermissions")(LoadPermissions.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ProductCodes != null) __obj.updateDynamic("ProductCodes")(ProductCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FpgaImageAttribute]
  }
}

