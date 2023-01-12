package typings.cypress.Cypress

import typings.cypress.cypressBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionOptions extends StObject {
  
  /**
    * Whether or not to persist the session across all specs in the run.
    * @default {false}
    */
  var cacheAcrossSpecs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function to run immediately after the session is created and `setup` function runs or
    * after a session is restored and the page is cleared. If this returns `false`, throws an
    * exception, returns a Promise which resolves to `false` or rejects or contains any failing
    * Cypress command, the session is considered invalid.
    *
    * If validation fails immediately after `setup`, the test will fail.
    * If validation fails after restoring a session, `setup` will re-run.
    * @default {false}
    */
  var validate: js.UndefOr[js.Function0[(js.Promise[`false` | Unit]) | Unit]] = js.undefined
}
object SessionOptions {
  
  inline def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionOptions] (val x: Self) extends AnyVal {
    
    inline def setCacheAcrossSpecs(value: Boolean): Self = StObject.set(x, "cacheAcrossSpecs", value.asInstanceOf[js.Any])
    
    inline def setCacheAcrossSpecsUndefined: Self = StObject.set(x, "cacheAcrossSpecs", js.undefined)
    
    inline def setValidate(value: () => (js.Promise[`false` | Unit]) | Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
