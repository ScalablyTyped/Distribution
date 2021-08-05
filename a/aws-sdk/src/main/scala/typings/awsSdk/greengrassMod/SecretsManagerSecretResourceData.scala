package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretsManagerSecretResourceData extends StObject {
  
  /**
    * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version (represented by the ''AWSCURRENT'' staging label) is included by default.
    */
  var ARN: js.UndefOr[string] = js.undefined
  
  /**
    * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
    */
  var AdditionalStagingLabelsToDownload: js.UndefOr[listOfString] = js.undefined
}
object SecretsManagerSecretResourceData {
  
  inline def apply(): SecretsManagerSecretResourceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretsManagerSecretResourceData]
  }
  
  extension [Self <: SecretsManagerSecretResourceData](x: Self) {
    
    inline def setARN(value: string): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setAdditionalStagingLabelsToDownload(value: listOfString): Self = StObject.set(x, "AdditionalStagingLabelsToDownload", value.asInstanceOf[js.Any])
    
    inline def setAdditionalStagingLabelsToDownloadUndefined: Self = StObject.set(x, "AdditionalStagingLabelsToDownload", js.undefined)
    
    inline def setAdditionalStagingLabelsToDownloadVarargs(value: string*): Self = StObject.set(x, "AdditionalStagingLabelsToDownload", js.Array(value :_*))
  }
}
