package typings.awsSdkSignatureV4Crt

import typings.awsSdkSignatureV4.distTypesSignatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4Crt.distTypesCrtSignerV4Mod.CrtSignerV4Init
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/signature-v4-crt", "CrtSignerV4")
  @js.native
  open class CrtSignerV4 protected ()
    extends typings.awsSdkSignatureV4Crt.distTypesCrtSignerV4Mod.CrtSignerV4 {
    def this(param0: CrtSignerV4Init & SignatureV4CryptoInit) = this()
  }
}
