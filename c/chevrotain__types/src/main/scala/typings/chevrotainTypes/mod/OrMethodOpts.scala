package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrMethodOpts[T] extends StObject {
  
  /**
    * The set of alternatives,
    * See detailed description in {@link BaseParser.OR}
    */
  var DEF: js.Array[IOrAlt[T]]
  
  /**
    * A description for the alternatives used in error messages
    * If none is provided, the error message will include the names of the expected
    * Tokens sequences which may start each alternative.
    */
  var ERR_MSG: js.UndefOr[String] = js.undefined
  
  /**
    * A Flag indicating that **all** ambiguities in this alternation should
    * be ignored.
    *
    * This flag should only be used in rare circumstances,
    * As normally alternation ambiguities should be resolved in other ways:
    * - Re-ordering the alternatives.
    * - Re-factoring the grammar to extract common prefixes before alternation.
    * - Using gates {@link IOrAlt.GATE} to implement custom lookahead logic.
    * - Using the more granular {@link IOrAlt.IGNORE_AMBIGUITIES} on a **specific** alternative.
    */
  var IGNORE_AMBIGUITIES: js.UndefOr[Boolean] = js.undefined
  
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
object OrMethodOpts {
  
  inline def apply[T](DEF: js.Array[IOrAlt[T]]): OrMethodOpts[T] = {
    val __obj = js.Dynamic.literal(DEF = DEF.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrMethodOpts[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrMethodOpts[?], T] (val x: Self & OrMethodOpts[T]) extends AnyVal {
    
    inline def setDEF(value: js.Array[IOrAlt[T]]): Self = StObject.set(x, "DEF", value.asInstanceOf[js.Any])
    
    inline def setDEFVarargs(value: IOrAlt[T]*): Self = StObject.set(x, "DEF", js.Array(value*))
    
    inline def setERR_MSG(value: String): Self = StObject.set(x, "ERR_MSG", value.asInstanceOf[js.Any])
    
    inline def setERR_MSGUndefined: Self = StObject.set(x, "ERR_MSG", js.undefined)
    
    inline def setIGNORE_AMBIGUITIES(value: Boolean): Self = StObject.set(x, "IGNORE_AMBIGUITIES", value.asInstanceOf[js.Any])
    
    inline def setIGNORE_AMBIGUITIESUndefined: Self = StObject.set(x, "IGNORE_AMBIGUITIES", js.undefined)
    
    inline def setMAX_LOOKAHEAD(value: Double): Self = StObject.set(x, "MAX_LOOKAHEAD", value.asInstanceOf[js.Any])
    
    inline def setMAX_LOOKAHEADUndefined: Self = StObject.set(x, "MAX_LOOKAHEAD", js.undefined)
  }
}
