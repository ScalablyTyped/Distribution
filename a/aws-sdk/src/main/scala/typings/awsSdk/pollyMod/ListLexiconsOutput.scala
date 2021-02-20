package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLexiconsOutput extends StObject {
  
  /**
    * A list of lexicon names and attributes.
    */
  var Lexicons: js.UndefOr[LexiconDescriptionList] = js.native
  
  /**
    * The pagination token to use in the next request to continue the listing of lexicons. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pollyMod.NextToken] = js.native
}
object ListLexiconsOutput {
  
  @scala.inline
  def apply(): ListLexiconsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLexiconsOutput]
  }
  
  @scala.inline
  implicit class ListLexiconsOutputMutableBuilder[Self <: ListLexiconsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLexicons(value: LexiconDescriptionList): Self = StObject.set(x, "Lexicons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLexiconsUndefined: Self = StObject.set(x, "Lexicons", js.undefined)
    
    @scala.inline
    def setLexiconsVarargs(value: LexiconDescription*): Self = StObject.set(x, "Lexicons", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
