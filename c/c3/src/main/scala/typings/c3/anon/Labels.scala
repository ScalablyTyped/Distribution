package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Labels extends StObject {
  
  def apply(): scala.Unit = js.native
  
  /**
    * Get and set axis labels.
    * @param labels If labels is given, specified axis' label will be updated.
    */
  def labels(): scala.Unit = js.native
  def labels(labels: keyinAxisNamestring): scala.Unit = js.native
  
  /**
    * Get and set axis max value.
    * @param max If an object is given, specified axis' max value will be updated. If a number is given, the max values for y and y2 will be updated.
    * @returns If `max` is *not* given, the current max values for each axis will be returned. Otherwise returns nothing.
    */
  def max(): keyinAxisNamenumber = js.native
  def max(max: Double): scala.Unit = js.native
  def max(max: keyinAxisNamenumberX): scala.Unit = js.native
  
  /**
    * Get and set axis min value.
    * @param min If an object is given, specified axis' min value will be updated. If a number is given, the min values for y and y2 will be updated.
    * @returns If `min` is *not* given, the current max values for each axis will be returned. Otherwise returns nothing.
    */
  def min(): keyinAxisNamenumber = js.native
  def min(min: Double): scala.Unit = js.native
  def min(min: keyinAxisNamenumberX): scala.Unit = js.native
  
  /**
    * Get and set axis min and max values.
    * @param range If range is given, specified axis' min and max value will be updated.
    * @returns If `range` is *not* given, returns the current min and max values for each axis.
    */
  def range(): Max = js.native
  def range(range: Min): scala.Unit = js.native
  
  def types(types: keyinAxisNameXAxisTypeYAx): scala.Unit = js.native
}
