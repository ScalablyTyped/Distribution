package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessControlTranslation extends StObject {
  
  /**
    * Specifies the replica ownership. For default and valid values, see PUT bucket replication in the Amazon S3 API Reference.
    */
  var Owner: OwnerOverride
}
object AccessControlTranslation {
  
  inline def apply(Owner: OwnerOverride): AccessControlTranslation = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlTranslation]
  }
  
  extension [Self <: AccessControlTranslation](x: Self) {
    
    inline def setOwner(value: OwnerOverride): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
