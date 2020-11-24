package typings.cradle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends js.Object {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var continuous: js.UndefOr[Boolean] = js.native
  
  var create_target: js.UndefOr[Boolean] = js.native
  
  var doc_ids: js.UndefOr[js.Array[String]] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  var query_params: js.UndefOr[js.Any] = js.native
  
  var source: String | Url = js.native
  
  var target: String | Url = js.native
}
object Cancel {
  
  @scala.inline
  def apply(source: String | Url, target: String | Url): Cancel = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelOps[Self <: Cancel] (val x: Self) extends AnyVal {
    
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
    def setSource(value: String | Url): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: String | Url): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    
    @scala.inline
    def setCreate_target(value: Boolean): Self = this.set("create_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate_target: Self = this.set("create_target", js.undefined)
    
    @scala.inline
    def setDoc_idsVarargs(value: String*): Self = this.set("doc_ids", js.Array(value :_*))
    
    @scala.inline
    def setDoc_ids(value: js.Array[String]): Self = this.set("doc_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoc_ids: Self = this.set("doc_ids", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setQuery_params(value: js.Any): Self = this.set("query_params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery_params: Self = this.set("query_params", js.undefined)
  }
}
