package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeCidrCollectionRequest extends StObject {
  
  /**
    *  Information about changes to a CIDR collection.
    */
  var Changes: CidrCollectionChanges
  
  /**
    * A sequential counter that Amazon Route 53 sets to 1 when you create a collection and increments it by 1 each time you update the collection. We recommend that you use ListCidrCollection to get the current value of CollectionVersion for the collection that you want to update, and then include that value with the change request. This prevents Route 53 from overwriting an intervening update:    If the value in the request matches the value of CollectionVersion in the collection, Route 53 updates the collection.   If the value of CollectionVersion in the collection is greater than the value in the request, the collection was changed after you got the version number. Route 53 does not update the collection, and it returns a CidrCollectionVersionMismatch error.   
    */
  var CollectionVersion: js.UndefOr[typings.awsSdk.route53Mod.CollectionVersion] = js.undefined
  
  /**
    * The UUID of the CIDR collection to update.
    */
  var Id: UUID
}
object ChangeCidrCollectionRequest {
  
  inline def apply(Changes: CidrCollectionChanges, Id: UUID): ChangeCidrCollectionRequest = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeCidrCollectionRequest]
  }
  
  extension [Self <: ChangeCidrCollectionRequest](x: Self) {
    
    inline def setChanges(value: CidrCollectionChanges): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: CidrCollectionChange*): Self = StObject.set(x, "Changes", js.Array(value*))
    
    inline def setCollectionVersion(value: CollectionVersion): Self = StObject.set(x, "CollectionVersion", value.asInstanceOf[js.Any])
    
    inline def setCollectionVersionUndefined: Self = StObject.set(x, "CollectionVersion", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
