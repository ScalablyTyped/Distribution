package typings.builderDashUtil.outFsMod

import typings.builderDashUtil.builderDashUtilNumbers.`8`
import typings.fsDashExtraDashP.fsDashExtraDashPMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val MAX_FILE_REQUESTS: `8` = js.native
  def DO_NOT_USE_HARD_LINKS(file: String): Boolean = js.native
  def USE_HARD_LINKS(file: String): Boolean = js.native
  def copyDir(src: String, destination: String): js.Promise[_] = js.native
  def copyDir(src: String, destination: String, options: CopyDirOptions): js.Promise[_] = js.native
  def copyFile(src: String, dest: String): js.Promise[_] = js.native
  def copyFile(src: String, dest: String, isEnsureDir: Boolean): js.Promise[_] = js.native
  def copyOrLinkFile(src: String, dest: String): js.Promise[_] = js.native
  def copyOrLinkFile(src: String, dest: String, stats: Null, isUseHardLink: Boolean): js.Promise[_] = js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Null,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  def copyOrLinkFile(src: String, dest: String, stats: Stats): js.Promise[_] = js.native
  def copyOrLinkFile(src: String, dest: String, stats: Stats, isUseHardLink: Boolean): js.Promise[_] = js.native
  def copyOrLinkFile(
    src: String,
    dest: String,
    stats: Stats,
    isUseHardLink: Boolean,
    exDevErrorHandler: js.Function0[Boolean]
  ): js.Promise[_] = js.native
  def exists(file: String): js.Promise[Boolean] = js.native
  def statOrNull(file: String): js.Promise[Stats | Null] = js.native
  def unlinkIfExists(file: String): js.Promise[String | Unit] = js.native
  def walk(initialDirPath: String): js.Promise[js.Array[String]] = js.native
  def walk(initialDirPath: String, filter: Null, consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
  def walk(initialDirPath: String, filter: Filter): js.Promise[js.Array[String]] = js.native
  def walk(initialDirPath: String, filter: Filter, consumer: FileConsumer): js.Promise[js.Array[String]] = js.native
}

