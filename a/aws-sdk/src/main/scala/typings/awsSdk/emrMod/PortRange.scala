package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRange extends StObject {
  
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MaxRange: js.UndefOr[Port] = js.undefined
  
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MinRange: Port
}
object PortRange {
  
  @scala.inline
  def apply(MinRange: Port): PortRange = {
    val __obj = js.Dynamic.literal(MinRange = MinRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit class PortRangeMutableBuilder[Self <: PortRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxRange(value: Port): Self = StObject.set(x, "MaxRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRangeUndefined: Self = StObject.set(x, "MaxRange", js.undefined)
    
    @scala.inline
    def setMinRange(value: Port): Self = StObject.set(x, "MinRange", value.asInstanceOf[js.Any])
  }
}
