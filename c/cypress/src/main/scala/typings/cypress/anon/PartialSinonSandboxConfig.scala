package typings.cypress.anon

import typings.cypress.typesSinonMod.SinonFakeServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<cypress.cypress/types/sinon.SinonSandboxConfig> */
trait PartialSinonSandboxConfig extends StObject {
  
  var injectInto: js.UndefOr[js.Object | Null] = js.undefined
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  
  var useFakeServer: js.UndefOr[Boolean | SinonFakeServer] = js.undefined
  
  var useFakeTimers: js.UndefOr[Boolean | PartialSinonFakeTimersCon] = js.undefined
}
object PartialSinonSandboxConfig {
  
  inline def apply(): PartialSinonSandboxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonSandboxConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSinonSandboxConfig] (val x: Self) extends AnyVal {
    
    inline def setInjectInto(value: js.Object): Self = StObject.set(x, "injectInto", value.asInstanceOf[js.Any])
    
    inline def setInjectIntoNull: Self = StObject.set(x, "injectInto", null)
    
    inline def setInjectIntoUndefined: Self = StObject.set(x, "injectInto", js.undefined)
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setUseFakeServer(value: Boolean | SinonFakeServer): Self = StObject.set(x, "useFakeServer", value.asInstanceOf[js.Any])
    
    inline def setUseFakeServerUndefined: Self = StObject.set(x, "useFakeServer", js.undefined)
    
    inline def setUseFakeTimers(value: Boolean | PartialSinonFakeTimersCon): Self = StObject.set(x, "useFakeTimers", value.asInstanceOf[js.Any])
    
    inline def setUseFakeTimersUndefined: Self = StObject.set(x, "useFakeTimers", js.undefined)
  }
}
