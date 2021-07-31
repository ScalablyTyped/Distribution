package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSuggestersResponse extends StObject {
  
  var FieldNames: js.UndefOr[FieldNameList] = js.undefined
}
object BuildSuggestersResponse {
  
  @scala.inline
  def apply(): BuildSuggestersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSuggestersResponse]
  }
  
  @scala.inline
  implicit class BuildSuggestersResponseMutableBuilder[Self <: BuildSuggestersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldNames(value: FieldNameList): Self = StObject.set(x, "FieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "FieldNames", js.undefined)
    
    @scala.inline
    def setFieldNamesVarargs(value: FieldName*): Self = StObject.set(x, "FieldNames", js.Array(value :_*))
  }
}
