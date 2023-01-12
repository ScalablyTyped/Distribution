package typings.cassandraDriver.mod

import typings.cassandraDriver.libTypesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQueryOptions
  extends StObject
     with QueryOptions {
  
  var graphLanguage: js.UndefOr[String] = js.undefined
  
  var graphName: js.UndefOr[String] = js.undefined
  
  var graphReadConsistency: js.UndefOr[consistencies] = js.undefined
  
  var graphSource: js.UndefOr[String] = js.undefined
  
  var graphWriteConsistency: js.UndefOr[consistencies] = js.undefined
}
object GraphQueryOptions {
  
  inline def apply(): GraphQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setGraphLanguage(value: String): Self = StObject.set(x, "graphLanguage", value.asInstanceOf[js.Any])
    
    inline def setGraphLanguageUndefined: Self = StObject.set(x, "graphLanguage", js.undefined)
    
    inline def setGraphName(value: String): Self = StObject.set(x, "graphName", value.asInstanceOf[js.Any])
    
    inline def setGraphNameUndefined: Self = StObject.set(x, "graphName", js.undefined)
    
    inline def setGraphReadConsistency(value: consistencies): Self = StObject.set(x, "graphReadConsistency", value.asInstanceOf[js.Any])
    
    inline def setGraphReadConsistencyUndefined: Self = StObject.set(x, "graphReadConsistency", js.undefined)
    
    inline def setGraphSource(value: String): Self = StObject.set(x, "graphSource", value.asInstanceOf[js.Any])
    
    inline def setGraphSourceUndefined: Self = StObject.set(x, "graphSource", js.undefined)
    
    inline def setGraphWriteConsistency(value: consistencies): Self = StObject.set(x, "graphWriteConsistency", value.asInstanceOf[js.Any])
    
    inline def setGraphWriteConsistencyUndefined: Self = StObject.set(x, "graphWriteConsistency", js.undefined)
  }
}
