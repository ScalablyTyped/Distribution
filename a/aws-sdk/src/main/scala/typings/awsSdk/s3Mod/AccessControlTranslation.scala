package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessControlTranslation extends StObject {
  
  /**
    * Specifies the replica ownership. For default and valid values, see PUT bucket replication in the Amazon Simple Storage Service API Reference.
    */
  var Owner: OwnerOverride = js.native
}
object AccessControlTranslation {
  
  @scala.inline
  def apply(Owner: OwnerOverride): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlTranslation]
  }
  
  @scala.inline
  implicit class AccessControlTranslationMutableBuilder[Self <: AccessControlTranslation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: OwnerOverride): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
