package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): DescribeVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVaultOutput]
  }
  
  @scala.inline
  implicit class DescribeVaultOutputOps[Self <: DescribeVaultOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setLastInventoryDate(value: String): Self = this.set("LastInventoryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastInventoryDate: Self = this.set("LastInventoryDate", js.undefined)
    
    @scala.inline
    def setNumberOfArchives(value: long): Self = this.set("NumberOfArchives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfArchives: Self = this.set("NumberOfArchives", js.undefined)
    
    @scala.inline
    def setSizeInBytes(value: long): Self = this.set("SizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeInBytes: Self = this.set("SizeInBytes", js.undefined)
    
    @scala.inline
    def setVaultARN(value: String): Self = this.set("VaultARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultARN: Self = this.set("VaultARN", js.undefined)
    
    @scala.inline
    def setVaultName(value: String): Self = this.set("VaultName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultName: Self = this.set("VaultName", js.undefined)
  }
}
