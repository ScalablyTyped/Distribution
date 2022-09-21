package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTemplateSyncConfigOutput extends StObject {
  
  /**
    * The template sync configuration detail data that's returned by Proton.
    */
  var templateSyncConfig: js.UndefOr[TemplateSyncConfig] = js.undefined
}
object DeleteTemplateSyncConfigOutput {
  
  inline def apply(): DeleteTemplateSyncConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTemplateSyncConfigOutput]
  }
  
  extension [Self <: DeleteTemplateSyncConfigOutput](x: Self) {
    
    inline def setTemplateSyncConfig(value: TemplateSyncConfig): Self = StObject.set(x, "templateSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setTemplateSyncConfigUndefined: Self = StObject.set(x, "templateSyncConfig", js.undefined)
  }
}
