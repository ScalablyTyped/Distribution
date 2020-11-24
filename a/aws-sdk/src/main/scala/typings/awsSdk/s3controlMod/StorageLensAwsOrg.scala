package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageLensAwsOrg extends js.Object {
  
  /**
    * A container for the Amazon Resource Name (ARN) of the AWS organization. This property is read-only and follows the following format:  arn:aws:organizations:us-east-1:example-account-id:organization/o-ex2l495dck  
    */
  var Arn: AwsOrgArn = js.native
}
object StorageLensAwsOrg {
  
  @scala.inline
  def apply(Arn: AwsOrgArn): StorageLensAwsOrg = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageLensAwsOrg]
  }
  
  @scala.inline
  implicit class StorageLensAwsOrgOps[Self <: StorageLensAwsOrg] (val x: Self) extends AnyVal {
    
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
    def setArn(value: AwsOrgArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
  }
}
