package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLogStreamsResponse extends js.Object {
  
  /**
    * The log streams.
    */
  var logStreams: js.UndefOr[LogStreams] = js.native
  
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeLogStreamsResponse {
  
  @scala.inline
  def apply(): DescribeLogStreamsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogStreamsResponse]
  }
  
  @scala.inline
  implicit class DescribeLogStreamsResponseOps[Self <: DescribeLogStreamsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogStreamsVarargs(value: LogStream*): Self = this.set("logStreams", js.Array(value :_*))
    
    @scala.inline
    def setLogStreams(value: LogStreams): Self = this.set("logStreams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogStreams: Self = this.set("logStreams", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
