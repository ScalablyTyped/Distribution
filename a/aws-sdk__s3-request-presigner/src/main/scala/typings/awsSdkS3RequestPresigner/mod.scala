package typings.awsSdkS3RequestPresigner

import typings.awsSdkS3RequestPresigner.distTypesPresignerMod.S3RequestPresignerOptions
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typings.awsSdkTypes.distTypesSignatureMod.RequestPresigningArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/s3-request-presigner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/s3-request-presigner", "S3RequestPresigner")
  @js.native
  open class S3RequestPresigner protected ()
    extends typings.awsSdkS3RequestPresigner.distTypesPresignerMod.S3RequestPresigner {
    def this(options: S3RequestPresignerOptions) = this()
  }
  
  inline def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[Any, InputTypesUnion, MetadataBearer, Any],
    command: Command[InputType, OutputType, Any, InputTypesUnion, MetadataBearer]
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignedUrl")(client.asInstanceOf[js.Any], command.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[Any, InputTypesUnion, MetadataBearer, Any],
    command: Command[InputType, OutputType, Any, InputTypesUnion, MetadataBearer],
    options: RequestPresigningArguments
  ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSignedUrl")(client.asInstanceOf[js.Any], command.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
