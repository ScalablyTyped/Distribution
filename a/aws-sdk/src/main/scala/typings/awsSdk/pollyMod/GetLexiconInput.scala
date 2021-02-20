package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLexiconInput extends StObject {
  
  /**
    * Name of the lexicon.
    */
  var Name: LexiconName = js.native
}
object GetLexiconInput {
  
  @scala.inline
  def apply(Name: LexiconName): GetLexiconInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLexiconInput]
  }
  
  @scala.inline
  implicit class GetLexiconInputMutableBuilder[Self <: GetLexiconInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
