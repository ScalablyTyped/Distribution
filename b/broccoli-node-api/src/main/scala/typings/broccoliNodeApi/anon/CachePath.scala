package typings.broccoliNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachePath extends js.Object {
  var cachePath: js.UndefOr[String] = js.undefined
  var inputPaths: js.Array[String]
  var outputPath: String
}

object CachePath {
  @scala.inline
  def apply(inputPaths: js.Array[String], outputPath: String, cachePath: String = null): CachePath = {
    val __obj = js.Dynamic.literal(inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePath]
  }
}

