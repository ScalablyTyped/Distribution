package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackTransactionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn = js.native
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn = js.native
  /**
    * The identifier of the transaction to roll back.
    */
  var transactionId: Id = js.native
}

object RollbackTransactionRequest {
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, transactionId: Id): RollbackTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any], transactionId = transactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackTransactionRequest]
  }
  @scala.inline
  implicit class RollbackTransactionRequestOps[Self <: RollbackTransactionRequest] (val x: Self) extends AnyVal {
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
    def setResourceArn(value: Arn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretArn(value: Arn): Self = this.set("secretArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionId(value: Id): Self = this.set("transactionId", value.asInstanceOf[js.Any])
  }
  
}

