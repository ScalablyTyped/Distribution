package typings
package builderDashUtilLib.outFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/fs", "FileCopier")
@js.native
class FileCopier () extends js.Object {
  def this(isUseHardLinkFunction: js.Function1[/* file */ java.lang.String, scala.Boolean]) = this()
  def this(isUseHardLinkFunction: js.UndefOr[scala.Nothing], transformer: FileTransformer) = this()
  def this(isUseHardLinkFunction: js.Function1[/* file */ java.lang.String, scala.Boolean], transformer: FileTransformer) = this()
  def this(isUseHardLinkFunction: scala.Null, transformer: FileTransformer) = this()
  var isUseHardLink: scala.Boolean = js.native
  val isUseHardLinkFunction: js.UndefOr[js.Any] = js.native
  val transformer: js.UndefOr[js.Any] = js.native
  def copy(src: java.lang.String, dest: java.lang.String): js.Promise[scala.Unit] = js.native
  def copy(src: java.lang.String, dest: java.lang.String, stat: fsDashExtraDashPLib.fsDashExtraDashPMod.Stats): js.Promise[scala.Unit] = js.native
}

