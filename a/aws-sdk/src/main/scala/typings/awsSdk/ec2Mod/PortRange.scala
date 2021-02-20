package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortRange extends StObject {
  
  /**
    * The first port in the range.
    */
  var From: js.UndefOr[Integer] = js.native
  
  /**
    * The last port in the range.
    */
  var To: js.UndefOr[Integer] = js.native
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
    def setFrom(value: Integer): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    @scala.inline
    def setTo(value: Integer): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
