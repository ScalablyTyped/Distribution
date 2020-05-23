package typings.cypress.anon

import typings.cypress.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenMode extends js.Object {
  var openMode: Nullable[Double]
  var runMode: Nullable[Double]
}

object OpenMode {
  @scala.inline
  def apply(
    openMode: Nullable[Double] = null.asInstanceOf[Nullable[Double]],
    runMode: Nullable[Double] = null.asInstanceOf[Nullable[Double]]
  ): OpenMode = {
    val __obj = js.Dynamic.literal(openMode = openMode.asInstanceOf[js.Any], runMode = runMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenMode]
  }
}

