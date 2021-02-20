package typings.awsSdkS3RequestPresigner

import typings.awsSdkSmithyClient.mod.Client
import typings.awsSdkSmithyClient.mod.Command
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.signatureMod.RequestPresigningArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSignedUrlMod {
  
  @JSImport("@aws-sdk/s3-request-presigner/dist/cjs/getSignedUrl", "getSignedUrl")
  @js.native
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer]
  ): js.Promise[String] = js.native
  @JSImport("@aws-sdk/s3-request-presigner/dist/cjs/getSignedUrl", "getSignedUrl")
  @js.native
  def getSignedUrl[InputTypesUnion /* <: js.Object */, InputType /* <: InputTypesUnion */, OutputType /* <: MetadataBearer */](
    client: Client[_, InputTypesUnion, MetadataBearer, _],
    command: Command[InputType, OutputType, _, InputTypesUnion, MetadataBearer],
    options: RequestPresigningArguments
  ): js.Promise[String] = js.native
}
