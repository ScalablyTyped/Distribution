package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReferencedSymbolEntry
  extends StObject
     with ReferenceEntry {
  
  var isDefinition: js.UndefOr[Boolean] = js.undefined
}
object ReferencedSymbolEntry {
  
  inline def apply(fileName: java.lang.String, isWriteAccess: Boolean, textSpan: TextSpan): ReferencedSymbolEntry = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], isWriteAccess = isWriteAccess.asInstanceOf[js.Any], textSpan = textSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencedSymbolEntry]
  }
  
  extension [Self <: ReferencedSymbolEntry](x: Self) {
    
    inline def setIsDefinition(value: Boolean): Self = StObject.set(x, "isDefinition", value.asInstanceOf[js.Any])
    
    inline def setIsDefinitionUndefined: Self = StObject.set(x, "isDefinition", js.undefined)
  }
}
