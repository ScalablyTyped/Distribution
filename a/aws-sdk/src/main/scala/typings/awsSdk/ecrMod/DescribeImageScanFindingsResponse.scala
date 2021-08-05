package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImageScanFindingsResponse extends StObject {
  
  var imageId: js.UndefOr[ImageIdentifier] = js.undefined
  
  /**
    * The information contained in the image scan findings.
    */
  var imageScanFindings: js.UndefOr[ImageScanFindings] = js.undefined
  
  /**
    * The current state of the scan.
    */
  var imageScanStatus: js.UndefOr[ImageScanStatus] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeImageScanFindings request. When the results of a DescribeImageScanFindings request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The registry ID associated with the request.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The repository name associated with the request.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object DescribeImageScanFindingsResponse {
  
  inline def apply(): DescribeImageScanFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImageScanFindingsResponse]
  }
  
  extension [Self <: DescribeImageScanFindingsResponse](x: Self) {
    
    inline def setImageId(value: ImageIdentifier): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setImageScanFindings(value: ImageScanFindings): Self = StObject.set(x, "imageScanFindings", value.asInstanceOf[js.Any])
    
    inline def setImageScanFindingsUndefined: Self = StObject.set(x, "imageScanFindings", js.undefined)
    
    inline def setImageScanStatus(value: ImageScanStatus): Self = StObject.set(x, "imageScanStatus", value.asInstanceOf[js.Any])
    
    inline def setImageScanStatusUndefined: Self = StObject.set(x, "imageScanStatus", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
