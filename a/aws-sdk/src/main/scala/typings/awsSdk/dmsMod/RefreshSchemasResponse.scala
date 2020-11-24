package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefreshSchemasResponse extends js.Object {
  
  /**
    * The status of the refreshed schema.
    */
  var RefreshSchemasStatus: js.UndefOr[typings.awsSdk.dmsMod.RefreshSchemasStatus] = js.native
}
object RefreshSchemasResponse {
  
  @scala.inline
  def apply(): RefreshSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasResponse]
  }
  
  @scala.inline
  implicit class RefreshSchemasResponseOps[Self <: RefreshSchemasResponse] (val x: Self) extends AnyVal {
    
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
    def setRefreshSchemasStatus(value: RefreshSchemasStatus): Self = this.set("RefreshSchemasStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshSchemasStatus: Self = this.set("RefreshSchemasStatus", js.undefined)
  }
}
