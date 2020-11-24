package typings.awsSdkClientS3Node.typesGetBucketCorsOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketCorsOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * _CORSRules shape
    */
  var CORSRules: js.UndefOr[js.Array[UnmarshalledCORSRule]] = js.native
}
object GetBucketCorsOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketCorsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketCorsOutput]
  }
  
  @scala.inline
  implicit class GetBucketCorsOutputOps[Self <: GetBucketCorsOutput] (val x: Self) extends AnyVal {
    
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
    def setCORSRulesVarargs(value: UnmarshalledCORSRule*): Self = this.set("CORSRules", js.Array(value :_*))
    
    @scala.inline
    def setCORSRules(value: js.Array[UnmarshalledCORSRule]): Self = this.set("CORSRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCORSRules: Self = this.set("CORSRules", js.undefined)
  }
}
