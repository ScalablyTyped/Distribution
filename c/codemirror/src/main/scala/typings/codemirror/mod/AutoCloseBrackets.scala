package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoCloseBrackets extends StObject {
  
  /**
    * If the next character is in the string, opening a bracket should be auto-closed.
    */
  var closeBefore: js.UndefOr[String] = js.undefined
  
  /**
    * explode should be a similar string that gives the pairs of characters that, when enter is pressed between them, should have the second character also moved to its own line.
    */
  var explode: js.UndefOr[String] = js.undefined
  
  /**
    * By default, if the active mode has a closeBrackets property, that overrides the configuration given in the option.
    * But you can add an override property with a truthy value to override mode-specific configuration.
    */
  var `override`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * String containing pairs of matching characters.
    */
  var pairs: js.UndefOr[String] = js.undefined
  
  /**
    * String containing chars that could do a triple quote.
    */
  var triples: js.UndefOr[String] = js.undefined
}
object AutoCloseBrackets {
  
  inline def apply(): AutoCloseBrackets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCloseBrackets]
  }
  
  extension [Self <: AutoCloseBrackets](x: Self) {
    
    inline def setCloseBefore(value: String): Self = StObject.set(x, "closeBefore", value.asInstanceOf[js.Any])
    
    inline def setCloseBeforeUndefined: Self = StObject.set(x, "closeBefore", js.undefined)
    
    inline def setExplode(value: String): Self = StObject.set(x, "explode", value.asInstanceOf[js.Any])
    
    inline def setExplodeUndefined: Self = StObject.set(x, "explode", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    
    inline def setPairs(value: String): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    inline def setPairsUndefined: Self = StObject.set(x, "pairs", js.undefined)
    
    inline def setTriples(value: String): Self = StObject.set(x, "triples", value.asInstanceOf[js.Any])
    
    inline def setTriplesUndefined: Self = StObject.set(x, "triples", js.undefined)
  }
}
