package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connector extends js.Object {
  /**
    * The ARN of the connector.
    */
  var ConnectorArn: string = js.native
  /**
    * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
    */
  var Id: string = js.native
  /**
    * The parameters or configuration that the connector uses.
    */
  var Parameters: js.UndefOr[mapOfString] = js.native
}

object Connector {
  @scala.inline
  def apply(ConnectorArn: string, Id: string): Connector = {
    val __obj = js.Dynamic.literal(ConnectorArn = ConnectorArn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connector]
  }
  @scala.inline
  implicit class ConnectorOps[Self <: Connector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectorArn(value: string): Self = this.set("ConnectorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: mapOfString): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
  
}

