package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAllowListResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the allow list.
    */
  var arn: js.UndefOr[stringMin71Max89PatternArnAwsAwsCnAwsUsGovMacie2AZ19920D12AllowListAZ0922] = js.undefined
  
  /**
    * The unique identifier for the allow list.
    */
  var id: js.UndefOr[stringMin22Max22PatternAZ0922] = js.undefined
}
object CreateAllowListResponse {
  
  inline def apply(): CreateAllowListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAllowListResponse]
  }
  
  extension [Self <: CreateAllowListResponse](x: Self) {
    
    inline def setArn(value: stringMin71Max89PatternArnAwsAwsCnAwsUsGovMacie2AZ19920D12AllowListAZ0922): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: stringMin22Max22PatternAZ0922): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
