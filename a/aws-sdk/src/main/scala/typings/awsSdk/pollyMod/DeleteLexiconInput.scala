package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteLexiconInput extends StObject {
  
  /**
    * The name of the lexicon to delete. Must be an existing lexicon in the region.
    */
  var Name: LexiconName = js.native
}
object DeleteLexiconInput {
  
  @scala.inline
  def apply(Name: LexiconName): DeleteLexiconInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLexiconInput]
  }
  
  @scala.inline
  implicit class DeleteLexiconInputMutableBuilder[Self <: DeleteLexiconInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
