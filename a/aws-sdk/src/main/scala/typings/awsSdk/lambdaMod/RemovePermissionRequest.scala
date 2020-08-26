package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionRequest extends js.Object {
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsSdk.lambdaMod.FunctionName = js.native
  /**
    * Specify a version or alias to remove permissions from a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsSdk.lambdaMod.Qualifier] = js.native
  /**
    * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * Statement ID of the permission to remove.
    */
  var StatementId: NamespacedStatementId = js.native
}

object RemovePermissionRequest {
  @scala.inline
  def apply(FunctionName: FunctionName, StatementId: NamespacedStatementId): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionRequest]
  }
  @scala.inline
  implicit class RemovePermissionRequestOps[Self <: RemovePermissionRequest] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: FunctionName): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementId(value: NamespacedStatementId): Self = this.set("StatementId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQualifier(value: Qualifier): Self = this.set("Qualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualifier: Self = this.set("Qualifier", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("RevisionId", js.undefined)
  }
  
}

