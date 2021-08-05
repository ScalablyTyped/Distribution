package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapActionDetail extends StObject {
  
  /**
    * A description of the bootstrap action.
    */
  var BootstrapActionConfig: js.UndefOr[typings.awsSdk.emrMod.BootstrapActionConfig] = js.undefined
}
object BootstrapActionDetail {
  
  inline def apply(): BootstrapActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BootstrapActionDetail]
  }
  
  extension [Self <: BootstrapActionDetail](x: Self) {
    
    inline def setBootstrapActionConfig(value: BootstrapActionConfig): Self = StObject.set(x, "BootstrapActionConfig", value.asInstanceOf[js.Any])
    
    inline def setBootstrapActionConfigUndefined: Self = StObject.set(x, "BootstrapActionConfig", js.undefined)
  }
}
