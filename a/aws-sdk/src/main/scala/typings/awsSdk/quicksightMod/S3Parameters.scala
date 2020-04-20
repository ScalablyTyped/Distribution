package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3Parameters extends js.Object {
  /**
    * Location of the Amazon S3 manifest file. This is NULL if the manifest file was uploaded in the console.
    */
  var ManifestFileLocation: typings.awsSdk.quicksightMod.ManifestFileLocation = js.native
}

object S3Parameters {
  @scala.inline
  def apply(ManifestFileLocation: ManifestFileLocation): S3Parameters = {
    val __obj = js.Dynamic.literal(ManifestFileLocation = ManifestFileLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Parameters]
  }
}

