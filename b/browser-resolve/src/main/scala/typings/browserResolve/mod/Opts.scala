package typings.browserResolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opts extends js.Object {
  // the 'browser' property to use from package.json (defaults to 'browser')
  var browser: js.UndefOr[String] = js.undefined
  // the calling filename where the require() call originated (in the source)
  var filename: js.UndefOr[String] = js.undefined
  // modules object with id to path mappings to consult before doing manual resolution (use to provide core modules)
  var modules: js.UndefOr[js.Any] = js.undefined
}

object Opts {
  @scala.inline
  def apply(browser: String = null, filename: String = null, modules: js.Any = null): Opts = {
    val __obj = js.Dynamic.literal()
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (modules != null) __obj.updateDynamic("modules")(modules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
}

