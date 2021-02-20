package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLayersResult extends StObject {
  
  /**
    * An array of Layer objects that describe the layers.
    */
  var Layers: js.UndefOr[typings.awsSdk.opsworksMod.Layers] = js.native
}
object DescribeLayersResult {
  
  @scala.inline
  def apply(): DescribeLayersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLayersResult]
  }
  
  @scala.inline
  implicit class DescribeLayersResultMutableBuilder[Self <: DescribeLayersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: Layers): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = StObject.set(x, "Layers", js.Array(value :_*))
  }
}
