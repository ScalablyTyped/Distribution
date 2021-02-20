package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteChapCredentialsInput extends StObject {
  
  /**
    * The iSCSI initiator that connects to the target.
    */
  var InitiatorName: IqnName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsSdk.storagegatewayMod.TargetARN = js.native
}
object DeleteChapCredentialsInput {
  
  @scala.inline
  def apply(InitiatorName: IqnName, TargetARN: TargetARN): DeleteChapCredentialsInput = {
    val __obj = js.Dynamic.literal(InitiatorName = InitiatorName.asInstanceOf[js.Any], TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteChapCredentialsInput]
  }
  
  @scala.inline
  implicit class DeleteChapCredentialsInputMutableBuilder[Self <: DeleteChapCredentialsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitiatorName(value: IqnName): Self = StObject.set(x, "InitiatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
  }
}
