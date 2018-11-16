package typings
package builderDashUtilLib.outFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", JSImport.Namespace)
@js.native
object outFsModMembers extends js.Object {
  val CONCURRENCY: builderDashUtilLib.Anon_Concurrency = js.native
  val DO_NOT_USE_HARD_LINKS: js.Function1[/* file */ java.lang.String, scala.Boolean] = js.native
  val MAX_FILE_REQUESTS: /* 8 */ scala.Double = js.native
  val USE_HARD_LINKS: js.Function1[/* file */ java.lang.String, scala.Boolean] = js.native
  def copyDir(src: java.lang.String, destination: java.lang.String): stdLib.Promise[_] = js.native
  def copyDir(src: java.lang.String, destination: java.lang.String, options: CopyDirOptions): stdLib.Promise[_] = js.native
  def copyFile(src: java.lang.String, dest: java.lang.String): stdLib.Promise[_] = js.native
  def copyFile(src: java.lang.String, dest: java.lang.String, isEnsureDir: scala.Boolean): stdLib.Promise[_] = js.native
  def copyOrLinkFile(src: java.lang.String, dest: java.lang.String): stdLib.Promise[_] = js.native
  def copyOrLinkFile(
    src: java.lang.String,
    dest: java.lang.String,
    stats: fsDashExtraDashPLib.fsDashExtraDashPMod.Stats
  ): stdLib.Promise[_] = js.native
  def copyOrLinkFile(
    src: java.lang.String,
    dest: java.lang.String,
    stats: fsDashExtraDashPLib.fsDashExtraDashPMod.Stats,
    isUseHardLink: scala.Boolean
  ): stdLib.Promise[_] = js.native
  def copyOrLinkFile(
    src: java.lang.String,
    dest: java.lang.String,
    stats: fsDashExtraDashPLib.fsDashExtraDashPMod.Stats,
    isUseHardLink: scala.Boolean,
    exDevErrorHandler: js.Function0[scala.Boolean]
  ): stdLib.Promise[_] = js.native
  def copyOrLinkFile(src: java.lang.String, dest: java.lang.String, stats: scala.Null, isUseHardLink: scala.Boolean): stdLib.Promise[_] = js.native
  def copyOrLinkFile(
    src: java.lang.String,
    dest: java.lang.String,
    stats: scala.Null,
    isUseHardLink: scala.Boolean,
    exDevErrorHandler: js.Function0[scala.Boolean]
  ): stdLib.Promise[_] = js.native
  def exists(file: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def statOrNull(file: java.lang.String): stdLib.Promise[fsDashExtraDashPLib.fsDashExtraDashPMod.Stats | scala.Null] = js.native
  def unlinkIfExists(file: java.lang.String): stdLib.Promise[java.lang.String | scala.Unit] = js.native
  def walk(initialDirPath: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def walk(initialDirPath: java.lang.String, filter: Filter): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def walk(initialDirPath: java.lang.String, filter: Filter, consumer: FileConsumer): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def walk(initialDirPath: java.lang.String, filter: scala.Null, consumer: FileConsumer): stdLib.Promise[js.Array[java.lang.String]] = js.native
}

