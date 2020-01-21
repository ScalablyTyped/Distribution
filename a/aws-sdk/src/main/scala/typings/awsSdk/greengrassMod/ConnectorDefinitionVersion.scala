package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorDefinitionVersion extends js.Object {
  /**
    * A list of references to connectors in this version, with their corresponding configuration settings.
    */
  var Connectors: js.UndefOr[listOfConnector] = js.native
}

object ConnectorDefinitionVersion {
  @scala.inline
  def apply(Connectors: listOfConnector = null): ConnectorDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Connectors != null) __obj.updateDynamic("Connectors")(Connectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorDefinitionVersion]
  }
}

