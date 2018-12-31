package typings
package bucksLib.BucksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucksStatic
  extends /**
  * Create bucks object.
  */
org.scalablytyped.runtime.Instantiable0[Bucks] {
  /**
    * If set `true`, uncaught errors are logged.
    */
  var DEBUG: scala.Boolean = js.native
  /**
    * bucks.js version.
    */
  var VERSION: java.lang.String = js.native
  /**
    * Not yet called `end` bucks object.
    */
  var living: js.Array[Bucks] = js.native
  /**
    * Running bucks objects.
    */
  var running: js.Array[Bucks] = js.native
  /**
    * Catch all errors.
    * @param onError Function called after catching error
    */
  def onError(onError: js.Function2[/* err */ stdLib.Error, /* bucks */ Bucks, _]): scala.Unit = js.native
}

