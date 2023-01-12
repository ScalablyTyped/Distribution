package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourcesFilterConfig. */
trait ISourcesFilterConfig extends StObject {
  
  /** SourcesFilterConfig nameRegularExpressions */
  var nameRegularExpressions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** SourcesFilterConfig tagExpression */
  var tagExpression: js.UndefOr[String | Null] = js.undefined
  
  /** SourcesFilterConfig uriToLinesMapping */
  var uriToLinesMapping: js.UndefOr[js.Array[IUriToLinesMapping] | Null] = js.undefined
}
object ISourcesFilterConfig {
  
  inline def apply(): ISourcesFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourcesFilterConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISourcesFilterConfig] (val x: Self) extends AnyVal {
    
    inline def setNameRegularExpressions(value: js.Array[String]): Self = StObject.set(x, "nameRegularExpressions", value.asInstanceOf[js.Any])
    
    inline def setNameRegularExpressionsNull: Self = StObject.set(x, "nameRegularExpressions", null)
    
    inline def setNameRegularExpressionsUndefined: Self = StObject.set(x, "nameRegularExpressions", js.undefined)
    
    inline def setNameRegularExpressionsVarargs(value: String*): Self = StObject.set(x, "nameRegularExpressions", js.Array(value*))
    
    inline def setTagExpression(value: String): Self = StObject.set(x, "tagExpression", value.asInstanceOf[js.Any])
    
    inline def setTagExpressionNull: Self = StObject.set(x, "tagExpression", null)
    
    inline def setTagExpressionUndefined: Self = StObject.set(x, "tagExpression", js.undefined)
    
    inline def setUriToLinesMapping(value: js.Array[IUriToLinesMapping]): Self = StObject.set(x, "uriToLinesMapping", value.asInstanceOf[js.Any])
    
    inline def setUriToLinesMappingNull: Self = StObject.set(x, "uriToLinesMapping", null)
    
    inline def setUriToLinesMappingUndefined: Self = StObject.set(x, "uriToLinesMapping", js.undefined)
    
    inline def setUriToLinesMappingVarargs(value: IUriToLinesMapping*): Self = StObject.set(x, "uriToLinesMapping", js.Array(value*))
  }
}
