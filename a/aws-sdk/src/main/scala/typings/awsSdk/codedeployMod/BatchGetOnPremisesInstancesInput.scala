package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetOnPremisesInstancesInput extends StObject {
  
  /**
    * The names of the on-premises instances about which to get information. The maximum number of instance names you can specify is 25.
    */
  var instanceNames: InstanceNameList
}
object BatchGetOnPremisesInstancesInput {
  
  inline def apply(instanceNames: InstanceNameList): BatchGetOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal(instanceNames = instanceNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetOnPremisesInstancesInput]
  }
  
  extension [Self <: BatchGetOnPremisesInstancesInput](x: Self) {
    
    inline def setInstanceNames(value: InstanceNameList): Self = StObject.set(x, "instanceNames", value.asInstanceOf[js.Any])
    
    inline def setInstanceNamesVarargs(value: InstanceName*): Self = StObject.set(x, "instanceNames", js.Array(value*))
  }
}
