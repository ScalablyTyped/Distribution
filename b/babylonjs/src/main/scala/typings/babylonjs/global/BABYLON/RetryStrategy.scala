package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RetryStrategy")
@js.native
open class RetryStrategy ()
  extends StObject
     with typings.babylonjs.BABYLON.RetryStrategy
/* static members */
object RetryStrategy {
  
  @JSGlobal("BABYLON.RetryStrategy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Function used to defines an exponential back off strategy
    * @param maxRetries defines the maximum number of retries (3 by default)
    * @param baseInterval defines the interval between retries
    * @returns the strategy function to use
    */
  inline def ExponentialBackoff(): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ExponentialBackoff")().asInstanceOf[js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ]]
  inline def ExponentialBackoff(maxRetries: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ExponentialBackoff")(maxRetries.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ]]
  inline def ExponentialBackoff(maxRetries: Double, baseInterval: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ExponentialBackoff")(maxRetries.asInstanceOf[js.Any], baseInterval.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ]]
  inline def ExponentialBackoff(maxRetries: Unit, baseInterval: Double): js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("ExponentialBackoff")(maxRetries.asInstanceOf[js.Any], baseInterval.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* url */ String, 
    /* request */ typings.babylonjs.BABYLON.WebRequest, 
    /* retryIndex */ Double, 
    Double
  ]]
}
