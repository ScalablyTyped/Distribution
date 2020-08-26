package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayReadyDrm extends js.Object {
  /**
    * The type of DRM, if any, that you want Elastic Transcoder to apply to the output files associated with this playlist.
    */
  var Format: js.UndefOr[PlayReadyDrmFormatString] = js.native
  /**
    * The series of random bits created by a random bit generator, unique for every encryption operation, that you want Elastic Transcoder to use to encrypt your files. The initialization vector must be base64-encoded, and it must be exactly 8 bytes long before being base64-encoded. If no initialization vector is provided, Elastic Transcoder generates one for you.
    */
  var InitializationVector: js.UndefOr[ZeroTo255String] = js.native
  /**
    * The DRM key for your file, provided by your DRM license provider. The key must be base64-encoded, and it must be one of the following bit lengths before being base64-encoded:  128, 192, or 256.  The key must also be encrypted by using AWS KMS.
    */
  var Key: js.UndefOr[NonEmptyBase64EncodedString] = js.native
  /**
    * The ID for your DRM key, so that your DRM license provider knows which key to provide. The key ID must be provided in big endian, and Elastic Transcoder converts it to little endian before inserting it into the PlayReady DRM headers. If you are unsure whether your license server provides your key ID in big or little endian, check with your DRM provider.
    */
  var KeyId: js.UndefOr[KeyIdGuid] = js.native
  /**
    * The MD5 digest of the key used for DRM on your file, and that you want Elastic Transcoder to use as a checksum to make sure your key was not corrupted in transit. The key MD5 must be base64-encoded, and it must be exactly 16 bytes before being base64-encoded.
    */
  var KeyMd5: js.UndefOr[NonEmptyBase64EncodedString] = js.native
  /**
    * The location of the license key required to play DRM content. The URL must be an absolute path, and is referenced by the PlayReady header. The PlayReady header is referenced in the protection header of the client manifest for Smooth Streaming outputs, and in the EXT-X-DXDRM and EXT-XDXDRMINFO metadata tags for HLS playlist outputs. An example URL looks like this: https://www.example.com/exampleKey/ 
    */
  var LicenseAcquisitionUrl: js.UndefOr[OneTo512String] = js.native
}

object PlayReadyDrm {
  @scala.inline
  def apply(): PlayReadyDrm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayReadyDrm]
  }
  @scala.inline
  implicit class PlayReadyDrmOps[Self <: PlayReadyDrm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFormat(value: PlayReadyDrmFormatString): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setInitializationVector(value: ZeroTo255String): Self = this.set("InitializationVector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitializationVector: Self = this.set("InitializationVector", js.undefined)
    @scala.inline
    def setKey(value: NonEmptyBase64EncodedString): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setKeyId(value: KeyIdGuid): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
    @scala.inline
    def setKeyMd5(value: NonEmptyBase64EncodedString): Self = this.set("KeyMd5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyMd5: Self = this.set("KeyMd5", js.undefined)
    @scala.inline
    def setLicenseAcquisitionUrl(value: OneTo512String): Self = this.set("LicenseAcquisitionUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseAcquisitionUrl: Self = this.set("LicenseAcquisitionUrl", js.undefined)
  }
  
}

