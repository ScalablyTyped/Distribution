package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dimension extends StObject {
  
  /**
    * The value to use in the custom metric dimension.
    */
  var Value: DimensionValue = js.native
}
object Dimension {
  
  @scala.inline
  def apply(Value: DimensionValue): Dimension = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  
  @scala.inline
  implicit class DimensionMutableBuilder[Self <: Dimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: DimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
