package typings.awsSdk.pollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLexiconInput extends StObject {
  
  /**
    * Name of the lexicon.
    */
  var Name: LexiconName
}
object GetLexiconInput {
  
  inline def apply(Name: LexiconName): GetLexiconInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLexiconInput]
  }
  
  extension [Self <: GetLexiconInput](x: Self) {
    
    inline def setName(value: LexiconName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
