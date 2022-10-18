package typings.cesium

import typings.cesium.anon.Canvas
import typings.cesium.mod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneSceneMod {
  
  @JSImport("cesium/Source/Scene/Scene", JSImport.Default)
  @js.native
  open class default protected () extends Scene {
    def this(options: Canvas) = this()
    def this(options: Canvas, depthPlaneEllipsoidOffset: Double) = this()
  }
}
