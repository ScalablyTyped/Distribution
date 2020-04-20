package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeExporterInfo extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the Node Exporter.
    
    */
  var EnabledInBroker: boolean = js.native
}

object NodeExporterInfo {
  @scala.inline
  def apply(EnabledInBroker: boolean): NodeExporterInfo = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeExporterInfo]
  }
}

