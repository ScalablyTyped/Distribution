package typings
package browserifyLib.browserifyMod.browserifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options pertaining to an individual file.
  */
trait FileOptions extends js.Object {
  // Basedir to use to resolve this file's path.
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  // If true, this is considered an entry point to your app.
  var entry: js.UndefOr[scala.Boolean] = js.undefined
  // Expose this file under a custom dependency name.
  // require('./vendor/angular/angular.js', {expose: 'angular'}) enables require('angular')
  var expose: js.UndefOr[java.lang.String] = js.undefined
  // Forward file to external() to be externalized.
  var external: js.UndefOr[scala.Boolean] = js.undefined
  // The name/path to the file.
  var file: js.UndefOr[java.lang.String] = js.undefined
  // The ID to use for require() statements.
  var id: js.UndefOr[java.lang.String] = js.undefined
  // Disable transforms on file if set to false.
  var transform: js.UndefOr[scala.Boolean] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    basedir: java.lang.String = null,
    entry: js.UndefOr[scala.Boolean] = js.undefined,
    expose: java.lang.String = null,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    file: java.lang.String = null,
    id: java.lang.String = null,
    transform: js.UndefOr[scala.Boolean] = js.undefined
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(entry)) __obj.updateDynamic("entry")(entry)
    if (expose != null) __obj.updateDynamic("expose")(expose)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (file != null) __obj.updateDynamic("file")(file)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[FileOptions]
  }
}

