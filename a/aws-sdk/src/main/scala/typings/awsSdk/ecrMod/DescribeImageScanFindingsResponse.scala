package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    imageId: ImageIdentifier = null,
    imageScanFindings: ImageScanFindings = null,
    imageScanStatus: ImageScanStatus = null,
    nextToken: NextToken = null,
    registryId: RegistryId = null,
    repositoryName: RepositoryName = null
  ): DescribeImageScanFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (imageId != null) __obj.updateDynamic("imageId")(imageId.asInstanceOf[js.Any])
    if (imageScanFindings != null) __obj.updateDynamic("imageScanFindings")(imageScanFindings.asInstanceOf[js.Any])
    if (imageScanStatus != null) __obj.updateDynamic("imageScanStatus")(imageScanStatus.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (registryId != null) __obj.updateDynamic("registryId")(registryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImageScanFindingsResponse]
  }
}

