package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeometryUpdater")
@js.native
open class GeometryUpdater protected () extends StObject {
  def this(options: typings.cesium.anon.Entity) = this()
  
  /**
    * Gets or sets the {@link ClassificationType} Property specifying if this geometry will classify terrain, 3D Tiles, or both when on the ground.
    */
  val classificationTypeProperty: Property = js.native
  
  /**
    * Creates the geometry instance which represents the fill of the geometry.
    * @param time - The time to use when retrieving initial attribute values.
    * @returns The geometry instance representing the filled portion of the geometry.
    */
  def createFillGeometryInstance(time: JulianDate): GeometryInstance = js.native
  
  /**
    * Creates the geometry instance which represents the outline of the geometry.
    * @param time - The time to use when retrieving initial attribute values.
    * @returns The geometry instance representing the outline portion of the geometry.
    */
  def createOutlineGeometryInstance(time: JulianDate): GeometryInstance = js.native
  
  /**
    * Destroys and resources used by the object.  Once an object is destroyed, it should not be used.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets the {@link DistanceDisplayCondition} Property specifying at what distance from the camera that this geometry will be displayed.
    */
  val distanceDisplayConditionProperty: Property = js.native
  
  /**
    * Gets the entity associated with this geometry.
    */
  val entity: Entity = js.native
  
  /**
    * Gets a value indicating if the geometry has a fill component.
    */
  val fillEnabled: Boolean = js.native
  
  /**
    * Gets the material property used to fill the geometry.
    */
  val fillMaterialProperty: MaterialProperty = js.native
  
  /**
    * Gets an event that is raised whenever the public properties
    * of this updater change.
    */
  val geometryChanged: Boolean = js.native
  
  /**
    * Gets a value indicating if fill visibility varies with simulation time.
    */
  val hasConstantFill: Boolean = js.native
  
  /**
    * Gets a value indicating if the geometry has an outline component.
    */
  val hasConstantOutline: Boolean = js.native
  
  /**
    * Gets the unique ID associated with this updater
    */
  val id: String = js.native
  
  /**
    * Gets a value indicating if the geometry is closed.
    * This property is only valid for static geometry.
    */
  val isClosed: Boolean = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets a value indicating if the geometry is time-varying.
    * If true, all visualization is delegated to a DynamicGeometryUpdater
    * returned by GeometryUpdater#createDynamicUpdater.
    */
  val isDynamic: Boolean = js.native
  
  /**
    * Checks if the geometry is filled at the provided time.
    * @param time - The time for which to retrieve visibility.
    * @returns true if geometry is filled at the provided time, false otherwise.
    */
  def isFilled(time: JulianDate): Boolean = js.native
  
  /**
    * Checks if the geometry is outlined at the provided time.
    * @param time - The time for which to retrieve visibility.
    * @returns true if geometry is outlined at the provided time, false otherwise.
    */
  def isOutlineVisible(time: JulianDate): Boolean = js.native
  
  /**
    * Gets the {@link Color} property for the geometry outline.
    */
  val outlineColorProperty: Property = js.native
  
  /**
    * Gets a value indicating if the geometry has an outline component.
    */
  val outlineEnabled: Boolean = js.native
  
  /**
    * Gets the constant with of the geometry outline, in pixels.
    * This value is only valid if isDynamic is false.
    */
  val outlineWidth: Double = js.native
  
  /**
    * Gets the property specifying whether the geometry
    * casts or receives shadows from light sources.
    */
  val shadowsProperty: Property = js.native
}
