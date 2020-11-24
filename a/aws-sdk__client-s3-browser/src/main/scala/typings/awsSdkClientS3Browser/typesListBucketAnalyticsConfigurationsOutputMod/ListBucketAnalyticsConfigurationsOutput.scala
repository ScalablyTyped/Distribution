package typings.awsSdkClientS3Browser.typesListBucketAnalyticsConfigurationsOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBucketAnalyticsConfigurationsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * <p>The list of analytics configurations for a bucket.</p>
    */
  var AnalyticsConfigurationList: js.UndefOr[js.Array[UnmarshalledAnalyticsConfiguration]] = js.native
  
  /**
    * <p>The ContinuationToken that represents where this request began.</p>
    */
  var ContinuationToken: js.UndefOr[String] = js.native
  
  /**
    * <p>Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
    */
  var IsTruncated: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.</p>
    */
  var NextContinuationToken: js.UndefOr[String] = js.native
}
object ListBucketAnalyticsConfigurationsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ListBucketAnalyticsConfigurationsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsOutput]
  }
  
  @scala.inline
  implicit class ListBucketAnalyticsConfigurationsOutputOps[Self <: ListBucketAnalyticsConfigurationsOutput] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsConfigurationListVarargs(value: UnmarshalledAnalyticsConfiguration*): Self = this.set("AnalyticsConfigurationList", js.Array(value :_*))
    
    @scala.inline
    def setAnalyticsConfigurationList(value: js.Array[UnmarshalledAnalyticsConfiguration]): Self = this.set("AnalyticsConfigurationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsConfigurationList: Self = this.set("AnalyticsConfigurationList", js.undefined)
    
    @scala.inline
    def setContinuationToken(value: String): Self = this.set("ContinuationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuationToken: Self = this.set("ContinuationToken", js.undefined)
    
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
