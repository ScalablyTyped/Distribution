package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDisksResult extends StObject {
  
  /**
    * An array of objects containing information about all block storage disks.
    */
  var disks: js.UndefOr[DiskList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDisks request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetDisksResult {
  
  @scala.inline
  def apply(): GetDisksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDisksResult]
  }
  
  @scala.inline
  implicit class GetDisksResultMutableBuilder[Self <: GetDisksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisks(value: DiskList): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    @scala.inline
    def setDisksVarargs(value: Disk*): Self = StObject.set(x, "disks", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
