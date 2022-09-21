package typings.cordovaPluginSafariviewcontroller

import typings.cordovaPluginSafariviewcontroller.cordovaPluginSafariviewcontrollerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariViewController extends StObject {
  
  /**
    * Try to connect to the Chrome's custom tabs service. You must call this method before calling
    * `warmUp()` or `mayLaunchUrl()` methods.
    *
    * **This method Android-specific. It will always error out on other platforms.**
    *
    * @param onSuccess The callback function to call after successfully connecting to the custom tabs service.
    * @param onError The callback function to call in case of an error or if method is unsupported on current platform.
    */
  def connectToService(): Unit = js.native
  def connectToService(onSuccess: Unit, onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  @JSName("connectToService")
  def connectToService_true(onSuccess: js.Function1[`true`, Unit]): Unit = js.native
  @JSName("connectToService")
  def connectToService_true(onSuccess: js.Function1[`true`, Unit], onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  
  /**
    * Get the list of available custom tab implementations. You can use the
    * values retrieved from this method in `useCustomTabsImplementation()`.
    *
    * **This method Android-specific. It will always error out on other platforms.**
    *
    * @param onSuccess The callback function to call after successfully retrieving the handler packages result.
    * @param onError The callback function to call in case of an error or if method is unsupported on current platform.
    */
  def getViewHandlerPackages(onSuccess: js.Function1[/* handlerPackages */ SafariViewControllerHandlerPackagesResult, Unit]): Unit = js.native
  def getViewHandlerPackages(
    onSuccess: js.Function1[/* handlerPackages */ SafariViewControllerHandlerPackagesResult, Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = js.native
  
  /**
    * Hide a previously opened `SafariViewController`.
    *
    * **This method is iOS-specific. It will always error out on other platforms.**
    *
    * @param onSuccess The callback function to call when `SafariViewController` could be hidden successfully.
    * @param onError The callback function to call in case of an error or if method is unsupported on current platform.
    */
  def hide(): Unit = js.native
  def hide(onSuccess: js.Function0[Unit]): Unit = js.native
  def hide(onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  def hide(onSuccess: Unit, onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  
  /**
    * Check whether an implementation of `SafariViewController` on iOS/custom tab implementation
    * selected by `useCustomTabsImplementation()` on Android is actually available to be used.
    *
    * @param callback The callback function to pass the result of the check.
    */
  def isAvailable(callback: js.Function1[/* isAvailable */ Boolean, Unit]): Unit = js.native
  
  /**
    * Prepare the selected custom tab implementation to navigate to passed URL. For even better performance optimization,
    * call this methods if there's more than a 50% chance the user will open a certain URL. See
    * [CustomTabsSession docs](https://developer.android.com/reference/androidx/browser/customtabs/CustomTabsSession#mayLaunchUrl(android.net.Uri,%20android.os.Bundle,%20java.util.List%3Candroid.os.Bundle%3E))
    * for more details.
    *
    * **This method Android-specific. It will always error out on other platforms.**
    *
    * @param url The URL that should be loaded next by the custom tab.
    * @param onSuccess The callback function to call after custom tab has accepted the URL to launch.
    * @param onError The callback function to call in case custom tab hasn't accepted the URL to launch,
    *                if an error has occurred, or if method is unsupported on current platform.
    */
  def mayLaunchUrl(url: String): Unit = js.native
  def mayLaunchUrl(url: String, onSuccess: Unit, onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  @JSName("mayLaunchUrl")
  def mayLaunchUrl_true(url: String, onSuccess: js.Function1[`true`, Unit]): Unit = js.native
  @JSName("mayLaunchUrl")
  def mayLaunchUrl_true(url: String, onSuccess: js.Function1[`true`, Unit], onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  
  /**
    * Show the `SafariViewController` on iOS/custom tab on Android.
    *
    * @param options The options for the `SafariViewController`/custom tab.
    * @param onSuccess The callback function to call with the different view events.
    * @param onError The callback function to call in case of an error.
    */
  def show(options: SafariViewControllerShowOptions): Unit = js.native
  def show(
    options: SafariViewControllerShowOptions,
    onSuccess: js.Function1[/* result */ SafariViewControllerShowResult, Unit]
  ): Unit = js.native
  def show(
    options: SafariViewControllerShowOptions,
    onSuccess: js.Function1[/* result */ SafariViewControllerShowResult, Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = js.native
  def show(
    options: SafariViewControllerShowOptions,
    onSuccess: Unit,
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = js.native
  
  /**
    * Set the custom tab implementation to use.
    *
    * **This method Android-specific. It will always error out on other platforms.**
    *
    * @param packageName The custom tab implementation to use previously retrieved via `getViewHandlerPackages()`.
    * @param onSuccess The callback function to call after successfully setting the custom tab implementation.
    * @param onError The callback function to call in case of an error or if method is unsupported on current platform.
    */
  def useCustomTabsImplementation(packageName: String): Unit = js.native
  def useCustomTabsImplementation(packageName: String, onSuccess: Unit, onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  @JSName("useCustomTabsImplementation")
  def useCustomTabsImplementation_true(packageName: String, onSuccess: js.Function1[`true`, Unit]): Unit = js.native
  @JSName("useCustomTabsImplementation")
  def useCustomTabsImplementation_true(
    packageName: String,
    onSuccess: js.Function1[`true`, Unit],
    onError: js.Function1[/* error */ Any, Unit]
  ): Unit = js.native
  
  /**
    * Warm up the browser process. Call this method whenever there's a chance the user will open an external url. See
    * [Custom Tabs implementation guide](https://developers.google.com/web/android/custom-tabs/implementation-guide#warm_up_the_browser_process)
    * for more details.
    *
    * **This method Android-specific. It will always error out on other platforms.**
    *
    * @param onSuccess The callback function to call after successfully warming up the browser process.
    * @param onError The callback function to call in case of an error or if method is unsupported on current platform.
    */
  def warmUp(): Unit = js.native
  def warmUp(onSuccess: Unit, onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
  @JSName("warmUp")
  def warmUp_true(onSuccess: js.Function1[`true`, Unit]): Unit = js.native
  @JSName("warmUp")
  def warmUp_true(onSuccess: js.Function1[`true`, Unit], onError: js.Function1[/* error */ Any, Unit]): Unit = js.native
}
