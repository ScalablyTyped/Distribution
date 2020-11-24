package typings.awsSdkTypes.paginationMod

import typings.awsSdkTypes.clientMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationConfiguration extends js.Object {
  
  var client: Client[_, _, _] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
  
  var startingToken: js.UndefOr[String] = js.native
}
object PaginationConfiguration {
  
  @scala.inline
  def apply(client: Client[_, _, _]): PaginationConfiguration = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationConfiguration]
  }
  
  @scala.inline
  implicit class PaginationConfigurationOps[Self <: PaginationConfiguration] (val x: Self) extends AnyVal {
    
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
    def setClient(value: Client[_, _, _]): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setStartingToken(value: String): Self = this.set("startingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingToken: Self = this.set("startingToken", js.undefined)
  }
}
