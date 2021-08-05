package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCloudFormationStackRequest extends StObject {
  
  /**
    * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry in this array.
    */
  var instances: InstanceEntryList
}
object CreateCloudFormationStackRequest {
  
  inline def apply(instances: InstanceEntryList): CreateCloudFormationStackRequest = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationStackRequest]
  }
  
  extension [Self <: CreateCloudFormationStackRequest](x: Self) {
    
    inline def setInstances(value: InstanceEntryList): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesVarargs(value: InstanceEntry*): Self = StObject.set(x, "instances", js.Array(value :_*))
  }
}
