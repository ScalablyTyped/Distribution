package typings.awsSdkClientS3Browser.typesGetBucketAnalyticsConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketAnalyticsConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * <p>The configuration and any analyses for the analytics filter.</p>
    */
  var AnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsConfiguration] = js.native
}
object GetBucketAnalyticsConfigurationOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketAnalyticsConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAnalyticsConfigurationOutput]
  }
  
  @scala.inline
  implicit class GetBucketAnalyticsConfigurationOutputOps[Self <: GetBucketAnalyticsConfigurationOutput] (val x: Self) extends AnyVal {
    
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
    def setAnalyticsConfiguration(value: UnmarshalledAnalyticsConfiguration): Self = this.set("AnalyticsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyticsConfiguration: Self = this.set("AnalyticsConfiguration", js.undefined)
  }
}
