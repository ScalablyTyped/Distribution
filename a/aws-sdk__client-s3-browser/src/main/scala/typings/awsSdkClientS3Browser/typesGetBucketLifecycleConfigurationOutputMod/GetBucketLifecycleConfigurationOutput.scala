package typings.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketLifecycleConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * _LifecycleRules shape
    */
  var Rules: js.UndefOr[js.Array[UnmarshalledLifecycleRule]] = js.native
}

object GetBucketLifecycleConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketLifecycleConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketLifecycleConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketLifecycleConfigurationOutputOps[Self <: GetBucketLifecycleConfigurationOutput] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: UnmarshalledLifecycleRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[UnmarshalledLifecycleRule]): Self = this.set("Rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("Rules", js.undefined)
  }
  
}

