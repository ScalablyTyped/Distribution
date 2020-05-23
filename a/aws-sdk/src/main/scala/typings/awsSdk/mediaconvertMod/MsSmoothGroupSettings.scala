package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSmoothGroupSettings extends js.Object {
  /**
    * By default, the service creates one .ism Microsoft Smooth Streaming manifest for each Microsoft Smooth Streaming output group in your job. This default manifest references every output in the output group. To create additional manifests that reference a subset of the outputs in the output group, specify a list of them here.
    */
  var AdditionalManifests: js.UndefOr[listOfMsSmoothAdditionalManifest] = js.native
  /**
    * COMBINE_DUPLICATE_STREAMS combines identical audio encoding settings across a Microsoft Smooth output group into a single audio stream.
    */
  var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.native
  /**
    * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
    */
  var Destination: js.UndefOr[stringPatternS3] = js.native
  /**
    * Settings associated with the destination. Will vary based on the type of destination
    */
  var DestinationSettings: js.UndefOr[typings.awsSdk.mediaconvertMod.DestinationSettings] = js.native
  /**
    * If you are using DRM, set DRM System (MsSmoothEncryptionSettings) to specify the value SpekeKeyProvider.
    */
  var Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.native
  /**
    * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be compatible with GOP size and frame rate.
    */
  var FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Manifest encoding (MsSmoothManifestEncoding) to specify the encoding format for the server and client manifest. Valid options are utf8 and utf16.
    */
  var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.native
}

object MsSmoothGroupSettings {
  @scala.inline
  def apply(
    AdditionalManifests: listOfMsSmoothAdditionalManifest = null,
    AudioDeduplication: MsSmoothAudioDeduplication = null,
    Destination: stringPatternS3 = null,
    DestinationSettings: DestinationSettings = null,
    Encryption: MsSmoothEncryptionSettings = null,
    FragmentLength: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    ManifestEncoding: MsSmoothManifestEncoding = null
  ): MsSmoothGroupSettings = {
    val __obj = js.Dynamic.literal()
    if (AdditionalManifests != null) __obj.updateDynamic("AdditionalManifests")(AdditionalManifests.asInstanceOf[js.Any])
    if (AudioDeduplication != null) __obj.updateDynamic("AudioDeduplication")(AudioDeduplication.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination.asInstanceOf[js.Any])
    if (DestinationSettings != null) __obj.updateDynamic("DestinationSettings")(DestinationSettings.asInstanceOf[js.Any])
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (!js.isUndefined(FragmentLength)) __obj.updateDynamic("FragmentLength")(FragmentLength.get.asInstanceOf[js.Any])
    if (ManifestEncoding != null) __obj.updateDynamic("ManifestEncoding")(ManifestEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsSmoothGroupSettings]
  }
}

