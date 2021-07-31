package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexiconDescription extends StObject {
  
  /**
    * Provides lexicon metadata.
    */
  var Attributes: js.UndefOr[LexiconAttributes] = js.undefined
  
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.undefined
}
object LexiconDescription {
  
  @scala.inline
  def apply(): LexiconDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexiconDescription]
  }
  
  @scala.inline
  implicit class LexiconDescriptionMutableBuilder[Self <: LexiconDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: LexiconAttributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
