package typings.backboneFetchCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var expires: Double
  var lastSync: Double
  var prefillExpires: Double
  var value: js.Any
}

object Cache {
  @scala.inline
  def apply(expires: Double, lastSync: Double, prefillExpires: Double, value: js.Any): Cache = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], lastSync = lastSync.asInstanceOf[js.Any], prefillExpires = prefillExpires.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cache]
  }
}

