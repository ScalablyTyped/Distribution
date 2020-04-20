package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the component. 
    */
  var componentArn: ComponentVersionArnOrBuildVersionArn = js.native
}

object ComponentConfiguration {
  @scala.inline
  def apply(componentArn: ComponentVersionArnOrBuildVersionArn): ComponentConfiguration = {
    val __obj = js.Dynamic.literal(componentArn = componentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfiguration]
  }
}

