package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSpeechSynthesisTasksOutput extends js.Object {
  
  /**
    * An opaque pagination token returned from the previous List operation in this request. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.native
  
  /**
    * List of SynthesisTask objects that provides information from the specified task in the list request, including output format, creation time, task status, and so on.
    */
  var SynthesisTasks: js.UndefOr[typings.awsSdk.pollyMod.SynthesisTasks] = js.native
}
object ListSpeechSynthesisTasksOutput {
  
  @scala.inline
  def apply(): ListSpeechSynthesisTasksOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSpeechSynthesisTasksOutput]
  }
  
  @scala.inline
  implicit class ListSpeechSynthesisTasksOutputOps[Self <: ListSpeechSynthesisTasksOutput] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSynthesisTasksVarargs(value: SynthesisTask*): Self = this.set("SynthesisTasks", js.Array(value :_*))
    
    @scala.inline
    def setSynthesisTasks(value: SynthesisTasks): Self = this.set("SynthesisTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynthesisTasks: Self = this.set("SynthesisTasks", js.undefined)
  }
}
