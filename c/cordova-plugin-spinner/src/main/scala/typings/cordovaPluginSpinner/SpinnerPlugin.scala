package typings.cordovaPluginSpinner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SpinnerPlugin {
  
  @js.native
  trait SpinnerPluginStatic extends StObject {
    
    /**
      * Blocks user input using an indeterminate spinner.
      *
      * An optional label can be shown below the spinner.
      *
      * @param labelText The optional value to show in a label.
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def activityStart(): Unit = js.native
    def activityStart(
      labelText: js.UndefOr[scala.Nothing],
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def activityStart(labelText: js.UndefOr[scala.Nothing], successCallback: js.Function0[Unit]): Unit = js.native
    def activityStart(
      labelText: js.UndefOr[scala.Nothing],
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def activityStart(labelText: String): Unit = js.native
    def activityStart(
      labelText: String,
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def activityStart(labelText: String, successCallback: js.Function0[Unit]): Unit = js.native
    def activityStart(
      labelText: String,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Allows user input by hiding the indeterminate spinner.
      *
      * @param successCallback The success callback for this asynchronous function.
      * @param failureCallback The failure callback for this asynchronous function; receives an error string.
      */
    def activityStop(): Unit = js.native
    def activityStop(
      successCallback: js.UndefOr[scala.Nothing],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def activityStop(successCallback: js.Function0[Unit]): Unit = js.native
    def activityStop(successCallback: js.Function0[Unit], failureCallback: js.Function1[/* error */ String, Unit]): Unit = js.native
  }
}
