package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesPutObjectInputMod.PutObjectInput
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-browser", "PutObjectCommand")
@js.native
class PutObjectCommand protected ()
  extends typings.awsSdkClientS3Browser.putObjectCommandMod.PutObjectCommand {
  def this(input: PutObjectInput[Blob]) = this()
}

