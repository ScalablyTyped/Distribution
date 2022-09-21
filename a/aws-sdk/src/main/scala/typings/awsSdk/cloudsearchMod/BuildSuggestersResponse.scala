package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSuggestersResponse extends StObject {
  
  var FieldNames: js.UndefOr[FieldNameList] = js.undefined
}
object BuildSuggestersResponse {
  
  inline def apply(): BuildSuggestersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSuggestersResponse]
  }
  
  extension [Self <: BuildSuggestersResponse](x: Self) {
    
    inline def setFieldNames(value: FieldNameList): Self = StObject.set(x, "FieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "FieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: FieldName*): Self = StObject.set(x, "FieldNames", js.Array(value*))
  }
}
