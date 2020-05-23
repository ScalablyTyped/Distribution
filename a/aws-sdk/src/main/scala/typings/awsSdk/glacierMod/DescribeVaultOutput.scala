package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVaultOutput extends js.Object {
  /**
    * The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
    */
  var CreationDate: js.UndefOr[String] = js.native
  /**
    * The Universal Coordinated Time (UTC) date when Amazon S3 Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example 2012-03-20T17:03:43.221Z.
    */
  var LastInventoryDate: js.UndefOr[String] = js.native
  /**
    * The number of archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
    */
  var NumberOfArchives: js.UndefOr[long] = js.native
  /**
    * Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.
    */
  var SizeInBytes: js.UndefOr[long] = js.native
  /**
    * The Amazon Resource Name (ARN) of the vault.
    */
  var VaultARN: js.UndefOr[String] = js.native
  /**
    * The name of the vault.
    */
  var VaultName: js.UndefOr[String] = js.native
}

object DescribeVaultOutput {
  @scala.inline
  def apply(
    CreationDate: String = null,
    LastInventoryDate: String = null,
    NumberOfArchives: js.UndefOr[long] = js.undefined,
    SizeInBytes: js.UndefOr[long] = js.undefined,
    VaultARN: String = null,
    VaultName: String = null
  ): DescribeVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (LastInventoryDate != null) __obj.updateDynamic("LastInventoryDate")(LastInventoryDate.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfArchives)) __obj.updateDynamic("NumberOfArchives")(NumberOfArchives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SizeInBytes)) __obj.updateDynamic("SizeInBytes")(SizeInBytes.get.asInstanceOf[js.Any])
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN.asInstanceOf[js.Any])
    if (VaultName != null) __obj.updateDynamic("VaultName")(VaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVaultOutput]
  }
}

