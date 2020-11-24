package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Patch extends js.Object {
  
  /**
    * The Advisory ID of the patch. For example, RHSA-2020:3779. Applies to Linux-based instances only.
    */
  var AdvisoryIds: js.UndefOr[PatchAdvisoryIdList] = js.native
  
  /**
    * The architecture of the patch. For example, in example-pkg-0.710.10-2.7.abcd.x86_64, the architecture is indicated by x86_64. Applies to Linux-based instances only.
    */
  var Arch: js.UndefOr[PatchArch] = js.native
  
  /**
    * The Bugzilla ID of the patch. For example, 1600646. Applies to Linux-based instances only.
    */
  var BugzillaIds: js.UndefOr[PatchBugzillaIdList] = js.native
  
  /**
    * The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, CVE-1999-0067. Applies to Linux-based instances only.
    */
  var CVEIds: js.UndefOr[PatchCVEIdList] = js.native
  
  /**
    * The classification of the patch. For example, SecurityUpdates, Updates, or CriticalUpdates.
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
    * The epoch of the patch. For example in pkg-example-EE-20180914-2.2.amzn1.noarch, the epoch value is 20180914-2. Applies to Linux-based instances only.
    */
  var Epoch: js.UndefOr[PatchEpoch] = js.native
  
  /**
    * The ID of the patch. Applies to Windows patches only.  This ID is not the same as the Microsoft Knowledge Base ID. 
    */
  var Id: js.UndefOr[PatchId] = js.native
  
  /**
    * The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
    */
  var KbNumber: js.UndefOr[PatchKbNumber] = js.native
  
  /**
    * The language of the patch if it's language-specific.
    */
  var Language: js.UndefOr[PatchLanguage] = js.native
  
  /**
    * The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example, MS14-045. Applies to Windows patches only.
    */
  var MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.native
  
  /**
    * The severity of the patch, such as Critical, Important, or Moderate. Applies to Windows patches only.
    */
  var MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.native
  
  /**
    * The name of the patch. Applies to Linux-based instances only.
    */
  var Name: js.UndefOr[PatchName] = js.native
  
  /**
    * The specific product the patch is applicable for. For example, WindowsServer2016 or AmazonLinux2018.03.
    */
  var Product: js.UndefOr[PatchProduct] = js.native
  
  /**
    * The product family the patch is applicable for. For example, Windows or Amazon Linux 2.
    */
  var ProductFamily: js.UndefOr[PatchProductFamily] = js.native
  
  /**
    * The particular release of a patch. For example, in pkg-example-EE-20180914-2.2.amzn1.noarch, the release is 2.amaz1. Applies to Linux-based instances only.
    */
  var Release: js.UndefOr[PatchRelease] = js.native
  
  /**
    * The date the patch was released.
    */
  var ReleaseDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The source patch repository for the operating system and version, such as trusty-security for Ubuntu Server 14.04 LTE and focal-security for Ubuntu Server 20.04 LTE. Applies to Linux-based instances only.
    */
  var Repository: js.UndefOr[PatchRepository] = js.native
  
  /**
    * The severity level of the patch. For example, CRITICAL or MODERATE.
    */
  var Severity: js.UndefOr[PatchSeverity] = js.native
  
  /**
    * The title of the patch.
    */
  var Title: js.UndefOr[PatchTitle] = js.native
  
  /**
    * The name of the vendor providing the patch.
    */
  var Vendor: js.UndefOr[PatchVendor] = js.native
  
  /**
    * The version number of the patch. For example, in example-pkg-1.710.10-2.7.abcd.x86_64, the version number is indicated by -1. Applies to Linux-based instances only.
    */
  var Version: js.UndefOr[PatchVersion] = js.native
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
    def setAdvisoryIdsVarargs(value: PatchAdvisoryId*): Self = this.set("AdvisoryIds", js.Array(value :_*))
    
    @scala.inline
    def setAdvisoryIds(value: PatchAdvisoryIdList): Self = this.set("AdvisoryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvisoryIds: Self = this.set("AdvisoryIds", js.undefined)
    
    @scala.inline
    def setArch(value: PatchArch): Self = this.set("Arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArch: Self = this.set("Arch", js.undefined)
    
    @scala.inline
    def setBugzillaIdsVarargs(value: PatchBugzillaId*): Self = this.set("BugzillaIds", js.Array(value :_*))
    
    @scala.inline
    def setBugzillaIds(value: PatchBugzillaIdList): Self = this.set("BugzillaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBugzillaIds: Self = this.set("BugzillaIds", js.undefined)
    
    @scala.inline
    def setCVEIdsVarargs(value: PatchCVEId*): Self = this.set("CVEIds", js.Array(value :_*))
    
    @scala.inline
    def setCVEIds(value: PatchCVEIdList): Self = this.set("CVEIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCVEIds: Self = this.set("CVEIds", js.undefined)
    
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
    def setEpoch(value: PatchEpoch): Self = this.set("Epoch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEpoch: Self = this.set("Epoch", js.undefined)
    
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
    def setName(value: PatchName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setProduct(value: PatchProduct): Self = this.set("Product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("Product", js.undefined)
    
    @scala.inline
    def setProductFamily(value: PatchProductFamily): Self = this.set("ProductFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductFamily: Self = this.set("ProductFamily", js.undefined)
    
    @scala.inline
    def setRelease(value: PatchRelease): Self = this.set("Release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelease: Self = this.set("Release", js.undefined)
    
    @scala.inline
    def setReleaseDate(value: DateTime): Self = this.set("ReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseDate: Self = this.set("ReleaseDate", js.undefined)
    
    @scala.inline
    def setRepository(value: PatchRepository): Self = this.set("Repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepository: Self = this.set("Repository", js.undefined)
    
    @scala.inline
    def setSeverity(value: PatchSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
    
    @scala.inline
    def setTitle(value: PatchTitle): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
    
    @scala.inline
    def setVendor(value: PatchVendor): Self = this.set("Vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendor: Self = this.set("Vendor", js.undefined)
    
    @scala.inline
    def setVersion(value: PatchVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
