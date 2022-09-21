package typings.ckeditorCkeditor5WordCount

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Characters extends StObject {
    
    val characters: Double
    
    val words: Double
  }
  object Characters {
    
    inline def apply(characters: Double, words: Double): Characters = {
      val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Characters]
    }
    
    extension [Self <: Characters](x: Self) {
      
      inline def setCharacters(value: Double): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      inline def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
}
