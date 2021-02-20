package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeExporterInfo extends StObject {
  
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
  
  @scala.inline
  implicit class NodeExporterInfoMutableBuilder[Self <: NodeExporterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledInBroker(value: boolean): Self = StObject.set(x, "EnabledInBroker", value.asInstanceOf[js.Any])
  }
}
