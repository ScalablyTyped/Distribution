package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLexiconsInput extends StObject {
  
  /**
    * An opaque pagination token returned from previous ListLexicons operation. If present, indicates where to continue the list of lexicons.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.undefined
}
object ListLexiconsInput {
  
  @scala.inline
  def apply(): ListLexiconsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexiconsInput]
  }
  
  @scala.inline
  implicit class ListLexiconsInputMutableBuilder[Self <: ListLexiconsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
