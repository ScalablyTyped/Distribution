package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeGenEdge extends js.Object {
  /**
    * The ID of the node at which the edge starts.
    */
  var Source: CodeGenIdentifier = js.native
  /**
    * The ID of the node at which the edge ends.
    */
  var Target: CodeGenIdentifier = js.native
  /**
    * The target of the edge.
    */
  var TargetParameter: js.UndefOr[CodeGenArgName] = js.native
}

object CodeGenEdge {
  @scala.inline
  def apply(Source: CodeGenIdentifier, Target: CodeGenIdentifier, TargetParameter: CodeGenArgName = null): CodeGenEdge = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    if (TargetParameter != null) __obj.updateDynamic("TargetParameter")(TargetParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeGenEdge]
  }
}

