package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyEbsDefaultKmsKeyIdResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the default CMK for encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
}
object ModifyEbsDefaultKmsKeyIdResult {
  
  @scala.inline
  def apply(): ModifyEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEbsDefaultKmsKeyIdResult]
  }
  
  @scala.inline
  implicit class ModifyEbsDefaultKmsKeyIdResultMutableBuilder[Self <: ModifyEbsDefaultKmsKeyIdResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
