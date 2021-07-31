package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionKeyDescription extends StObject {
  
  /**
    * A map of name-value pairs for the dimensions in the group.
    */
  var Dimensions: js.UndefOr[DimensionMap] = js.undefined
  
  /**
    * If PartitionBy was specified, PartitionKeys contains the dimensions that were.
    */
  var Partitions: js.UndefOr[MetricValuesList] = js.undefined
  
  /**
    * The aggregated metric value for the dimension(s), over the requested time range.
    */
  var Total: js.UndefOr[Double] = js.undefined
}
object DimensionKeyDescription {
  
  @scala.inline
  def apply(): DimensionKeyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionKeyDescription]
  }
  
  @scala.inline
  implicit class DimensionKeyDescriptionMutableBuilder[Self <: DimensionKeyDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: DimensionMap): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setPartitions(value: MetricValuesList): Self = StObject.set(x, "Partitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionsUndefined: Self = StObject.set(x, "Partitions", js.undefined)
    
    @scala.inline
    def setPartitionsVarargs(value: Double*): Self = StObject.set(x, "Partitions", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
