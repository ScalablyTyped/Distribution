package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Patch extends js.Object {
  /**
    * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
    */
  var Classification: js.UndefOr[PatchClassification] = js.native
  /**
    * The URL where more information can be obtained about the patch.
    */
  var ContentUrl: js.UndefOr[PatchContentUrl] = js.native
  /**
    * The description of the patch.
    */
  var Description: js.UndefOr[PatchDescription] = js.native
  /**
    * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
    */
  var Id: js.UndefOr[PatchId] = js.native
  /**
    * The Microsoft Knowledge Base ID of the patch.
    */
  var KbNumber: js.UndefOr[PatchKbNumber] = js.native
  /**
    * The language of the patch if it's language-specific.
    */
  var Language: js.UndefOr[PatchLanguage] = js.native
  /**
    * The ID of the MSRC bulletin the patch is related to.
    */
  var MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.native
  /**
    * The severity of the patch (for example Critical, Important, Moderate).
    */
  var MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.native
  /**
    * The specific product the patch is applicable for (for example, WindowsServer2016).
    */
  var Product: js.UndefOr[PatchProduct] = js.native
  /**
    * The product family the patch is applicable for (for example, Windows).
    */
  var ProductFamily: js.UndefOr[PatchProductFamily] = js.native
  /**
    * The date the patch was released.
    */
  var ReleaseDate: js.UndefOr[DateTime] = js.native
  /**
    * The title of the patch.
    */
  var Title: js.UndefOr[PatchTitle] = js.native
  /**
    * The name of the vendor providing the patch.
    */
  var Vendor: js.UndefOr[PatchVendor] = js.native
}

object Patch {
  @scala.inline
  def apply(): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patch]
  }
  @scala.inline
  implicit class PatchOps[Self <: Patch] (val x: Self) extends AnyVal {
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
    def setClassification(value: PatchClassification): Self = this.set("Classification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassification: Self = this.set("Classification", js.undefined)
    @scala.inline
    def setContentUrl(value: PatchContentUrl): Self = this.set("ContentUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentUrl: Self = this.set("ContentUrl", js.undefined)
    @scala.inline
    def setDescription(value: PatchDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setId(value: PatchId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setKbNumber(value: PatchKbNumber): Self = this.set("KbNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKbNumber: Self = this.set("KbNumber", js.undefined)
    @scala.inline
    def setLanguage(value: PatchLanguage): Self = this.set("Language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("Language", js.undefined)
    @scala.inline
    def setMsrcNumber(value: PatchMsrcNumber): Self = this.set("MsrcNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsrcNumber: Self = this.set("MsrcNumber", js.undefined)
    @scala.inline
    def setMsrcSeverity(value: PatchMsrcSeverity): Self = this.set("MsrcSeverity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMsrcSeverity: Self = this.set("MsrcSeverity", js.undefined)
    @scala.inline
    def setProduct(value: PatchProduct): Self = this.set("Product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("Product", js.undefined)
    @scala.inline
    def setProductFamily(value: PatchProductFamily): Self = this.set("ProductFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductFamily: Self = this.set("ProductFamily", js.undefined)
    @scala.inline
    def setReleaseDate(value: DateTime): Self = this.set("ReleaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseDate: Self = this.set("ReleaseDate", js.undefined)
    @scala.inline
    def setTitle(value: PatchTitle): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
    @scala.inline
    def setVendor(value: PatchVendor): Self = this.set("Vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("Vendor", js.undefined)
  }
  
}

