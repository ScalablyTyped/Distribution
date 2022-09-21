package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApplicationResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.undefined
  
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[string] = js.undefined
  
  /**
    * Whether the author of this application has been verified. This means means that AWS has made a good faith review, as a reasonable and prudent service provider, of the information provided by the requester and has confirmed that the requester's identity is as claimed.
    */
  var IsVerifiedAuthor: js.UndefOr[boolean] = js.undefined
  
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A link to a license file of the app that matches the spdxLicenseID value of your application.Maximum size 5 MB
    */
  var LicenseUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeUrl: js.UndefOr[string] = js.undefined
  
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[string] = js.undefined
  
  /**
    * The URL to the public profile of a verified author. This URL is submitted by the author.
    */
  var VerifiedAuthorUrl: js.UndefOr[string] = js.undefined
  
  /**
    * Version information about the application.
    */
  var Version: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.Version] = js.undefined
}
object GetApplicationResponse {
  
  inline def apply(): GetApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApplicationResponse]
  }
  
  extension [Self <: GetApplicationResponse](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
    
    inline def setAuthor(value: string): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    inline def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHomePageUrl(value: string): Self = StObject.set(x, "HomePageUrl", value.asInstanceOf[js.Any])
    
    inline def setHomePageUrlUndefined: Self = StObject.set(x, "HomePageUrl", js.undefined)
    
    inline def setIsVerifiedAuthor(value: boolean): Self = StObject.set(x, "IsVerifiedAuthor", value.asInstanceOf[js.Any])
    
    inline def setIsVerifiedAuthorUndefined: Self = StObject.set(x, "IsVerifiedAuthor", js.undefined)
    
    inline def setLabels(value: listOfString): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setLabelsVarargs(value: string*): Self = StObject.set(x, "Labels", js.Array(value*))
    
    inline def setLicenseUrl(value: string): Self = StObject.set(x, "LicenseUrl", value.asInstanceOf[js.Any])
    
    inline def setLicenseUrlUndefined: Self = StObject.set(x, "LicenseUrl", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReadmeUrl(value: string): Self = StObject.set(x, "ReadmeUrl", value.asInstanceOf[js.Any])
    
    inline def setReadmeUrlUndefined: Self = StObject.set(x, "ReadmeUrl", js.undefined)
    
    inline def setSpdxLicenseId(value: string): Self = StObject.set(x, "SpdxLicenseId", value.asInstanceOf[js.Any])
    
    inline def setSpdxLicenseIdUndefined: Self = StObject.set(x, "SpdxLicenseId", js.undefined)
    
    inline def setVerifiedAuthorUrl(value: string): Self = StObject.set(x, "VerifiedAuthorUrl", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAuthorUrlUndefined: Self = StObject.set(x, "VerifiedAuthorUrl", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
