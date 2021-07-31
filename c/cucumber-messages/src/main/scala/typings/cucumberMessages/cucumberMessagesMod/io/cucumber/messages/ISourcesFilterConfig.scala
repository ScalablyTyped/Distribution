package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

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
  
  @scala.inline
  def apply(): ISourcesFilterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourcesFilterConfig]
  }
  
  @scala.inline
  implicit class ISourcesFilterConfigMutableBuilder[Self <: ISourcesFilterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameRegularExpressions(value: js.Array[String]): Self = StObject.set(x, "nameRegularExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameRegularExpressionsNull: Self = StObject.set(x, "nameRegularExpressions", null)
    
    @scala.inline
    def setNameRegularExpressionsUndefined: Self = StObject.set(x, "nameRegularExpressions", js.undefined)
    
    @scala.inline
    def setNameRegularExpressionsVarargs(value: String*): Self = StObject.set(x, "nameRegularExpressions", js.Array(value :_*))
    
    @scala.inline
    def setTagExpression(value: String): Self = StObject.set(x, "tagExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagExpressionNull: Self = StObject.set(x, "tagExpression", null)
    
    @scala.inline
    def setTagExpressionUndefined: Self = StObject.set(x, "tagExpression", js.undefined)
    
    @scala.inline
    def setUriToLinesMapping(value: js.Array[IUriToLinesMapping]): Self = StObject.set(x, "uriToLinesMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriToLinesMappingNull: Self = StObject.set(x, "uriToLinesMapping", null)
    
    @scala.inline
    def setUriToLinesMappingUndefined: Self = StObject.set(x, "uriToLinesMapping", js.undefined)
    
    @scala.inline
    def setUriToLinesMappingVarargs(value: IUriToLinesMapping*): Self = StObject.set(x, "uriToLinesMapping", js.Array(value :_*))
  }
}
