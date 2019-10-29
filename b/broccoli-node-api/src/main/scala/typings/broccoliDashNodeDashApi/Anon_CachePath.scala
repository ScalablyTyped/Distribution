package typings.broccoliDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CachePath extends js.Object {
  var cachePath: js.UndefOr[String] = js.undefined
  var inputPaths: js.Array[String]
  var outputPath: String
}

object Anon_CachePath {
  @scala.inline
  def apply(inputPaths: js.Array[String], outputPath: String, cachePath: String = null): Anon_CachePath = {
    val __obj = js.Dynamic.literal(inputPaths = inputPaths, outputPath = outputPath)
    if (cachePath != null) __obj.updateDynamic("cachePath")(cachePath)
    __obj.asInstanceOf[Anon_CachePath]
  }
}

