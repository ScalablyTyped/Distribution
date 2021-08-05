package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3AccessControlList extends StObject {
  
  /**
    * 
    */
  var Grants: js.UndefOr[S3GrantList] = js.undefined
  
  /**
    * 
    */
  var Owner: S3ObjectOwner
}
object S3AccessControlList {
  
  inline def apply(Owner: S3ObjectOwner): S3AccessControlList = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3AccessControlList]
  }
  
  extension [Self <: S3AccessControlList](x: Self) {
    
    inline def setGrants(value: S3GrantList): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    inline def setGrantsVarargs(value: S3Grant*): Self = StObject.set(x, "Grants", js.Array(value :_*))
    
    inline def setOwner(value: S3ObjectOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
