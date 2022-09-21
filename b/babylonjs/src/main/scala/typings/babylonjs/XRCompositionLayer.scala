package typings.babylonjs

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://immersive-web.github.io/layers/#xrcompositionlayertype
@js.native
trait XRCompositionLayer
  extends StObject
     with EventTarget {
  
  var blendTextureSourceAlpha: Boolean = js.native
  
  var chromaticAberrationCorrection: Boolean = js.native
  
  def destroy(): Unit = js.native
  
  var layout: XRLayerLayout = js.native
  
  var mipLevels: Double = js.native
  
  var needsRedraw: Boolean = js.native
}
