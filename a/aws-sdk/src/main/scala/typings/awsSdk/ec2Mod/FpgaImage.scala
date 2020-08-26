package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FpgaImage extends js.Object {
  /**
    * The date and time the AFI was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * Indicates whether data retention support is enabled for the AFI.
    */
  var DataRetentionSupport: js.UndefOr[Boolean] = js.native
  /**
    * The description of the AFI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The global FPGA image identifier (AGFI ID).
    */
  var FpgaImageGlobalId: js.UndefOr[String] = js.native
  /**
    * The FPGA image identifier (AFI ID).
    */
  var FpgaImageId: js.UndefOr[String] = js.native
  /**
    * The name of the AFI.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
    */
  var OwnerAlias: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the AFI owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Information about the PCI bus.
    */
  var PciId: js.UndefOr[typings.awsSdk.ec2Mod.PciId] = js.native
  /**
    * The product codes for the AFI.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * Indicates whether the AFI is public.
    */
  var Public: js.UndefOr[Boolean] = js.native
  /**
    * The version of the AWS Shell that was used to create the bitstream.
    */
  var ShellVersion: js.UndefOr[String] = js.native
  /**
    * Information about the state of the AFI.
    */
  var State: js.UndefOr[FpgaImageState] = js.native
  /**
    * Any tags assigned to the AFI.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The time of the most recent update to the AFI.
    */
  var UpdateTime: js.UndefOr[DateTime] = js.native
}

object FpgaImage {
  @scala.inline
  def apply(): FpgaImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FpgaImage]
  }
  @scala.inline
  implicit class FpgaImageOps[Self <: FpgaImage] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: DateTime): Self = this.set("CreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("CreateTime", js.undefined)
    @scala.inline
    def setDataRetentionSupport(value: Boolean): Self = this.set("DataRetentionSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataRetentionSupport: Self = this.set("DataRetentionSupport", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setFpgaImageGlobalId(value: String): Self = this.set("FpgaImageGlobalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpgaImageGlobalId: Self = this.set("FpgaImageGlobalId", js.undefined)
    @scala.inline
    def setFpgaImageId(value: String): Self = this.set("FpgaImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFpgaImageId: Self = this.set("FpgaImageId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOwnerAlias(value: String): Self = this.set("OwnerAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAlias: Self = this.set("OwnerAlias", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setPciId(value: PciId): Self = this.set("PciId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePciId: Self = this.set("PciId", js.undefined)
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("Public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("Public", js.undefined)
    @scala.inline
    def setShellVersion(value: String): Self = this.set("ShellVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShellVersion: Self = this.set("ShellVersion", js.undefined)
    @scala.inline
    def setState(value: FpgaImageState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setUpdateTime(value: DateTime): Self = this.set("UpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("UpdateTime", js.undefined)
  }
  
}

