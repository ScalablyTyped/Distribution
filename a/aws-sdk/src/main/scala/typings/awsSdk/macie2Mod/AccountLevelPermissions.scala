package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLevelPermissions extends StObject {
  
  /**
    * The block public access settings for the bucket.
    */
  var blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.undefined
}
object AccountLevelPermissions {
  
  inline def apply(): AccountLevelPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLevelPermissions]
  }
  
  extension [Self <: AccountLevelPermissions](x: Self) {
    
    inline def setBlockPublicAccess(value: BlockPublicAccess): Self = StObject.set(x, "blockPublicAccess", value.asInstanceOf[js.Any])
    
    inline def setBlockPublicAccessUndefined: Self = StObject.set(x, "blockPublicAccess", js.undefined)
  }
}
