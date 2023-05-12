package typings.contentstack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CachePolicy extends StObject
@JSImport("contentstack", "CachePolicy")
@js.native
object CachePolicy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CachePolicy & Double] = js.native
  
  @js.native
  sealed trait CACHE_ELSE_NETWORK
    extends StObject
       with CachePolicy
  /* 1 */ val CACHE_ELSE_NETWORK: typings.contentstack.mod.CachePolicy.CACHE_ELSE_NETWORK & Double = js.native
  
  @js.native
  sealed trait CACHE_THEN_NETWORK
    extends StObject
       with CachePolicy
  /* 3 */ val CACHE_THEN_NETWORK: typings.contentstack.mod.CachePolicy.CACHE_THEN_NETWORK & Double = js.native
  
  @js.native
  sealed trait IGNORE_CACHE
    extends StObject
       with CachePolicy
  /* -1 */ val IGNORE_CACHE: typings.contentstack.mod.CachePolicy.IGNORE_CACHE & Double = js.native
  
  @js.native
  sealed trait NETWORK_ELSE_CACHE
    extends StObject
       with CachePolicy
  /* 2 */ val NETWORK_ELSE_CACHE: typings.contentstack.mod.CachePolicy.NETWORK_ELSE_CACHE & Double = js.native
  
  @js.native
  sealed trait ONLY_NETWORK
    extends StObject
       with CachePolicy
  /* 0 */ val ONLY_NETWORK: typings.contentstack.mod.CachePolicy.ONLY_NETWORK & Double = js.native
}
