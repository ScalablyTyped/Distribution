package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelegationSet extends StObject {
  
  /**
    * The value that you specified for CallerReference when you created the reusable delegation set.
    */
  var CallerReference: js.UndefOr[Nonce] = js.undefined
  
  /**
    * The ID that Amazon Route 53 assigns to a reusable delegation set.
    */
  var Id: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A complex type that contains a list of the authoritative name servers for a hosted zone or for a reusable delegation set.
    */
  var NameServers: DelegationSetNameServers
}
object DelegationSet {
  
  inline def apply(NameServers: DelegationSetNameServers): DelegationSet = {
    val __obj = js.Dynamic.literal(NameServers = NameServers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationSet]
  }
  
  extension [Self <: DelegationSet](x: Self) {
    
    inline def setCallerReference(value: Nonce): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setCallerReferenceUndefined: Self = StObject.set(x, "CallerReference", js.undefined)
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setNameServers(value: DelegationSetNameServers): Self = StObject.set(x, "NameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersVarargs(value: DNSName*): Self = StObject.set(x, "NameServers", js.Array(value*))
  }
}
