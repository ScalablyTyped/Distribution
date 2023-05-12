package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketsOutput extends StObject {
  
  /**
    * The list of buckets owned by the requester.
    */
  var Buckets: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Buckets] = js.undefined
  
  /**
    * The owner of the buckets listed.
    */
  var Owner: js.UndefOr[typings.awsSdk2Types.clientsS3Mod.Owner] = js.undefined
}
object ListBucketsOutput {
  
  inline def apply(): ListBucketsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBucketsOutput] (val x: Self) extends AnyVal {
    
    inline def setBuckets(value: Buckets): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    inline def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "Buckets", js.Array(value*))
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
  }
}
