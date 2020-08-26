package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [mongodb-core](https://github.com/mongodb-js/mongodb-core) module.
  */
@js.native
trait mongodbCore
  extends Integration
     with Analyzable

object mongodbCore {
  @scala.inline
  def apply(): mongodbCore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mongodbCore]
  }
}

