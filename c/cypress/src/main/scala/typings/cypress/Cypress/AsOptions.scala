package typings.cypress.Cypress

import typings.cypress.cypressStrings.query
import typings.cypress.cypressStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to affect how an alias is stored
  *
  * @see https://on.cypress.io/as
  */
trait AsOptions extends StObject {
  
  /**
    * The type of alias to store, which impacts how the value is retrieved later in the test.
    * If an alias should be a 'query' (re-runs all queries leading up to the resulting value so it's alway up-to-date) or a
    * 'static' (read once when the alias is saved and is never updated). `type` has no effect when aliasing intercepts, spies, and stubs.
    *
    * @default 'query'
    */
  var `type`: query | static
}
object AsOptions {
  
  inline def apply(`type`: query | static): AsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsOptions] (val x: Self) extends AnyVal {
    
    inline def setType(value: query | static): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
