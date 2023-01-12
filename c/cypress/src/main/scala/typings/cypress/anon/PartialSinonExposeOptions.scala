package typings.cypress.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.cypress/types/sinon.SinonExposeOptions> */
trait PartialSinonExposeOptions extends StObject {
  
  var includeFail: js.UndefOr[Boolean] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
}
object PartialSinonExposeOptions {
  
  inline def apply(): PartialSinonExposeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonExposeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSinonExposeOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeFail(value: Boolean): Self = StObject.set(x, "includeFail", value.asInstanceOf[js.Any])
    
    inline def setIncludeFailUndefined: Self = StObject.set(x, "includeFail", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
