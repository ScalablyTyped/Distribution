package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typings.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput
import typings.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typings.awsSdkTypes.commandMod.Command
import typings.awsSdkTypes.middlewareMod.Handler
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getObjectTorrentCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetObjectTorrentCommand", "GetObjectTorrentCommand")
  @js.native
  class GetObjectTorrentCommand protected () extends Command[
          InputTypesUnion, 
          GetObjectTorrentInput, 
          OutputTypesUnion, 
          GetObjectTorrentOutput[Blob], 
          S3ResolvedConfiguration
        ] {
    def this(input: GetObjectTorrentInput) = this()
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ js.Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTorrentInput, GetObjectTorrentOutput[Blob]] = js.native
  }
}
