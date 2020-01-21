package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCoreDefinitionRequest extends js.Object {
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
}

object DeleteCoreDefinitionRequest {
  @scala.inline
  def apply(CoreDefinitionId: string): DeleteCoreDefinitionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCoreDefinitionRequest]
  }
}

