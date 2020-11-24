package typings.awsSdkClientS3Browser.typesGetBucketReplicationOutputMod

import typings.awsSdkClientS3Browser.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkClientS3Browser.typesReplicationConfigurationMod.UnmarshalledReplicationConfiguration
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketReplicationOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  
  /**
    * <p>Container for replication rules. You can add as many as 1,000 rules. Total replication configuration size can be up to 2 MB.</p>
    */
  var ReplicationConfiguration: js.UndefOr[UnmarshalledReplicationConfiguration] = js.native
}
object GetBucketReplicationOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): GetBucketReplicationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketReplicationOutput]
  }
  
  @scala.inline
  implicit class GetBucketReplicationOutputOps[Self <: GetBucketReplicationOutput] (val x: Self) extends AnyVal {
    
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
    def setReplicationConfiguration(value: UnmarshalledReplicationConfiguration): Self = this.set("ReplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationConfiguration: Self = this.set("ReplicationConfiguration", js.undefined)
  }
}
