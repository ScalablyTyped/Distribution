package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "DataSourceClock")
@js.native
open class DataSourceClock () extends StObject {
  
  /**
    * Gets or sets the desired clock range setting.
    * See {@link Clock#clockRange}.
    */
  var clockRange: ClockRange = js.native
  
  /**
    * Gets or sets the desired clock step setting.
    * See {@link Clock#clockStep}.
    */
  var clockStep: ClockStep = js.native
  
  def clone(result: DataSourceClock): DataSourceClock = js.native
  
  /**
    * Gets or sets the desired current time when this data source is loaded.
    * See {@link Clock#currentTime}.
    */
  var currentTime: JulianDate = js.native
  
  /**
    * Gets the event that is raised whenever a new property is assigned.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Returns true if this DataSourceClock is equivalent to the other
    * @param other - The other DataSourceClock to compare to.
    * @returns <code>true</code> if the DataSourceClocks are equal; otherwise, <code>false</code>.
    */
  def equals(other: DataSourceClock): Boolean = js.native
  
  /**
    * Gets the value of this clock instance as a {@link Clock} object.
    * @returns The modified result parameter or a new instance if one was not provided.
    */
  def getValue(): Clock = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: DataSourceClock): Unit = js.native
  
  /**
    * Gets or sets the desired clock multiplier.
    * See {@link Clock#multiplier}.
    */
  var multiplier: Double = js.native
  
  /**
    * Gets or sets the desired start time of the clock.
    * See {@link Clock#startTime}.
    */
  var startTime: JulianDate = js.native
  
  /**
    * Gets or sets the desired stop time of the clock.
    * See {@link Clock#stopTime}.
    */
  var stopTime: JulianDate = js.native
}
