package typings.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RuntimeConfig. */
trait IRuntimeConfig extends StObject {
  
  /** RuntimeConfig isDryRun */
  var isDryRun: js.UndefOr[Boolean | Null] = js.undefined
  
  /** RuntimeConfig isFailFast */
  var isFailFast: js.UndefOr[Boolean | Null] = js.undefined
  
  /** RuntimeConfig isStrict */
  var isStrict: js.UndefOr[Boolean | Null] = js.undefined
  
  /** RuntimeConfig maxParallel */
  var maxParallel: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any) | Null
  ] = js.undefined
}
object IRuntimeConfig {
  
  inline def apply(): IRuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRuntimeConfig]
  }
  
  extension [Self <: IRuntimeConfig](x: Self) {
    
    inline def setIsDryRun(value: Boolean): Self = StObject.set(x, "isDryRun", value.asInstanceOf[js.Any])
    
    inline def setIsDryRunNull: Self = StObject.set(x, "isDryRun", null)
    
    inline def setIsDryRunUndefined: Self = StObject.set(x, "isDryRun", js.undefined)
    
    inline def setIsFailFast(value: Boolean): Self = StObject.set(x, "isFailFast", value.asInstanceOf[js.Any])
    
    inline def setIsFailFastNull: Self = StObject.set(x, "isFailFast", null)
    
    inline def setIsFailFastUndefined: Self = StObject.set(x, "isFailFast", js.undefined)
    
    inline def setIsStrict(value: Boolean): Self = StObject.set(x, "isStrict", value.asInstanceOf[js.Any])
    
    inline def setIsStrictNull: Self = StObject.set(x, "isStrict", null)
    
    inline def setIsStrictUndefined: Self = StObject.set(x, "isStrict", js.undefined)
    
    inline def setMaxParallel(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
    ): Self = StObject.set(x, "maxParallel", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelNull: Self = StObject.set(x, "maxParallel", null)
    
    inline def setMaxParallelUndefined: Self = StObject.set(x, "maxParallel", js.undefined)
  }
}
