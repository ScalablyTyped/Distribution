package typings
package cqrsDashDomainLib.cqrsDashDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region defineContext
trait DefineContextOptions extends js.Object {
  /**
    * optional, default is the directory name
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object DefineContextOptions {
  @scala.inline
  def apply(name: java.lang.String = null): DefineContextOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DefineContextOptions]
  }
}

