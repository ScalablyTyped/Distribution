package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryInfo extends StObject {
  
  /**
    * Returns a FieldInfo object.
    */
  var SelectFields: js.UndefOr[FieldInfoList] = js.native
}
object QueryInfo {
  
  @scala.inline
  def apply(): QueryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryInfo]
  }
  
  @scala.inline
  implicit class QueryInfoMutableBuilder[Self <: QueryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectFields(value: FieldInfoList): Self = StObject.set(x, "SelectFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectFieldsUndefined: Self = StObject.set(x, "SelectFields", js.undefined)
    
    @scala.inline
    def setSelectFieldsVarargs(value: FieldInfo*): Self = StObject.set(x, "SelectFields", js.Array(value :_*))
  }
}
