package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageLensAwsOrg extends StObject {
  
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
  implicit class StorageLensAwsOrgMutableBuilder[Self <: StorageLensAwsOrg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AwsOrgArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
