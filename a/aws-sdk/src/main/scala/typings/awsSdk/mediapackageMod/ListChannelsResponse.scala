package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelsResponse extends StObject {
  
  /**
    * A list of Channel records.
    */
  var Channels: js.UndefOr[listOfChannel] = js.native
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListChannelsResponse {
  
  @scala.inline
  def apply(): ListChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelsResponse]
  }
  
  @scala.inline
  implicit class ListChannelsResponseMutableBuilder[Self <: ListChannelsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: listOfChannel): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "Channels", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
