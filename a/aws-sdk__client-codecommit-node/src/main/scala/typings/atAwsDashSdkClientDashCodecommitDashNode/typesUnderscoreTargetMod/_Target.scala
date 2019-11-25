package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Target extends js.Object {
  /**
    * <p>The branch of the repository where the pull request changes will be merged into. Also known as the destination branch.</p>
    */
  var destinationReference: js.UndefOr[String] = js.undefined
  /**
    * <p>The name of the repository that contains the pull request.</p>
    */
  var repositoryName: String
  /**
    * <p>The branch of the repository that contains the changes for the pull request. Also known as the source branch.</p>
    */
  var sourceReference: String
}

object _Target {
  @scala.inline
  def apply(repositoryName: String, sourceReference: String, destinationReference: String = null): _Target = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], sourceReference = sourceReference.asInstanceOf[js.Any])
    if (destinationReference != null) __obj.updateDynamic("destinationReference")(destinationReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Target]
  }
}

