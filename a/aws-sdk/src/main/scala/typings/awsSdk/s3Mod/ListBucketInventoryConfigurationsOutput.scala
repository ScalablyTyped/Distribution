package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketInventoryConfigurationsOutput extends StObject {
  
  /**
    * If sent in the request, the marker that is used as a starting point for this inventory configuration list response.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
  
  /**
    * The list of inventory configurations for a bucket.
    */
  var InventoryConfigurationList: js.UndefOr[typings.awsSdk.s3Mod.InventoryConfigurationList] = js.native
  
  /**
    * Tells whether the returned list of inventory configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken is provided for a subsequent request.
    */
  var IsTruncated: js.UndefOr[typings.awsSdk.s3Mod.IsTruncated] = js.native
  
  /**
    * The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.
    */
  var NextContinuationToken: js.UndefOr[NextToken] = js.native
}
object ListBucketInventoryConfigurationsOutput {
  
  @scala.inline
  def apply(): ListBucketInventoryConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListBucketInventoryConfigurationsOutputMutableBuilder[Self <: ListBucketInventoryConfigurationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuationToken(value: Token): Self = StObject.set(x, "ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationTokenUndefined: Self = StObject.set(x, "ContinuationToken", js.undefined)
    
    @scala.inline
    def setInventoryConfigurationList(value: InventoryConfigurationList): Self = StObject.set(x, "InventoryConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventoryConfigurationListUndefined: Self = StObject.set(x, "InventoryConfigurationList", js.undefined)
    
    @scala.inline
    def setInventoryConfigurationListVarargs(value: InventoryConfiguration*): Self = StObject.set(x, "InventoryConfigurationList", js.Array(value :_*))
    
    @scala.inline
    def setIsTruncated(value: IsTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncatedUndefined: Self = StObject.set(x, "IsTruncated", js.undefined)
    
    @scala.inline
    def setNextContinuationToken(value: NextToken): Self = StObject.set(x, "NextContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextContinuationTokenUndefined: Self = StObject.set(x, "NextContinuationToken", js.undefined)
  }
}
