package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStaticIpResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the requested static IP.
    */
  var staticIp: js.UndefOr[StaticIp] = js.native
}
object GetStaticIpResult {
  
  @scala.inline
  def apply(): GetStaticIpResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStaticIpResult]
  }
  
  @scala.inline
  implicit class GetStaticIpResultMutableBuilder[Self <: GetStaticIpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStaticIp(value: StaticIp): Self = StObject.set(x, "staticIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticIpUndefined: Self = StObject.set(x, "staticIp", js.undefined)
  }
}
