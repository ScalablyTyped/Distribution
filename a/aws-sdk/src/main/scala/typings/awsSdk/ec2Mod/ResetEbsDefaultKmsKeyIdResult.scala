package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetEbsDefaultKmsKeyIdResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the default CMK for EBS encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
}
object ResetEbsDefaultKmsKeyIdResult {
  
  @scala.inline
  def apply(): ResetEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetEbsDefaultKmsKeyIdResult]
  }
  
  @scala.inline
  implicit class ResetEbsDefaultKmsKeyIdResultMutableBuilder[Self <: ResetEbsDefaultKmsKeyIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
