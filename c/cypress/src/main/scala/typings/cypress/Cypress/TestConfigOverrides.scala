package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.anon.OpenMode
import typings.cypress.anon.PartialBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Pick<cypress.Cypress.ConfigOptions<any>, 'animationDistanceThreshold' | 'blockHosts' | 'defaultCommandTimeout' | 'env' | 'execTimeout' | 'includeShadowDom' | 'numTestsKeptInMemory' | 'pageLoadTimeout' | 'redirectionLimit' | 'requestTimeout' | 'responseTimeout' | 'retries' | 'screenshotOnRunFailure' | 'slowTestThreshold' | 'scrollBehavior' | 'taskTimeout' | 'viewportHeight' | 'viewportWidth' | 'waitForAnimations'>> */
/* Inlined parent std.Partial<std.Pick<cypress.Cypress.ResolvedConfigOptions<any>, 'baseUrl'>> */
trait TestConfigOverrides extends StObject {
  
  var animationDistanceThreshold: js.UndefOr[Double] = js.undefined
  
  var baseUrl: js.UndefOr[String | Null] = js.undefined
  
  var blockHosts: js.UndefOr[Null | String | js.Array[String]] = js.undefined
  
  var browser: js.UndefOr[IsBrowserMatcher | js.Array[IsBrowserMatcher]] = js.undefined
  
  var defaultCommandTimeout: js.UndefOr[Double] = js.undefined
  
  var env: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var execTimeout: js.UndefOr[Double] = js.undefined
  
  var includeShadowDom: js.UndefOr[Boolean] = js.undefined
  
  var keystrokeDelay: js.UndefOr[Double] = js.undefined
  
  var numTestsKeptInMemory: js.UndefOr[Double] = js.undefined
  
  var pageLoadTimeout: js.UndefOr[Double] = js.undefined
  
  var redirectionLimit: js.UndefOr[Double] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  var responseTimeout: js.UndefOr[Double] = js.undefined
  
  var retries: js.UndefOr[Nullable[Double | OpenMode]] = js.undefined
  
  var screenshotOnRunFailure: js.UndefOr[Boolean] = js.undefined
  
  var scrollBehavior: js.UndefOr[scrollBehaviorOptions] = js.undefined
  
  var slowTestThreshold: js.UndefOr[Double] = js.undefined
  
  var taskTimeout: js.UndefOr[Double] = js.undefined
  
  var viewportHeight: js.UndefOr[Double] = js.undefined
  
  var viewportWidth: js.UndefOr[Double] = js.undefined
  
  var waitForAnimations: js.UndefOr[Boolean] = js.undefined
}
object TestConfigOverrides {
  
  inline def apply(): TestConfigOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestConfigOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestConfigOverrides] (val x: Self) extends AnyVal {
    
    inline def setAnimationDistanceThreshold(value: Double): Self = StObject.set(x, "animationDistanceThreshold", value.asInstanceOf[js.Any])
    
    inline def setAnimationDistanceThresholdUndefined: Self = StObject.set(x, "animationDistanceThreshold", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlNull: Self = StObject.set(x, "baseUrl", null)
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBlockHosts(value: String | js.Array[String]): Self = StObject.set(x, "blockHosts", value.asInstanceOf[js.Any])
    
    inline def setBlockHostsNull: Self = StObject.set(x, "blockHosts", null)
    
    inline def setBlockHostsUndefined: Self = StObject.set(x, "blockHosts", js.undefined)
    
    inline def setBlockHostsVarargs(value: String*): Self = StObject.set(x, "blockHosts", js.Array(value*))
    
    inline def setBrowser(value: IsBrowserMatcher | js.Array[IsBrowserMatcher]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setBrowserVarargs(value: (BrowserName | IsBrowserMatcher | PartialBrowser)*): Self = StObject.set(x, "browser", js.Array(value*))
    
    inline def setDefaultCommandTimeout(value: Double): Self = StObject.set(x, "defaultCommandTimeout", value.asInstanceOf[js.Any])
    
    inline def setDefaultCommandTimeoutUndefined: Self = StObject.set(x, "defaultCommandTimeout", js.undefined)
    
    inline def setEnv(value: StringDictionary[Any]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExecTimeout(value: Double): Self = StObject.set(x, "execTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecTimeoutUndefined: Self = StObject.set(x, "execTimeout", js.undefined)
    
    inline def setIncludeShadowDom(value: Boolean): Self = StObject.set(x, "includeShadowDom", value.asInstanceOf[js.Any])
    
    inline def setIncludeShadowDomUndefined: Self = StObject.set(x, "includeShadowDom", js.undefined)
    
    inline def setKeystrokeDelay(value: Double): Self = StObject.set(x, "keystrokeDelay", value.asInstanceOf[js.Any])
    
    inline def setKeystrokeDelayUndefined: Self = StObject.set(x, "keystrokeDelay", js.undefined)
    
    inline def setNumTestsKeptInMemory(value: Double): Self = StObject.set(x, "numTestsKeptInMemory", value.asInstanceOf[js.Any])
    
    inline def setNumTestsKeptInMemoryUndefined: Self = StObject.set(x, "numTestsKeptInMemory", js.undefined)
    
    inline def setPageLoadTimeout(value: Double): Self = StObject.set(x, "pageLoadTimeout", value.asInstanceOf[js.Any])
    
    inline def setPageLoadTimeoutUndefined: Self = StObject.set(x, "pageLoadTimeout", js.undefined)
    
    inline def setRedirectionLimit(value: Double): Self = StObject.set(x, "redirectionLimit", value.asInstanceOf[js.Any])
    
    inline def setRedirectionLimitUndefined: Self = StObject.set(x, "redirectionLimit", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setResponseTimeout(value: Double): Self = StObject.set(x, "responseTimeout", value.asInstanceOf[js.Any])
    
    inline def setResponseTimeoutUndefined: Self = StObject.set(x, "responseTimeout", js.undefined)
    
    inline def setRetries(value: Nullable[Double | OpenMode]): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesNull: Self = StObject.set(x, "retries", null)
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setScreenshotOnRunFailure(value: Boolean): Self = StObject.set(x, "screenshotOnRunFailure", value.asInstanceOf[js.Any])
    
    inline def setScreenshotOnRunFailureUndefined: Self = StObject.set(x, "screenshotOnRunFailure", js.undefined)
    
    inline def setScrollBehavior(value: scrollBehaviorOptions): Self = StObject.set(x, "scrollBehavior", value.asInstanceOf[js.Any])
    
    inline def setScrollBehaviorUndefined: Self = StObject.set(x, "scrollBehavior", js.undefined)
    
    inline def setSlowTestThreshold(value: Double): Self = StObject.set(x, "slowTestThreshold", value.asInstanceOf[js.Any])
    
    inline def setSlowTestThresholdUndefined: Self = StObject.set(x, "slowTestThreshold", js.undefined)
    
    inline def setTaskTimeout(value: Double): Self = StObject.set(x, "taskTimeout", value.asInstanceOf[js.Any])
    
    inline def setTaskTimeoutUndefined: Self = StObject.set(x, "taskTimeout", js.undefined)
    
    inline def setViewportHeight(value: Double): Self = StObject.set(x, "viewportHeight", value.asInstanceOf[js.Any])
    
    inline def setViewportHeightUndefined: Self = StObject.set(x, "viewportHeight", js.undefined)
    
    inline def setViewportWidth(value: Double): Self = StObject.set(x, "viewportWidth", value.asInstanceOf[js.Any])
    
    inline def setViewportWidthUndefined: Self = StObject.set(x, "viewportWidth", js.undefined)
    
    inline def setWaitForAnimations(value: Boolean): Self = StObject.set(x, "waitForAnimations", value.asInstanceOf[js.Any])
    
    inline def setWaitForAnimationsUndefined: Self = StObject.set(x, "waitForAnimations", js.undefined)
  }
}
