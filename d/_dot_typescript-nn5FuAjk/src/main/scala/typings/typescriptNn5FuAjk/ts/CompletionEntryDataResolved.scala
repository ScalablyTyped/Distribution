package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryDataResolved
  extends StObject
     with CompletionEntryDataAutoImport
     with CompletionEntryData {
  
  @JSName("moduleSpecifier")
  var moduleSpecifier_CompletionEntryDataResolved: java.lang.String
}
object CompletionEntryDataResolved {
  
  inline def apply(exportName: java.lang.String, moduleSpecifier: java.lang.String): CompletionEntryDataResolved = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any], moduleSpecifier = moduleSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDataResolved]
  }
  
  extension [Self <: CompletionEntryDataResolved](x: Self) {
    
    inline def setModuleSpecifier(value: java.lang.String): Self = StObject.set(x, "moduleSpecifier", value.asInstanceOf[js.Any])
  }
}
