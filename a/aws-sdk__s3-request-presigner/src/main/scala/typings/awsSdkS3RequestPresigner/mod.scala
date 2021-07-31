package typings.awsSdkS3RequestPresigner

import typings.awsSdkS3RequestPresigner.presignerMod.S3RequestPresignerOptions
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.signatureMod.RequestPresigningArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/s3-request-presigner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/s3-request-presigner", "S3RequestPresigner")
  @js.native
  class S3RequestPresigner protected ()
    extends typings.awsSdkS3RequestPresigner.presignerMod.S3RequestPresigner {
    def this(options: S3RequestPresignerOptions) = this()
  }
  
  @scala.inline
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[js.Any, InputTypesUnion, MetadataBearer, js.Any],
    command: Command[InputType, OutputType, js.Any, InputTypesUnion, MetadataBearer]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignedUrl")(client.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  @scala.inline
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[js.Any, InputTypesUnion, MetadataBearer, js.Any],
    command: Command[InputType, OutputType, js.Any, InputTypesUnion, MetadataBearer],
    options: RequestPresigningArguments
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignedUrl")(client.asInstanceOf[js.Any], command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
