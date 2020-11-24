package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackageVersionDescription extends js.Object {
  
  /**
    *  The name of the package that is displayed. The displayName varies depending on the package version's format. For example, if an npm package is named ui, is in the namespace vue, and has the format npm, then the displayName is @vue/ui. 
    */
  var displayName: js.UndefOr[String255] = js.native
  
  /**
    *  The format of the package version. The valid package formats are:     npm: A Node Package Manager (npm) package.     pypi: A Python Package Index (PyPI) package.     maven: A Maven package that contains compiled code in a distributable format, such as a JAR file.   
    */
  var format: js.UndefOr[PackageFormat] = js.native
  
  /**
    *  The homepage associated with the package. 
    */
  var homePage: js.UndefOr[String] = js.native
  
  /**
    *  Information about licenses associated with the package version. 
    */
  var licenses: js.UndefOr[LicenseInfoList] = js.native
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  
  /**
    *  The name of the requested package. 
    */
  var packageName: js.UndefOr[PackageName] = js.native
  
  /**
    *  A timestamp that contains the date and time the package version was published. 
    */
  var publishedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The revision of the package version. 
    */
  var revision: js.UndefOr[PackageVersionRevision] = js.native
  
  /**
    *  The repository for the source code in the package version, or the source code used to build it. 
    */
  var sourceCodeRepository: js.UndefOr[String] = js.native
  
  /**
    *  A string that contains the status of the package version. It can be one of the following:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var status: js.UndefOr[PackageVersionStatus] = js.native
  
  /**
    *  A summary of the package version. The summary is extracted from the package. The information in and detail level of the summary depends on the package version's format. 
    */
  var summary: js.UndefOr[String] = js.native
  
  /**
    *  The version of the package. 
    */
  var version: js.UndefOr[PackageVersion] = js.native
}
object PackageVersionDescription {
  
  @scala.inline
  def apply(): PackageVersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageVersionDescription]
  }
  
  @scala.inline
  implicit class PackageVersionDescriptionOps[Self <: PackageVersionDescription] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String255): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setHomePage(value: String): Self = this.set("homePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePage: Self = this.set("homePage", js.undefined)
    
    @scala.inline
    def setLicensesVarargs(value: LicenseInfo*): Self = this.set("licenses", js.Array(value :_*))
    
    @scala.inline
    def setLicenses(value: LicenseInfoList): Self = this.set("licenses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenses: Self = this.set("licenses", js.undefined)
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setPackageName(value: PackageName): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setPublishedTime(value: Timestamp): Self = this.set("publishedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedTime: Self = this.set("publishedTime", js.undefined)
    
    @scala.inline
    def setRevision(value: PackageVersionRevision): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setSourceCodeRepository(value: String): Self = this.set("sourceCodeRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeRepository: Self = this.set("sourceCodeRepository", js.undefined)
    
    @scala.inline
    def setStatus(value: PackageVersionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setVersion(value: PackageVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
