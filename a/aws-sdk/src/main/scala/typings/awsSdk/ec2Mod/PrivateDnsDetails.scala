package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateDnsDetails extends StObject {
  
  /**
    * The private DNS name assigned to the VPC endpoint service.
    */
  var PrivateDnsName: js.UndefOr[String] = js.undefined
}
object PrivateDnsDetails {
  
  inline def apply(): PrivateDnsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateDnsDetails]
  }
  
  extension [Self <: PrivateDnsDetails](x: Self) {
    
    inline def setPrivateDnsName(value: String): Self = StObject.set(x, "PrivateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "PrivateDnsName", js.undefined)
  }
}
