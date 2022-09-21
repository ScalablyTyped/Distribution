package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ParameterType. */
trait IParameterType extends StObject {
  
  /** ParameterType name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** ParameterType preferForRegularExpressionMatch */
  var preferForRegularExpressionMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /** ParameterType regularExpressions */
  var regularExpressions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ParameterType useForSnippets */
  var useForSnippets: js.UndefOr[Boolean | Null] = js.undefined
}
object IParameterType {
  
  inline def apply(): IParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParameterType]
  }
  
  extension [Self <: IParameterType](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreferForRegularExpressionMatch(value: Boolean): Self = StObject.set(x, "preferForRegularExpressionMatch", value.asInstanceOf[js.Any])
    
    inline def setPreferForRegularExpressionMatchNull: Self = StObject.set(x, "preferForRegularExpressionMatch", null)
    
    inline def setPreferForRegularExpressionMatchUndefined: Self = StObject.set(x, "preferForRegularExpressionMatch", js.undefined)
    
    inline def setRegularExpressions(value: js.Array[String]): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
    
    inline def setRegularExpressionsNull: Self = StObject.set(x, "regularExpressions", null)
    
    inline def setRegularExpressionsUndefined: Self = StObject.set(x, "regularExpressions", js.undefined)
    
    inline def setRegularExpressionsVarargs(value: String*): Self = StObject.set(x, "regularExpressions", js.Array(value*))
    
    inline def setUseForSnippets(value: Boolean): Self = StObject.set(x, "useForSnippets", value.asInstanceOf[js.Any])
    
    inline def setUseForSnippetsNull: Self = StObject.set(x, "useForSnippets", null)
    
    inline def setUseForSnippetsUndefined: Self = StObject.set(x, "useForSnippets", js.undefined)
  }
}
