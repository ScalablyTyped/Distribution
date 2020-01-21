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
  def apply(
    Classification: PatchClassification = null,
    ContentUrl: PatchContentUrl = null,
    Description: PatchDescription = null,
    Id: PatchId = null,
    KbNumber: PatchKbNumber = null,
    Language: PatchLanguage = null,
    MsrcNumber: PatchMsrcNumber = null,
    MsrcSeverity: PatchMsrcSeverity = null,
    Product: PatchProduct = null,
    ProductFamily: PatchProductFamily = null,
    ReleaseDate: DateTime = null,
    Title: PatchTitle = null,
    Vendor: PatchVendor = null
  ): Patch = {
    val __obj = js.Dynamic.literal()
    if (Classification != null) __obj.updateDynamic("Classification")(Classification.asInstanceOf[js.Any])
    if (ContentUrl != null) __obj.updateDynamic("ContentUrl")(ContentUrl.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (KbNumber != null) __obj.updateDynamic("KbNumber")(KbNumber.asInstanceOf[js.Any])
    if (Language != null) __obj.updateDynamic("Language")(Language.asInstanceOf[js.Any])
    if (MsrcNumber != null) __obj.updateDynamic("MsrcNumber")(MsrcNumber.asInstanceOf[js.Any])
    if (MsrcSeverity != null) __obj.updateDynamic("MsrcSeverity")(MsrcSeverity.asInstanceOf[js.Any])
    if (Product != null) __obj.updateDynamic("Product")(Product.asInstanceOf[js.Any])
    if (ProductFamily != null) __obj.updateDynamic("ProductFamily")(ProductFamily.asInstanceOf[js.Any])
    if (ReleaseDate != null) __obj.updateDynamic("ReleaseDate")(ReleaseDate.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    if (Vendor != null) __obj.updateDynamic("Vendor")(Vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Patch]
  }
}

