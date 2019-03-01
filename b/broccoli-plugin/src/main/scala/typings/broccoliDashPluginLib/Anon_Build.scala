package typings
package broccoliDashPluginLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Build extends js.Object {
  def build(): scala.Unit | js.Promise[_]
}

object Anon_Build {
  @scala.inline
  def apply(build: js.Function0[scala.Unit | js.Promise[_]]): Anon_Build = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.asInstanceOf[Anon_Build]
  }
}

