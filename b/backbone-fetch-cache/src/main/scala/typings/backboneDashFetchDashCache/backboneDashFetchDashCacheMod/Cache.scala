package typings.backboneDashFetchDashCache.backboneDashFetchDashCacheMod

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
    val __obj = js.Dynamic.literal(expires = expires, lastSync = lastSync, prefillExpires = prefillExpires, value = value)
  
    __obj.asInstanceOf[Cache]
  }
}

