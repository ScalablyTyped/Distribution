package typings.cassandraDashDriver.libDatastaxMod.datastax.graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var labels: js.Array[_]
  var objects: js.Array[_]
}

object Path {
  @scala.inline
  def apply(labels: js.Array[_], objects: js.Array[_]): Path = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Path]
  }
}

