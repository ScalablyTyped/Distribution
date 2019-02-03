package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class used to define a retry strategy when error happens while loading assets
  */
@JSGlobal("BABYLON.RetryStrategy")
@js.native
class RetryStrategy () extends js.Object

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
    /* url */ java.lang.String, 
    /* request */ stdLib.XMLHttpRequest, 
    /* retryIndex */ scala.Double, 
    scala.Double
  ] = js.native
  def ExponentialBackoff(maxRetries: scala.Double): js.Function3[
    /* url */ java.lang.String, 
    /* request */ stdLib.XMLHttpRequest, 
    /* retryIndex */ scala.Double, 
    scala.Double
  ] = js.native
  def ExponentialBackoff(maxRetries: scala.Double, baseInterval: scala.Double): js.Function3[
    /* url */ java.lang.String, 
    /* request */ stdLib.XMLHttpRequest, 
    /* retryIndex */ scala.Double, 
    scala.Double
  ] = js.native
}

