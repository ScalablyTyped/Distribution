package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRMediaBinding extends StObject {
  
  def createCylinderLayer(video: HTMLVideoElement): XRCylinderLayer = js.native
  def createCylinderLayer(video: HTMLVideoElement, init: XRMediaCylinderLayerInit): XRCylinderLayer = js.native
  
  def createEquirectLayer(video: HTMLVideoElement): XREquirectLayer = js.native
  def createEquirectLayer(video: HTMLVideoElement, init: XRMediaEquirectLayerInit): XREquirectLayer = js.native
  
  def createQuadLayer(video: HTMLVideoElement): XRQuadLayer = js.native
  def createQuadLayer(video: HTMLVideoElement, init: XRMediaQuadLayerInit): XRQuadLayer = js.native
}
