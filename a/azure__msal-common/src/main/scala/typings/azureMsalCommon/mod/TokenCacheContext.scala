package typings.azureMsalCommon.mod

import typings.azureMsalCommon.distCacheInterfaceIserializabletokencacheMod.ISerializableTokenCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "TokenCacheContext")
@js.native
open class TokenCacheContext protected ()
  extends typings.azureMsalCommon.distCachePersistenceTokenCacheContextMod.TokenCacheContext {
  def this(tokenCache: ISerializableTokenCache, hasChanged: Boolean) = this()
}
