package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query extends js.Object {
  
  /**
    * List of selectors that define the query. An object must satisfy all of the selectors to match the query.
    */
  var selectors: js.UndefOr[SelectorList] = js.native
}
object Query {
  
  @scala.inline
  def apply(): Query = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
    
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
    def setSelectorsVarargs(value: Selector*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: SelectorList): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
  }
}
