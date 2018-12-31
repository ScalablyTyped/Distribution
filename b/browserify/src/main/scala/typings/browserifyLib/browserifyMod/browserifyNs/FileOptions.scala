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

