package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStringObject extends js.Object {
  
  /**
    * Indicates whether the distribution forwards and caches based on query strings.
    */
  var option: js.UndefOr[Boolean] = js.native
  
  /**
    * The specific query strings that the distribution forwards to the origin. Your distribution will cache content based on the specified query strings. If the option parameter is true, then your distribution forwards all query strings, regardless of what you specify using the queryStringsAllowList parameter.
    */
  var queryStringsAllowList: js.UndefOr[StringList] = js.native
}
object QueryStringObject {
  
  @scala.inline
  def apply(): QueryStringObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStringObject]
  }
  
  @scala.inline
  implicit class QueryStringObjectOps[Self <: QueryStringObject] (val x: Self) extends AnyVal {
    
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
    def setOption(value: Boolean): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("option", js.undefined)
    
    @scala.inline
    def setQueryStringsAllowListVarargs(value: String*): Self = this.set("queryStringsAllowList", js.Array(value :_*))
    
    @scala.inline
    def setQueryStringsAllowList(value: StringList): Self = this.set("queryStringsAllowList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryStringsAllowList: Self = this.set("queryStringsAllowList", js.undefined)
  }
}
