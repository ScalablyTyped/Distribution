package typings.babylonjs.miscIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Misc/index", "RetryStrategy")
@js.native
class RetryStrategy ()
  extends typings.babylonjs.retryStrategyMod.RetryStrategy

/* static members */
@JSImport("babylonjs/Misc/index", "RetryStrategy")
@js.native
object RetryStrategy extends js.Object {
  /**
    * Function used to defines an exponential back off strategy
    * @param maxRetries defines the maximum number of retries (3 by default)
    * @param baseInterval defines the interval between retries
    * @returns the strategy function to use
    */
  def ExponentialBackoff(): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  def ExponentialBackoff(maxRetries: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  def ExponentialBackoff(maxRetries: Double, baseInterval: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.webRequestMod.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
}

