package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDependencySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the nested application.
    */
  var ApplicationId: string = js.native
  /**
    * The semantic version of the nested application.
    */
  var SemanticVersion: string = js.native
}

object ApplicationDependencySummary {
  @scala.inline
  def apply(ApplicationId: string, SemanticVersion: string): ApplicationDependencySummary = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SemanticVersion = SemanticVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDependencySummary]
  }
}

