package typings.vegaLite8ozrbXDH.transformDTsMod

import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DensityTransform
  extends StObject
     with Transform {
  
  /**
    * The output fields for the sample value and corresponding density estimate.
    *
    * __Default value:__ `["value", "density"]`
    */
  var as: js.UndefOr[js.Tuple2[FieldName, FieldName]] = js.undefined
  
  /**
    * The bandwidth (standard deviation) of the Gaussian kernel. If unspecified or set to zero, the bandwidth value is automatically estimated from the input data using Scott’s rule.
    */
  var bandwidth: js.UndefOr[Double] = js.undefined
  
  /**
    * A boolean flag indicating if the output values should be probability estimates (false) or smoothed counts (true).
    *
    * __Default value:__ `false`
    */
  var counts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean flag indicating whether to produce density estimates (false) or cumulative density estimates (true).
    *
    * __Default value:__ `false`
    */
  var cumulative: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The data field for which to perform density estimation.
    */
  var density: FieldName
  
  /**
    * A [min, max] domain from which to sample the distribution. If unspecified, the extent will be determined by the observed minimum and maximum values of the density value field.
    */
  var extent: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  /**
    * The data fields to group by. If not specified, a single group containing all data objects will be used.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * The maximum number of samples to take along the extent domain for plotting the density.
    *
    * __Default value:__ `200`
    */
  var maxsteps: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of samples to take along the extent domain for plotting the density.
    *
    * __Default value:__ `25`
    */
  var minsteps: js.UndefOr[Double] = js.undefined
  
  /**
    * The exact number of samples to take along the extent domain for plotting the density. If specified, overrides both minsteps and maxsteps to set an exact number of uniform samples. Potentially useful in conjunction with a fixed extent to ensure consistent sample points for stacked densities.
    */
  var steps: js.UndefOr[Double] = js.undefined
}
object DensityTransform {
  
  inline def apply(density: FieldName): DensityTransform = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any])
    __obj.asInstanceOf[DensityTransform]
  }
  
  extension [Self <: DensityTransform](x: Self) {
    
    inline def setAs(value: js.Tuple2[FieldName, FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setBandwidth(value: Double): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setCounts(value: Boolean): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setCumulative(value: Boolean): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    inline def setDensity(value: FieldName): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setExtent(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setMaxsteps(value: Double): Self = StObject.set(x, "maxsteps", value.asInstanceOf[js.Any])
    
    inline def setMaxstepsUndefined: Self = StObject.set(x, "maxsteps", js.undefined)
    
    inline def setMinsteps(value: Double): Self = StObject.set(x, "minsteps", value.asInstanceOf[js.Any])
    
    inline def setMinstepsUndefined: Self = StObject.set(x, "minsteps", js.undefined)
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
