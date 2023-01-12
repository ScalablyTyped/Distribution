package typings.azureMsalCommon

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsProtocolUtilsMod {
  
  @JSImport("@azure/msal-common/dist/utils/ProtocolUtils", "ProtocolUtils")
  @js.native
  open class ProtocolUtils () extends StObject
  /* static members */
  object ProtocolUtils {
    
    @JSImport("@azure/msal-common/dist/utils/ProtocolUtils", "ProtocolUtils")
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
  
  trait LibraryStateObject extends StObject {
    
    var id: String
    
    var meta: js.UndefOr[Record[String, String]] = js.undefined
  }
  object LibraryStateObject {
    
    inline def apply(id: String): LibraryStateObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibraryStateObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LibraryStateObject] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: Record[String, String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  trait RequestStateObject extends StObject {
    
    var libraryState: LibraryStateObject
    
    var userRequestState: String
  }
  object RequestStateObject {
    
    inline def apply(libraryState: LibraryStateObject, userRequestState: String): RequestStateObject = {
      val __obj = js.Dynamic.literal(libraryState = libraryState.asInstanceOf[js.Any], userRequestState = userRequestState.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestStateObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestStateObject] (val x: Self) extends AnyVal {
      
      inline def setLibraryState(value: LibraryStateObject): Self = StObject.set(x, "libraryState", value.asInstanceOf[js.Any])
      
      inline def setUserRequestState(value: String): Self = StObject.set(x, "userRequestState", value.asInstanceOf[js.Any])
    }
  }
}
