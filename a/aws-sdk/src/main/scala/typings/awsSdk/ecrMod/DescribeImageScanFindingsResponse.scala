package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImageScanFindingsResponse extends js.Object {
  
  var imageId: js.UndefOr[ImageIdentifier] = js.native
  
  /**
    * The information contained in the image scan findings.
    */
  var imageScanFindings: js.UndefOr[ImageScanFindings] = js.native
  
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.native
  
  /**
    * The nextToken value to include in a future DescribeImageScanFindings request. When the results of a DescribeImageScanFindings request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.native
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object DescribeImageScanFindingsResponse {
  
  @scala.inline
  def apply(): DescribeImageScanFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageScanFindingsResponse]
  }
  
  @scala.inline
  implicit class DescribeImageScanFindingsResponseOps[Self <: DescribeImageScanFindingsResponse] (val x: Self) extends AnyVal {
    
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
    def setImageId(value: ImageIdentifier): Self = this.set("imageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageId: Self = this.set("imageId", js.undefined)
    
    @scala.inline
    def setImageScanFindings(value: ImageScanFindings): Self = this.set("imageScanFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageScanFindings: Self = this.set("imageScanFindings", js.undefined)
    
    @scala.inline
    def setImageScanStatus(value: ImageScanStatus): Self = this.set("imageScanStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageScanStatus: Self = this.set("imageScanStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRegistryId(value: RegistryId): Self = this.set("registryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryId: Self = this.set("registryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
