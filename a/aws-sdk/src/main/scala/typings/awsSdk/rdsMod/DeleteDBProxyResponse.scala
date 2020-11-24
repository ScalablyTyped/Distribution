package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBProxyResponse extends js.Object {
  
  /**
    * The data structure representing the details of the DB proxy that you delete.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.rdsMod.DBProxy] = js.native
}
object DeleteDBProxyResponse {
  
  @scala.inline
  def apply(): DeleteDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBProxyResponse]
  }
  
  @scala.inline
  implicit class DeleteDBProxyResponseOps[Self <: DeleteDBProxyResponse] (val x: Self) extends AnyVal {
    
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
    def setDBProxy(value: DBProxy): Self = this.set("DBProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBProxy: Self = this.set("DBProxy", js.undefined)
  }
}
