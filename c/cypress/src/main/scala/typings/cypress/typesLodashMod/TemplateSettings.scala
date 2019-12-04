package typings.cypress.typesLodashMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * By default, the template delimiters used by Lo-Dash are similar to those in embedded Ruby
  * (ERB). Change the following template settings to use alternative delimiters.
  **/
trait TemplateSettings extends js.Object {
  /**
    * The "escape" delimiter.
    **/
  var escape: js.UndefOr[RegExp] = js.undefined
  /**
    * The "evaluate" delimiter.
    **/
  var evaluate: js.UndefOr[RegExp] = js.undefined
  /**
    * An object to import into the template as local variables.
    **/
  var imports: js.UndefOr[Dictionary[_]] = js.undefined
  /**
    * The "interpolate" delimiter.
    **/
  var interpolate: js.UndefOr[RegExp] = js.undefined
  /**
    * Used to reference the data object in the template text.
    **/
  var variable: js.UndefOr[String] = js.undefined
}

object TemplateSettings {
  @scala.inline
  def apply(
    escape: RegExp = null,
    evaluate: RegExp = null,
    imports: Dictionary[_] = null,
    interpolate: RegExp = null,
    variable: String = null
  ): TemplateSettings = {
    val __obj = js.Dynamic.literal()
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(evaluate.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSettings]
  }
}

