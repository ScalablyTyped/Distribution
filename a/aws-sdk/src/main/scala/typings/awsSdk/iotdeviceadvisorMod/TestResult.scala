package typings.awsSdk.iotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult extends StObject {
  
  /**
    * Show each group of test results.
    */
  var groups: js.UndefOr[GroupResultList] = js.undefined
}
object TestResult {
  
  inline def apply(): TestResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestResult]
  }
  
  extension [Self <: TestResult](x: Self) {
    
    inline def setGroups(value: GroupResultList): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupResult*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
