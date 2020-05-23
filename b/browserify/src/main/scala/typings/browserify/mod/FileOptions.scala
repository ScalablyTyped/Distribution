package typings.browserify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options pertaining to an individual file.
  */
trait FileOptions extends js.Object {
  // Basedir to use to resolve this file's path.
  var basedir: js.UndefOr[String] = js.undefined
  // If true, this is considered an entry point to your app.
  var entry: js.UndefOr[Boolean] = js.undefined
  // Expose this file under a custom dependency name.
  // require('./vendor/angular/angular.js', {expose: 'angular'}) enables require('angular')
  var expose: js.UndefOr[String] = js.undefined
  // Forward file to external() to be externalized.
  var external: js.UndefOr[Boolean] = js.undefined
  // The name/path to the file.
  var file: js.UndefOr[String] = js.undefined
  // The ID to use for require() statements.
  var id: js.UndefOr[String] = js.undefined
  // Disable transforms on file if set to false.
  var transform: js.UndefOr[Boolean] = js.undefined
}

object FileOptions {
  @scala.inline
  def apply(
    basedir: String = null,
    entry: js.UndefOr[Boolean] = js.undefined,
    expose: String = null,
    external: js.UndefOr[Boolean] = js.undefined,
    file: String = null,
    id: String = null,
    transform: js.UndefOr[Boolean] = js.undefined
  ): FileOptions = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (!js.isUndefined(entry)) __obj.updateDynamic("entry")(entry.get.asInstanceOf[js.Any])
    if (expose != null) __obj.updateDynamic("expose")(expose.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.get.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

