package typings
package cordovaDashPluginDashSpinnerLib.SpinnerPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpinnerPluginStatic extends js.Object {
  /**
           * Blocks user input using an indeterminate spinner.
           *
           * An optional label can be shown below the spinner.
           *
           * @param labelText The optional value to show in a label.
           * @param successCallback The success callback for this asynchronous function.
           * @param failureCallback The failure callback for this asynchronous function; receives an error string.
           */
  def activityStart(): scala.Unit = js.native
  /**
           * Blocks user input using an indeterminate spinner.
           *
           * An optional label can be shown below the spinner.
           *
           * @param labelText The optional value to show in a label.
           * @param successCallback The success callback for this asynchronous function.
           * @param failureCallback The failure callback for this asynchronous function; receives an error string.
           */
  def activityStart(labelText: java.lang.String): scala.Unit = js.native
  /**
           * Blocks user input using an indeterminate spinner.
           *
           * An optional label can be shown below the spinner.
           *
           * @param labelText The optional value to show in a label.
           * @param successCallback The success callback for this asynchronous function.
           * @param failureCallback The failure callback for this asynchronous function; receives an error string.
           */
  def activityStart(labelText: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Blocks user input using an indeterminate spinner.
           *
           * An optional label can be shown below the spinner.
           *
           * @param labelText The optional value to show in a label.
           * @param successCallback The success callback for this asynchronous function.
           * @param failureCallback The failure callback for this asynchronous function; receives an error string.
           */
  def activityStart(
    labelText: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Allows user input by hiding the indeterminate spinner.
           *
           * @param successCallback The success callback for this asynchronous function.
           * @param failureCallback The failure callback for this asynchronous function; receives an error string.
           */
  def activityStop(): scala.Unit = js.native
  /**
           * Allows user input by hiding the indeterminate spinner.
           *
           * @param successCallback The success callback for this asynchronous function.
           * @param failureCallback The failure callback for this asynchronous function; receives an error string.
           */
  def activityStop(successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Allows user input by hiding the indeterminate spinner.
           *
           * @param successCallback The success callback for this asynchronous function.
           * @param failureCallback The failure callback for this asynchronous function; receives an error string.
           */
  def activityStop(
    successCallback: js.Function0[scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

