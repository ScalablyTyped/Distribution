package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemEndOcclusionQuery
  extends StObject
     with IWebGPURenderItem
object WebGPURenderItemEndOcclusionQuery {
  
  inline def apply(run: GPURenderPassEncoder => Unit): WebGPURenderItemEndOcclusionQuery = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[WebGPURenderItemEndOcclusionQuery]
  }
}
