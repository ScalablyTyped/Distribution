package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTerminologyRequest extends js.Object {
  /**
    * The name of the custom terminology being deleted. 
    */
  var Name: ResourceName = js.native
}

object DeleteTerminologyRequest {
  @scala.inline
  def apply(Name: ResourceName): DeleteTerminologyRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTerminologyRequest]
  }
}

