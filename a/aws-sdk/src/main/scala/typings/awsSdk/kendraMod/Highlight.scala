package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highlight extends js.Object {
  
  /**
    * The zero-based location in the response string where the highlight starts.
    */
  var BeginOffset: Integer = js.native
  
  /**
    * The zero-based location in the response string where the highlight ends.
    */
  var EndOffset: Integer = js.native
  
  /**
    * Indicates whether the response is the best response. True if this is the best response; otherwise, false.
    */
  var TopAnswer: js.UndefOr[Boolean] = js.native
}
object Highlight {
  
  @scala.inline
  def apply(BeginOffset: Integer, EndOffset: Integer): Highlight = {
    val __obj = js.Dynamic.literal(BeginOffset = BeginOffset.asInstanceOf[js.Any], EndOffset = EndOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  
  @scala.inline
  implicit class HighlightOps[Self <: Highlight] (val x: Self) extends AnyVal {
    
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
    def setBeginOffset(value: Integer): Self = this.set("BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffset(value: Integer): Self = this.set("EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopAnswer(value: Boolean): Self = this.set("TopAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopAnswer: Self = this.set("TopAnswer", js.undefined)
  }
}
