package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument for SetCompilerOptionsForInferredProjectsRequest request.
  */
trait SetCompilerOptionsForInferredProjectsArgs extends StObject {
  
  /**
    * Compiler options to be used with inferred projects.
    */
  var options: InferredProjectCompilerOptions
  
  /**
    * Specifies the project root path used to scope compiler options.
    * It is an error to provide this property if the server has not been started with
    * `useInferredProjectPerProjectRoot` enabled.
    */
  var projectRootPath: js.UndefOr[String] = js.undefined
}
object SetCompilerOptionsForInferredProjectsArgs {
  
  inline def apply(options: InferredProjectCompilerOptions): SetCompilerOptionsForInferredProjectsArgs = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCompilerOptionsForInferredProjectsArgs]
  }
  
  extension [Self <: SetCompilerOptionsForInferredProjectsArgs](x: Self) {
    
    inline def setOptions(value: InferredProjectCompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setProjectRootPath(value: String): Self = StObject.set(x, "projectRootPath", value.asInstanceOf[js.Any])
    
    inline def setProjectRootPathUndefined: Self = StObject.set(x, "projectRootPath", js.undefined)
  }
}
