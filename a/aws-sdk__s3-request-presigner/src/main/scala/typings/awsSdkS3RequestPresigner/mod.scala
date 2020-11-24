package typings.awsSdkS3RequestPresigner

import typings.awsSdkS3RequestPresigner.presignerMod.S3RequestPresignerOptions
import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.signatureMod.RequestPresigningArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/s3-request-presigner", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer]
  ): js.Promise[String] = js.native
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer],
    options: RequestPresigningArguments
  ): js.Promise[String] = js.native
  
  @js.native
  class S3RequestPresigner protected ()
    extends typings.awsSdkS3RequestPresigner.presignerMod.S3RequestPresigner {
    def this(options: S3RequestPresignerOptions) = this()
  }
}
