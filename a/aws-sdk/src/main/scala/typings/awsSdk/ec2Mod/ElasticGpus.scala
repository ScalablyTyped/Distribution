package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticGpus extends StObject {
  
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
  implicit class ElasticGpusMutableBuilder[Self <: ElasticGpus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setElasticGpuHealth(value: ElasticGpuHealth): Self = StObject.set(x, "ElasticGpuHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuHealthUndefined: Self = StObject.set(x, "ElasticGpuHealth", js.undefined)
    
    @scala.inline
    def setElasticGpuId(value: String): Self = StObject.set(x, "ElasticGpuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuIdUndefined: Self = StObject.set(x, "ElasticGpuId", js.undefined)
    
    @scala.inline
    def setElasticGpuState(value: ElasticGpuState): Self = StObject.set(x, "ElasticGpuState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuStateUndefined: Self = StObject.set(x, "ElasticGpuState", js.undefined)
    
    @scala.inline
    def setElasticGpuType(value: String): Self = StObject.set(x, "ElasticGpuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticGpuTypeUndefined: Self = StObject.set(x, "ElasticGpuType", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
