package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleExecuteParams extends StObject {
  
  var ownerUri: String = js.native
  
  var queryString: String = js.native
}
object SimpleExecuteParams {
  
  @scala.inline
  def apply(ownerUri: String, queryString: String): SimpleExecuteParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleExecuteParams]
  }
  
  @scala.inline
  implicit class SimpleExecuteParamsMutableBuilder[Self <: SimpleExecuteParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
  }
}
