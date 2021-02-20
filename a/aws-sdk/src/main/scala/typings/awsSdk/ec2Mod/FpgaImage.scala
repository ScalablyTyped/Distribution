package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FpgaImage extends StObject {
  
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
  implicit class FpgaImageMutableBuilder[Self <: FpgaImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: DateTime): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    @scala.inline
    def setDataRetentionSupport(value: Boolean): Self = StObject.set(x, "DataRetentionSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataRetentionSupportUndefined: Self = StObject.set(x, "DataRetentionSupport", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setFpgaImageGlobalId(value: String): Self = StObject.set(x, "FpgaImageGlobalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageGlobalIdUndefined: Self = StObject.set(x, "FpgaImageGlobalId", js.undefined)
    
    @scala.inline
    def setFpgaImageId(value: String): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFpgaImageIdUndefined: Self = StObject.set(x, "FpgaImageId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwnerAlias(value: String): Self = StObject.set(x, "OwnerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAliasUndefined: Self = StObject.set(x, "OwnerAlias", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setPciId(value: PciId): Self = StObject.set(x, "PciId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPciIdUndefined: Self = StObject.set(x, "PciId", js.undefined)
    
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "Public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "Public", js.undefined)
    
    @scala.inline
    def setShellVersion(value: String): Self = StObject.set(x, "ShellVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellVersionUndefined: Self = StObject.set(x, "ShellVersion", js.undefined)
    
    @scala.inline
    def setState(value: FpgaImageState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: DateTime): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}
