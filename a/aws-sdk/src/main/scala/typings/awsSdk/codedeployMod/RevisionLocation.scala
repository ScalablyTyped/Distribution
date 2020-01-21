package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionLocation extends js.Object {
  /**
    *  The content of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML and stored as a RawString. 
    */
  var appSpecContent: js.UndefOr[AppSpecContent] = js.native
  /**
    * Information about the location of application artifacts stored in GitHub.
    */
  var gitHubLocation: js.UndefOr[GitHubLocation] = js.native
  /**
    * The type of application revision:   S3: An application revision stored in Amazon S3.   GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).   String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).  
    */
  var revisionType: js.UndefOr[RevisionLocationType] = js.native
  /**
    * Information about the location of a revision stored in Amazon S3. 
    */
  var s3Location: js.UndefOr[S3Location] = js.native
  /**
    * Information about the location of an AWS Lambda deployment revision stored as a RawString.
    */
  var string: js.UndefOr[RawString] = js.native
}

object RevisionLocation {
  @scala.inline
  def apply(
    appSpecContent: AppSpecContent = null,
    gitHubLocation: GitHubLocation = null,
    revisionType: RevisionLocationType = null,
    s3Location: S3Location = null,
    string: RawString = null
  ): RevisionLocation = {
    val __obj = js.Dynamic.literal()
    if (appSpecContent != null) __obj.updateDynamic("appSpecContent")(appSpecContent.asInstanceOf[js.Any])
    if (gitHubLocation != null) __obj.updateDynamic("gitHubLocation")(gitHubLocation.asInstanceOf[js.Any])
    if (revisionType != null) __obj.updateDynamic("revisionType")(revisionType.asInstanceOf[js.Any])
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevisionLocation]
  }
}

