package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishMetricAction extends StObject {
  
  /**
    * 
    */
  var Dimensions: typings.awsSdk.networkfirewallMod.Dimensions = js.native
}
object PublishMetricAction {
  
  @scala.inline
  def apply(Dimensions: Dimensions): PublishMetricAction = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishMetricAction]
  }
  
  @scala.inline
  implicit class PublishMetricActionMutableBuilder[Self <: PublishMetricAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
  }
}
