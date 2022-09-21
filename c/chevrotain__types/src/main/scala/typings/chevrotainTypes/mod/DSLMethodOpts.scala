package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSLMethodOpts[T] extends StObject {
  
  /**
    * The Grammar to process in this method.
    */
  def DEF(): T
  /**
    * The Grammar to process in this method.
    */
  @JSName("DEF")
  var DEF_Original: GrammarAction[T]
  
  /**
    * A semantic constraint on this DSL method
    * @see https://github.com/chevrotain/chevrotain/blob/master/examples/parser/predicate_lookahead/predicate_lookahead.js
    * For farther details.
    */
  var GATE: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /**
    * Maximum number of "following tokens" which would be used to
    * Choose between the alternatives.
    *
    * By default this value is determined by the {@link IParserConfig.maxLookahead} value.
    * A Higher value may be used for a specific DSL method to resolve ambiguities
    * And a lower value may be used to resolve slow initialization times issues.
    *
    * TODO: create full docs and link
    */
  var MAX_LOOKAHEAD: js.UndefOr[Double] = js.undefined
}
object DSLMethodOpts {
  
  inline def apply[T](DEF: () => T): DSLMethodOpts[T] = {
    val __obj = js.Dynamic.literal(DEF = js.Any.fromFunction0(DEF))
    __obj.asInstanceOf[DSLMethodOpts[T]]
  }
  
  extension [Self <: DSLMethodOpts[?], T](x: Self & DSLMethodOpts[T]) {
    
    inline def setDEF(value: () => T): Self = StObject.set(x, "DEF", js.Any.fromFunction0(value))
    
    inline def setGATE(value: () => Boolean): Self = StObject.set(x, "GATE", js.Any.fromFunction0(value))
    
    inline def setGATEUndefined: Self = StObject.set(x, "GATE", js.undefined)
    
    inline def setMAX_LOOKAHEAD(value: Double): Self = StObject.set(x, "MAX_LOOKAHEAD", value.asInstanceOf[js.Any])
    
    inline def setMAX_LOOKAHEADUndefined: Self = StObject.set(x, "MAX_LOOKAHEAD", js.undefined)
  }
}
