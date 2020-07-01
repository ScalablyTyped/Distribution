package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcePolicy extends js.Object {
  /**
    *  The resource policy formatted in JSON. 
    */
  var document: js.UndefOr[PolicyDocument] = js.native
  /**
    *  The ARN of the resource associated with the resource policy 
    */
  var resourceArn: js.UndefOr[Arn] = js.native
  /**
    *  The current revision of the resource policy. 
    */
  var revision: js.UndefOr[PolicyRevision] = js.native
}

object ResourcePolicy {
  @scala.inline
  def apply(document: PolicyDocument = null, resourceArn: Arn = null, revision: PolicyRevision = null): ResourcePolicy = {
    val __obj = js.Dynamic.literal()
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourcePolicy]
  }
}

