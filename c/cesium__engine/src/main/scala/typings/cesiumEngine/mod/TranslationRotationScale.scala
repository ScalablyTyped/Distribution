package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "TranslationRotationScale")
@js.native
open class TranslationRotationScale () extends StObject {
  def this(translation: Cartesian3) = this()
  def this(translation: Unit, rotation: Quaternion) = this()
  def this(translation: Cartesian3, rotation: Quaternion) = this()
  def this(translation: Unit, rotation: Unit, scale: Cartesian3) = this()
  def this(translation: Unit, rotation: Quaternion, scale: Cartesian3) = this()
  def this(translation: Cartesian3, rotation: Unit, scale: Cartesian3) = this()
  def this(translation: Cartesian3, rotation: Quaternion, scale: Cartesian3) = this()
  
  /**
    * Compares this instance against the provided instance and returns
    * <code>true</code> if they are equal, <code>false</code> otherwise.
    * @param [right] - The right hand side TranslationRotationScale.
    * @returns <code>true</code> if they are equal, <code>false</code> otherwise.
    */
  def equals(): Boolean = js.native
  def equals(right: TranslationRotationScale): Boolean = js.native
  
  /**
    * Gets or sets the (x, y, z, w) rotation to apply to the node.
    */
  var rotation: Quaternion = js.native
  
  /**
    * Gets or sets the (x, y, z) scaling to apply to the node.
    */
  var scale: Cartesian3 = js.native
  
  /**
    * Gets or sets the (x, y, z) translation to apply to the node.
    */
  var translation: Cartesian3 = js.native
}
