package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSummary extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: string
  
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: string
  
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.undefined
  
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: string
  
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[string] = js.undefined
  
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: string
  
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[string] = js.undefined
}
object ApplicationSummary {
  
  @scala.inline
  def apply(ApplicationId: string, Author: string, Description: string, Name: string): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  
  @scala.inline
  implicit class ApplicationSummaryMutableBuilder[Self <: ApplicationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: string): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
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
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdxLicenseId(value: string): Self = StObject.set(x, "SpdxLicenseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpdxLicenseIdUndefined: Self = StObject.set(x, "SpdxLicenseId", js.undefined)
  }
}
