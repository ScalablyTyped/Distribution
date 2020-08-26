package typings.awsSdkClientSqsNode.typesAddPermissionInputMod

import typings.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>The AWS account number of the <a href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P">principal</a> who is given permission. The principal must have an AWS account, but does not need to be signed up for Amazon SQS. For information about locating the AWS account identification, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-making-api-requests.html#sqs-api-request-authentication">Your AWS Identifiers</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p>
    */
  var AWSAccountIds: js.Array[String] | Iterable[String] = js.native
  /**
    * <p>The action the client wants to allow for the specified principal. Valid values: the name of any action or <code>*</code>.</p> <p>For more information about these actions, see <a href="http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-overview-of-managing-access.html">Overview of Managing Access Permissions to Your Amazon Simple Queue Service Resource</a> in the <i>Amazon Simple Queue Service Developer Guide</i>.</p> <p>Specifying <code>SendMessage</code>, <code>DeleteMessage</code>, or <code>ChangeMessageVisibility</code> for <code>ActionName.n</code> also grants permissions for the corresponding batch versions of those actions: <code>SendMessageBatch</code>, <code>DeleteMessageBatch</code>, and <code>ChangeMessageVisibilityBatch</code>.</p>
    */
  var Actions: js.Array[String] | Iterable[String] = js.native
  /**
    * <p>The unique identification of the permission you're setting (for example, <code>AliceSendMessage</code>). Maximum 80 characters. Allowed characters include alphanumeric characters, hyphens (<code>-</code>), and underscores (<code>_</code>).</p>
    */
  var Label: String = js.native
  /**
    * <p>The URL of the Amazon SQS queue to which permissions are added.</p> <p>Queue URLs and names are case-sensitive.</p>
    */
  var QueueUrl: String = js.native
}

object AddPermissionInput {
  @scala.inline
  def apply(
    AWSAccountIds: js.Array[String] | Iterable[String],
    Actions: js.Array[String] | Iterable[String],
    Label: String,
    QueueUrl: String
  ): AddPermissionInput = {
    val __obj = js.Dynamic.literal(AWSAccountIds = AWSAccountIds.asInstanceOf[js.Any], Actions = Actions.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], QueueUrl = QueueUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionInput]
  }
  @scala.inline
  implicit class AddPermissionInputOps[Self <: AddPermissionInput] (val x: Self) extends AnyVal {
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
    def setAWSAccountIdsVarargs(value: String*): Self = this.set("AWSAccountIds", js.Array(value :_*))
    @scala.inline
    def setAWSAccountIds(value: js.Array[String] | Iterable[String]): Self = this.set("AWSAccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: String*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[String] | Iterable[String]): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueUrl(value: String): Self = this.set("QueueUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
  }
  
}

