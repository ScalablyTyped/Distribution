package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Define an interface for all classes that will hold resources
  */
trait IDisposable extends js.Object {
  /**
    * Releases all held resources
    */
  def dispose(): scala.Unit
}

object IDisposable {
  @scala.inline
  def apply(dispose: () => scala.Unit): IDisposable = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
  
    __obj.asInstanceOf[IDisposable]
  }
}

