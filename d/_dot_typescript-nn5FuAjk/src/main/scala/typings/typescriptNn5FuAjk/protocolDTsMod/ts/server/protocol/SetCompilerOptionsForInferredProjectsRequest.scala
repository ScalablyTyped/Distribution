package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.compilerOptionsForInferredProjects
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to set compiler options for inferred projects.
  * External projects are opened / closed explicitly.
  * Configured projects are opened when user opens loose file that has 'tsconfig.json' or 'jsconfig.json' anywhere in one of containing folders.
  * This configuration file will be used to obtain a list of files and configuration settings for the project.
  * Inferred projects are created when user opens a loose file that is not the part of external project
  * or configured project and will contain only open file and transitive closure of referenced files if 'useOneInferredProject' is false,
  * or all open loose files and its transitive closure of referenced files if 'useOneInferredProject' is true.
  */
trait SetCompilerOptionsForInferredProjectsRequest
  extends StObject
     with Request {
  
  @JSName("arguments")
  var arguments_SetCompilerOptionsForInferredProjectsRequest: SetCompilerOptionsForInferredProjectsArgs
  
  @JSName("command")
  var command_SetCompilerOptionsForInferredProjectsRequest: compilerOptionsForInferredProjects
}
object SetCompilerOptionsForInferredProjectsRequest {
  
  inline def apply(arguments: SetCompilerOptionsForInferredProjectsArgs, seq: Double): SetCompilerOptionsForInferredProjectsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = "compilerOptionsForInferredProjects", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[SetCompilerOptionsForInferredProjectsRequest]
  }
  
  extension [Self <: SetCompilerOptionsForInferredProjectsRequest](x: Self) {
    
    inline def setArguments(value: SetCompilerOptionsForInferredProjectsArgs): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCommand(value: compilerOptionsForInferredProjects): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
  }
}
