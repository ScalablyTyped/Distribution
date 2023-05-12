package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineErrorInit extends StObject {
  
  var reason: GPUPipelineErrorReason
}
object GPUPipelineErrorInit {
  
  inline def apply(reason: GPUPipelineErrorReason): GPUPipelineErrorInit = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUPipelineErrorInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUPipelineErrorInit] (val x: Self) extends AnyVal {
    
    inline def setReason(value: GPUPipelineErrorReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
