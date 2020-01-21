package typings.builderUtil.fsMod

import typings.fsExtra.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", "copyOrLinkFile")
@js.native
object copyOrLinkFile extends js.Object {
  def apply(src: String, dest: String): js.Promise[_] = js.native
  def apply(src: String, dest: String, stats: Null, isUseHardLink: Boolean): js.Promise[_] = js.native
  def apply(
    src: String,
    dest: String,
    stats: Null,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  def apply(src: String, dest: String, stats: Stats): js.Promise[_] = js.native
  def apply(src: String, dest: String, stats: Stats, isUseHardLink: Boolean): js.Promise[_] = js.native
  def apply(
    src: String,
    dest: String,
    stats: Stats,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
}

