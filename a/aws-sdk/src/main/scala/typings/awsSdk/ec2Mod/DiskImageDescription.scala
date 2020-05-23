package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskImageDescription extends js.Object {
  /**
    * The checksum computed for the disk image.
    */
  var Checksum: js.UndefOr[String] = js.native
  /**
    * The disk image format.
    */
  var Format: js.UndefOr[DiskImageFormat] = js.native
  /**
    * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the Authenticating REST Requests topic in the Amazon Simple Storage Service Developer Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  var ImportManifestUrl: js.UndefOr[String] = js.native
  /**
    * The size of the disk image, in GiB.
    */
  var Size: js.UndefOr[Long] = js.native
}

object DiskImageDescription {
  @scala.inline
  def apply(
    Checksum: String = null,
    Format: DiskImageFormat = null,
    ImportManifestUrl: String = null,
    Size: js.UndefOr[Long] = js.undefined
  ): DiskImageDescription = {
    val __obj = js.Dynamic.literal()
    if (Checksum != null) __obj.updateDynamic("Checksum")(Checksum.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (ImportManifestUrl != null) __obj.updateDynamic("ImportManifestUrl")(ImportManifestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskImageDescription]
  }
}

