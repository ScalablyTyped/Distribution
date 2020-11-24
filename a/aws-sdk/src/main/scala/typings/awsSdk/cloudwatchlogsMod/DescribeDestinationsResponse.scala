package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDestinationsResponse extends js.Object {
  
  /**
    * The destinations.
    */
  var destinations: js.UndefOr[Destinations] = js.native
  
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeDestinationsResponse {
  
  @scala.inline
  def apply(): DescribeDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDestinationsResponse]
  }
  
  @scala.inline
  implicit class DescribeDestinationsResponseOps[Self <: DescribeDestinationsResponse] (val x: Self) extends AnyVal {
    
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
    def setDestinationsVarargs(value: Destination*): Self = this.set("destinations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: Destinations): Self = this.set("destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinations: Self = this.set("destinations", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
