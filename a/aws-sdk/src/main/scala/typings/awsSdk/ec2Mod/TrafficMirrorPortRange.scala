package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficMirrorPortRange extends StObject {
  
  /**
    * The start of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var FromPort: js.UndefOr[Integer] = js.native
  
  /**
    * The end of the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var ToPort: js.UndefOr[Integer] = js.native
}
object TrafficMirrorPortRange {
  
  @scala.inline
  def apply(): TrafficMirrorPortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorPortRange]
  }
  
  @scala.inline
  implicit class TrafficMirrorPortRangeMutableBuilder[Self <: TrafficMirrorPortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    @scala.inline
    def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
