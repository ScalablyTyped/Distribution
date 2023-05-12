package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distAccountClientInfoMod.ClientInfo
import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typings.azureMsalCommon.mod.^
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DEFAULT_CRYPTO_IMPLEMENTATION: ICrypto = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_CRYPTO_IMPLEMENTATION").asInstanceOf[ICrypto]

inline def IntFields: ReadonlySet[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("IntFields").asInstanceOf[ReadonlySet[String]]

inline def OIDC_DEFAULT_SCOPES: js.Array[String] = ^.asInstanceOf[js.Dynamic].selectDynamic("OIDC_DEFAULT_SCOPES").asInstanceOf[js.Array[String]]

inline def ONE_DAY_IN_MS: /* 86400000 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("ONE_DAY_IN_MS").asInstanceOf[/* 86400000 */ Double]

inline def StubbedNetworkModule: INetworkModule = ^.asInstanceOf[js.Dynamic].selectDynamic("StubbedNetworkModule").asInstanceOf[INetworkModule]

inline def THE_FAMILY_ID: /* "1" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("THE_FAMILY_ID").asInstanceOf[/* "1" */ String]

inline def buildClientInfo(rawClientInfo: String, crypto: ICrypto): ClientInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("buildClientInfo")(rawClientInfo.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[ClientInfo]

inline def buildClientInfoFromHomeAccountId(homeAccountId: String): ClientInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClientInfoFromHomeAccountId")(homeAccountId.asInstanceOf[js.Any]).asInstanceOf[ClientInfo]

inline def version: /* "13.0.0" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[/* "13.0.0" */ String]
