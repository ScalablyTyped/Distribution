package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateSyncConfigOutput extends StObject {
  
  /**
    * The template sync configuration detail data that's returned by Proton.
    */
  var templateSyncConfig: js.UndefOr[TemplateSyncConfig] = js.undefined
}
object GetTemplateSyncConfigOutput {
  
  inline def apply(): GetTemplateSyncConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateSyncConfigOutput]
  }
  
  extension [Self <: GetTemplateSyncConfigOutput](x: Self) {
    
    inline def setTemplateSyncConfig(value: TemplateSyncConfig): Self = StObject.set(x, "templateSyncConfig", value.asInstanceOf[js.Any])
    
    inline def setTemplateSyncConfigUndefined: Self = StObject.set(x, "templateSyncConfig", js.undefined)
  }
}
