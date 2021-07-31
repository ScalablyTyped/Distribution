package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTablesResponse extends StObject {
  
  /**
    * A continuation token, present if the current list segment is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of the requested Table objects.
    */
  var TableList: js.UndefOr[typings.awsSdk.glueMod.TableList] = js.undefined
}
object GetTablesResponse {
  
  @scala.inline
  def apply(): GetTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTablesResponse]
  }
  
  @scala.inline
  implicit class GetTablesResponseMutableBuilder[Self <: GetTablesResponse] (val x: Self) extends AnyVal {
    
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
