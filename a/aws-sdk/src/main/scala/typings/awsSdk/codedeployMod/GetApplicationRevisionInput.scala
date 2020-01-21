package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetApplicationRevisionInput extends js.Object {
  /**
    * The name of the application that corresponds to the revision.
    */
  var applicationName: ApplicationName = js.native
  /**
    * Information about the application revision to get, including type and location.
    */
  var revision: RevisionLocation = js.native
}

object GetApplicationRevisionInput {
  @scala.inline
  def apply(applicationName: ApplicationName, revision: RevisionLocation): GetApplicationRevisionInput = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApplicationRevisionInput]
  }
}

