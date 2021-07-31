package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patch extends StObject {
  
  /**
    * The Advisory ID of the patch. For example, RHSA-2020:3779. Applies to Linux-based instances only.
    */
  var AdvisoryIds: js.UndefOr[PatchAdvisoryIdList] = js.undefined
  
  /**
    * The architecture of the patch. For example, in example-pkg-0.710.10-2.7.abcd.x86_64, the architecture is indicated by x86_64. Applies to Linux-based instances only.
    */
  var Arch: js.UndefOr[PatchArch] = js.undefined
  
  /**
    * The Bugzilla ID of the patch. For example, 1600646. Applies to Linux-based instances only.
    */
  var BugzillaIds: js.UndefOr[PatchBugzillaIdList] = js.undefined
  
  /**
    * The Common Vulnerabilities and Exposures (CVE) ID of the patch. For example, CVE-1999-0067. Applies to Linux-based instances only.
    */
  var CVEIds: js.UndefOr[PatchCVEIdList] = js.undefined
  
  /**
    * The classification of the patch. For example, SecurityUpdates, Updates, or CriticalUpdates.
    */
  var Classification: js.UndefOr[PatchClassification] = js.undefined
  
  /**
    * The URL where more information can be obtained about the patch.
    */
  var ContentUrl: js.UndefOr[PatchContentUrl] = js.undefined
  
  /**
    * The description of the patch.
    */
  var Description: js.UndefOr[PatchDescription] = js.undefined
  
  /**
    * The epoch of the patch. For example in pkg-example-EE-20180914-2.2.amzn1.noarch, the epoch value is 20180914-2. Applies to Linux-based instances only.
    */
  var Epoch: js.UndefOr[PatchEpoch] = js.undefined
  
  /**
    * The ID of the patch. Applies to Windows patches only.  This ID is not the same as the Microsoft Knowledge Base ID. 
    */
  var Id: js.UndefOr[PatchId] = js.undefined
  
  /**
    * The Microsoft Knowledge Base ID of the patch. Applies to Windows patches only.
    */
  var KbNumber: js.UndefOr[PatchKbNumber] = js.undefined
  
  /**
    * The language of the patch if it's language-specific.
    */
  var Language: js.UndefOr[PatchLanguage] = js.undefined
  
  /**
    * The ID of the Microsoft Security Response Center (MSRC) bulletin the patch is related to. For example, MS14-045. Applies to Windows patches only.
    */
  var MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.undefined
  
  /**
    * The severity of the patch, such as Critical, Important, or Moderate. Applies to Windows patches only.
    */
  var MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.undefined
  
  /**
    * The name of the patch. Applies to Linux-based instances only.
    */
  var Name: js.UndefOr[PatchName] = js.undefined
  
  /**
    * The specific product the patch is applicable for. For example, WindowsServer2016 or AmazonLinux2018.03.
    */
  var Product: js.UndefOr[PatchProduct] = js.undefined
  
  /**
    * The product family the patch is applicable for. For example, Windows or Amazon Linux 2.
    */
  var ProductFamily: js.UndefOr[PatchProductFamily] = js.undefined
  
  /**
    * The particular release of a patch. For example, in pkg-example-EE-20180914-2.2.amzn1.noarch, the release is 2.amaz1. Applies to Linux-based instances only.
    */
  var Release: js.UndefOr[PatchRelease] = js.undefined
  
  /**
    * The date the patch was released.
    */
  var ReleaseDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The source patch repository for the operating system and version, such as trusty-security for Ubuntu Server 14.04 LTE and focal-security for Ubuntu Server 20.04 LTE. Applies to Linux-based instances only.
    */
  var Repository: js.UndefOr[PatchRepository] = js.undefined
  
  /**
    * The severity level of the patch. For example, CRITICAL or MODERATE.
    */
  var Severity: js.UndefOr[PatchSeverity] = js.undefined
  
  /**
    * The title of the patch.
    */
  var Title: js.UndefOr[PatchTitle] = js.undefined
  
  /**
    * The name of the vendor providing the patch.
    */
  var Vendor: js.UndefOr[PatchVendor] = js.undefined
  
  /**
    * The version number of the patch. For example, in example-pkg-1.710.10-2.7.abcd.x86_64, the version number is indicated by -1. Applies to Linux-based instances only.
    */
  var Version: js.UndefOr[PatchVersion] = js.undefined
}
object Patch {
  
  @scala.inline
  def apply(): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patch]
  }
  
  @scala.inline
  implicit class PatchMutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvisoryIds(value: PatchAdvisoryIdList): Self = StObject.set(x, "AdvisoryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvisoryIdsUndefined: Self = StObject.set(x, "AdvisoryIds", js.undefined)
    
    @scala.inline
    def setAdvisoryIdsVarargs(value: PatchAdvisoryId*): Self = StObject.set(x, "AdvisoryIds", js.Array(value :_*))
    
    @scala.inline
    def setArch(value: PatchArch): Self = StObject.set(x, "Arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchUndefined: Self = StObject.set(x, "Arch", js.undefined)
    
    @scala.inline
    def setBugzillaIds(value: PatchBugzillaIdList): Self = StObject.set(x, "BugzillaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBugzillaIdsUndefined: Self = StObject.set(x, "BugzillaIds", js.undefined)
    
    @scala.inline
    def setBugzillaIdsVarargs(value: PatchBugzillaId*): Self = StObject.set(x, "BugzillaIds", js.Array(value :_*))
    
    @scala.inline
    def setCVEIds(value: PatchCVEIdList): Self = StObject.set(x, "CVEIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVEIdsUndefined: Self = StObject.set(x, "CVEIds", js.undefined)
    
    @scala.inline
    def setCVEIdsVarargs(value: PatchCVEId*): Self = StObject.set(x, "CVEIds", js.Array(value :_*))
    
    @scala.inline
    def setClassification(value: PatchClassification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationUndefined: Self = StObject.set(x, "Classification", js.undefined)
    
    @scala.inline
    def setContentUrl(value: PatchContentUrl): Self = StObject.set(x, "ContentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "ContentUrl", js.undefined)
    
    @scala.inline
    def setDescription(value: PatchDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEpoch(value: PatchEpoch): Self = StObject.set(x, "Epoch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEpochUndefined: Self = StObject.set(x, "Epoch", js.undefined)
    
    @scala.inline
    def setId(value: PatchId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setKbNumber(value: PatchKbNumber): Self = StObject.set(x, "KbNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKbNumberUndefined: Self = StObject.set(x, "KbNumber", js.undefined)
    
    @scala.inline
    def setLanguage(value: PatchLanguage): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "Language", js.undefined)
    
    @scala.inline
    def setMsrcNumber(value: PatchMsrcNumber): Self = StObject.set(x, "MsrcNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsrcNumberUndefined: Self = StObject.set(x, "MsrcNumber", js.undefined)
    
    @scala.inline
    def setMsrcSeverity(value: PatchMsrcSeverity): Self = StObject.set(x, "MsrcSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsrcSeverityUndefined: Self = StObject.set(x, "MsrcSeverity", js.undefined)
    
    @scala.inline
    def setName(value: PatchName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProduct(value: PatchProduct): Self = StObject.set(x, "Product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductFamily(value: PatchProductFamily): Self = StObject.set(x, "ProductFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductFamilyUndefined: Self = StObject.set(x, "ProductFamily", js.undefined)
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "Product", js.undefined)
    
    @scala.inline
    def setRelease(value: PatchRelease): Self = StObject.set(x, "Release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: DateTime): Self = StObject.set(x, "ReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDateUndefined: Self = StObject.set(x, "ReleaseDate", js.undefined)
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "Release", js.undefined)
    
    @scala.inline
    def setRepository(value: PatchRepository): Self = StObject.set(x, "Repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryUndefined: Self = StObject.set(x, "Repository", js.undefined)
    
    @scala.inline
    def setSeverity(value: PatchSeverity): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    @scala.inline
    def setTitle(value: PatchTitle): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    @scala.inline
    def setVendor(value: PatchVendor): Self = StObject.set(x, "Vendor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorUndefined: Self = StObject.set(x, "Vendor", js.undefined)
    
    @scala.inline
    def setVersion(value: PatchVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
