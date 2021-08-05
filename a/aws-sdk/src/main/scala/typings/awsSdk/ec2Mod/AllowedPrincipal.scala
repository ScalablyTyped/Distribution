package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedPrincipal extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the principal.
    */
  var Principal: js.UndefOr[String] = js.undefined
  
  /**
    * The type of principal.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.ec2Mod.PrincipalType] = js.undefined
}
object AllowedPrincipal {
  
  inline def apply(): AllowedPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPrincipal]
  }
  
  extension [Self <: AllowedPrincipal](x: Self) {
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
  }
}
