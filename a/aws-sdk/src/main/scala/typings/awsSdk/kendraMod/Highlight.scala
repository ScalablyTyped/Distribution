package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Highlight extends StObject {
  
  /**
    * The zero-based location in the response string where the highlight starts.
    */
  var BeginOffset: Integer
  
  /**
    * The zero-based location in the response string where the highlight ends.
    */
  var EndOffset: Integer
  
  /**
    * Indicates whether the response is the best response. True if this is the best response; otherwise, false.
    */
  var TopAnswer: js.UndefOr[Boolean] = js.undefined
}
object Highlight {
  
  @scala.inline
  def apply(BeginOffset: Integer, EndOffset: Integer): Highlight = {
    val __obj = js.Dynamic.literal(BeginOffset = BeginOffset.asInstanceOf[js.Any], EndOffset = EndOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  
  @scala.inline
  implicit class HighlightMutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopAnswer(value: Boolean): Self = StObject.set(x, "TopAnswer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopAnswerUndefined: Self = StObject.set(x, "TopAnswer", js.undefined)
  }
}
