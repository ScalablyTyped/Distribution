package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataBuffer extends StObject {
  
  /** Gets or sets the size of the underlying buffer */
  var capacity: Double = js.native
  
  /**
    * Gets or sets a boolean indicating if the buffer contains 32bits indices
    */
  var is32Bits: Boolean = js.native
  
  /**
    * Gets or sets the number of objects referencing this buffer
    */
  var references: Double = js.native
  
  /**
    * Gets the underlying buffer
    */
  def underlyingResource: js.Any = js.native
}
