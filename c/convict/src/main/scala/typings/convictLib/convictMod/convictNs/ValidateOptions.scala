package typings
package convictLib.convictMod.convictNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ValidateOptions extends js.Object {
  /**
           * If set to warn, any properties specified in config files that are not declared in
           * the schema will print a warning. This is the default behavior. If set to strict,
           * any properties specified in config files that are not declared in the schema will
           * throw errors. This is to ensure that the schema and the config files are in sync.
           */
  var allowed: js.UndefOr[ValidationMethod] = js.undefined
  /** @deprecated use allowed instead */
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

