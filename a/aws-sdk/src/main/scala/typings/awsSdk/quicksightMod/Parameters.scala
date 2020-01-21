package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  /**
    * DateTime parameters.
    */
  var DateTimeParameters: js.UndefOr[DateTimeParameterList] = js.native
  /**
    * Decimal parameters.
    */
  var DecimalParameters: js.UndefOr[DecimalParameterList] = js.native
  /**
    * Integer parameters.
    */
  var IntegerParameters: js.UndefOr[IntegerParameterList] = js.native
  /**
    * String parameters.
    */
  var StringParameters: js.UndefOr[StringParameterList] = js.native
}

object Parameters {
  @scala.inline
  def apply(
    DateTimeParameters: DateTimeParameterList = null,
    DecimalParameters: DecimalParameterList = null,
    IntegerParameters: IntegerParameterList = null,
    StringParameters: StringParameterList = null
  ): Parameters = {
    val __obj = js.Dynamic.literal()
    if (DateTimeParameters != null) __obj.updateDynamic("DateTimeParameters")(DateTimeParameters.asInstanceOf[js.Any])
    if (DecimalParameters != null) __obj.updateDynamic("DecimalParameters")(DecimalParameters.asInstanceOf[js.Any])
    if (IntegerParameters != null) __obj.updateDynamic("IntegerParameters")(IntegerParameters.asInstanceOf[js.Any])
    if (StringParameters != null) __obj.updateDynamic("StringParameters")(StringParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

