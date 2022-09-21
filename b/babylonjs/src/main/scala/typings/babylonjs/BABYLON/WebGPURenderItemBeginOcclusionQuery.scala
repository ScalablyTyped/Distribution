package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemBeginOcclusionQuery
  extends StObject
     with IWebGPURenderItem {
  
  var query: Double
}
object WebGPURenderItemBeginOcclusionQuery {
  
  inline def apply(query: Double, run: GPURenderPassEncoder => Unit): WebGPURenderItemBeginOcclusionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[WebGPURenderItemBeginOcclusionQuery]
  }
  
  extension [Self <: WebGPURenderItemBeginOcclusionQuery](x: Self) {
    
    inline def setQuery(value: Double): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
