package typings.cucumberGherkinStreams

import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultDialect extends StObject {
    
    var defaultDialect: js.UndefOr[String] = js.undefined
    
    var includeGherkinDocument: js.UndefOr[Boolean] = js.undefined
    
    var includePickles: js.UndefOr[Boolean] = js.undefined
    
    var includeSource: js.UndefOr[Boolean] = js.undefined
    
    var newId: js.UndefOr[NewId] = js.undefined
  }
  object DefaultDialect {
    
    inline def apply(): DefaultDialect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultDialect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultDialect] (val x: Self) extends AnyVal {
      
      inline def setDefaultDialect(value: String): Self = StObject.set(x, "defaultDialect", value.asInstanceOf[js.Any])
      
      inline def setDefaultDialectUndefined: Self = StObject.set(x, "defaultDialect", js.undefined)
      
      inline def setIncludeGherkinDocument(value: Boolean): Self = StObject.set(x, "includeGherkinDocument", value.asInstanceOf[js.Any])
      
      inline def setIncludeGherkinDocumentUndefined: Self = StObject.set(x, "includeGherkinDocument", js.undefined)
      
      inline def setIncludePickles(value: Boolean): Self = StObject.set(x, "includePickles", value.asInstanceOf[js.Any])
      
      inline def setIncludePicklesUndefined: Self = StObject.set(x, "includePickles", js.undefined)
      
      inline def setIncludeSource(value: Boolean): Self = StObject.set(x, "includeSource", value.asInstanceOf[js.Any])
      
      inline def setIncludeSourceUndefined: Self = StObject.set(x, "includeSource", js.undefined)
      
      inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
      
      inline def setNewIdUndefined: Self = StObject.set(x, "newId", js.undefined)
    }
  }
}
