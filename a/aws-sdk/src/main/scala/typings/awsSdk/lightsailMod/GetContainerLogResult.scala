package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainerLogResult extends StObject {
  
  /**
    * An array of objects that describe the log events of a container.
    */
  var logEvents: js.UndefOr[ContainerServiceLogEventList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetContainerLog request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetContainerLogResult {
  
  @scala.inline
  def apply(): GetContainerLogResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerLogResult]
  }
  
  @scala.inline
  implicit class GetContainerLogResultMutableBuilder[Self <: GetContainerLogResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogEvents(value: ContainerServiceLogEventList): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogEventsUndefined: Self = StObject.set(x, "logEvents", js.undefined)
    
    @scala.inline
    def setLogEventsVarargs(value: ContainerServiceLogEvent*): Self = StObject.set(x, "logEvents", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
