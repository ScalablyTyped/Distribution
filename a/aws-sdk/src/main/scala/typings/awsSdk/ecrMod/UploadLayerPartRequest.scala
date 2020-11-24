package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadLayerPartRequest extends js.Object {
  
  /**
    * The base64-encoded layer part payload.
    */
  var layerPartBlob: LayerPartBlob = js.native
  
  /**
    * The position of the first byte of the layer part witin the overall image layer.
    */
  var partFirstByte: PartSize = js.native
  
  /**
    * The position of the last byte of the layer part within the overall image layer.
    */
  var partLastByte: PartSize = js.native
  
  /**
    * The AWS account ID associated with the registry to which you are uploading layer parts. If you do not specify a registry, the default registry is assumed.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The name of the repository to which you are uploading layer parts.
    */
  var repositoryName: RepositoryName = js.native
  
  /**
    * The upload ID from a previous InitiateLayerUpload operation to associate with the layer part upload.
    */
  var uploadId: UploadId = js.native
}
object UploadLayerPartRequest {
  
  @scala.inline
  def apply(
    layerPartBlob: LayerPartBlob,
    partFirstByte: PartSize,
    partLastByte: PartSize,
    repositoryName: RepositoryName,
    uploadId: UploadId
  ): UploadLayerPartRequest = {
    val __obj = js.Dynamic.literal(layerPartBlob = layerPartBlob.asInstanceOf[js.Any], partFirstByte = partFirstByte.asInstanceOf[js.Any], partLastByte = partLastByte.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadLayerPartRequest]
  }
  
  @scala.inline
  implicit class UploadLayerPartRequestOps[Self <: UploadLayerPartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLayerPartBlob(value: LayerPartBlob): Self = this.set("layerPartBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartFirstByte(value: PartSize): Self = this.set("partFirstByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartLastByte(value: PartSize): Self = this.set("partLastByte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: UploadId): Self = this.set("uploadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
  }
}
