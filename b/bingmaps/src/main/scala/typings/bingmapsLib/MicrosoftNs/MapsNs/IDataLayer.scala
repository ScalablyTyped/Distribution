package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataLayer extends ILayer {
  /** Clears all data in the layer. */
  def clear(): scala.Unit
}

object IDataLayer {
  @scala.inline
  def apply(clear: () => scala.Unit): IDataLayer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[IDataLayer]
  }
}

