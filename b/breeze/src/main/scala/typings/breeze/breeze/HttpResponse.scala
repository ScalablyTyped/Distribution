package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpResponse extends js.Object {
  
  var config: js.Any = js.native
  
  var data: js.Array[Entity] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  def getHeaders(headerName: String): String = js.native
  
  var saveContext: js.UndefOr[js.Any] = js.native
  
  var status: Double = js.native
}
object HttpResponse {
  
  @scala.inline
  def apply(config: js.Any, data: js.Array[Entity], getHeaders: String => String, status: Double): HttpResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getHeaders = js.Any.fromFunction1(getHeaders), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
  
  @scala.inline
  implicit class HttpResponseOps[Self <: HttpResponse] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Entity*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Entity]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHeaders(value: String => String): Self = this.set("getHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setSaveContext(value: js.Any): Self = this.set("saveContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveContext: Self = this.set("saveContext", js.undefined)
  }
}
