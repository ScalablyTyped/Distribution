package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisionedCapacityOutput extends StObject {
  
  /**
    * The response body contains the following JSON fields.
    */
  var ProvisionedCapacityList: js.UndefOr[typings.awsSdk.glacierMod.ProvisionedCapacityList] = js.undefined
}
object ListProvisionedCapacityOutput {
  
  @scala.inline
  def apply(): ListProvisionedCapacityOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProvisionedCapacityOutput]
  }
  
  @scala.inline
  implicit class ListProvisionedCapacityOutputMutableBuilder[Self <: ListProvisionedCapacityOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvisionedCapacityList(value: ProvisionedCapacityList): Self = StObject.set(x, "ProvisionedCapacityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedCapacityListUndefined: Self = StObject.set(x, "ProvisionedCapacityList", js.undefined)
    
    @scala.inline
    def setProvisionedCapacityListVarargs(value: ProvisionedCapacityDescription*): Self = StObject.set(x, "ProvisionedCapacityList", js.Array(value :_*))
  }
}
