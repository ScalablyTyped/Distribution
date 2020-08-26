package typings.ddTrace.mod.plugins

import typings.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [mysql2](https://github.com/brianmario/mysql2) module.
  */
@js.native
trait mysql2
  extends Integration
     with Analyzable

object mysql2 {
  @scala.inline
  def apply(): mysql2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[mysql2]
  }
}

