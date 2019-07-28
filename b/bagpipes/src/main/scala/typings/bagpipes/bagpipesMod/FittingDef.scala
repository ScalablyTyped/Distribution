package typings.bagpipes.bagpipesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FittingDef
  extends // allow other config settings
/* prop */ StringDictionary[js.Any] {
  /** Static values passed to the fitting during construction */
  var config: js.UndefOr[js.Any] = js.undefined
  /** Dynamic values passed to the fitting during execution */
  var input: js.UndefOr[js.Any] = js.undefined
  /** The name of the fitting of the type specified */
  var name: js.UndefOr[String] = js.undefined
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

object FittingDef {
  @scala.inline
  def apply(
    StringDictionary: // allow other config settings
  /* prop */ StringDictionary[js.Any] = null,
    config: js.Any = null,
    input: js.Any = null,
    name: String = null,
    output: js.Any = null,
    `type`: FittingType = null
  ): FittingDef = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (config != null) __obj.updateDynamic("config")(config)
    if (input != null) __obj.updateDynamic("input")(input)
    if (name != null) __obj.updateDynamic("name")(name)
    if (output != null) __obj.updateDynamic("output")(output)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FittingDef]
  }
}

