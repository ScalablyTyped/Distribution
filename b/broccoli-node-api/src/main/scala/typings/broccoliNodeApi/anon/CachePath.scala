package typings.broccoliNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachePath extends js.Object {
  var cachePath: js.UndefOr[String] = js.native
  var inputPaths: js.Array[String] = js.native
  var outputPath: String = js.native
}

object CachePath {
  @scala.inline
  def apply(inputPaths: js.Array[String], outputPath: String): CachePath = {
    val __obj = js.Dynamic.literal(inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePath]
  }
  @scala.inline
  implicit class CachePathOps[Self <: CachePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputPathsVarargs(value: String*): Self = this.set("inputPaths", js.Array(value :_*))
    @scala.inline
    def setInputPaths(value: js.Array[String]): Self = this.set("inputPaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputPath(value: String): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setCachePath(value: String): Self = this.set("cachePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePath: Self = this.set("cachePath", js.undefined)
  }
  
}

