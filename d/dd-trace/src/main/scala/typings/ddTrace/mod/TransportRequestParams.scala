package typings.ddTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait TransportRequestParams extends js.Object {
  
  var body: js.UndefOr[anyObject] = js.native
  
  var bulkBody: js.UndefOr[anyObject] = js.native
  
  var method: String = js.native
  
  var path: String = js.native
  
  var querystring: js.UndefOr[anyObject] = js.native
}
object TransportRequestParams {
  
  @scala.inline
  def apply(method: String, path: String): TransportRequestParams = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportRequestParams]
  }
  
  @scala.inline
  implicit class TransportRequestParamsOps[Self <: TransportRequestParams] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: anyObject): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBulkBody(value: anyObject): Self = this.set("bulkBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkBody: Self = this.set("bulkBody", js.undefined)
    
    @scala.inline
    def setQuerystring(value: anyObject): Self = this.set("querystring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuerystring: Self = this.set("querystring", js.undefined)
  }
}
