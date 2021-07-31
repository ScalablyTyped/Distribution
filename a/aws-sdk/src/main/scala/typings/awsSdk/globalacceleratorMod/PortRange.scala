package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRange extends StObject {
  
  /**
    * The first port in the range of ports, inclusive.
    */
  var FromPort: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The last port in the range of ports, inclusive.
    */
  var ToPort: js.UndefOr[PortNumber] = js.undefined
}
object PortRange {
  
  @scala.inline
  def apply(): PortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit class PortRangeMutableBuilder[Self <: PortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPort(value: PortNumber): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    @scala.inline
    def setToPort(value: PortNumber): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
