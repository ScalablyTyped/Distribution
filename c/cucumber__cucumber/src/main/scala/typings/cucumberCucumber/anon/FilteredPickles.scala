package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libApiGherkinMod.PickleWithDocument
import typings.cucumberMessages.mod.ParseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilteredPickles extends StObject {
  
  var filteredPickles: js.Array[PickleWithDocument]
  
  var parseErrors: js.Array[ParseError]
}
object FilteredPickles {
  
  inline def apply(filteredPickles: js.Array[PickleWithDocument], parseErrors: js.Array[ParseError]): FilteredPickles = {
    val __obj = js.Dynamic.literal(filteredPickles = filteredPickles.asInstanceOf[js.Any], parseErrors = parseErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilteredPickles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilteredPickles] (val x: Self) extends AnyVal {
    
    inline def setFilteredPickles(value: js.Array[PickleWithDocument]): Self = StObject.set(x, "filteredPickles", value.asInstanceOf[js.Any])
    
    inline def setFilteredPicklesVarargs(value: PickleWithDocument*): Self = StObject.set(x, "filteredPickles", js.Array(value*))
    
    inline def setParseErrors(value: js.Array[ParseError]): Self = StObject.set(x, "parseErrors", value.asInstanceOf[js.Any])
    
    inline def setParseErrorsVarargs(value: ParseError*): Self = StObject.set(x, "parseErrors", js.Array(value*))
  }
}
