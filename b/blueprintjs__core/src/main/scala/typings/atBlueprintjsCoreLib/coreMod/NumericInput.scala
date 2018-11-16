package typings
package atBlueprintjsCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "NumericInput")
@js.native
class NumericInput ()
  extends atBlueprintjsCoreLib.libEsmComponentsMod.NumericInput {
  def this(props: atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod.INumericInputProps) = this()
  def this(props: atBlueprintjsCoreLib.libEsmCommonPropsMod.HTMLInputProps with atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod.INumericInputProps, context: js.Any) = this()
}

@JSImport("@blueprintjs/core", "NumericInput")
@js.native
object NumericInput extends js.Object {
  var CONTINUOUS_CHANGE_DELAY: js.Any = js.native
  var CONTINUOUS_CHANGE_INTERVAL: js.Any = js.native
  var DECREMENT_ICON_NAME: js.Any = js.native
  var DECREMENT_KEY: js.Any = js.native
  /**
       * A regex that matches a string of length 1 (i.e. a standalone character)
       * if and only if it is a floating-point number character as defined by W3C:
       * https://www.w3.org/TR/2012/WD-html-markup-20120329/datatypes.html#common.data.float
       *
       * Floating-point number characters are the only characters that can be
       * printed within a default input[type="number"]. This component should
       * behave the same way when this.props.allowNumericCharactersOnly = true.
       * See here for the input[type="number"].value spec:
       * https://www.w3.org/TR/2012/WD-html-markup-20120329/input.number.html#input.number.attrs.value
       */
  var FLOATING_POINT_NUMBER_CHARACTER_REGEX: js.Any = js.native
  var INCREMENT_ICON_NAME: js.Any = js.native
  var INCREMENT_KEY: js.Any = js.native
  var VALUE_EMPTY: java.lang.String = js.native
  var VALUE_ZERO: java.lang.String = js.native
  var defaultProps: atBlueprintjsCoreLib.libEsmComponentsFormsNumericInputMod.INumericInputProps = js.native
  var displayName: java.lang.String = js.native
}

