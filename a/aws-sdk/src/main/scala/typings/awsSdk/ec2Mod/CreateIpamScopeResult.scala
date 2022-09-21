package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIpamScopeResult extends StObject {
  
  /**
    * Information about the created scope.
    */
  var IpamScope: js.UndefOr[typings.awsSdk.ec2Mod.IpamScope] = js.undefined
}
object CreateIpamScopeResult {
  
  inline def apply(): CreateIpamScopeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIpamScopeResult]
  }
  
  extension [Self <: CreateIpamScopeResult](x: Self) {
    
    inline def setIpamScope(value: IpamScope): Self = StObject.set(x, "IpamScope", value.asInstanceOf[js.Any])
    
    inline def setIpamScopeUndefined: Self = StObject.set(x, "IpamScope", js.undefined)
  }
}
