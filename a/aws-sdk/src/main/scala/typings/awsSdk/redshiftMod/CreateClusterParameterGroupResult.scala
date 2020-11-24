package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateClusterParameterGroupResult extends js.Object {
  
  var ClusterParameterGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterParameterGroup] = js.native
}
object CreateClusterParameterGroupResult {
  
  @scala.inline
  def apply(): CreateClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterParameterGroupResult]
  }
  
  @scala.inline
  implicit class CreateClusterParameterGroupResultOps[Self <: CreateClusterParameterGroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterParameterGroup(value: ClusterParameterGroup): Self = this.set("ClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterParameterGroup: Self = this.set("ClusterParameterGroup", js.undefined)
  }
}
