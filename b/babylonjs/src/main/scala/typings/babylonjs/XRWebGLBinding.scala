package typings.babylonjs

import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRWebGLBinding extends StObject {
  
  def createCubeLayer(): XRCubeLayer = js.native
  def createCubeLayer(init: XRCubeLayerInit): XRCubeLayer = js.native
  
  def createCylinderLayer(): XRCylinderLayer = js.native
  def createCylinderLayer(init: XRCylinderLayerInit): XRCylinderLayer = js.native
  
  def createEquirectLayer(): XREquirectLayer = js.native
  def createEquirectLayer(init: XREquirectLayerInit): XREquirectLayer = js.native
  
  def createProjectionLayer(): XRProjectionLayer = js.native
  def createProjectionLayer(init: XRProjectionLayerInit): XRProjectionLayer = js.native
  
  def createQuadLayer(): XRQuadLayer = js.native
  def createQuadLayer(init: XRQuadLayerInit): XRQuadLayer = js.native
  
  def getDepthInformation(view: XRView): js.UndefOr[XRWebGLDepthInformation] = js.native
  
  // BABYLON addition
  def getReflectionCubeMap(lightProbe: XRLightProbe): WebGLTexture = js.native
  
  def getSubImage(layer: XRCompositionLayer, frame: XRFrame): XRWebGLSubImage = js.native
  def getSubImage(layer: XRCompositionLayer, frame: XRFrame, eye: XREye): XRWebGLSubImage = js.native
  
  def getViewSubImage(layer: XRProjectionLayer, view: XRView): XRWebGLSubImage = js.native
  
  val nativeProjectionScaleFactor: Double = js.native
}
