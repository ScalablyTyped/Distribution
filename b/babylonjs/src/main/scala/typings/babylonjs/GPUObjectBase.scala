package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* eslint-disable @typescript-eslint/naming-convention */
trait GPUObjectBase extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
}
object GPUObjectBase {
  
  inline def apply(): GPUObjectBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUObjectBase]
  }
  
  extension [Self <: GPUObjectBase](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
