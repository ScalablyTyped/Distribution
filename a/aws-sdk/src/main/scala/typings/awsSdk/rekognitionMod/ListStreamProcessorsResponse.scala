package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamProcessorsResponse extends js.Object {
  
  /**
    * If the response is truncated, Amazon Rekognition Video returns this token that you can use in the subsequent request to retrieve the next set of stream processors. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * List of stream processors that you have created.
    */
  var StreamProcessors: js.UndefOr[StreamProcessorList] = js.native
}
object ListStreamProcessorsResponse {
  
  @scala.inline
  def apply(): ListStreamProcessorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamProcessorsResponse]
  }
  
  @scala.inline
  implicit class ListStreamProcessorsResponseOps[Self <: ListStreamProcessorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setStreamProcessorsVarargs(value: StreamProcessor*): Self = this.set("StreamProcessors", js.Array(value :_*))
    
    @scala.inline
    def setStreamProcessors(value: StreamProcessorList): Self = this.set("StreamProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamProcessors: Self = this.set("StreamProcessors", js.undefined)
  }
}
