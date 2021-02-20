package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationRequest extends StObject {
  
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: string = js.native
  
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: string = js.native
  
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[string] = js.native
  
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[listOfString] = js.native
  
  /**
    * A local text file that contains the license of the app that matches the spdxLicenseID value of your application.
    The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
    */
  var LicenseBody: js.UndefOr[string] = js.native
  
  /**
    * A link to the S3 object that contains the license of the app that matches the spdxLicenseID value of your application.Maximum size 5 MBYou can specify only one of licenseBody and licenseUrl; otherwise, an error results.
    */
  var LicenseUrl: js.UndefOr[string] = js.native
  
  /**
    * The name of the application that you want to publish.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: string = js.native
  
  /**
    * A local text readme file in Markdown language that contains a more detailed description of the application and how it works.
    The file has the format file://&lt;path>/&lt;filename>.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
    */
  var ReadmeBody: js.UndefOr[string] = js.native
  
  /**
    * A link to the S3 object in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MBYou can specify only one of readmeBody and readmeUrl; otherwise, an error results.
    */
  var ReadmeUrl: js.UndefOr[string] = js.native
  
  /**
    * The semantic version of the application:
    https://semver.org/
    
    */
  var SemanticVersion: js.UndefOr[string] = js.native
  
  /**
    * A link to the S3 object that contains the ZIP archive of the source code for this version of your application.Maximum size 50 MB
    */
  var SourceCodeArchiveUrl: js.UndefOr[string] = js.native
  
  /**
    * A link to a public repository for the source code of your application, for example the URL of a specific GitHub commit.
    */
  var SourceCodeUrl: js.UndefOr[string] = js.native
  
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[string] = js.native
  
  /**
    * The local raw packaged AWS SAM template file of your application.
    The file has the format file://&lt;path>/&lt;filename>.You can specify only one of templateBody and templateUrl; otherwise an error results.
    */
  var TemplateBody: js.UndefOr[string] = js.native
  
  /**
    * A link to the S3 object containing the packaged AWS SAM template of your application.You can specify only one of templateBody and templateUrl; otherwise an error results.
    */
  var TemplateUrl: js.UndefOr[string] = js.native
}
object CreateApplicationRequest {
  
  @scala.inline
  def apply(Author: string, Description: string, Name: string): CreateApplicationRequest = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationRequest]
  }
  
  @scala.inline
  implicit class CreateApplicationRequestMutableBuilder[Self <: CreateApplicationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: string): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePageUrl(value: string): Self = StObject.set(x, "HomePageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePageUrlUndefined: Self = StObject.set(x, "HomePageUrl", js.undefined)
    
    @scala.inline
    def setLabels(value: listOfString): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: string*): Self = StObject.set(x, "Labels", js.Array(value :_*))
    
    @scala.inline
    def setLicenseBody(value: string): Self = StObject.set(x, "LicenseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseBodyUndefined: Self = StObject.set(x, "LicenseBody", js.undefined)
    
    @scala.inline
    def setLicenseUrl(value: string): Self = StObject.set(x, "LicenseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseUrlUndefined: Self = StObject.set(x, "LicenseUrl", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadmeBody(value: string): Self = StObject.set(x, "ReadmeBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadmeBodyUndefined: Self = StObject.set(x, "ReadmeBody", js.undefined)
    
    @scala.inline
    def setReadmeUrl(value: string): Self = StObject.set(x, "ReadmeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadmeUrlUndefined: Self = StObject.set(x, "ReadmeUrl", js.undefined)
    
    @scala.inline
    def setSemanticVersion(value: string): Self = StObject.set(x, "SemanticVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticVersionUndefined: Self = StObject.set(x, "SemanticVersion", js.undefined)
    
    @scala.inline
    def setSourceCodeArchiveUrl(value: string): Self = StObject.set(x, "SourceCodeArchiveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeArchiveUrlUndefined: Self = StObject.set(x, "SourceCodeArchiveUrl", js.undefined)
    
    @scala.inline
    def setSourceCodeUrl(value: string): Self = StObject.set(x, "SourceCodeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeUrlUndefined: Self = StObject.set(x, "SourceCodeUrl", js.undefined)
    
    @scala.inline
    def setSpdxLicenseId(value: string): Self = StObject.set(x, "SpdxLicenseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdxLicenseIdUndefined: Self = StObject.set(x, "SpdxLicenseId", js.undefined)
    
    @scala.inline
    def setTemplateBody(value: string): Self = StObject.set(x, "TemplateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateBodyUndefined: Self = StObject.set(x, "TemplateBody", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: string): Self = StObject.set(x, "TemplateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "TemplateUrl", js.undefined)
  }
}
