package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTableVersionsResponse extends StObject {
  
  /**
    * A continuation token, if the list of available versions does not include the last one.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of strings identifying available versions of the specified table.
    */
  var TableVersions: js.UndefOr[GetTableVersionsList] = js.native
}
object GetTableVersionsResponse {
  
  @scala.inline
  def apply(): GetTableVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTableVersionsResponse]
  }
  
  @scala.inline
  implicit class GetTableVersionsResponseMutableBuilder[Self <: GetTableVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTableVersions(value: GetTableVersionsList): Self = StObject.set(x, "TableVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableVersionsUndefined: Self = StObject.set(x, "TableVersions", js.undefined)
    
    @scala.inline
    def setTableVersionsVarargs(value: TableVersion*): Self = StObject.set(x, "TableVersions", js.Array(value :_*))
  }
}
