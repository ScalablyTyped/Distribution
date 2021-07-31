package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessPointsRequest extends StObject {
  
  /**
    * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with FileSystemId.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.efsMod.AccessPointId] = js.undefined
  
  /**
    * (Optional) If you provide a FileSystemId, EFS returns all access points for that file system; mutually exclusive with AccessPointId.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.efsMod.FileSystemId] = js.undefined
  
  /**
    * (Optional) When retrieving all access points for a file system, you can optionally specify the MaxItems parameter to limit the number of objects returned in a response. The default value is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.efsMod.MaxResults] = js.undefined
  
  /**
    *  NextToken is present if the response is paginated. You can use NextMarker in the subsequent request to fetch the next page of access point descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeAccessPointsRequest {
  
  @scala.inline
  def apply(): DescribeAccessPointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsRequest]
  }
  
  @scala.inline
  implicit class DescribeAccessPointsRequestMutableBuilder[Self <: DescribeAccessPointsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointId(value: AccessPointId): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPointIdUndefined: Self = StObject.set(x, "AccessPointId", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
