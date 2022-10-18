package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a SourcesConfig. */
trait ISourcesConfig extends StObject {
  
  /** SourcesConfig absolutePaths */
  var absolutePaths: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** SourcesConfig filters */
  var filters: js.UndefOr[ISourcesFilterConfig | Null] = js.undefined
  
  /** SourcesConfig language */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /** SourcesConfig order */
  var order: js.UndefOr[ISourcesOrder | Null] = js.undefined
}
object ISourcesConfig {
  
  inline def apply(): ISourcesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourcesConfig]
  }
  
  extension [Self <: ISourcesConfig](x: Self) {
    
    inline def setAbsolutePaths(value: js.Array[String]): Self = StObject.set(x, "absolutePaths", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathsNull: Self = StObject.set(x, "absolutePaths", null)
    
    inline def setAbsolutePathsUndefined: Self = StObject.set(x, "absolutePaths", js.undefined)
    
    inline def setAbsolutePathsVarargs(value: String*): Self = StObject.set(x, "absolutePaths", js.Array(value*))
    
    inline def setFilters(value: ISourcesFilterConfig): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersNull: Self = StObject.set(x, "filters", null)
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setOrder(value: ISourcesOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderNull: Self = StObject.set(x, "order", null)
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
