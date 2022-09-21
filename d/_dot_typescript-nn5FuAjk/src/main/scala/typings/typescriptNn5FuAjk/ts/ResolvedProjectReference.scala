package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedProjectReference extends StObject {
  
  var commandLine: ParsedCommandLine
  
  var references: js.UndefOr[Array[js.UndefOr[ResolvedProjectReference]]] = js.undefined
  
  var sourceFile: SourceFile
}
object ResolvedProjectReference {
  
  inline def apply(commandLine: ParsedCommandLine, sourceFile: SourceFile): ResolvedProjectReference = {
    val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], sourceFile = sourceFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedProjectReference]
  }
  
  extension [Self <: ResolvedProjectReference](x: Self) {
    
    inline def setCommandLine(value: ParsedCommandLine): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    inline def setReferences(value: Array[js.UndefOr[ResolvedProjectReference]]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    inline def setSourceFile(value: SourceFile): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
  }
}
