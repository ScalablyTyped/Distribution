package typings.chartJs.mod

import typings.chartJs.anon.Circumference
import typings.chartJs.distChunksHelpersDotcoreMod.D_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoughnutController extends D_ {
  
  /**
    * @private
    */
  /* private */ var _circumference: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _getCircumference: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _getRingWeight: Any = js.native
  
  /**
    * Get radius length offset of the dataset in relation to the visible datasets weights. This allows determining the inner and outer radius correctly
    * @private
    */
  /* private */ var _getRingWeightOffset: Any = js.native
  
  /**
    * @private
    */
  /* private */ var _getRotation: Any = js.native
  
  /**
    * Get the maximal rotation & circumference extents
    * across all visible datasets.
    */
  def _getRotationExtents(): Circumference = js.native
  
  /**
    * Returns the sum of all visible data set weights.
    * @private
    */
  /* private */ var _getVisibleDatasetWeightTotal: Any = js.native
  
  def calculateCircumference(value: Any): Double = js.native
  
  def calculateTotal(): Double = js.native
  
  def getMaxBorderWidth(arcs: Any): Double = js.native
  
  def getMaxOffset(arcs: Any): Double = js.native
  
  var innerRadius: Double = js.native
  
  var offsetX: Double = js.native
  
  var offsetY: Double = js.native
  
  var outerRadius: Double = js.native
  
  /**
    * Override data parsing, since we are not using scales
    */
  def parse(start: Any, count: Any): scala.Unit = js.native
}
