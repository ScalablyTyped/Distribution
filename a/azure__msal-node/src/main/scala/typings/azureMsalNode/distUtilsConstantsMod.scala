package typings.azureMsalNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsConstantsMod {
  
  @js.native
  sealed trait ApiId extends StObject
  @JSImport("@azure/msal-node/dist/utils/Constants", "ApiId")
  @js.native
  object ApiId extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ApiId & Double] = js.native
    
    @js.native
    sealed trait acquireTokenByClientCredential
      extends StObject
         with ApiId
    /* 771 */ val acquireTokenByClientCredential: typings.azureMsalNode.distUtilsConstantsMod.ApiId.acquireTokenByClientCredential & Double = js.native
    
    @js.native
    sealed trait acquireTokenByCode
      extends StObject
         with ApiId
    /* 871 */ val acquireTokenByCode: typings.azureMsalNode.distUtilsConstantsMod.ApiId.acquireTokenByCode & Double = js.native
    
    @js.native
    sealed trait acquireTokenByDeviceCode
      extends StObject
         with ApiId
    /* 671 */ val acquireTokenByDeviceCode: typings.azureMsalNode.distUtilsConstantsMod.ApiId.acquireTokenByDeviceCode & Double = js.native
    
    @js.native
    sealed trait acquireTokenByRefreshToken
      extends StObject
         with ApiId
    /* 872 */ val acquireTokenByRefreshToken: typings.azureMsalNode.distUtilsConstantsMod.ApiId.acquireTokenByRefreshToken & Double = js.native
    
    @js.native
    sealed trait acquireTokenByUsernamePassword
      extends StObject
         with ApiId
    /* 371 */ val acquireTokenByUsernamePassword: typings.azureMsalNode.distUtilsConstantsMod.ApiId.acquireTokenByUsernamePassword & Double = js.native
    
    @js.native
    sealed trait acquireTokenSilent
      extends StObject
         with ApiId
    /* 62 */ val acquireTokenSilent: typings.azureMsalNode.distUtilsConstantsMod.ApiId.acquireTokenSilent & Double = js.native
  }
  
  object CACHE {
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "CACHE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "CACHE.EXTENSION_LIB")
    @js.native
    def EXTENSION_LIB: String = js.native
    inline def EXTENSION_LIB_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION_LIB")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "CACHE.FILE_CACHE")
    @js.native
    def FILE_CACHE: String = js.native
    inline def FILE_CACHE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_CACHE")(x.asInstanceOf[js.Any])
  }
  
  object CharSet {
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "CharSet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "CharSet.CV_CHARSET")
    @js.native
    def CV_CHARSET: String = js.native
    inline def CV_CHARSET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CV_CHARSET")(x.asInstanceOf[js.Any])
  }
  
  object Constants {
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Constants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Constants.AUTHORIZATION_PENDING")
    @js.native
    def AUTHORIZATION_PENDING: String = js.native
    inline def AUTHORIZATION_PENDING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHORIZATION_PENDING")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Constants.HTTP_PROTOCOL")
    @js.native
    def HTTP_PROTOCOL: String = js.native
    inline def HTTP_PROTOCOL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_PROTOCOL")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Constants.JWT_BEARER_ASSERTION_TYPE")
    @js.native
    def JWT_BEARER_ASSERTION_TYPE: String = js.native
    inline def JWT_BEARER_ASSERTION_TYPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JWT_BEARER_ASSERTION_TYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Constants.LOCALHOST")
    @js.native
    def LOCALHOST: String = js.native
    inline def LOCALHOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOCALHOST")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Constants.MSAL_SKU")
    @js.native
    def MSAL_SKU: String = js.native
    inline def MSAL_SKU_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MSAL_SKU")(x.asInstanceOf[js.Any])
  }
  
  object Hash {
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Hash")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "Hash.SHA256")
    @js.native
    def SHA256: String = js.native
    inline def SHA256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA256")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait HttpMethod extends StObject
  @JSImport("@azure/msal-node/dist/utils/Constants", "HttpMethod")
  @js.native
  object HttpMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HttpMethod & String] = js.native
    
    @js.native
    sealed trait GET
      extends StObject
         with HttpMethod
    /* "get" */ val GET: typings.azureMsalNode.distUtilsConstantsMod.HttpMethod.GET & String = js.native
    
    @js.native
    sealed trait POST
      extends StObject
         with HttpMethod
    /* "post" */ val POST: typings.azureMsalNode.distUtilsConstantsMod.HttpMethod.POST & String = js.native
  }
  
  @js.native
  sealed trait HttpStatus extends StObject
  @JSImport("@azure/msal-node/dist/utils/Constants", "HttpStatus")
  @js.native
  object HttpStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpStatus & Double] = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with HttpStatus
    /* 200 */ val OK: typings.azureMsalNode.distUtilsConstantsMod.HttpStatus.OK & Double = js.native
    
    @js.native
    sealed trait REDIRECT
      extends StObject
         with HttpStatus
    /* 302 */ val REDIRECT: typings.azureMsalNode.distUtilsConstantsMod.HttpStatus.REDIRECT & Double = js.native
  }
  
  object JwtConstants {
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.ALGORITHM")
    @js.native
    def ALGORITHM: String = js.native
    inline def ALGORITHM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALGORITHM")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.AUDIENCE")
    @js.native
    def AUDIENCE: String = js.native
    inline def AUDIENCE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIENCE")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.EXPIRATION_TIME")
    @js.native
    def EXPIRATION_TIME: String = js.native
    inline def EXPIRATION_TIME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPIRATION_TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.ISSUER")
    @js.native
    def ISSUER: String = js.native
    inline def ISSUER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ISSUER")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.JWT_ID")
    @js.native
    def JWT_ID: String = js.native
    inline def JWT_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JWT_ID")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.NOT_BEFORE")
    @js.native
    def NOT_BEFORE: String = js.native
    inline def NOT_BEFORE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_BEFORE")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.RSA_256")
    @js.native
    def RSA_256: String = js.native
    inline def RSA_256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RSA_256")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.SUBJECT")
    @js.native
    def SUBJECT: String = js.native
    inline def SUBJECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUBJECT")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.X5C")
    @js.native
    def X5C: String = js.native
    inline def X5C_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X5C")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "JwtConstants.X5T")
    @js.native
    def X5T: String = js.native
    inline def X5T_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X5T")(x.asInstanceOf[js.Any])
  }
  
  object LOOPBACK_SERVER_CONSTANTS {
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "LOOPBACK_SERVER_CONSTANTS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "LOOPBACK_SERVER_CONSTANTS.INTERVAL_MS")
    @js.native
    def INTERVAL_MS: Double = js.native
    inline def INTERVAL_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERVAL_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/msal-node/dist/utils/Constants", "LOOPBACK_SERVER_CONSTANTS.TIMEOUT_MS")
    @js.native
    def TIMEOUT_MS: Double = js.native
    inline def TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_MS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@azure/msal-node/dist/utils/Constants", "RANDOM_OCTET_SIZE")
  @js.native
  val RANDOM_OCTET_SIZE: /* 32 */ Double = js.native
  
  @JSImport("@azure/msal-node/dist/utils/Constants", "REGION_ENVIRONMENT_VARIABLE")
  @js.native
  val REGION_ENVIRONMENT_VARIABLE: /* "REGION_NAME" */ String = js.native
}
