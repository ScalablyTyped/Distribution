package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccessPointOutput extends StObject {
  
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsSdk.elbMod.DNSName] = js.native
}
object CreateAccessPointOutput {
  
  @scala.inline
  def apply(): CreateAccessPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessPointOutput]
  }
  
  @scala.inline
  implicit class CreateAccessPointOutputMutableBuilder[Self <: CreateAccessPointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDNSName(value: DNSName): Self = StObject.set(x, "DNSName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDNSNameUndefined: Self = StObject.set(x, "DNSName", js.undefined)
  }
}
