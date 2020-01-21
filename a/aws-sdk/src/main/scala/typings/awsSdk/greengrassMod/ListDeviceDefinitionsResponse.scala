package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceDefinitionsResponse extends js.Object {
  /**
    * Information about a definition.
    */
  var Definitions: js.UndefOr[listOfDefinitionInformation] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListDeviceDefinitionsResponse {
  @scala.inline
  def apply(Definitions: listOfDefinitionInformation = null, NextToken: string = null): ListDeviceDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Definitions != null) __obj.updateDynamic("Definitions")(Definitions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceDefinitionsResponse]
  }
}

