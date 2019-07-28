package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrimitiveChangedEventArgs extends js.Object {
  /** The name of the change that occured; 'locations' or 'options'. */
  var name: String
  /** The IPrimitive shape the event occured on. */
  var sender: IPrimitive
}

object IPrimitiveChangedEventArgs {
  @scala.inline
  def apply(name: String, sender: IPrimitive): IPrimitiveChangedEventArgs = {
    val __obj = js.Dynamic.literal(name = name, sender = sender)
  
    __obj.asInstanceOf[IPrimitiveChangedEventArgs]
  }
}

