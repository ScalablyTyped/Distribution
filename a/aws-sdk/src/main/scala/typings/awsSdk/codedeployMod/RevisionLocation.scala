package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The type of application revision:   S3: An application revision stored in Amazon S3.   GitHub: An application revision stored in GitHub (EC2/On-premises deployments only).   String: A YAML-formatted or JSON-formatted string (AWS Lambda deployments only).   AppSpecContent: An AppSpecContent object that contains the contents of an AppSpec file for an AWS Lambda or Amazon ECS deployment. The content is formatted as JSON or YAML stored as a RawString.  
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
  def apply(): RevisionLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionLocation]
  }
  
  @scala.inline
  implicit class RevisionLocationOps[Self <: RevisionLocation] (val x: Self) extends AnyVal {
    
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
    def setAppSpecContent(value: AppSpecContent): Self = this.set("appSpecContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppSpecContent: Self = this.set("appSpecContent", js.undefined)
    
    @scala.inline
    def setGitHubLocation(value: GitHubLocation): Self = this.set("gitHubLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitHubLocation: Self = this.set("gitHubLocation", js.undefined)
    
    @scala.inline
    def setRevisionType(value: RevisionLocationType): Self = this.set("revisionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionType: Self = this.set("revisionType", js.undefined)
    
    @scala.inline
    def setS3Location(value: S3Location): Self = this.set("s3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Location: Self = this.set("s3Location", js.undefined)
    
    @scala.inline
    def setString(value: RawString): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
