package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CustomDataSource")
@js.native
open class CustomDataSource () extends StObject {
  def this(name: String) = this()
  
  /**
    * Gets an event that will be raised when the underlying data changes.
    */
  var changedEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the clock for this instance.
    */
  var clock: DataSourceClock = js.native
  
  /**
    * Gets or sets the clustering options for this data source. This object can be shared between multiple data sources.
    */
  var clustering: EntityCluster = js.native
  
  /**
    * Gets the collection of {@link Entity} instances.
    */
  var entities: EntityCollection = js.native
  
  /**
    * Gets an event that will be raised if an error is encountered during processing.
    */
  var errorEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets whether the data source is currently loading data.
    */
  var isLoading: Boolean = js.native
  
  /**
    * Gets an event that will be raised when the data source either starts or stops loading.
    */
  var loadingEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets a human-readable name for this instance.
    */
  var name: String = js.native
  
  /**
    * Gets whether or not this data source should be displayed.
    */
  var show: Boolean = js.native
  
  /**
    * Updates the data source to the provided time.  This function is optional and
    * is not required to be implemented.  It is provided for data sources which
    * retrieve data based on the current animation time or scene state.
    * If implemented, update will be called by {@link DataSourceDisplay} once a frame.
    * @param time - The simulation time.
    * @returns True if this data source is ready to be displayed at the provided time, false otherwise.
    */
  def update(time: JulianDate): Boolean = js.native
}
