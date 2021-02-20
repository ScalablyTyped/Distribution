package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketsOutput extends StObject {
  
  /**
    * The list of buckets owned by the requestor.
    */
  var Buckets: js.UndefOr[typings.awsSdk.s3Mod.Buckets] = js.native
  
  /**
    * The owner of the buckets listed.
    */
  var Owner: js.UndefOr[typings.awsSdk.s3Mod.Owner] = js.native
}
object ListBucketsOutput {
  
  @scala.inline
  def apply(): ListBucketsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsOutput]
  }
  
  @scala.inline
  implicit class ListBucketsOutputMutableBuilder[Self <: ListBucketsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuckets(value: Buckets): Self = StObject.set(x, "Buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "Buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: Bucket*): Self = StObject.set(x, "Buckets", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
  }
}
