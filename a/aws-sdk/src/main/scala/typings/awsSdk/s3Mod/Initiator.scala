package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initiator extends StObject {
  
  /**
    * Name of the Principal.
    */
  var DisplayName: js.UndefOr[typings.awsSdk.s3Mod.DisplayName] = js.undefined
  
  /**
    * If the principal is an AWS account, it provides the Canonical User ID. If the principal is an IAM User, it provides a user ARN value.
    */
  var ID: js.UndefOr[typings.awsSdk.s3Mod.ID] = js.undefined
}
object Initiator {
  
  inline def apply(): Initiator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initiator]
  }
  
  extension [Self <: Initiator](x: Self) {
    
    inline def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setID(value: ID): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIDUndefined: Self = StObject.set(x, "ID", js.undefined)
  }
}
