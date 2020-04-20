package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComponentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the component that you want to retrieve. Regex requires "/\d+$" suffix.
    */
  var componentBuildVersionArn: ComponentBuildVersionArn = js.native
}

object GetComponentRequest {
  @scala.inline
  def apply(componentBuildVersionArn: ComponentBuildVersionArn): GetComponentRequest = {
    val __obj = js.Dynamic.literal(componentBuildVersionArn = componentBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentRequest]
  }
}

