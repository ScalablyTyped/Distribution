package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser", "UploadPartCommand")
@js.native
class UploadPartCommand protected ()
  extends typings.awsSdkClientS3Browser.uploadPartCommandMod.UploadPartCommand {
  def this(input: UploadPartInput[Blob]) = this()
}
