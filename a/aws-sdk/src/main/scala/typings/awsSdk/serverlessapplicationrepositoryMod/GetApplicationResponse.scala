package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApplicationResponse extends js.Object {
  
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
object GetApplicationResponse {
  
  @scala.inline
  def apply(): GetApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationResponse]
  }
  
  @scala.inline
  implicit class GetApplicationResponseOps[Self <: GetApplicationResponse] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setAuthor(value: string): Self = this.set("Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("Author", js.undefined)
    
    @scala.inline
    def setCreationTime(value: string): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setHomePageUrl(value: string): Self = this.set("HomePageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePageUrl: Self = this.set("HomePageUrl", js.undefined)
    
    @scala.inline
    def setIsVerifiedAuthor(value: boolean): Self = this.set("IsVerifiedAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVerifiedAuthor: Self = this.set("IsVerifiedAuthor", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: string*): Self = this.set("Labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: listOfString): Self = this.set("Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    
    @scala.inline
    def setLicenseUrl(value: string): Self = this.set("LicenseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseUrl: Self = this.set("LicenseUrl", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setReadmeUrl(value: string): Self = this.set("ReadmeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadmeUrl: Self = this.set("ReadmeUrl", js.undefined)
    
    @scala.inline
    def setSpdxLicenseId(value: string): Self = this.set("SpdxLicenseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpdxLicenseId: Self = this.set("SpdxLicenseId", js.undefined)
    
    @scala.inline
    def setVerifiedAuthorUrl(value: string): Self = this.set("VerifiedAuthorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifiedAuthorUrl: Self = this.set("VerifiedAuthorUrl", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
