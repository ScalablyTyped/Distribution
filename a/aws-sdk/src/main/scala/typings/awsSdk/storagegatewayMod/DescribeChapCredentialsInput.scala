package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChapCredentialsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var TargetARN: typings.awsSdk.storagegatewayMod.TargetARN
}
object DescribeChapCredentialsInput {
  
  @scala.inline
  def apply(TargetARN: TargetARN): DescribeChapCredentialsInput = {
    val __obj = js.Dynamic.literal(TargetARN = TargetARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChapCredentialsInput]
  }
  
  @scala.inline
  implicit class DescribeChapCredentialsInputMutableBuilder[Self <: DescribeChapCredentialsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
  }
}
