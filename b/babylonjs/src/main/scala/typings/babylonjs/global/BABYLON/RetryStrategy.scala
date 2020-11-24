package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RetryStrategy")
@js.native
class RetryStrategy ()
  extends typings.babylonjs.BABYLON.RetryStrategy
/* static members */
@JSGlobal("BABYLON.RetryStrategy")
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
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  def ExponentialBackoff(maxRetries: js.UndefOr[scala.Nothing], baseInterval: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  def ExponentialBackoff(maxRetries: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
  def ExponentialBackoff(maxRetries: Double, baseInterval: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = js.native
}
