package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryStringObject extends StObject {
  
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
  implicit class QueryStringObjectMutableBuilder[Self <: QueryStringObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOption(value: Boolean): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    @scala.inline
    def setQueryStringsAllowList(value: StringList): Self = StObject.set(x, "queryStringsAllowList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryStringsAllowListUndefined: Self = StObject.set(x, "queryStringsAllowList", js.undefined)
    
    @scala.inline
    def setQueryStringsAllowListVarargs(value: String*): Self = StObject.set(x, "queryStringsAllowList", js.Array(value :_*))
  }
}
