package typings.awsSdkClientKmsBrowser.mod

import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_1
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_256
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_PKCS1_V1_5
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSA_2048
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersForImportInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput
object GetParametersForImportInput {
  
  inline def apply(
    KeyId: String,
    WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
    WrappingKeySpec: RSA_2048 | String
  ): GetParametersForImportInput = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersForImportInput]
  }
}
