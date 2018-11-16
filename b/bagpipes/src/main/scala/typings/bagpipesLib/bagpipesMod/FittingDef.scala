package typings
package bagpipesLib.bagpipesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FittingDef
  extends // allow other config settings
/* prop */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /** Static values passed to the fitting during construction */
  var config: js.UndefOr[js.Any] = js.undefined
  /** Dynamic values passed to the fitting during execution */
  var input: js.UndefOr[js.Any] = js.undefined
  /** The name of the fitting of the type specified */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the context key to which the output value is assigned */
  var output: js.UndefOr[js.Any] = js.undefined
  /**
       * If type is omitted (as it must be for in-line usage), Bagpipes will
       * first check the user fittings then the system fittings for the name and
       * use the first fitting found.
       *
       * Thus be aware that if you define a fitting with the same name as a
       * system one, your fitting will override it.
       */
  var `type`: js.UndefOr[FittingType] = js.undefined
}

