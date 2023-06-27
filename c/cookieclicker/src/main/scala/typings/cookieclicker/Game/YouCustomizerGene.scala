package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YouCustomizerGene[T] extends StObject {
  
  /**
    * List of possible choices.
    *
    * For T = [number, number], each choice is an offset in 'youAddons.png',
    * similar to an icon.
    */
  var choices: js.Array[T]
  
  /**
    * Default value.
    */
  var `def`: Double
  
  var id: String
  
  var isList: `true`
  
  /**
    * Index of the gene in Game.YouCustomizer.genes.
    */
  var n: Double
}
object YouCustomizerGene {
  
  inline def apply[T](choices: js.Array[T], `def`: Double, id: String, n: Double): YouCustomizerGene[T] = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isList = true, n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[YouCustomizerGene[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: YouCustomizerGene[?], T] (val x: Self & YouCustomizerGene[T]) extends AnyVal {
    
    inline def setChoices(value: js.Array[T]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesVarargs(value: T*): Self = StObject.set(x, "choices", js.Array(value*))
    
    inline def setDef(value: Double): Self = StObject.set(x, "def", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsList(value: `true`): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
