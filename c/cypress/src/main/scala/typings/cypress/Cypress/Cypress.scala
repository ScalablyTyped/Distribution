package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.Anon_Absolute
import typings.cypress.Anon_Add
import typings.cypress.Anon_Debug
import typings.cypress.Anon_Defaults
import typings.cypress.Anon_DefaultsOptions
import typings.cypress.Anon_Element
import typings.cypress.JQuery
import typings.cypress.JQuery.PlainObject
import typings.cypress.JQuery.Selector
import typings.cypress.JQuery.htmlString
import typings.cypress.JQueryStatic
import typings.cypress.Mocha.IRunnable
import typings.cypress.Mocha.ITest
import typings.cypress.Window
import typings.cypress.cypressNumbers.`false`
import typings.cypress.cypressStrings.`command:end`
import typings.cypress.cypressStrings.`command:enqueued`
import typings.cypress.cypressStrings.`command:retry`
import typings.cypress.cypressStrings.`command:start`
import typings.cypress.cypressStrings.`log:added`
import typings.cypress.cypressStrings.`log:changed`
import typings.cypress.cypressStrings.`test:after:run`
import typings.cypress.cypressStrings.`test:before:run`
import typings.cypress.cypressStrings.`uncaught:exception`
import typings.cypress.cypressStrings.`url:changed`
import typings.cypress.cypressStrings.`viewport:changed`
import typings.cypress.cypressStrings.`window:alert`
import typings.cypress.cypressStrings.`window:before:load`
import typings.cypress.cypressStrings.`window:before:unload`
import typings.cypress.cypressStrings.`window:confirm`
import typings.cypress.cypressStrings.`window:load`
import typings.cypress.cypressStrings.`window:unload`
import typings.cypress.cypressStrings.animationDistanceThreshold
import typings.cypress.cypressStrings.baseUrl
import typings.cypress.cypressStrings.bundled
import typings.cypress.cypressStrings.chromeWebSecurity
import typings.cypress.cypressStrings.defaultCommandTimeout
import typings.cypress.cypressStrings.env
import typings.cypress.cypressStrings.execTimeout
import typings.cypress.cypressStrings.fail
import typings.cypress.cypressStrings.fileServerFolder
import typings.cypress.cypressStrings.fixturesFolder
import typings.cypress.cypressStrings.ignoreTestFiles
import typings.cypress.cypressStrings.integrationFolder
import typings.cypress.cypressStrings.nodeVersion
import typings.cypress.cypressStrings.numTestsKeptInMemory
import typings.cypress.cypressStrings.pageLoadTimeout
import typings.cypress.cypressStrings.pluginsFile
import typings.cypress.cypressStrings.port
import typings.cypress.cypressStrings.reporter
import typings.cypress.cypressStrings.requestTimeout
import typings.cypress.cypressStrings.resolvedNodePath
import typings.cypress.cypressStrings.resolvedNodeVersion
import typings.cypress.cypressStrings.responseTimeout
import typings.cypress.cypressStrings.screenshotsFolder
import typings.cypress.cypressStrings.scrolled
import typings.cypress.cypressStrings.supportFile
import typings.cypress.cypressStrings.system
import typings.cypress.cypressStrings.trashAssetsBeforeRuns
import typings.cypress.cypressStrings.video
import typings.cypress.cypressStrings.videoCompression
import typings.cypress.cypressStrings.videoUploadOnPasses
import typings.cypress.cypressStrings.videosFolder
import typings.cypress.cypressStrings.viewportHeight
import typings.cypress.cypressStrings.viewportWidth
import typings.cypress.cypressStrings.waitForAnimations
import typings.cypress.cypressStrings.watchForFileChanges
import typings.cypress.typesLodashMod.LoDashStatic
import typings.cypress.typesSinonMod.SinonSpy
import typings.cypress.typesSinonMod.SinonStub
import typings.std.ArrayLike
import typings.std.BeforeUnloadEvent
import typings.std.Document
import typings.std.Element
import typings.std.Error
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Several libraries are bundled with Cypress by default.
  *
  * @see https://on.cypress.io/api
  */
@js.native
trait Cypress extends js.Object {
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  var $_Original: JQueryStatic = js.native
  /**
    * Cypress automatically includes a Blob library and exposes it as Cypress.Blob.
    *
    * @see https://on.cypress.io/blob
    * @see https://github.com/nolanlawson/blob-util
    * @example
    *    Cypress.Blob.method()
    */
  var Blob: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BlobUtil.BlobUtilStatic */ js.Any = js.native
  /**
    * @see https://on.cypress.io/api/commands
    */
  var Commands: Anon_Add = js.native
  /**
    * @see https://on.cypress.io/cookies
    */
  var Cookies: Anon_Debug = js.native
  /**
    * Internal class for LocalStorage management.
    */
  var LocalStorage: typings.cypress.Cypress.LocalStorage = js.native
  /**
    * Cypress automatically includes Bluebird and exposes it as Cypress.Promise.
    *
    * @see https://on.cypress.io/promise
    * @see https://github.com/petkaantonov/bluebird
    * @example
    *   new Cypress.Promise((resolve, reject) => { ... })
    */
  var Promise: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Bluebird.BluebirdStatic */ js.Any = js.native
  /**
    * @see https://on.cypress.io/api/screenshot-api
    */
  var Screenshot: Anon_DefaultsOptions = js.native
  /**
    * @see https://on.cypress.io/api/api-server
    */
  var Server: Anon_Defaults = js.native
  /**
    * Lodash library
    *
    * @see https://on.cypress.io/_
    * @example
    *    Cypress._.keys(obj)
    */
  var `_`: LoDashStatic = js.native
  /**
    * CPU architecture, from Node `os.arch()`
    *
    * @see https://nodejs.org/api/os.html#os_os_arch
    * @example
    *    Cypress.arch // "x64"
    */
  var arch: String = js.native
  /**
    * Information about the browser currently running the tests
    */
  var browser: Browser = js.native
  /**
    * @see https://on.cypress.io/dom
    */
  var dom: Anon_Element = js.native
  /**
    * Cypress automatically includes minimatch and exposes it as Cypress.minimatch.
    *
    * @see https://on.cypress.io/minimatch
    */
  var minimatch: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Minimatch.minimatch */ js.Any = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  var moment: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Moment.MomentStatic */ js.Any = js.native
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  var off_Original: Actions = js.native
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  var on_Original: Actions = js.native
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  var once_Original: Actions = js.native
  /**
    * OS platform name, from Node `os.platform()`
    *
    * @see https://nodejs.org/api/os.html#os_os_platform
    * @example
    *    Cypress.platform // "darwin"
    */
  var platform: String = js.native
  /**
    * Currently executing spec file.
    * @example
    ```
    Cypress.spec
    // {
    //  name: "config_passing_spec.coffee",
    //  relative: "cypress/integration/config_passing_spec.coffee",
    //  absolute: "/users/smith/projects/web/cypress/integration/config_passing_spec.coffee"
    // }
    ```
    */
  var spec: Anon_Absolute = js.native
  /**
    * Cypress version string. i.e. "1.1.2"
    * @see https://on.cypress.io/version
    * @example
    ```
    expect(Cypress.version).to.be.a('string')
    if (Cypress.version === '1.2.0') {
    // test something specific
    }
    ```
    */
  var version: String = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param element A DOM element to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Set the background color of the page to black.
  ```javascript
  $( document.body ).css( "background", "black" );
  ```
    */
  // NOTE: `HTMLSelectElement` is both an Element and an Array-Like Object but jQuery treats it as an Element.
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $(element: HTMLSelectElement): JQuery[HTMLSelectElement] = js.native
  // HACK: This is the factory function returned when importing jQuery without a DOM. Declaring it separately breaks using the type parameter on JQueryStatic.
  // HACK: The discriminator parameter handles the edge case of passing a Window object to JQueryStatic. It doesn't actually exist on the factory function.
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $(window: Window, discriminator: Boolean): JQueryStatic = js.native
  /**
    * Returns an empty jQuery set.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.4
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement](): JQuery[TElement] = js.native
  /**
    * Binds a function to be executed when the DOM has finished loading.
    * @param callback The function to execute when the DOM is ready.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Execute the function when the DOM is ready to be used.
  ```javascript
  $(function() {
    // Document is ready
  });
  ```
    * @example ​ ````Use both the shortcut for $(document).ready() and the argument to write failsafe jQuery code using the $ alias, without relying on the global alias.
  ```javascript
  jQuery(function( $ ) {
    // Your code using failsafe $ alias here...
  });
  ```
    */
  // tslint:disable-next-line:no-unnecessary-generics unified-signatures
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement](callback: js.ThisFunction1[/* this */ Document, /* $ */ this.type, Unit]): JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param element_elementArray _&#x40;param_ `element_elementArray`
    * <br>
    * * `element` — A DOM element to wrap in a jQuery object. <br>
    * * `elementArray` — An array containing a set of DOM elements to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Set the background color of the page to black.
  ```javascript
  $( document.body ).css( "background", "black" );
  ```
    * @example ​ ````Hide all the input elements within a form.
  ```javascript
  $( myForm.elements ).hide();
  ```
    */
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[T /* <: Element */](element_elementArray: T): JQuery[T] = js.native
  @JSName("$")
  def $[T /* <: Element */](element_elementArray: ArrayLike[T]): JQuery[T] = js.native
  /**
    * Creates DOM elements on the fly from the provided string of raw HTML.
    * @param html _&#x40;param_ `html`
    * <br>
    * * `html (ownerDocument)` — A string of HTML to create on the fly. Note that this parses HTML, not XML. <br>
    * * `html (attributes)` — A string defining a single, standalone, HTML element (e.g. &lt;div/&gt; or &lt;div&gt;&lt;/div&gt;).
    * @param ownerDocument_attributes _&#x40;param_ `ownerDocument_attributes`
    * <br>
    * * `ownerDocument` — A document in which the new elements will be created. <br>
    * * `attributes` — An object of attributes, events, and methods to call on the newly-created element.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @since 1.4
    * @example ​ ````Create a div element (and all of its contents) dynamically and append it to the body element. Internally, an element is created and its innerHTML property set to the given markup.
  ```javascript
  $( "<div><p>Hello</p></div>" ).appendTo( "body" )
  ```
    * @example ​ ````Create some DOM elements.
  ```javascript
  $( "<div/>", {
    "class": "test",
    text: "Click me!",
    click: function() {
    $( this ).toggleClass( "test" );
    }
  })
    .appendTo( "body" );
  ```
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement /* <: HTMLElement */](html: htmlString): JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: PlainObject[_]): JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: HTMLElement */](html: htmlString, ownerDocument_attributes: Document): JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param selection An existing jQuery object to clone.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[T](selection: JQuery[T]): JQuery[T] = js.native
  @JSName("$")
  def $[TElement /* <: Element */](selector: Selector, context: JQuery[HTMLElement]): JQuery[TElement] = js.native
  @JSName("$")
  def $[TElement /* <: Element */](selector: Selector, context: Element): JQuery[TElement] = js.native
  /**
    * Accepts a string containing a CSS selector which is then used to match a set of elements.
    * @param selector A string containing a selector expression
    * @param context A DOM Element, Document, or jQuery to use as context
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    * @example ​ ````Find all p elements that are children of a div element and apply a border to them.
  ```html
  <!doctype html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <title>jQuery demo</title>
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
  </head>
  <body>
  ​
  <p>one</p>
  <div><p>two</p></div>
  <p>three</p>
  ​
  <script>
  $( "div > p" ).css( "border", "1px solid gray" );
  </script>
  </body>
  </html>
  ```
    * @example ​ ````Find all inputs of type radio within the first form in the document.
  ```javascript
  $( "input:radio", document.forms[ 0 ] );
  ```
    * @example ​ ````Find all div elements within an XML document from an Ajax response.
  ```javascript
  $( "div", xml.responseXML );
  ```
  ​
    */
  // tslint:disable-next-line:no-unnecessary-generics
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $_TElement_Element[TElement /* <: Element */](selector: Selector): JQuery[TElement] = js.native
  @JSName("$")
  def $_TElement_Element[TElement /* <: Element */](selector: Selector, context: Document): JQuery[TElement] = js.native
  /**
    * Return a collection of matched elements either found in the DOM based on passed argument(s) or created by passing an HTML string.
    * @param object A plain object to wrap in a jQuery object.
    * @see \`{@link https://api.jquery.com/jQuery/ }\`
    * @since 1.0
    */
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $_T_PlainObjectWildcard[T /* <: PlainObject[_] */](`object`: T): JQuery[T] = js.native
  /**
    * Returns all configuration objects.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config()
    // {defaultCommandTimeout: 10000, pageLoadTimeout: 30000, ...}
    ```
    */
  def config(): ConfigOptions = js.native
  /**
    * Sets multiple configuration values at once.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config({
    defaultCommandTimeout: 10000,
    viewportHeight: 900
    })
    ```
    */
  def config(Object: Partial[ConfigOptions]): Unit = js.native
  def config(key: nodeVersion, value: bundled): Unit = js.native
  def config(key: nodeVersion, value: system): Unit = js.native
  @JSName("config")
  def config_animationDistanceThreshold(key: animationDistanceThreshold): Double = js.native
  @JSName("config")
  def config_animationDistanceThreshold(key: animationDistanceThreshold, value: Double): Unit = js.native
  /**
    * Returns one configuration value.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config('pageLoadTimeout')
    // 60000
    ```
    */
  @JSName("config")
  def config_baseUrl(key: baseUrl): String | Null = js.native
  /**
    * Sets one configuration value.
    * @see https://on.cypress.io/config
    * @example
    ```
    Cypress.config('viewportWidth', 800)
    ```
    */
  @JSName("config")
  def config_baseUrl(key: baseUrl, value: String): Unit = js.native
  @JSName("config")
  def config_baseUrl_Unit(key: baseUrl): Unit = js.native
  @JSName("config")
  def config_chromeWebSecurity(key: chromeWebSecurity): Boolean = js.native
  @JSName("config")
  def config_chromeWebSecurity(key: chromeWebSecurity, value: Boolean): Unit = js.native
  @JSName("config")
  def config_defaultCommandTimeout(key: defaultCommandTimeout): Double = js.native
  @JSName("config")
  def config_defaultCommandTimeout(key: defaultCommandTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_env(key: env): StringDictionary[js.Any] = js.native
  @JSName("config")
  def config_env(key: env, value: StringDictionary[js.Any]): Unit = js.native
  @JSName("config")
  def config_execTimeout(key: execTimeout): Double = js.native
  @JSName("config")
  def config_execTimeout(key: execTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_fileServerFolder(key: fileServerFolder): String = js.native
  @JSName("config")
  def config_fileServerFolder(key: fileServerFolder, value: String): Unit = js.native
  @JSName("config")
  def config_fixturesFolder(key: fixturesFolder): String = js.native
  @JSName("config")
  def config_fixturesFolder(key: fixturesFolder, value: String): Unit = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: ignoreTestFiles): String | js.Array[String] = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: ignoreTestFiles, value: String): Unit = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: ignoreTestFiles, value: js.Array[String]): Unit = js.native
  @JSName("config")
  def config_integrationFolder(key: integrationFolder): String = js.native
  @JSName("config")
  def config_integrationFolder(key: integrationFolder, value: String): Unit = js.native
  @JSName("config")
  def config_nodeVersion(key: nodeVersion): system | bundled = js.native
  @JSName("config")
  def config_numTestsKeptInMemory(key: numTestsKeptInMemory): Double = js.native
  @JSName("config")
  def config_numTestsKeptInMemory(key: numTestsKeptInMemory, value: Double): Unit = js.native
  @JSName("config")
  def config_pageLoadTimeout(key: pageLoadTimeout): Double = js.native
  @JSName("config")
  def config_pageLoadTimeout(key: pageLoadTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_pluginsFile(key: pluginsFile): String = js.native
  @JSName("config")
  def config_pluginsFile(key: pluginsFile, value: String): Unit = js.native
  @JSName("config")
  def config_port(key: port): Double | Null = js.native
  @JSName("config")
  def config_port(key: port, value: Double): Unit = js.native
  @JSName("config")
  def config_port_Unit(key: port): Unit = js.native
  @JSName("config")
  def config_reporter(key: reporter): String = js.native
  @JSName("config")
  def config_reporter(key: reporter, value: String): Unit = js.native
  @JSName("config")
  def config_requestTimeout(key: requestTimeout): Double = js.native
  @JSName("config")
  def config_requestTimeout(key: requestTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_resolvedNodePath(key: resolvedNodePath): String = js.native
  @JSName("config")
  def config_resolvedNodePath(key: resolvedNodePath, value: String): Unit = js.native
  @JSName("config")
  def config_resolvedNodeVersion(key: resolvedNodeVersion): String = js.native
  @JSName("config")
  def config_resolvedNodeVersion(key: resolvedNodeVersion, value: String): Unit = js.native
  @JSName("config")
  def config_responseTimeout(key: responseTimeout): Double = js.native
  @JSName("config")
  def config_responseTimeout(key: responseTimeout, value: Double): Unit = js.native
  @JSName("config")
  def config_screenshotsFolder(key: screenshotsFolder): String = js.native
  @JSName("config")
  def config_screenshotsFolder(key: screenshotsFolder, value: String): Unit = js.native
  @JSName("config")
  def config_supportFile(key: supportFile): String = js.native
  @JSName("config")
  def config_supportFile(key: supportFile, value: String): Unit = js.native
  @JSName("config")
  def config_trashAssetsBeforeRuns(key: trashAssetsBeforeRuns): Boolean = js.native
  @JSName("config")
  def config_trashAssetsBeforeRuns(key: trashAssetsBeforeRuns, value: Boolean): Unit = js.native
  @JSName("config")
  def config_video(key: video): Boolean = js.native
  @JSName("config")
  def config_video(key: video, value: Boolean): Unit = js.native
  @JSName("config")
  def config_videoCompression(key: videoCompression): Double = js.native
  @JSName("config")
  def config_videoCompression(key: videoCompression, value: Double): Unit = js.native
  @JSName("config")
  def config_videoUploadOnPasses(key: videoUploadOnPasses): Boolean = js.native
  @JSName("config")
  def config_videoUploadOnPasses(key: videoUploadOnPasses, value: Boolean): Unit = js.native
  @JSName("config")
  def config_videosFolder(key: videosFolder): String = js.native
  @JSName("config")
  def config_videosFolder(key: videosFolder, value: String): Unit = js.native
  @JSName("config")
  def config_viewportHeight(key: viewportHeight): Double = js.native
  @JSName("config")
  def config_viewportHeight(key: viewportHeight, value: Double): Unit = js.native
  @JSName("config")
  def config_viewportWidth(key: viewportWidth): Double = js.native
  @JSName("config")
  def config_viewportWidth(key: viewportWidth, value: Double): Unit = js.native
  @JSName("config")
  def config_waitForAnimations(key: waitForAnimations): Boolean = js.native
  @JSName("config")
  def config_waitForAnimations(key: waitForAnimations, value: Boolean): Unit = js.native
  @JSName("config")
  def config_watchForFileChanges(key: watchForFileChanges): Boolean = js.native
  @JSName("config")
  def config_watchForFileChanges(key: watchForFileChanges, value: Boolean): Unit = js.native
  // no real way to type without generics
  /**
    * Returns all environment variables set with CYPRESS_ prefix or in "env" object in "cypress.json"
    *
    * @see https://on.cypress.io/env
    */
  def env(): ObjectLike = js.native
  /**
    * Returns specific environment variable or undefined
    * @see https://on.cypress.io/env
    * @example
    *    // cypress.json
    *    { "env": { "foo": "bar" } }
    *    Cypress.env("foo") // => bar
    */
  def env(key: String): js.Any = js.native
  /**
    * Set value for a variable.
    * Any value you change will be permanently changed for the remainder of your tests.
    * @see https://on.cypress.io/env
    * @example
    *    Cypress.env("host", "http://server.dev.local")
    */
  def env(key: String, value: js.Any): Unit = js.native
  /**
    * Set values for multiple variables at once. Values are merged with existing values.
    * @see https://on.cypress.io/env
    * @example
    *    Cypress.env({ host: "http://server.dev.local", foo: "foo" })
    */
  def env(`object`: ObjectLike): Unit = js.native
  def isCy(obj: js.Any): /* is cypress.Cypress.Chainable<any> */ Boolean = js.native
  /**
    * Checks if a variable is a valid instance of `cy` or a `cy` chainable.
    *
    * @see https://on.cypress.io/iscy
    * @example
    *    Cypress.isCy(cy) // => true
    */
  def isCy[TSubject](obj: Chainable[TSubject]): /* is cypress.Cypress.Chainable<TSubject> */ Boolean = js.native
  /**
    * Internal options for "cy.log" used in custom commands.
    *
    * @see https://on.cypress.io/cypress-log
    */
  def log(options: Partial[LogConfig]): Log = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/index.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def off(
    action: `uncaught:exception`,
    fn: js.Function2[/* error */ Error, /* runnable */ IRunnable, `false` | Unit]
  ): Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def off(action: `window:confirm`, fn: js.Function1[/* text */ String, `false` | Unit]): Unit = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandend(action: `command:end`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandenqueued(action: `command:enqueued`, fn: js.Function1[/* command */ EnqueuedCommand, Unit]): Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandretry(action: `command:retry`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_commandstart(action: `command:start`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_fail(action: fail, fn: js.Function2[/* error */ Error, /* mocha */ IRunnable, Unit]): Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_logadded(action: `log:added`, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_logchanged(action: `log:changed`, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_scrolled(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_testafterrun(action: `test:after:run`, fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]): Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_testbeforerun(action: `test:before:run`, fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]): Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_urlchanged(action: `url:changed`, fn: js.Function1[/* url */ String, Unit]): Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_viewportchanged(action: `viewport:changed`, fn: js.Function1[/* viewport */ Viewport, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowalert(action: `window:alert`, fn: js.Function1[/* text */ String, Unit]): Unit = js.native
  @JSName("off")
  def off_windowalert(action: `window:alert`, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowbeforeload(action: `window:before:load`, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowbeforeunload(action: `window:before:unload`, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_windowconfirm(action: `window:confirm`, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowload(action: `window:load`, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_windowunload(action: `window:unload`, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/index.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def on(
    action: `uncaught:exception`,
    fn: js.Function2[/* error */ Error, /* runnable */ IRunnable, `false` | Unit]
  ): Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def on(action: `window:confirm`, fn: js.Function1[/* text */ String, `false` | Unit]): Unit = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandend(action: `command:end`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandenqueued(action: `command:enqueued`, fn: js.Function1[/* command */ EnqueuedCommand, Unit]): Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandretry(action: `command:retry`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_commandstart(action: `command:start`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_fail(action: fail, fn: js.Function2[/* error */ Error, /* mocha */ IRunnable, Unit]): Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_logadded(action: `log:added`, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_logchanged(action: `log:changed`, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_scrolled(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_testafterrun(action: `test:after:run`, fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]): Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_testbeforerun(action: `test:before:run`, fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]): Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_urlchanged(action: `url:changed`, fn: js.Function1[/* url */ String, Unit]): Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_viewportchanged(action: `viewport:changed`, fn: js.Function1[/* viewport */ Viewport, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowalert(action: `window:alert`, fn: js.Function1[/* text */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_windowalert(action: `window:alert`, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowbeforeload(action: `window:before:load`, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowbeforeunload(action: `window:before:unload`, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_windowconfirm(action: `window:confirm`, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowload(action: `window:load`, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_windowunload(action: `window:unload`, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    // likely want to do this in a support file
    // so it's applied to all spec files
    // cypress/support/index.js
    Cypress.on('uncaught:exception', (err, runnable) => {
    // returning false here prevents Cypress from
    // failing the test
    return false
    })
    // stub "window.alert" in a single test
    it('shows alert', () => {
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // trigger application code that calls alert(...)
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def once(
    action: `uncaught:exception`,
    fn: js.Function2[/* error */ Error, /* runnable */ IRunnable, `false` | Unit]
  ): Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be canceled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    ```
    cy.on('window:confirm', (str) => {
    console.log(str)
    return false // simulate "Cancel"
    })
    ```
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  def once(action: `window:confirm`, fn: js.Function1[/* text */ String, `false` | Unit]): Unit = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandend(action: `command:end`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandenqueued(action: `command:enqueued`, fn: js.Function1[/* command */ EnqueuedCommand, Unit]): Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandretry(action: `command:retry`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_commandstart(action: `command:start`, fn: js.Function1[/* command */ CommandQueue, Unit]): Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_fail(action: fail, fn: js.Function2[/* error */ Error, /* mocha */ IRunnable, Unit]): Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_logadded(action: `log:added`, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_logchanged(action: `log:changed`, fn: js.Function2[/* log */ js.Any, /* interactive */ Boolean, Unit]): Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_scrolled(action: scrolled, fn: js.Function1[/* $el */ JQuery[HTMLElement], Unit]): Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_testafterrun(action: `test:after:run`, fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]): Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_testbeforerun(action: `test:before:run`, fn: js.Function2[/* attributes */ ObjectLike, /* test */ ITest, Unit]): Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_urlchanged(action: `url:changed`, fn: js.Function1[/* url */ String, Unit]): Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_viewportchanged(action: `viewport:changed`, fn: js.Function1[/* viewport */ Viewport, Unit]): Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    ```
    const stub = cy.stub()
    cy.on('window:alert', stub)
    // assume the button calls window.alert()
    cy.get('.my-button')
    .click()
    .then(() => {
    expect(stub).to.have.been.calledOnce
    })
    ```
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowalert(action: `window:alert`, fn: js.Function1[/* text */ String, Unit]): Unit = js.native
  @JSName("once")
  def once_windowalert(action: `window:alert`, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowbeforeload(action: `window:before:load`, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowbeforeunload(action: `window:before:unload`, fn: js.Function1[/* event */ BeforeUnloadEvent, Unit]): Unit = js.native
  @JSName("once")
  def once_windowconfirm(action: `window:confirm`, fn: SinonSpyAgent[SinonSpy | SinonStub]): Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowload(action: `window:load`, fn: js.Function1[/* win */ Window, Unit]): Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("once")
  def once_windowunload(action: `window:unload`, fn: js.Function1[/* event */ Event, Unit]): Unit = js.native
}

