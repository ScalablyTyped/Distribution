package typings.cassandraDashDriver.libDatastaxGraphMod.graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  var key: js.Any
  var value: js.Any
}

object Property {
  @scala.inline
  def apply(key: js.Any, value: js.Any): Property = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Property]
  }
}

