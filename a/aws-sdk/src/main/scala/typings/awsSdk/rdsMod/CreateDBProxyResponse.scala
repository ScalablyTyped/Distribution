package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDBProxyResponse extends js.Object {
  
  /**
    * The DBProxy structure corresponding to the new proxy.
    */
  var DBProxy: js.UndefOr[typings.awsSdk.rdsMod.DBProxy] = js.native
}
object CreateDBProxyResponse {
  
  @scala.inline
  def apply(): CreateDBProxyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBProxyResponse]
  }
  
  @scala.inline
  implicit class CreateDBProxyResponseOps[Self <: CreateDBProxyResponse] (val x: Self) extends AnyVal {
    
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
