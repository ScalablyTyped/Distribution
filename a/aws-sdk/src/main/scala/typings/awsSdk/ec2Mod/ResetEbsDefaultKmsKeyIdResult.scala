package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetEbsDefaultKmsKeyIdResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the default CMK for EBS encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
}
object ResetEbsDefaultKmsKeyIdResult {
  
  inline def apply(): ResetEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetEbsDefaultKmsKeyIdResult]
  }
  
  extension [Self <: ResetEbsDefaultKmsKeyIdResult](x: Self) {
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
