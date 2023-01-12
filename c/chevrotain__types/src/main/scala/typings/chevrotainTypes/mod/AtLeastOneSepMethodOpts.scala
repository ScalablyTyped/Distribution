package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtLeastOneSepMethodOpts[T]
  extends StObject
     with ManySepMethodOpts[T] {
  
  /**
    *  Short title/classification to what is being matched.
    *  Will be used in the error message,.
    *  If none is provided, the error message will include the names of the expected
    *  Tokens sequences which start the method's inner grammar.
    */
  var ERR_MSG: js.UndefOr[String] = js.undefined
}
object AtLeastOneSepMethodOpts {
  
  inline def apply[T](DEF: () => T, SEP: TokenType): AtLeastOneSepMethodOpts[T] = {
    val __obj = js.Dynamic.literal(DEF = js.Any.fromFunction0(DEF), SEP = SEP.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtLeastOneSepMethodOpts[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AtLeastOneSepMethodOpts[?], T] (val x: Self & AtLeastOneSepMethodOpts[T]) extends AnyVal {
    
    inline def setERR_MSG(value: String): Self = StObject.set(x, "ERR_MSG", value.asInstanceOf[js.Any])
    
    inline def setERR_MSGUndefined: Self = StObject.set(x, "ERR_MSG", js.undefined)
  }
}
