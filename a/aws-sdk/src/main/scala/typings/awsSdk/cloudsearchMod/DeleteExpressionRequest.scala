package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteExpressionRequest extends js.Object {
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  
  /**
    * The name of the Expression to delete.
    */
  var ExpressionName: StandardName = js.native
}
object DeleteExpressionRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, ExpressionName: StandardName): DeleteExpressionRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], ExpressionName = ExpressionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExpressionRequest]
  }
  
  @scala.inline
  implicit class DeleteExpressionRequestOps[Self <: DeleteExpressionRequest] (val x: Self) extends AnyVal {
    
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionName(value: StandardName): Self = this.set("ExpressionName", value.asInstanceOf[js.Any])
  }
}
