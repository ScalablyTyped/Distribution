package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CollectResults extends js.Object {
  var collectResults: Boolean
  var maxErrors: js.UndefOr[Double] = js.undefined
}

object Anon_CollectResults {
  @scala.inline
  def apply(collectResults: Boolean, maxErrors: Int | Double = null): Anon_CollectResults = {
    val __obj = js.Dynamic.literal(collectResults = collectResults)
    if (maxErrors != null) __obj.updateDynamic("maxErrors")(maxErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CollectResults]
  }
}

