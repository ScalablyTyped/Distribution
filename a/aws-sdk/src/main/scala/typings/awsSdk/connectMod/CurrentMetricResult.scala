package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentMetricResult extends StObject {
  
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[CurrentMetricDataCollections] = js.native
  
  /**
    * The dimensions for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.connectMod.Dimensions] = js.native
}
object CurrentMetricResult {
  
  @scala.inline
  def apply(): CurrentMetricResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetricResult]
  }
  
  @scala.inline
  implicit class CurrentMetricResultMutableBuilder[Self <: CurrentMetricResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollections(value: CurrentMetricDataCollections): Self = StObject.set(x, "Collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionsUndefined: Self = StObject.set(x, "Collections", js.undefined)
    
    @scala.inline
    def setCollectionsVarargs(value: CurrentMetricData*): Self = StObject.set(x, "Collections", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
  }
}
