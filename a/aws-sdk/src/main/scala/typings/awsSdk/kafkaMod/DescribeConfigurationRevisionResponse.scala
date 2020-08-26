package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationRevisionResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the configuration.
    
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * 
    The time when the configuration was created.
    
    */
  var CreationTime: js.UndefOr[timestampIso8601] = js.native
  /**
    * 
    The description of the configuration.
    
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * 
    The revision number.
    
    */
  var Revision: js.UndefOr[long] = js.native
  /**
    * 
    Contents of the server.properties file. When using the API, you must ensure that the contents of the file are base64 encoded. 
    When using the AWS Management Console, the SDK, or the AWS CLI, the contents of server.properties can be in plaintext.
    
    */
  var ServerProperties: js.UndefOr[_Blob] = js.native
}

object DescribeConfigurationRevisionResponse {
  @scala.inline
  def apply(): DescribeConfigurationRevisionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
  }
  @scala.inline
  implicit class DescribeConfigurationRevisionResponseOps[Self <: DescribeConfigurationRevisionResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setCreationTime(value: timestampIso8601): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setRevision(value: long): Self = this.set("Revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("Revision", js.undefined)
    @scala.inline
    def setServerProperties(value: _Blob): Self = this.set("ServerProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerProperties: Self = this.set("ServerProperties", js.undefined)
  }
  
}

