package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordOptions extends StObject {
  
  var capitalize: Boolean
  
  var length: Double
  
  var syllables: Double
}
object WordOptions {
  
  @scala.inline
  def apply(capitalize: Boolean, length: Double, syllables: Double): WordOptions = {
    val __obj = js.Dynamic.literal(capitalize = capitalize.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], syllables = syllables.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordOptions]
  }
  
  @scala.inline
  implicit class WordOptionsMutableBuilder[Self <: WordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyllables(value: Double): Self = StObject.set(x, "syllables", value.asInstanceOf[js.Any])
  }
}
