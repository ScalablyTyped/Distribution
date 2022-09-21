package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProgramOptions extends StObject {
  
  var configFileParsingDiagnostics: js.UndefOr[Array[Diagnostic]] = js.undefined
  
  var host: js.UndefOr[CompilerHost] = js.undefined
  
  var oldProgram: js.UndefOr[Program] = js.undefined
  
  var options: CompilerOptions
  
  var projectReferences: js.UndefOr[Array[ProjectReference]] = js.undefined
  
  var rootNames: Array[java.lang.String]
}
object CreateProgramOptions {
  
  inline def apply(options: CompilerOptions, rootNames: Array[java.lang.String]): CreateProgramOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgramOptions]
  }
  
  extension [Self <: CreateProgramOptions](x: Self) {
    
    inline def setConfigFileParsingDiagnostics(value: Array[Diagnostic]): Self = StObject.set(x, "configFileParsingDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setConfigFileParsingDiagnosticsUndefined: Self = StObject.set(x, "configFileParsingDiagnostics", js.undefined)
    
    inline def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOldProgram(value: Program): Self = StObject.set(x, "oldProgram", value.asInstanceOf[js.Any])
    
    inline def setOldProgramUndefined: Self = StObject.set(x, "oldProgram", js.undefined)
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProjectReferences(value: Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
    
    inline def setProjectReferencesUndefined: Self = StObject.set(x, "projectReferences", js.undefined)
    
    inline def setRootNames(value: Array[java.lang.String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
  }
}
