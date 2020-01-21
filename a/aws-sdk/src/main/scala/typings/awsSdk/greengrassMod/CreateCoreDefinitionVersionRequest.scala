package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCoreDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.native
  /**
    * The ID of the core definition.
    */
  var CoreDefinitionId: string = js.native
  /**
    * A list of cores in the core definition version.
    */
  var Cores: js.UndefOr[listOfCore] = js.native
}

object CreateCoreDefinitionVersionRequest {
  @scala.inline
  def apply(CoreDefinitionId: string, AmznClientToken: string = null, Cores: listOfCore = null): CreateCoreDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(CoreDefinitionId = CoreDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Cores != null) __obj.updateDynamic("Cores")(Cores.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoreDefinitionVersionRequest]
  }
}

