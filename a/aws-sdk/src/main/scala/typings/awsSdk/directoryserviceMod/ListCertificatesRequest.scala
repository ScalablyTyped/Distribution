package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The number of items that should show up on one page
    */
  var Limit: js.UndefOr[PageLimit] = js.undefined
  
  /**
    * A token for requesting another page of certificates if the NextToken response element indicates that more certificates are available. Use the value of the returned NextToken element in your request until the token comes back as null. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
}
object ListCertificatesRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesRequest]
  }
  
  @scala.inline
  implicit class ListCertificatesRequestMutableBuilder[Self <: ListCertificatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: PageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
