package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPipelinesRequest extends StObject {
  
  /**
    * To list pipelines in chronological order by the date and time that they were created, enter true. To list pipelines in reverse chronological order, enter false.
    */
  var Ascending: js.UndefOr[typings.awsSdk.elastictranscoderMod.Ascending] = js.native
  
  /**
    * When Elastic Transcoder returns more than one page of results, use pageToken in subsequent GET requests to get each successive page of results. 
    */
  var PageToken: js.UndefOr[Id] = js.native
}
object ListPipelinesRequest {
  
  @scala.inline
  def apply(): ListPipelinesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesRequest]
  }
  
  @scala.inline
  implicit class ListPipelinesRequestMutableBuilder[Self <: ListPipelinesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Ascending): Self = StObject.set(x, "Ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscendingUndefined: Self = StObject.set(x, "Ascending", js.undefined)
    
    @scala.inline
    def setPageToken(value: Id): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
  }
}
