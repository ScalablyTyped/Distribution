package typings
package blocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////////////
// App.Property
/////////////////////////////////////////

trait PropertyPrototype extends js.Object {
  var creditcard: js.UndefOr[Validator] = js.undefined
  var date: js.UndefOr[Validator] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var digits: js.UndefOr[Validator] = js.undefined
  var email: js.UndefOr[Validator] = js.undefined
  @JSName("equals")
  var equals_FPropertyPrototype: js.UndefOr[Validator] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var isObservable: js.UndefOr[scala.Boolean] = js.undefined
  var letters: js.UndefOr[Validator] = js.undefined
  var max: js.UndefOr[Validator] = js.undefined
  var maxErrors: js.UndefOr[scala.Double] = js.undefined
  var maxlength: js.UndefOr[Validator] = js.undefined
  var min: js.UndefOr[Validator] = js.undefined
  var minlength: js.UndefOr[Validator] = js.undefined
  var number: js.UndefOr[Validator] = js.undefined
  var regexp: js.UndefOr[Validator] = js.undefined
  // Validators
  var required: js.UndefOr[Validator] = js.undefined
  var url: js.UndefOr[Validator] = js.undefined
  var validateInitially: js.UndefOr[scala.Boolean] = js.undefined
  var validateOnChange: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

