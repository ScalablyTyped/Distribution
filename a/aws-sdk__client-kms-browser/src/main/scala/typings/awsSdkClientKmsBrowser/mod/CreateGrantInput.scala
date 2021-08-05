package typings.awsSdkClientKmsBrowser.mod

import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.CreateGrant
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Decrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DescribeKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Encrypt
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKey
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKeyWithoutPlaintext
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptFrom
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptTo
import typings.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RetireGrant
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGrantInput
  extends StObject
     with typings.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput
object CreateGrantInput {
  
  inline def apply(
    GranteePrincipal: String,
    KeyId: String,
    Operations: (js.Array[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ]) | (Iterable[
      Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
    ])
  ): CreateGrantInput = {
    val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGrantInput]
  }
}
