package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteComponentRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the component build version to delete. 
    */
  var componentBuildVersionArn: ComponentBuildVersionArn = js.native
}

object DeleteComponentRequest {
  @scala.inline
  def apply(componentBuildVersionArn: ComponentBuildVersionArn): DeleteComponentRequest = {
    val __obj = js.Dynamic.literal(componentBuildVersionArn = componentBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteComponentRequest]
  }
}

