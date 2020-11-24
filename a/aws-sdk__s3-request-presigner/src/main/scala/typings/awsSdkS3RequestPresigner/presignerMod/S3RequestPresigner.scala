package typings.awsSdkS3RequestPresigner.presignerMod

import typings.awsSdkTypes.signatureMod.RequestPresigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/s3-request-presigner/dist/cjs/presigner", "S3RequestPresigner")
@js.native
class S3RequestPresigner protected () extends RequestPresigner {
  def this(options: S3RequestPresignerOptions) = this()
  
  val signer: js.Any = js.native
}
