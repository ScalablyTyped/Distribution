package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDhcpOptionsResult extends StObject {
  
  /**
    * A set of DHCP options.
    */
  var DhcpOptions: js.UndefOr[typings.awsSdk.ec2Mod.DhcpOptions] = js.undefined
}
object CreateDhcpOptionsResult {
  
  @scala.inline
  def apply(): CreateDhcpOptionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDhcpOptionsResult]
  }
  
  @scala.inline
  implicit class CreateDhcpOptionsResultMutableBuilder[Self <: CreateDhcpOptionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDhcpOptions(value: DhcpOptions): Self = StObject.set(x, "DhcpOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhcpOptionsUndefined: Self = StObject.set(x, "DhcpOptions", js.undefined)
  }
}
