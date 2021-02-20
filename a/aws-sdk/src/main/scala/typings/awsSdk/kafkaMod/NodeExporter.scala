package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeExporter extends StObject {
  
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
  
  @scala.inline
  implicit class NodeExporterMutableBuilder[Self <: NodeExporter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabledInBroker(value: boolean): Self = StObject.set(x, "EnabledInBroker", value.asInstanceOf[js.Any])
  }
}
