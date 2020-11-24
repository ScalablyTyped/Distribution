package typings.awsSdkClientS3Node.typesListBucketInventoryConfigurationsOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesInventoryConfigurationMod.UnmarshalledInventoryConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketInventoryConfigurationsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * <p>If sent in the request, the marker that is used as a starting point for this inventory configuration list response.</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.native
  
  /**
    * <p>The list of inventory configurations for a bucket.</p>
    */
  var InventoryConfigurationList: js.UndefOr[js.Array[UnmarshalledInventoryConfiguration]] = js.native
  
  /**
    * <p>Indicates whether the returned list of inventory configurations is truncated in this response. A value of true indicates that the list is truncated.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The marker used to continue this inventory configuration listing. Use the NextContinuationToken from this response to continue the listing in a subsequent request. The continuation token is an opaque value that Amazon S3 understands.</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.native
}
object ListBucketInventoryConfigurationsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBucketInventoryConfigurationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketInventoryConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListBucketInventoryConfigurationsOutputOps[Self <: ListBucketInventoryConfigurationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinuationToken(value: String): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
    
    @scala.inline
    def setInventoryConfigurationListVarargs(value: UnmarshalledInventoryConfiguration*): Self = this.set("InventoryConfigurationList", js.Array(value :_*))
    
    @scala.inline
    def setInventoryConfigurationList(value: js.Array[UnmarshalledInventoryConfiguration]): Self = this.set("InventoryConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInventoryConfigurationList: Self = this.set("InventoryConfigurationList", js.undefined)
    
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsTruncated: Self = this.set("IsTruncated", js.undefined)
    
    @scala.inline
    def setNextContinuationToken(value: String): Self = this.set("NextContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextContinuationToken: Self = this.set("NextContinuationToken", js.undefined)
  }
}
