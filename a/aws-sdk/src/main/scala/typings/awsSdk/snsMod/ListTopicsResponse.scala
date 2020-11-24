package typings.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTopicsResponse extends js.Object {
  
  /**
    * Token to pass along to the next ListTopics request. This element is returned if there are additional topics to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  
  /**
    * A list of topic ARNs.
    */
  var Topics: js.UndefOr[TopicsList] = js.native
}
object ListTopicsResponse {
  
  @scala.inline
  def apply(): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsResponse]
  }
  
  @scala.inline
  implicit class ListTopicsResponseOps[Self <: ListTopicsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: nextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: Topic*): Self = this.set("Topics", js.Array(value :_*))
    
    @scala.inline
    def setTopics(value: TopicsList): Self = this.set("Topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("Topics", js.undefined)
  }
}
