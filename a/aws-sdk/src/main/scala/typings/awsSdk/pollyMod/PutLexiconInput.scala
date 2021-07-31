package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutLexiconInput extends StObject {
  
  /**
    * Content of the PLS lexicon as string data.
    */
  var Content: LexiconContent
  
  /**
    * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric string up to 20 characters long. 
    */
  var Name: LexiconName
}
object PutLexiconInput {
  
  @scala.inline
  def apply(Content: LexiconContent, Name: LexiconName): PutLexiconInput = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLexiconInput]
  }
  
  @scala.inline
  implicit class PutLexiconInputMutableBuilder[Self <: PutLexiconInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: LexiconContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
