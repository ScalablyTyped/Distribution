package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicAccessBlockOutput extends StObject {
  
  /**
    * The PublicAccessBlock configuration currently in effect for this AWS account.
    */
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.undefined
}
object GetPublicAccessBlockOutput {
  
  inline def apply(): GetPublicAccessBlockOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPublicAccessBlockOutput]
  }
  
  extension [Self <: GetPublicAccessBlockOutput](x: Self) {
    
    inline def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
  }
}
