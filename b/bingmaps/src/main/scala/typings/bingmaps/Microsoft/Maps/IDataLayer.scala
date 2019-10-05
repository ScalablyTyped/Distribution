package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataLayer extends ILayer {
  /** Clears all data in the layer. */
  def clear(): Unit
}

object IDataLayer {
  @scala.inline
  def apply(clear: () => Unit): IDataLayer = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
  
    __obj.asInstanceOf[IDataLayer]
  }
}

