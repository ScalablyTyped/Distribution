package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionFilter extends StObject {
  
  /**
    * The dimension name to be matched.
    */
  var Name: DimensionName = js.native
  
  /**
    * The value of the dimension to be matched.
    */
  var Value: js.UndefOr[DimensionValue] = js.native
}
object DimensionFilter {
  
  @scala.inline
  def apply(Name: DimensionName): DimensionFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionFilter]
  }
  
  @scala.inline
  implicit class DimensionFilterMutableBuilder[Self <: DimensionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: DimensionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: DimensionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
