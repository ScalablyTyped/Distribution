package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPUBindGroupLayoutEntryInfo extends StObject {
  
  var index: Double
  
  var name: String
  
  var nameInArrayOfTexture: js.UndefOr[String] = js.undefined
}
object WebGPUBindGroupLayoutEntryInfo {
  
  inline def apply(index: Double, name: String): WebGPUBindGroupLayoutEntryInfo = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGPUBindGroupLayoutEntryInfo]
  }
  
  extension [Self <: WebGPUBindGroupLayoutEntryInfo](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameInArrayOfTexture(value: String): Self = StObject.set(x, "nameInArrayOfTexture", value.asInstanceOf[js.Any])
    
    inline def setNameInArrayOfTextureUndefined: Self = StObject.set(x, "nameInArrayOfTexture", js.undefined)
  }
}
