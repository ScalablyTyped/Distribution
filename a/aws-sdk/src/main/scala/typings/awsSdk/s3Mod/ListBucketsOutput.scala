package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBucketsOutput extends StObject {
  
  /**
    * The list of buckets owned by the requestor.
    */
  var Buckets: js.UndefOr[typings.awsSdk.s3Mod.Buckets] = js.undefined
  
  /**
    * The owner of the buckets listed.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.undefined
}
object ListBucketsOutput {
  
  inline def apply(): ListBucketsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsOutput]
  }
  
  extension [Self <: ListBucketsOutput](x: Self) {
    
    inline def setBuckets(value: Buckets): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    inline def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "Buckets", js.Array(value :_*))
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
  }
}
