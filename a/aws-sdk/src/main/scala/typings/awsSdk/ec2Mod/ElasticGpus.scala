package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticGpus extends js.Object {
  
  /**
    * The Availability Zone in the which the Elastic Graphics accelerator resides.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The status of the Elastic Graphics accelerator.
    */
  var ElasticGpuHealth: js.UndefOr[typings.awsSdk.ec2Mod.ElasticGpuHealth] = js.native
  
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.native
  
  /**
    * The state of the Elastic Graphics accelerator.
    */
  var ElasticGpuState: js.UndefOr[typings.awsSdk.ec2Mod.ElasticGpuState] = js.native
  
  /**
    * The type of Elastic Graphics accelerator.
    */
  var ElasticGpuType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the instance to which the Elastic Graphics accelerator is attached.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The tags assigned to the Elastic Graphics accelerator.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ElasticGpus {
  
  @scala.inline
  def apply(): ElasticGpus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpus]
  }
  
  @scala.inline
  implicit class ElasticGpusOps[Self <: ElasticGpus] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setElasticGpuHealth(value: ElasticGpuHealth): Self = this.set("ElasticGpuHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticGpuHealth: Self = this.set("ElasticGpuHealth", js.undefined)
    
    @scala.inline
    def setElasticGpuId(value: String): Self = this.set("ElasticGpuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticGpuId: Self = this.set("ElasticGpuId", js.undefined)
    
    @scala.inline
    def setElasticGpuState(value: ElasticGpuState): Self = this.set("ElasticGpuState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticGpuState: Self = this.set("ElasticGpuState", js.undefined)
    
    @scala.inline
    def setElasticGpuType(value: String): Self = this.set("ElasticGpuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticGpuType: Self = this.set("ElasticGpuType", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
