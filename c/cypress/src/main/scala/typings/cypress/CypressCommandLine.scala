package typings.cypress

import typings.cypress.Cypress.ConfigOptions
import typings.cypress.Cypress.ResolvedConfigOptions
import typings.cypress.Cypress.TestingType
import typings.cypress.anon.Absolute
import typings.cypress.anon.EndedAt
import typings.cypress.anon.PartialCypressRunOptions
import typings.cypress.cypressStrings.failed
import typings.cypress.cypressStrings.finished
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CypressCommandLine {
  
  trait AttemptResult extends StObject {
    
    var duration: ms
    
    var error: TestError | Null
    
    var screenshots: js.Array[ScreenshotInformation]
    
    var startedAt: dateTimeISO
    
    var state: String
    
    var videoTimestamp: ms
  }
  object AttemptResult {
    
    inline def apply(
      duration: ms,
      screenshots: js.Array[ScreenshotInformation],
      startedAt: dateTimeISO,
      state: String,
      videoTimestamp: ms
    ): AttemptResult = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], screenshots = screenshots.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], videoTimestamp = videoTimestamp.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[AttemptResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttemptResult] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: ms): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: TestError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setScreenshots(value: js.Array[ScreenshotInformation]): Self = StObject.set(x, "screenshots", value.asInstanceOf[js.Any])
      
      inline def setScreenshotsVarargs(value: ScreenshotInformation*): Self = StObject.set(x, "screenshots", js.Array(value*))
      
      inline def setStartedAt(value: dateTimeISO): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setVideoTimestamp(value: ms): Self = StObject.set(x, "videoTimestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Methods allow parsing given CLI arguments the same way Cypress CLI does it.
    */
  trait CypressCliParser extends StObject {
    
    /**
      * Parses the given array of string arguments to "cypress run"
      * just like Cypress CLI does it.
      * @see https://on.cypress.io/module-api
      * @example
      *  const cypress = require('cypress')
      *  const args = ['cypress', 'run', '--browser', 'chrome']
      *  const options = await cypress.cli.parseRunArguments(args)
      *  // options is {browser: 'chrome'}
      *  // pass the options to cypress.run()
      *  const results = await cypress.run(options)
      */
    def parseRunArguments(args: js.Array[String]): js.Promise[PartialCypressRunOptions]
  }
  object CypressCliParser {
    
    inline def apply(parseRunArguments: js.Array[String] => js.Promise[PartialCypressRunOptions]): CypressCliParser = {
      val __obj = js.Dynamic.literal(parseRunArguments = js.Any.fromFunction1(parseRunArguments))
      __obj.asInstanceOf[CypressCliParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CypressCliParser] (val x: Self) extends AnyVal {
      
      inline def setParseRunArguments(value: js.Array[String] => js.Promise[PartialCypressRunOptions]): Self = StObject.set(x, "parseRunArguments", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Options available for `cypress.open` and `cypress.run`
    */
  trait CypressCommonOptions extends StObject {
    
    /**
      * Specify configuration
      */
    var config: ConfigOptions[Any]
    
    /**
      * Path to the config file to be used.
      *
      * @default "cypress.config.{js,ts,mjs,cjs}"
      */
    var configFile: String
    
    /**
      * Specify environment variables.
      * TODO: isn't this duplicate of config.env?!
      */
    var env: js.Object
    
    /**
      * Path to a specific project
      */
    var project: String
    
    /**
      * Specify the type of tests to execute.
      * @default "e2e"
      */
    var testingType: TestingType
  }
  object CypressCommonOptions {
    
    inline def apply(
      config: ConfigOptions[Any],
      configFile: String,
      env: js.Object,
      project: String,
      testingType: TestingType
    ): CypressCommonOptions = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], testingType = testingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CypressCommonOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CypressCommonOptions] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: ConfigOptions[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: js.Object): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setTestingType(value: TestingType): Self = StObject.set(x, "testingType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * If Cypress fails to run at all (for example, if there are no spec files to run),
    * then it will return a CypressFailedRunResult. Check the failures attribute.
    * @example
    ```
    const result = await cypress.run()
    if (result.status === 'failed') {
    console.error('failures %d', result.failures)
    console.error(result.message)
    process.exit(result.failures)
    }
    ```
    *
    **/
  trait CypressFailedRunResult extends StObject {
    
    var failures: Double
    
    var message: String
    
    var status: failed
  }
  object CypressFailedRunResult {
    
    inline def apply(failures: Double, message: String): CypressFailedRunResult = {
      val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = "failed")
      __obj.asInstanceOf[CypressFailedRunResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CypressFailedRunResult] (val x: Self) extends AnyVal {
      
      inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: failed): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * All options that one can pass to "cypress.open"
    * @see https://on.cypress.io/module-api#cypress-open
    * @example
    ```
    const cypress = require('cypress')
    cypress.open({
    env: {
    username: 'Joe Doe',
    email: 'joe@acme.co'
    },
    project: '~/demos/my-project'
    })
    ```
    */
  trait CypressOpenOptions
    extends StObject
       with CypressCommonOptions {
    
    /**
      * Specify browser to run tests in, either by name or by filesystem path
      */
    var browser: String
    
    /**
      * Open Cypress in detached mode
      */
    var detached: Boolean
    
    /**
      * Run in global mode
      */
    var global: Boolean
    
    /**
      * Override default port
      */
    var port: Double
  }
  object CypressOpenOptions {
    
    inline def apply(
      browser: String,
      config: ConfigOptions[Any],
      configFile: String,
      detached: Boolean,
      env: js.Object,
      global: Boolean,
      port: Double,
      project: String,
      testingType: TestingType
    ): CypressOpenOptions = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], testingType = testingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CypressOpenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CypressOpenOptions] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * All options that one can pass to "cypress.run"
    * @see https://on.cypress.io/module-api#cypress-run
    * @example
    ```
    const cypress = require('cypress')
    cypress.run({
    reporter: 'junit',
    browser: 'chrome',
    config: {
    baseUrl: 'http://localhost:8080',
    chromeWebSecurity: false,
    },
    env: {
    foo: 'bar',
    baz: 'quux',
    }
    })
    ```
    */
  trait CypressRunOptions
    extends StObject
       with CypressCommonOptions {
    
    /**
      * Specify browser to run tests in, either by name or by filesystem path
      */
    var browser: String
    
    /**
      * Specify a unique identifier for a run to enable grouping or parallelization
      */
    var ciBuildId: String
    
    /**
      * Group recorded tests together under a single run name
      */
    var group: String
    
    /**
      * Display the browser instead of running headlessly
      */
    var headed: Boolean
    
    /**
      * Hide the browser instead of running headed
      */
    var headless: Boolean
    
    /**
      * Specify your secret Record Key
      */
    var key: String
    
    /**
      * Keep Cypress open after all tests run
      */
    var noExit: Boolean
    
    /**
      * Run recorded specs in parallel across multiple machines
      */
    var parallel: Boolean
    
    /**
      * Override default port
      */
    var port: Double
    
    /**
      * Run quietly, using only the configured reporter
      */
    var quiet: Boolean
    
    /**
      * Whether to record the test run
      */
    var record: Boolean
    
    /**
      * Specify a mocha reporter
      */
    var reporter: String
    
    /**
      * Specify mocha reporter options
      */
    var reporterOptions: Any
    
    /**
      * Specify the specs to run
      */
    var spec: String
    
    /**
      * Tag string for the recorded run, like "production,nightly"
      */
    var tag: String
  }
  object CypressRunOptions {
    
    inline def apply(
      browser: String,
      ciBuildId: String,
      config: ConfigOptions[Any],
      configFile: String,
      env: js.Object,
      group: String,
      headed: Boolean,
      headless: Boolean,
      key: String,
      noExit: Boolean,
      parallel: Boolean,
      port: Double,
      project: String,
      quiet: Boolean,
      record: Boolean,
      reporter: String,
      reporterOptions: Any,
      spec: String,
      tag: String,
      testingType: TestingType
    ): CypressRunOptions = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], ciBuildId = ciBuildId.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], headed = headed.asInstanceOf[js.Any], headless = headless.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], noExit = noExit.asInstanceOf[js.Any], parallel = parallel.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterOptions = reporterOptions.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], testingType = testingType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CypressRunOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CypressRunOptions] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setCiBuildId(value: String): Self = StObject.set(x, "ciBuildId", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setHeaded(value: Boolean): Self = StObject.set(x, "headed", value.asInstanceOf[js.Any])
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNoExit(value: Boolean): Self = StObject.set(x, "noExit", value.asInstanceOf[js.Any])
      
      inline def setParallel(value: Boolean): Self = StObject.set(x, "parallel", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setRecord(value: Boolean): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterOptions(value: Any): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Results returned by the test run.
    * @see https://on.cypress.io/module-api
    */
  trait CypressRunResult extends StObject {
    
    var browserName: String
    
    var browserPath: String
    
    var browserVersion: String
    
    var config: ResolvedConfigOptions[Any]
    
    var cypressVersion: String
    
    var endedTestsAt: dateTimeISO
    
    var osName: String
    
    var osVersion: String
    
    /**
      * If Cypress test run is being recorded, full url will be provided.
      * @see https://on.cypress.io/dashboard-introduction
      */
    var runUrl: js.UndefOr[String] = js.undefined
    
    var runs: js.Array[RunResult]
    
    var startedTestsAt: dateTimeISO
    
    var status: finished
    
    var totalDuration: ms
    
    var totalFailed: Double
    
    var totalPassed: Double
    
    var totalPending: Double
    
    var totalSkipped: Double
    
    var totalSuites: Double
    
    var totalTests: Double
  }
  object CypressRunResult {
    
    inline def apply(
      browserName: String,
      browserPath: String,
      browserVersion: String,
      config: ResolvedConfigOptions[Any],
      cypressVersion: String,
      endedTestsAt: dateTimeISO,
      osName: String,
      osVersion: String,
      runs: js.Array[RunResult],
      startedTestsAt: dateTimeISO,
      totalDuration: ms,
      totalFailed: Double,
      totalPassed: Double,
      totalPending: Double,
      totalSkipped: Double,
      totalSuites: Double,
      totalTests: Double
    ): CypressRunResult = {
      val __obj = js.Dynamic.literal(browserName = browserName.asInstanceOf[js.Any], browserPath = browserPath.asInstanceOf[js.Any], browserVersion = browserVersion.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], cypressVersion = cypressVersion.asInstanceOf[js.Any], endedTestsAt = endedTestsAt.asInstanceOf[js.Any], osName = osName.asInstanceOf[js.Any], osVersion = osVersion.asInstanceOf[js.Any], runs = runs.asInstanceOf[js.Any], startedTestsAt = startedTestsAt.asInstanceOf[js.Any], status = "finished", totalDuration = totalDuration.asInstanceOf[js.Any], totalFailed = totalFailed.asInstanceOf[js.Any], totalPassed = totalPassed.asInstanceOf[js.Any], totalPending = totalPending.asInstanceOf[js.Any], totalSkipped = totalSkipped.asInstanceOf[js.Any], totalSuites = totalSuites.asInstanceOf[js.Any], totalTests = totalTests.asInstanceOf[js.Any])
      __obj.asInstanceOf[CypressRunResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CypressRunResult] (val x: Self) extends AnyVal {
      
      inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
      
      inline def setBrowserPath(value: String): Self = StObject.set(x, "browserPath", value.asInstanceOf[js.Any])
      
      inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: ResolvedConfigOptions[Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCypressVersion(value: String): Self = StObject.set(x, "cypressVersion", value.asInstanceOf[js.Any])
      
      inline def setEndedTestsAt(value: dateTimeISO): Self = StObject.set(x, "endedTestsAt", value.asInstanceOf[js.Any])
      
      inline def setOsName(value: String): Self = StObject.set(x, "osName", value.asInstanceOf[js.Any])
      
      inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      inline def setRunUrl(value: String): Self = StObject.set(x, "runUrl", value.asInstanceOf[js.Any])
      
      inline def setRunUrlUndefined: Self = StObject.set(x, "runUrl", js.undefined)
      
      inline def setRuns(value: js.Array[RunResult]): Self = StObject.set(x, "runs", value.asInstanceOf[js.Any])
      
      inline def setRunsVarargs(value: RunResult*): Self = StObject.set(x, "runs", js.Array(value*))
      
      inline def setStartedTestsAt(value: dateTimeISO): Self = StObject.set(x, "startedTestsAt", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: finished): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTotalDuration(value: ms): Self = StObject.set(x, "totalDuration", value.asInstanceOf[js.Any])
      
      inline def setTotalFailed(value: Double): Self = StObject.set(x, "totalFailed", value.asInstanceOf[js.Any])
      
      inline def setTotalPassed(value: Double): Self = StObject.set(x, "totalPassed", value.asInstanceOf[js.Any])
      
      inline def setTotalPending(value: Double): Self = StObject.set(x, "totalPending", value.asInstanceOf[js.Any])
      
      inline def setTotalSkipped(value: Double): Self = StObject.set(x, "totalSkipped", value.asInstanceOf[js.Any])
      
      inline def setTotalSuites(value: Double): Self = StObject.set(x, "totalSuites", value.asInstanceOf[js.Any])
      
      inline def setTotalTests(value: Double): Self = StObject.set(x, "totalTests", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Information about a single "before", "beforeEach", "afterEach" and "after" hook.
    */
  trait HookInformation extends StObject {
    
    var body: String
    
    var hookName: HookName
    
    var title: js.Array[String]
  }
  object HookInformation {
    
    inline def apply(body: String, hookName: HookName, title: js.Array[String]): HookInformation = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], hookName = hookName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HookInformation] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHookName(value: HookName): Self = StObject.set(x, "hookName", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.cypressStrings.before
    - typings.cypress.cypressStrings.beforeEach
    - typings.cypress.cypressStrings.afterEach
    - typings.cypress.cypressStrings.after
  */
  trait HookName extends StObject
  object HookName {
    
    inline def after: typings.cypress.cypressStrings.after = "after".asInstanceOf[typings.cypress.cypressStrings.after]
    
    inline def afterEach: typings.cypress.cypressStrings.afterEach = "afterEach".asInstanceOf[typings.cypress.cypressStrings.afterEach]
    
    inline def before: typings.cypress.cypressStrings.before = "before".asInstanceOf[typings.cypress.cypressStrings.before]
    
    inline def beforeEach: typings.cypress.cypressStrings.beforeEach = "beforeEach".asInstanceOf[typings.cypress.cypressStrings.beforeEach]
  }
  
  /**
    * Cypress test run result for a single spec.
    */
  trait RunResult extends StObject {
    
    var error: String | Null
    
    var hooks: js.Array[HookInformation]
    
    /**
      * Reporter name like "spec"
      */
    var reporter: String
    
    /**
      * This is controlled by the reporter, and Cypress cannot guarantee
      * the properties. Usually this object has suites, tests, passes, etc
      */
    var reporterStats: js.Object
    
    var shouldUploadVideo: Boolean
    
    /**
      * information about the spec test file.
      */
    var spec: Absolute
    
    /**
      * Accurate test results collected by Cypress.
      */
    var stats: EndedAt
    
    var tests: js.Array[TestResult]
    
    var video: String | Null
  }
  object RunResult {
    
    inline def apply(
      hooks: js.Array[HookInformation],
      reporter: String,
      reporterStats: js.Object,
      shouldUploadVideo: Boolean,
      spec: Absolute,
      stats: EndedAt,
      tests: js.Array[TestResult]
    ): RunResult = {
      val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], reporter = reporter.asInstanceOf[js.Any], reporterStats = reporterStats.asInstanceOf[js.Any], shouldUploadVideo = shouldUploadVideo.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], error = null, video = null)
      __obj.asInstanceOf[RunResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RunResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setHooks(value: js.Array[HookInformation]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksVarargs(value: HookInformation*): Self = StObject.set(x, "hooks", js.Array(value*))
      
      inline def setReporter(value: String): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterStats(value: js.Object): Self = StObject.set(x, "reporterStats", value.asInstanceOf[js.Any])
      
      inline def setShouldUploadVideo(value: Boolean): Self = StObject.set(x, "shouldUploadVideo", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: Absolute): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStats(value: EndedAt): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setTests(value: js.Array[TestResult]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
      
      inline def setTestsVarargs(value: TestResult*): Self = StObject.set(x, "tests", js.Array(value*))
      
      inline def setVideo(value: String): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoNull: Self = StObject.set(x, "video", null)
    }
  }
  
  /**
    * Information about a single screenshot.
    */
  trait ScreenshotInformation extends StObject {
    
    var height: pixels
    
    var name: String
    
    /**
      * Absolute path to the saved image
      */
    var path: String
    
    var takenAt: dateTimeISO
    
    var width: pixels
  }
  object ScreenshotInformation {
    
    inline def apply(height: pixels, name: String, path: String, takenAt: dateTimeISO, width: pixels): ScreenshotInformation = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], takenAt = takenAt.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenshotInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScreenshotInformation] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: pixels): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTakenAt(value: dateTimeISO): Self = StObject.set(x, "takenAt", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: pixels): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestError extends StObject {
    
    var message: String
    
    var name: String
    
    var stack: String
  }
  object TestError {
    
    inline def apply(message: String, name: String, stack: String): TestError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Cypress single test result
    */
  trait TestResult extends StObject {
    
    var attempts: js.Array[AttemptResult]
    
    var body: String
    
    /**
      * Error string as it's presented in console if the test fails
      */
    var displayError: String | Null
    
    var state: String
    
    var title: js.Array[String]
  }
  object TestResult {
    
    inline def apply(attempts: js.Array[AttemptResult], body: String, state: String, title: js.Array[String]): TestResult = {
      val __obj = js.Dynamic.literal(attempts = attempts.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], displayError = null)
      __obj.asInstanceOf[TestResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestResult] (val x: Self) extends AnyVal {
      
      inline def setAttempts(value: js.Array[AttemptResult]): Self = StObject.set(x, "attempts", value.asInstanceOf[js.Any])
      
      inline def setAttemptsVarargs(value: AttemptResult*): Self = StObject.set(x, "attempts", js.Array(value*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDisplayError(value: String): Self = StObject.set(x, "displayError", value.asInstanceOf[js.Any])
      
      inline def setDisplayErrorNull: Self = StObject.set(x, "displayError", null)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
    }
  }
  
  // small utility types to better express meaning of other types
  type dateTimeISO = String
  
  type ms = Double
  
  type pixels = Double
}
