package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTablesResponse extends StObject {
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of the requested Table objects. The SearchTables response returns only the tables that you have access to.
    */
  var TableList: js.UndefOr[typings.awsSdk.glueMod.TableList] = js.native
}
object SearchTablesResponse {
  
  @scala.inline
  def apply(): SearchTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTablesResponse]
  }
  
  @scala.inline
  implicit class SearchTablesResponseMutableBuilder[Self <: SearchTablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTableList(value: TableList): Self = StObject.set(x, "TableList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableListUndefined: Self = StObject.set(x, "TableList", js.undefined)
    
    @scala.inline
    def setTableListVarargs(value: Table*): Self = StObject.set(x, "TableList", js.Array(value :_*))
  }
}
