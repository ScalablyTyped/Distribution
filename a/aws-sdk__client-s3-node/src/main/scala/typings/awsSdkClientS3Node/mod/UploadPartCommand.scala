package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node", "UploadPartCommand")
@js.native
class UploadPartCommand protected ()
  extends typings.awsSdkClientS3Node.uploadPartCommandMod.UploadPartCommand {
  def this(input: UploadPartInput[Readable]) = this()
}

