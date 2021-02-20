package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceSpecification extends StObject {
  
  /**
    * Excludes the root volume from being snapshotted.
    */
  var ExcludeBootVolume: js.UndefOr[Boolean] = js.native
  
  /**
    * The instance to specify which volumes should be snapshotted.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.native
}
object InstanceSpecification {
  
  @scala.inline
  def apply(): InstanceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceSpecification]
  }
  
  @scala.inline
  implicit class InstanceSpecificationMutableBuilder[Self <: InstanceSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeBootVolume(value: Boolean): Self = StObject.set(x, "ExcludeBootVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeBootVolumeUndefined: Self = StObject.set(x, "ExcludeBootVolume", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
  }
}
