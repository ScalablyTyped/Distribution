package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distUtilsProtocolUtilsMod.RequestStateObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "ProtocolUtils")
@js.native
open class ProtocolUtils ()
  extends typings.azureMsalCommon.distUtilsProtocolUtilsMod.ProtocolUtils
/* static members */
object ProtocolUtils {
  
  @JSImport("@azure/msal-common", "ProtocolUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates the state value used by the common library.
    * @param randomGuid
    * @param cryptoObj
    */
  inline def generateLibraryState(cryptoObj: ICrypto): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateLibraryState")(cryptoObj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateLibraryState(cryptoObj: ICrypto, meta: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateLibraryState")(cryptoObj.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Parses the state into the RequestStateObject, which contains the LibraryState info and the state passed by the user.
    * @param state
    * @param cryptoObj
    */
  inline def parseRequestState(cryptoObj: ICrypto, state: String): RequestStateObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequestState")(cryptoObj.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RequestStateObject]
  
  /**
    * Appends user state with random guid, or returns random guid.
    * @param userState
    * @param randomGuid
    */
  inline def setRequestState(cryptoObj: ICrypto): String = ^.asInstanceOf[js.Dynamic].applyDynamic("setRequestState")(cryptoObj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def setRequestState(cryptoObj: ICrypto, userState: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setRequestState")(cryptoObj.asInstanceOf[js.Any], userState.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def setRequestState(cryptoObj: ICrypto, userState: String, meta: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setRequestState")(cryptoObj.asInstanceOf[js.Any], userState.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def setRequestState(cryptoObj: ICrypto, userState: Unit, meta: Record[String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setRequestState")(cryptoObj.asInstanceOf[js.Any], userState.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[String]
}
