package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlatformApplicationsResponse extends StObject {
  
  /**
    * NextToken string is returned when calling ListPlatformApplications action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Platform applications returned when calling ListPlatformApplications action.
    */
  var PlatformApplications: js.UndefOr[ListOfPlatformApplications] = js.native
}
object ListPlatformApplicationsResponse {
  
  @scala.inline
  def apply(): ListPlatformApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListPlatformApplicationsResponseMutableBuilder[Self <: ListPlatformApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPlatformApplications(value: ListOfPlatformApplications): Self = StObject.set(x, "PlatformApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformApplicationsUndefined: Self = StObject.set(x, "PlatformApplications", js.undefined)
    
    @scala.inline
    def setPlatformApplicationsVarargs(value: PlatformApplication*): Self = StObject.set(x, "PlatformApplications", js.Array(value :_*))
  }
}
