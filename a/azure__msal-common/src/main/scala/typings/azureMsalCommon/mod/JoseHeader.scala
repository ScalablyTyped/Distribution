package typings.azureMsalCommon.mod

import typings.azureMsalCommon.joseHeaderMod.JoseHeaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "JoseHeader")
@js.native
open class JoseHeader protected ()
  extends typings.azureMsalCommon.joseHeaderMod.JoseHeader {
  def this(options: JoseHeaderOptions) = this()
}
/* static members */
object JoseHeader {
  
  @JSImport("@azure/msal-common", "JoseHeader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Builds SignedHttpRequest formatted JOSE Header from the
    * JOSE Header options provided or previously set on the object and returns
    * the stringified header object.
    * Throws if keyId or algorithm aren't provided since they are required for Access Token Binding.
    * @param shrHeaderOptions
    * @returns
    */
  inline def getShrHeaderString(shrHeaderOptions: JoseHeaderOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getShrHeaderString")(shrHeaderOptions.asInstanceOf[js.Any]).asInstanceOf[String]
}
