package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Pick<cypress.Cypress.ConfigOptions, 'baseUrl' | 'defaultCommandTimeout' | 'taskTimeout' | 'animationDistanceThreshold' | 'waitForAnimations' | 'viewportHeight' | 'viewportWidth' | 'requestTimeout' | 'execTimeout' | 'env' | 'responseTimeout'>> */
trait TestConfigOverrides extends js.Object {
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  // retries?: number
  var browser: js.UndefOr[IsBrowserMatcher | js.Array[IsBrowserMatcher]] = js.undefined
  var defaultCommandTimeout: js.UndefOr[Double] = js.undefined
  var env: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var execTimeout: js.UndefOr[Double] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var responseTimeout: js.UndefOr[Double] = js.undefined
  var taskTimeout: js.UndefOr[Double] = js.undefined
  var viewportHeight: js.UndefOr[Double] = js.undefined
  var viewportWidth: js.UndefOr[Double] = js.undefined
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
}

object TestConfigOverrides {
  @scala.inline
  def apply(
    animationDistanceThreshold: js.UndefOr[Double] = js.undefined,
    baseUrl: String = null,
    browser: IsBrowserMatcher | js.Array[IsBrowserMatcher] = null,
    defaultCommandTimeout: js.UndefOr[Double] = js.undefined,
    env: StringDictionary[js.Any] = null,
    execTimeout: js.UndefOr[Double] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    responseTimeout: js.UndefOr[Double] = js.undefined,
    taskTimeout: js.UndefOr[Double] = js.undefined,
    viewportHeight: js.UndefOr[Double] = js.undefined,
    viewportWidth: js.UndefOr[Double] = js.undefined,
    waitForAnimations: js.UndefOr[Boolean] = js.undefined
  ): TestConfigOverrides = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animationDistanceThreshold)) __obj.updateDynamic("animationDistanceThreshold")(animationDistanceThreshold.get.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultCommandTimeout)) __obj.updateDynamic("defaultCommandTimeout")(defaultCommandTimeout.get.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(execTimeout)) __obj.updateDynamic("execTimeout")(execTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responseTimeout)) __obj.updateDynamic("responseTimeout")(responseTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(taskTimeout)) __obj.updateDynamic("taskTimeout")(taskTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportHeight)) __obj.updateDynamic("viewportHeight")(viewportHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewportWidth)) __obj.updateDynamic("viewportWidth")(viewportWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAnimations)) __obj.updateDynamic("waitForAnimations")(waitForAnimations.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConfigOverrides]
  }
}

