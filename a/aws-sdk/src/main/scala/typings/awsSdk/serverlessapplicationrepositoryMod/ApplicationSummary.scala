package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSummary extends js.Object {
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationId: string = js.native
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: string = js.native
  /**
    * The date and time this resource was created.
    */
  var CreationTime: js.UndefOr[string] = js.native
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
    * The name of the application.Minimum length=1. Maximum length=140Pattern: "[a-zA-Z0-9\\-]+";
    */
  var Name: string = js.native
  /**
    * A valid identifier from https://spdx.org/licenses/.
    */
  var SpdxLicenseId: js.UndefOr[string] = js.native
}

object ApplicationSummary {
  @scala.inline
  def apply(ApplicationId: string, Author: string, Description: string, Name: string): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Author = Author.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSummary]
  }
  @scala.inline
  implicit class ApplicationSummaryOps[Self <: ApplicationSummary] (val x: Self) extends AnyVal {
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
    def setAuthor(value: string): Self = this.set("Author", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: string): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setHomePageUrl(value: string): Self = this.set("HomePageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomePageUrl: Self = this.set("HomePageUrl", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: string*): Self = this.set("Labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: listOfString): Self = this.set("Labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("Labels", js.undefined)
    @scala.inline
    def setSpdxLicenseId(value: string): Self = this.set("SpdxLicenseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpdxLicenseId: Self = this.set("SpdxLicenseId", js.undefined)
  }
  
}

