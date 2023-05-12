package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.Intensity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "SunLight")
@js.native
open class SunLight () extends StObject {
  def this(options: Intensity) = this()
  
  /**
    * The color of the light.
    */
  var color: Color = js.native
  
  /**
    * The intensity of the light.
    */
  var intensity: Double = js.native
}
