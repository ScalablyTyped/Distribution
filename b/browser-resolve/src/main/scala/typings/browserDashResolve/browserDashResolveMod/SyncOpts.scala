package typings.browserDashResolve.browserDashResolveMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOpts
  extends typings.resolve.resolveMod.SyncOpts
     with Opts

object SyncOpts {
  @scala.inline
  def apply(
    basedir: String = null,
    browser: String = null,
    extensions: String | js.Array[String] = null,
    filename: String = null,
    isFile: /* file */ String => Boolean = null,
    moduleDirectory: String | js.Array[String] = null,
    modules: js.Any = null,
    `package`: js.Any = null,
    packageFilter: (/* pkg */ js.Any, /* pkgfile */ String) => _ = null,
    pathFilter: (/* pkg */ js.Any, /* path */ String, /* relativePath */ String) => String = null,
    paths: String | js.Array[String] = null,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined,
    readFileSync: (/* file */ String, /* charset */ String) => String | Buffer = null
  ): SyncOpts = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (isFile != null) __obj.updateDynamic("isFile")(js.Any.fromFunction1(isFile))
    if (moduleDirectory != null) __obj.updateDynamic("moduleDirectory")(moduleDirectory.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (packageFilter != null) __obj.updateDynamic("packageFilter")(js.Any.fromFunction2(packageFilter))
    if (pathFilter != null) __obj.updateDynamic("pathFilter")(js.Any.fromFunction3(pathFilter))
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks)
    if (readFileSync != null) __obj.updateDynamic("readFileSync")(js.Any.fromFunction2(readFileSync))
    __obj.asInstanceOf[SyncOpts]
  }
}

