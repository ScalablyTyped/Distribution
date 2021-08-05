package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2InstanceLimit extends StObject {
  
  /**
    * Number of instances of the specified type that are currently in use by this AWS account.
    */
  var CurrentInstances: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var EC2InstanceType: js.UndefOr[typings.awsSdk.gameliftMod.EC2InstanceType] = js.undefined
  
  /**
    * Number of instances allowed.
    */
  var InstanceLimit: js.UndefOr[WholeNumber] = js.undefined
}
object EC2InstanceLimit {
  
  inline def apply(): EC2InstanceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceLimit]
  }
  
  extension [Self <: EC2InstanceLimit](x: Self) {
    
    inline def setCurrentInstances(value: WholeNumber): Self = StObject.set(x, "CurrentInstances", value.asInstanceOf[js.Any])
    
    inline def setCurrentInstancesUndefined: Self = StObject.set(x, "CurrentInstances", js.undefined)
    
    inline def setEC2InstanceType(value: EC2InstanceType): Self = StObject.set(x, "EC2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceTypeUndefined: Self = StObject.set(x, "EC2InstanceType", js.undefined)
    
    inline def setInstanceLimit(value: WholeNumber): Self = StObject.set(x, "InstanceLimit", value.asInstanceOf[js.Any])
    
    inline def setInstanceLimitUndefined: Self = StObject.set(x, "InstanceLimit", js.undefined)
  }
}
