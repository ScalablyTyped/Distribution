package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-common", "TimeUtils")
@js.native
open class TimeUtils ()
  extends typings.azureMsalCommon.timeUtilsMod.TimeUtils
/* static members */
object TimeUtils {
  
  @JSImport("@azure/msal-common", "TimeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Waits for t number of milliseconds
    * @param t number
    * @param value T
    */
  inline def delay[T](t: Double): js.Promise[T | Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(t.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Unit]]
  inline def delay[T](t: Double, value: T): js.Promise[T | Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("delay")(t.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T | Unit]]
  
  /**
    * check if a token is expired based on given UTC time in seconds.
    * @param expiresOn
    */
  inline def isTokenExpired(expiresOn: String, offset: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTokenExpired")(expiresOn.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * return the current time in Unix time (seconds).
    */
  inline def nowSeconds(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("nowSeconds")().asInstanceOf[Double]
  
  /**
    * If the current time is earlier than the time that a token was cached at, we must discard the token
    * i.e. The system clock was turned back after acquiring the cached token
    * @param cachedAt
    * @param offset
    */
  inline def wasClockTurnedBack(cachedAt: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("wasClockTurnedBack")(cachedAt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
