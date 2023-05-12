package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "I3SField")
@js.native
open class I3SField () extends StObject {
  
  /**
    * Gets the header for this field.
    */
  val header: Any = js.native
  
  /**
    * Loads the content.
    * @returns A promise that is resolved when the field data is loaded
    */
  def load(): js.Promise[Unit] = js.native
  
  /**
    * Gets the name for the field.
    */
  val name: String = js.native
  
  /**
    * Gets the resource for the fields
    */
  val resource: Resource = js.native
  
  /**
    * Gets the values for this field.
    */
  val values: Any = js.native
}
