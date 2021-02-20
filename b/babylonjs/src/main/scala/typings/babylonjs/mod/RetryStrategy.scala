package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RetryStrategy")
@js.native
class RetryStrategy ()
  extends typings.babylonjs.legacyMod.RetryStrategy
/* static members */
object RetryStrategy {
  
  /**
    * Function used to defines an exponential back off strategy
    * @param maxRetries defines the maximum number of retries (3 by default)
    * @param baseInterval defines the interval between retries
    * @returns the strategy function to use
    */
  @JSImport("babylonjs", "RetryStrategy.ExponentialBackoff")
  @js.native
  def ExponentialBackoff(): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  @JSImport("babylonjs", "RetryStrategy.ExponentialBackoff")
  @js.native
  def ExponentialBackoff(maxRetries: js.UndefOr[scala.Nothing], baseInterval: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  @JSImport("babylonjs", "RetryStrategy.ExponentialBackoff")
  @js.native
  def ExponentialBackoff(maxRetries: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  @JSImport("babylonjs", "RetryStrategy.ExponentialBackoff")
  @js.native
  def ExponentialBackoff(maxRetries: Double, baseInterval: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
}
