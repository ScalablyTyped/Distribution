package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtifactStore extends js.Object {
  /**
    * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. If this is undefined, the default key for Amazon S3 is used.
    */
  var encryptionKey: js.UndefOr[EncryptionKey] = js.native
  /**
    * The S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but not a folder in the bucket. A folder to contain the pipeline artifacts is created for you based on the name of the pipeline. You can use any S3 bucket in the same AWS Region as the pipeline to store your pipeline artifacts.
    */
  var location: ArtifactStoreLocation = js.native
  /**
    * The type of the artifact store, such as S3.
    */
  var `type`: ArtifactStoreType = js.native
}

object ArtifactStore {
  @scala.inline
  def apply(location: ArtifactStoreLocation, `type`: ArtifactStoreType): ArtifactStore = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactStore]
  }
  @scala.inline
  implicit class ArtifactStoreOps[Self <: ArtifactStore] (val x: Self) extends AnyVal {
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
    def setLocation(value: ArtifactStoreLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ArtifactStoreType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionKey(value: EncryptionKey): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionKey: Self = this.set("encryptionKey", js.undefined)
  }
  
}

