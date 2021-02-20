package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApplicationResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.native
  
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: js.UndefOr[string] = js.native
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.native
  
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[string] = js.native
  
  /**
    * Whether the author of this application has been verified. This means means that AWS has made a good faith review, as a reasonable and prudent service provider, of the information provided by the requester and has confirmed that the requester's identity is as claimed.
    */
  var IsVerifiedAuthor: js.UndefOr[boolean] = js.native
  
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[listOfString] = js.native
  
  /**
    * A link to a license file of the app that matches the spdxLicenseID value of your application.Maximum size 5 MB
    */
  var LicenseUrl: js.UndefOr[string] = js.native
  
  /**
    * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeUrl: js.UndefOr[string] = js.native
  
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[string] = js.native
  
  /**
    * The URL to the public profile of a verified author. This URL is submitted by the author.
    */
  var VerifiedAuthorUrl: js.UndefOr[string] = js.native
  
  /**
    * Version information about the application.
    */
  var Version: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.Version] = js.native
}
object CreateApplicationResponse {
  
  @scala.inline
  def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  @scala.inline
  implicit class CreateApplicationResponseMutableBuilder[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    @scala.inline
    def setAuthor(value: string): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    @scala.inline
    def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setHomePageUrl(value: string): Self = StObject.set(x, "HomePageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePageUrlUndefined: Self = StObject.set(x, "HomePageUrl", js.undefined)
    
    @scala.inline
    def setIsVerifiedAuthor(value: boolean): Self = StObject.set(x, "IsVerifiedAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerifiedAuthorUndefined: Self = StObject.set(x, "IsVerifiedAuthor", js.undefined)
    
    @scala.inline
    def setLabels(value: listOfString): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: string*): Self = StObject.set(x, "Labels", js.Array(value :_*))
    
    @scala.inline
    def setLicenseUrl(value: string): Self = StObject.set(x, "LicenseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseUrlUndefined: Self = StObject.set(x, "LicenseUrl", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setReadmeUrl(value: string): Self = StObject.set(x, "ReadmeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadmeUrlUndefined: Self = StObject.set(x, "ReadmeUrl", js.undefined)
    
    @scala.inline
    def setSpdxLicenseId(value: string): Self = StObject.set(x, "SpdxLicenseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdxLicenseIdUndefined: Self = StObject.set(x, "SpdxLicenseId", js.undefined)
    
    @scala.inline
    def setVerifiedAuthorUrl(value: string): Self = StObject.set(x, "VerifiedAuthorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedAuthorUrlUndefined: Self = StObject.set(x, "VerifiedAuthorUrl", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
