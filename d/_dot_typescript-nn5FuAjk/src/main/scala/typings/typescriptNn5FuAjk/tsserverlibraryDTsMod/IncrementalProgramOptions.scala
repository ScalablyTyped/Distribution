package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncrementalProgramOptions[T /* <: BuilderProgram */] extends StObject {
  
  var configFileParsingDiagnostics: js.UndefOr[Array[Diagnostic]] = js.undefined
  
  var createProgram: js.UndefOr[CreateProgram_[T]] = js.undefined
  
  var host: js.UndefOr[CompilerHost] = js.undefined
  
  var options: CompilerOptions
  
  var projectReferences: js.UndefOr[Array[ProjectReference]] = js.undefined
  
  var rootNames: Array[java.lang.String]
}
object IncrementalProgramOptions {
  
  inline def apply[T /* <: BuilderProgram */](options: CompilerOptions, rootNames: Array[java.lang.String]): IncrementalProgramOptions[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], rootNames = rootNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncrementalProgramOptions[T]]
  }
  
  extension [Self <: IncrementalProgramOptions[?], T /* <: BuilderProgram */](x: Self & IncrementalProgramOptions[T]) {
    
    inline def setConfigFileParsingDiagnostics(value: Array[Diagnostic]): Self = StObject.set(x, "configFileParsingDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setConfigFileParsingDiagnosticsUndefined: Self = StObject.set(x, "configFileParsingDiagnostics", js.undefined)
    
    inline def setCreateProgram(
      value: (/* rootNames */ js.UndefOr[Array[java.lang.String]], /* options */ js.UndefOr[CompilerOptions], /* host */ js.UndefOr[CompilerHost], /* oldProgram */ js.UndefOr[T], /* configFileParsingDiagnostics */ js.UndefOr[Array[Diagnostic]], /* projectReferences */ js.UndefOr[Array[ProjectReference]]) => T
    ): Self = StObject.set(x, "createProgram", js.Any.fromFunction6(value))
    
    inline def setCreateProgramUndefined: Self = StObject.set(x, "createProgram", js.undefined)
    
    inline def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProjectReferences(value: Array[ProjectReference]): Self = StObject.set(x, "projectReferences", value.asInstanceOf[js.Any])
    
    inline def setProjectReferencesUndefined: Self = StObject.set(x, "projectReferences", js.undefined)
    
    inline def setRootNames(value: Array[java.lang.String]): Self = StObject.set(x, "rootNames", value.asInstanceOf[js.Any])
  }
}
