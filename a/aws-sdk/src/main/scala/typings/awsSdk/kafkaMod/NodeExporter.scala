package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeExporter extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the Node Exporter.
    
    */
  var EnabledInBroker: boolean = js.native
}

object NodeExporter {
  @scala.inline
  def apply(EnabledInBroker: boolean): NodeExporter = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeExporter]
  }
}

