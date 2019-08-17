package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreDescribeVaultOutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DescribeVaultOutput extends js.Object {
  /**
    * <p>The Universal Coordinated Time (UTC) date when the vault was created. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
    */
  var CreationDate: js.UndefOr[String] = js.undefined
  /**
    * <p>The Universal Coordinated Time (UTC) date when Amazon Glacier completed the last vault inventory. This value should be a string in the ISO 8601 date format, for example <code>2012-03-20T17:03:43.221Z</code>.</p>
    */
  var LastInventoryDate: js.UndefOr[String] = js.undefined
  /**
    * <p>The number of archives in the vault as of the last inventory date. This field will return <code>null</code> if an inventory has not yet run on the vault, for example if you just created the vault.</p>
    */
  var NumberOfArchives: js.UndefOr[Double] = js.undefined
  /**
    * <p>Total size, in bytes, of the archives in the vault as of the last inventory date. This field will return null if an inventory has not yet run on the vault, for example if you just created the vault.</p>
    */
  var SizeInBytes: js.UndefOr[Double] = js.undefined
  /**
    * <p>The Amazon Resource Name (ARN) of the vault.</p>
    */
  var VaultARN: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the vault.</p>
    */
  var VaultName: js.UndefOr[String] = js.undefined
}

object _DescribeVaultOutput {
  @scala.inline
  def apply(
    CreationDate: String = null,
    LastInventoryDate: String = null,
    NumberOfArchives: Int | Double = null,
    SizeInBytes: Int | Double = null,
    VaultARN: String = null,
    VaultName: String = null
  ): _DescribeVaultOutput = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (LastInventoryDate != null) __obj.updateDynamic("LastInventoryDate")(LastInventoryDate)
    if (NumberOfArchives != null) __obj.updateDynamic("NumberOfArchives")(NumberOfArchives.asInstanceOf[js.Any])
    if (SizeInBytes != null) __obj.updateDynamic("SizeInBytes")(SizeInBytes.asInstanceOf[js.Any])
    if (VaultARN != null) __obj.updateDynamic("VaultARN")(VaultARN)
    if (VaultName != null) __obj.updateDynamic("VaultName")(VaultName)
    __obj.asInstanceOf[_DescribeVaultOutput]
  }
}

