package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RuntimeConfig. */
@js.native
trait IRuntimeConfig extends StObject {
  
  /** RuntimeConfig isDryRun */
  var isDryRun: js.UndefOr[Boolean | Null] = js.native
  
  /** RuntimeConfig isFailFast */
  var isFailFast: js.UndefOr[Boolean | Null] = js.native
  
  /** RuntimeConfig isStrict */
  var isStrict: js.UndefOr[Boolean | Null] = js.native
  
  /** RuntimeConfig maxParallel */
  var maxParallel: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
}
object IRuntimeConfig {
  
  @scala.inline
  def apply(): IRuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRuntimeConfig]
  }
  
  @scala.inline
  implicit class IRuntimeConfigMutableBuilder[Self <: IRuntimeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsDryRun(value: Boolean): Self = StObject.set(x, "isDryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDryRunNull: Self = StObject.set(x, "isDryRun", null)
    
    @scala.inline
    def setIsDryRunUndefined: Self = StObject.set(x, "isDryRun", js.undefined)
    
    @scala.inline
    def setIsFailFast(value: Boolean): Self = StObject.set(x, "isFailFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFailFastNull: Self = StObject.set(x, "isFailFast", null)
    
    @scala.inline
    def setIsFailFastUndefined: Self = StObject.set(x, "isFailFast", js.undefined)
    
    @scala.inline
    def setIsStrict(value: Boolean): Self = StObject.set(x, "isStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStrictNull: Self = StObject.set(x, "isStrict", null)
    
    @scala.inline
    def setIsStrictUndefined: Self = StObject.set(x, "isStrict", js.undefined)
    
    @scala.inline
    def setMaxParallel(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = StObject.set(x, "maxParallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxParallelNull: Self = StObject.set(x, "maxParallel", null)
    
    @scala.inline
    def setMaxParallelUndefined: Self = StObject.set(x, "maxParallel", js.undefined)
  }
}
