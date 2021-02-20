package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedPrincipal extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the principal.
    */
  var Principal: js.UndefOr[String] = js.native
  
  /**
    * The type of principal.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.ec2Mod.PrincipalType] = js.native
}
object AllowedPrincipal {
  
  @scala.inline
  def apply(): AllowedPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPrincipal]
  }
  
  @scala.inline
  implicit class AllowedPrincipalMutableBuilder[Self <: AllowedPrincipal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipal(value: String): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
    
    @scala.inline
    def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
  }
}
