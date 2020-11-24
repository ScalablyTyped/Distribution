package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRoleRequest extends js.Object {
  
  /**
    * The Amazon S3 bucket that contains media files to be transcoded. The action attempts to read from this bucket.
    */
  var InputBucket: BucketName = js.native
  
  /**
    * The Amazon S3 bucket that Elastic Transcoder writes transcoded media files to. The action attempts to read from this bucket.
    */
  var OutputBucket: BucketName = js.native
  
  /**
    * The IAM Amazon Resource Name (ARN) for the role that you want Elastic Transcoder to test.
    */
  var Role: typings.awsSdk.elastictranscoderMod.Role = js.native
  
  /**
    * The ARNs of one or more Amazon Simple Notification Service (Amazon SNS) topics that you want the action to send a test notification to.
    */
  var Topics: SnsTopics = js.native
}
object TestRoleRequest {
  
  @scala.inline
  def apply(InputBucket: BucketName, OutputBucket: BucketName, Role: Role, Topics: SnsTopics): TestRoleRequest = {
    val __obj = js.Dynamic.literal(InputBucket = InputBucket.asInstanceOf[js.Any], OutputBucket = OutputBucket.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Topics = Topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRoleRequest]
  }
  
  @scala.inline
  implicit class TestRoleRequestOps[Self <: TestRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInputBucket(value: BucketName): Self = this.set("InputBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBucket(value: BucketName): Self = this.set("OutputBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: Role): Self = this.set("Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsVarargs(value: SnsTopic*): Self = this.set("Topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: SnsTopics): Self = this.set("Topics", value.asInstanceOf[js.Any])
  }
}
