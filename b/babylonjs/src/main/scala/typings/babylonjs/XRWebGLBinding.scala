package typings.babylonjs

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webxrlayers-1/#XRWebGLBindingtype
@js.native
trait XRWebGLBinding extends StObject {
  
  // https://immersive-web.github.io/layers/#XRWebGLBindingtype
  def createProjectionLayer(init: XRProjectionLayerInit): XRProjectionLayer = js.native
  
  def getReflectionCubeMap(lightProbe: XRLightProbe): WebGLTexture = js.native
  
  def getSubImage(layer: XRCompositionLayer, frame: XRFrame): XRWebGLSubImage = js.native
  def getSubImage(layer: XRCompositionLayer, frame: XRFrame, eye: XREye): XRWebGLSubImage = js.native
  
  def getViewSubImage(layer: XRProjectionLayer, view: XRView): XRWebGLSubImage = js.native
}
