package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCloudFormationStackRequest extends js.Object {
  
  /**
    * An array of parameters that will be used to create the new Amazon EC2 instance. You can only pass one instance entry at a time in this array. You will get an invalid parameter error if you pass more than one instance entry in this array.
    */
  var instances: InstanceEntryList = js.native
}
object CreateCloudFormationStackRequest {
  
  @scala.inline
  def apply(instances: InstanceEntryList): CreateCloudFormationStackRequest = {
    val __obj = js.Dynamic.literal(instances = instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCloudFormationStackRequest]
  }
  
  @scala.inline
  implicit class CreateCloudFormationStackRequestOps[Self <: CreateCloudFormationStackRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInstancesVarargs(value: InstanceEntry*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: InstanceEntryList): Self = this.set("instances", value.asInstanceOf[js.Any])
  }
}
