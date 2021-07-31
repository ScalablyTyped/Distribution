package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexDocumentsResponse extends StObject {
  
  /**
    * The names of the fields that are currently being indexed.
    */
  var FieldNames: js.UndefOr[FieldNameList] = js.undefined
}
object IndexDocumentsResponse {
  
  @scala.inline
  def apply(): IndexDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndexDocumentsResponse]
  }
  
  @scala.inline
  implicit class IndexDocumentsResponseMutableBuilder[Self <: IndexDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldNames(value: FieldNameList): Self = StObject.set(x, "FieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "FieldNames", js.undefined)
    
    @scala.inline
    def setFieldNamesVarargs(value: FieldName*): Self = StObject.set(x, "FieldNames", js.Array(value :_*))
  }
}
