package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapabilitiesDecodingInfo
  extends StObject
     with MediaCapabilitiesInfo {
  
  var configuration: js.UndefOr[MediaDecodingConfiguration] = js.undefined
}
object MediaCapabilitiesDecodingInfo {
  
  inline def apply(powerEfficient: scala.Boolean, smooth: scala.Boolean, supported: scala.Boolean): MediaCapabilitiesDecodingInfo = {
    val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCapabilitiesDecodingInfo]
  }
  
  extension [Self <: MediaCapabilitiesDecodingInfo](x: Self) {
    
    inline def setConfiguration(value: MediaDecodingConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
