package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationResponse extends js.Object {
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

object UpdateApplicationResponse {
  @scala.inline
  def apply(
    ApplicationId: string = null,
    Author: string = null,
    CreationTime: string = null,
    Description: string = null,
    HomePageUrl: string = null,
    IsVerifiedAuthor: js.UndefOr[boolean] = js.undefined,
    Labels: listOfString = null,
    LicenseUrl: string = null,
    Name: string = null,
    ReadmeUrl: string = null,
    SpdxLicenseId: string = null,
    VerifiedAuthorUrl: string = null,
    Version: Version = null
  ): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId.asInstanceOf[js.Any])
    if (Author != null) __obj.updateDynamic("Author")(Author.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HomePageUrl != null) __obj.updateDynamic("HomePageUrl")(HomePageUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(IsVerifiedAuthor)) __obj.updateDynamic("IsVerifiedAuthor")(IsVerifiedAuthor.get.asInstanceOf[js.Any])
    if (Labels != null) __obj.updateDynamic("Labels")(Labels.asInstanceOf[js.Any])
    if (LicenseUrl != null) __obj.updateDynamic("LicenseUrl")(LicenseUrl.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ReadmeUrl != null) __obj.updateDynamic("ReadmeUrl")(ReadmeUrl.asInstanceOf[js.Any])
    if (SpdxLicenseId != null) __obj.updateDynamic("SpdxLicenseId")(SpdxLicenseId.asInstanceOf[js.Any])
    if (VerifiedAuthorUrl != null) __obj.updateDynamic("VerifiedAuthorUrl")(VerifiedAuthorUrl.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
}

