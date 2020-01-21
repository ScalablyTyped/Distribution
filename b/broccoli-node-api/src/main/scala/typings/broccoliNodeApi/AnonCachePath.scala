package typings.broccoliNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCachePath extends js.Object {
  var cachePath: js.UndefOr[String] = js.undefined
  var inputPaths: js.Array[String]
  var outputPath: String
}

object AnonCachePath {
  @scala.inline
  def apply(inputPaths: js.Array[String], outputPath: String, cachePath: String = null): AnonCachePath = {
    val __obj = js.Dynamic.literal(inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCachePath]
  }
}

