package typings.cleasbyVigfussonDictionary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cleasby-vigfusson-dictionary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDictionary(): js.Array[DictionaryEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDictionary")().asInstanceOf[js.Array[DictionaryEntry]]
  
  inline def getNoMarkupDictionary(): js.Array[DictionaryEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNoMarkupDictionary")().asInstanceOf[js.Array[DictionaryEntry]]
  
  trait DictionaryEntry extends StObject {
    
    var definitions: js.Array[String]
    
    var word: String
  }
  object DictionaryEntry {
    
    inline def apply(definitions: js.Array[String], word: String): DictionaryEntry = {
      val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
      __obj.asInstanceOf[DictionaryEntry]
    }
    
    extension [Self <: DictionaryEntry](x: Self) {
      
      inline def setDefinitions(value: js.Array[String]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsVarargs(value: String*): Self = StObject.set(x, "definitions", js.Array(value*))
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    }
  }
}
