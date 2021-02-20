package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a ParameterType. */
@js.native
trait IParameterType extends StObject {
  
  /** ParameterType name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** ParameterType preferForRegularExpressionMatch */
  var preferForRegularExpressionMatch: js.UndefOr[Boolean | Null] = js.native
  
  /** ParameterType regularExpressions */
  var regularExpressions: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ParameterType useForSnippets */
  var useForSnippets: js.UndefOr[Boolean | Null] = js.native
}
object IParameterType {
  
  @scala.inline
  def apply(): IParameterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IParameterType]
  }
  
  @scala.inline
  implicit class IParameterTypeMutableBuilder[Self <: IParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPreferForRegularExpressionMatch(value: Boolean): Self = StObject.set(x, "preferForRegularExpressionMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferForRegularExpressionMatchNull: Self = StObject.set(x, "preferForRegularExpressionMatch", null)
    
    @scala.inline
    def setPreferForRegularExpressionMatchUndefined: Self = StObject.set(x, "preferForRegularExpressionMatch", js.undefined)
    
    @scala.inline
    def setRegularExpressions(value: js.Array[String]): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegularExpressionsNull: Self = StObject.set(x, "regularExpressions", null)
    
    @scala.inline
    def setRegularExpressionsUndefined: Self = StObject.set(x, "regularExpressions", js.undefined)
    
    @scala.inline
    def setRegularExpressionsVarargs(value: String*): Self = StObject.set(x, "regularExpressions", js.Array(value :_*))
    
    @scala.inline
    def setUseForSnippets(value: Boolean): Self = StObject.set(x, "useForSnippets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseForSnippetsNull: Self = StObject.set(x, "useForSnippets", null)
    
    @scala.inline
    def setUseForSnippetsUndefined: Self = StObject.set(x, "useForSnippets", js.undefined)
  }
}
