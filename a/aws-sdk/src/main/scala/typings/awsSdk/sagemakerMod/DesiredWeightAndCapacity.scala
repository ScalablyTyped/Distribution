package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DesiredWeightAndCapacity extends StObject {
  
  /**
    * The variant's capacity.
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.native
  
  /**
    * The variant's weight.
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.native
  
  /**
    * The name of the variant to update.
    */
  var VariantName: typings.awsSdk.sagemakerMod.VariantName = js.native
}
object DesiredWeightAndCapacity {
  
  @scala.inline
  def apply(VariantName: VariantName): DesiredWeightAndCapacity = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredWeightAndCapacity]
  }
  
  @scala.inline
  implicit class DesiredWeightAndCapacityMutableBuilder[Self <: DesiredWeightAndCapacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredInstanceCount(value: TaskCount): Self = StObject.set(x, "DesiredInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredInstanceCountUndefined: Self = StObject.set(x, "DesiredInstanceCount", js.undefined)
    
    @scala.inline
    def setDesiredWeight(value: VariantWeight): Self = StObject.set(x, "DesiredWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredWeightUndefined: Self = StObject.set(x, "DesiredWeight", js.undefined)
    
    @scala.inline
    def setVariantName(value: VariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
  }
}
