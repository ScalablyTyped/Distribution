package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JmxExporterInfo extends js.Object {
  /**
    * 
    Indicates whether you want to enable or disable the JMX Exporter.
    
    */
  var EnabledInBroker: boolean = js.native
}

object JmxExporterInfo {
  @scala.inline
  def apply(EnabledInBroker: boolean): JmxExporterInfo = {
    val __obj = js.Dynamic.literal(EnabledInBroker = EnabledInBroker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JmxExporterInfo]
  }
}

