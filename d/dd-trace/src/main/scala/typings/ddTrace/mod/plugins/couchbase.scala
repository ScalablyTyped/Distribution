package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [couchbase](https://www.npmjs.com/package/couchbase) module.
  */
@js.native
trait couchbase
  extends Integration
     with Analyzable

object couchbase {
  @scala.inline
  def apply(): couchbase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[couchbase]
  }
}

