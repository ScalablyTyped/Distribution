package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lexicon extends StObject {
  
  /**
    * Lexicon content in string format. The content of a lexicon must be in PLS format.
    */
  var Content: js.UndefOr[LexiconContent] = js.native
  
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.native
}
object Lexicon {
  
  @scala.inline
  def apply(): Lexicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lexicon]
  }
  
  @scala.inline
  implicit class LexiconMutableBuilder[Self <: Lexicon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: LexiconContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    @scala.inline
    def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
