package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComponentResponse extends js.Object {
  /**
    * The component object associated with the specified ARN. 
    */
  var component: js.UndefOr[Component] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetComponentResponse {
  @scala.inline
  def apply(component: Component = null, requestId: NonEmptyString = null): GetComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentResponse]
  }
}

