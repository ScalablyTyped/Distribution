package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GroundGeometryUpdater")
@js.native
open class GroundGeometryUpdater protected () extends StObject {
  def this(options: typings.cesiumEngine.anon.Entity) = this()
  
  /**
    * Destroys and resources used by the object.  Once an object is destroyed, it should not be used.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the zindex
    */
  val zIndex: Double = js.native
}
