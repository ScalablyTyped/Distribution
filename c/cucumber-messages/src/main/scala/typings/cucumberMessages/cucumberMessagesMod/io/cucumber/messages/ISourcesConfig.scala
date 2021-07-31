package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

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
  
  @scala.inline
  def apply(): ISourcesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISourcesConfig]
  }
  
  @scala.inline
  implicit class ISourcesConfigMutableBuilder[Self <: ISourcesConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePaths(value: js.Array[String]): Self = StObject.set(x, "absolutePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePathsNull: Self = StObject.set(x, "absolutePaths", null)
    
    @scala.inline
    def setAbsolutePathsUndefined: Self = StObject.set(x, "absolutePaths", js.undefined)
    
    @scala.inline
    def setAbsolutePathsVarargs(value: String*): Self = StObject.set(x, "absolutePaths", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: ISourcesFilterConfig): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersNull: Self = StObject.set(x, "filters", null)
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageNull: Self = StObject.set(x, "language", null)
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setOrder(value: ISourcesOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderNull: Self = StObject.set(x, "order", null)
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
