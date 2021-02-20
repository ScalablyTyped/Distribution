package typings.cassandraDriver.mod

import typings.cassandraDriver.typesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQueryOptions extends QueryOptions {
  
  var graphLanguage: js.UndefOr[String] = js.native
  
  var graphName: js.UndefOr[String] = js.native
  
  var graphReadConsistency: js.UndefOr[consistencies] = js.native
  
  var graphSource: js.UndefOr[String] = js.native
  
  var graphWriteConsistency: js.UndefOr[consistencies] = js.native
}
object GraphQueryOptions {
  
  @scala.inline
  def apply(): GraphQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryOptions]
  }
  
  @scala.inline
  implicit class GraphQueryOptionsMutableBuilder[Self <: GraphQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraphLanguage(value: String): Self = StObject.set(x, "graphLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphLanguageUndefined: Self = StObject.set(x, "graphLanguage", js.undefined)
    
    @scala.inline
    def setGraphName(value: String): Self = StObject.set(x, "graphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphNameUndefined: Self = StObject.set(x, "graphName", js.undefined)
    
    @scala.inline
    def setGraphReadConsistency(value: consistencies): Self = StObject.set(x, "graphReadConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphReadConsistencyUndefined: Self = StObject.set(x, "graphReadConsistency", js.undefined)
    
    @scala.inline
    def setGraphSource(value: String): Self = StObject.set(x, "graphSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphSourceUndefined: Self = StObject.set(x, "graphSource", js.undefined)
    
    @scala.inline
    def setGraphWriteConsistency(value: consistencies): Self = StObject.set(x, "graphWriteConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphWriteConsistencyUndefined: Self = StObject.set(x, "graphWriteConsistency", js.undefined)
  }
}
