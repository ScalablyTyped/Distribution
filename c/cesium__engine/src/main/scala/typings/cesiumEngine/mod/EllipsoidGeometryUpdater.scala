package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "EllipsoidGeometryUpdater")
@js.native
open class EllipsoidGeometryUpdater protected () extends StObject {
  def this(entity: Entity, scene: Scene) = this()
  
  /**
    * Creates the geometry instance which represents the fill of the geometry.
    * @param time - The time to use when retrieving initial attribute values.
    * @param [skipModelMatrix = false] - Whether to compute a model matrix for the geometry instance
    * @param [modelMatrixResult] - Used to store the result of the model matrix calculation
    * @returns The geometry instance representing the filled portion of the geometry.
    */
  def createFillGeometryInstance(time: JulianDate): GeometryInstance = js.native
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: Boolean): GeometryInstance = js.native
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: Boolean, modelMatrixResult: Matrix4): GeometryInstance = js.native
  def createFillGeometryInstance(time: JulianDate, skipModelMatrix: Unit, modelMatrixResult: Matrix4): GeometryInstance = js.native
  
  /**
    * Creates the geometry instance which represents the outline of the geometry.
    * @param time - The time to use when retrieving initial attribute values.
    * @param [skipModelMatrix = false] - Whether to compute a model matrix for the geometry instance
    * @param [modelMatrixResult] - Used to store the result of the model matrix calculation
    * @returns The geometry instance representing the outline portion of the geometry.
    */
  def createOutlineGeometryInstance(time: JulianDate): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: Boolean): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: Boolean, modelMatrixResult: Matrix4): GeometryInstance = js.native
  def createOutlineGeometryInstance(time: JulianDate, skipModelMatrix: Unit, modelMatrixResult: Matrix4): GeometryInstance = js.native
}
