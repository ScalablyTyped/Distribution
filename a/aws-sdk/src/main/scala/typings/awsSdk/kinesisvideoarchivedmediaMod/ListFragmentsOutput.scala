package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFragmentsOutput extends js.Object {
  
  /**
    * A list of archived Fragment objects from the stream that meet the selector criteria. Results are in no specific order, even across pages.
    */
  var Fragments: js.UndefOr[FragmentList] = js.native
  
  /**
    * If the returned list is truncated, the operation returns this token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.NextToken] = js.native
}
object ListFragmentsOutput {
  
  @scala.inline
  def apply(): ListFragmentsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFragmentsOutput]
  }
  
  @scala.inline
  implicit class ListFragmentsOutputOps[Self <: ListFragmentsOutput] (val x: Self) extends AnyVal {
    
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
    def setFragmentsVarargs(value: Fragment*): Self = this.set("Fragments", js.Array(value :_*))
    
    @scala.inline
    def setFragments(value: FragmentList): Self = this.set("Fragments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragments: Self = this.set("Fragments", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
