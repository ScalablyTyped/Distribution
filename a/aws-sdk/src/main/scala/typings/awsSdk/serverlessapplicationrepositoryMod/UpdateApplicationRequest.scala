package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * The name of the author publishing the app.Minimum length=1. Maximum length=127.Pattern "^[a-z0-9](([a-z0-9]|-(?!-))*[a-z0-9])?$";
    */
  var Author: js.UndefOr[string] = js.native
  /**
    * The description of the application.Minimum length=1. Maximum length=256
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * A URL with more information about the application, for example the location of your GitHub repository for the application.
    */
  var HomePageUrl: js.UndefOr[string] = js.native
  /**
    * Labels to improve discovery of apps in search results.Minimum length=1. Maximum length=127. Maximum number of labels: 10Pattern: "^[a-zA-Z0-9+\\-_:\\/@]+$";
    */
  var Labels: js.UndefOr[listOfString] = js.native
  /**
    * A text readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeBody: js.UndefOr[string] = js.native
  /**
    * A link to the readme file in Markdown language that contains a more detailed description of the application and how it works.Maximum size 5 MB
    */
  var ReadmeUrl: js.UndefOr[string] = js.native
}

object UpdateApplicationRequest {
  @scala.inline
  def apply(ApplicationId: string): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  @scala.inline
  implicit class UpdateApplicationRequestOps[Self <: UpdateApplicationRequest] (val x: Self) extends AnyVal {
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
    def deleteAuthor: Self = this.set("Author", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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
    def setReadmeBody(value: string): Self = this.set("ReadmeBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadmeBody: Self = this.set("ReadmeBody", js.undefined)
    @scala.inline
    def setReadmeUrl(value: string): Self = this.set("ReadmeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadmeUrl: Self = this.set("ReadmeUrl", js.undefined)
  }
  
}

