package typings.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteStatementRequest extends js.Object {
  
  /**
    * Specifies the parameters for the parameterized statement in the request.
    */
  var Parameters: js.UndefOr[StatementParameters] = js.native
  
  /**
    * Specifies the statement of the request.
    */
  var Statement: typings.awsSdk.qldbsessionMod.Statement = js.native
  
  /**
    * Specifies the transaction ID of the request.
    */
  var TransactionId: typings.awsSdk.qldbsessionMod.TransactionId = js.native
}
object ExecuteStatementRequest {
  
  @scala.inline
  def apply(Statement: Statement, TransactionId: TransactionId): ExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteStatementRequest]
  }
  
  @scala.inline
  implicit class ExecuteStatementRequestOps[Self <: ExecuteStatementRequest] (val x: Self) extends AnyVal {
    
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
    def setStatement(value: Statement): Self = this.set("Statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionId(value: TransactionId): Self = this.set("TransactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: ValueHolder*): Self = this.set("Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: StatementParameters): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
  }
}
