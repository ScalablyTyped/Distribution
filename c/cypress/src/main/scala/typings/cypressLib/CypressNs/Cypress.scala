package typings
package cypressLib.CypressNs

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
  var $_Original: jqueryLib.JQueryStatic = js.native
  /**
    * Cypress automatically includes a Blob library and exposes it as Cypress.Blob.
    *
    * @see https://on.cypress.io/blob
    * @see https://github.com/nolanlawson/blob-util
    * @example
    *    Cypress.Blob.method()
    */
  var Blob: cypressLib.BlobUtilNs.BlobUtilStatic = js.native
  /**
    * @see https://on.cypress.io/api/commands
    */
  var Commands: cypressLib.Anon_Overwrite = js.native
  /**
    * @see https://on.cypress.io/cookies
    */
  var Cookies: cypressLib.Anon_Debug = js.native
  /**
    * Cypress automatically includes Bluebird and exposes it as Cypress.Promise.
    *
    * @see https://on.cypress.io/promise
    * @see https://github.com/petkaantonov/bluebird
    * @example
    *   new Cypress.Promise((resolve, reject) => { ... })
    */
  var Promise: cypressLib.BluebirdNs.BluebirdStatic = js.native
  /**
    * @see https://on.cypress.io/api/screenshot-api
    */
  var Screenshot: cypressLib.Anon_Defaults = js.native
  /**
    * @see https://on.cypress.io/api/api-server
    */
  var Server: cypressLib.Anon_DefaultsOptions = js.native
  /**
    * Lodash library
    *
    * @see https://on.cypress.io/_
    * @example
    *    Cypress._.keys(obj)
    */
  @JSName("_")
  var __Original: lodashLib.lodashMod.underscoreNs.LoDashStatic = js.native
  /**
    * CPU architecture, from Node `os.arch()`
    *
    * @see https://nodejs.org/api/os.html#os_os_arch
    * @example
    *    Cypress.arch // "x64"
    */
  var arch: java.lang.String = js.native
  /**
    * Information about the browser currently running the tests
    */
  var browser: Browser = js.native
  /**
    * @see https://on.cypress.io/dom
    */
  var dom: cypressLib.Anon_IsHidden = js.native
  /**
    * Cypress automatically includes minimatch and exposes it as Cypress.minimatch.
    *
    * @see https://on.cypress.io/minimatch
    */
  var minimatch: cypressLib.MimimatchNs.MimimatchStatic = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  @JSName("moment")
  var moment_Original: cypressLib.MomentNs.MomentStatic = js.native
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
    * OS platform name, from Node `os.platform()`
    *
    * @see https://nodejs.org/api/os.html#os_os_platform
    * @example
    *    Cypress.platform // "darwin"
    */
  var platform: java.lang.String = js.native
  /**
    * Currently executing spec file.
    */
  var spec: cypressLib.Anon_Absolute = js.native
  /**
    * Cypress version string. i.e. "1.1.2"
    * @see https://on.cypress.io/version
    * @example
    *    expect(Cypress.version).to.be.a('string')
    *    if (Cypress.version === '1.2.0') {
    *       // test something specific
    *    }
    */
  var version: java.lang.String = js.native
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
  def $(element: stdLib.HTMLSelectElement): jqueryLib.JQuery[stdLib.HTMLSelectElement] = js.native
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
  def $(window: stdLib.Window, discriminator: scala.Boolean): jqueryLib.JQueryStatic = js.native
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
  def $[TElement](): jqueryLib.JQuery[TElement] = js.native
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
  def $[TElement](callback: js.ThisFunction1[/* this */ stdLib.Document, /* $ */ this.type, scala.Unit]): jqueryLib.JQuery[TElement] = js.native
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
  def $[T /* <: stdLib.Element */](element_elementArray: T): jqueryLib.JQuery[T] = js.native
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[T /* <: stdLib.Element */](element_elementArray: stdLib.ArrayLike[T]): jqueryLib.JQuery[T] = js.native
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement /* <: stdLib.HTMLElement */](html: jqueryLib.JQueryNs.htmlString, ownerDocument_attributes: jqueryLib.JQueryNs.PlainObject[_]): jqueryLib.JQuery[TElement] = js.native
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
  def $[T](selection: jqueryLib.JQuery[T]): jqueryLib.JQuery[T] = js.native
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
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector): jqueryLib.JQuery[TElement] = js.native
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector, context: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[TElement] = js.native
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector, context: stdLib.Document): jqueryLib.JQuery[TElement] = js.native
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $[TElement /* <: stdLib.Element */](selector: jqueryLib.JQueryNs.Selector, context: stdLib.Element): jqueryLib.JQuery[TElement] = js.native
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
  def $_TElementHTMLElement[TElement /* <: stdLib.HTMLElement */](html: jqueryLib.JQueryNs.htmlString): jqueryLib.JQuery[TElement] = js.native
  /**
    * jQuery library
    *
    * @see https://on.cypress.io/$
    * @example
    *    Cypress.$('p')
    */
  @JSName("$")
  def $_TElementHTMLElement[TElement /* <: stdLib.HTMLElement */](html: jqueryLib.JQueryNs.htmlString, ownerDocument_attributes: stdLib.Document): jqueryLib.JQuery[TElement] = js.native
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
  def $_TPlainObject[T /* <: jqueryLib.JQueryNs.PlainObject[_] */](`object`: T): jqueryLib.JQuery[T] = js.native
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  /**
    * Lodash library
    *
    * @see https://on.cypress.io/_
    * @example
    *    Cypress._.keys(obj)
    */
  def `_`[T](value: T): lodashLib.lodashMod.underscoreNs.LoDashImplicitWrapper[T] = js.native
  /**
    * @see https://on.cypress.io/config
    */
  def config(): ConfigOptions = js.native
  def config(Object: stdLib.Partial[ConfigOptions]): scala.Unit = js.native
  @JSName("config")
  def config_animationDistanceThreshold(key: cypressLib.cypressLibStrings.animationDistanceThreshold): scala.Double = js.native
  @JSName("config")
  def config_animationDistanceThreshold(key: cypressLib.cypressLibStrings.animationDistanceThreshold, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_baseUrl(key: cypressLib.cypressLibStrings.baseUrl): java.lang.String | scala.Null = js.native
  @JSName("config")
  def config_baseUrl(key: cypressLib.cypressLibStrings.baseUrl, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_baseUrl_Unit(key: cypressLib.cypressLibStrings.baseUrl): scala.Unit = js.native
  @JSName("config")
  def config_chromeWebSecurity(key: cypressLib.cypressLibStrings.chromeWebSecurity): scala.Boolean = js.native
  @JSName("config")
  def config_chromeWebSecurity(key: cypressLib.cypressLibStrings.chromeWebSecurity, value: scala.Boolean): scala.Unit = js.native
  @JSName("config")
  def config_defaultCommandTimeout(key: cypressLib.cypressLibStrings.defaultCommandTimeout): scala.Double = js.native
  @JSName("config")
  def config_defaultCommandTimeout(key: cypressLib.cypressLibStrings.defaultCommandTimeout, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_env(key: cypressLib.cypressLibStrings.env): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  @JSName("config")
  def config_env(key: cypressLib.cypressLibStrings.env, value: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  @JSName("config")
  def config_execTimeout(key: cypressLib.cypressLibStrings.execTimeout): scala.Double = js.native
  @JSName("config")
  def config_execTimeout(key: cypressLib.cypressLibStrings.execTimeout, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_fileServerFolder(key: cypressLib.cypressLibStrings.fileServerFolder): java.lang.String = js.native
  @JSName("config")
  def config_fileServerFolder(key: cypressLib.cypressLibStrings.fileServerFolder, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_fixturesFolder(key: cypressLib.cypressLibStrings.fixturesFolder): java.lang.String = js.native
  @JSName("config")
  def config_fixturesFolder(key: cypressLib.cypressLibStrings.fixturesFolder, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: cypressLib.cypressLibStrings.ignoreTestFiles): java.lang.String | js.Array[java.lang.String] = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: cypressLib.cypressLibStrings.ignoreTestFiles, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_ignoreTestFiles(key: cypressLib.cypressLibStrings.ignoreTestFiles, value: js.Array[java.lang.String]): scala.Unit = js.native
  @JSName("config")
  def config_integrationFolder(key: cypressLib.cypressLibStrings.integrationFolder): java.lang.String = js.native
  @JSName("config")
  def config_integrationFolder(key: cypressLib.cypressLibStrings.integrationFolder, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_numTestsKeptInMemory(key: cypressLib.cypressLibStrings.numTestsKeptInMemory): scala.Double = js.native
  @JSName("config")
  def config_numTestsKeptInMemory(key: cypressLib.cypressLibStrings.numTestsKeptInMemory, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_pageLoadTimeout(key: cypressLib.cypressLibStrings.pageLoadTimeout): scala.Double = js.native
  @JSName("config")
  def config_pageLoadTimeout(key: cypressLib.cypressLibStrings.pageLoadTimeout, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_pluginsFile(key: cypressLib.cypressLibStrings.pluginsFile): java.lang.String = js.native
  @JSName("config")
  def config_pluginsFile(key: cypressLib.cypressLibStrings.pluginsFile, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_port(key: cypressLib.cypressLibStrings.port): scala.Double | scala.Null = js.native
  @JSName("config")
  def config_port(key: cypressLib.cypressLibStrings.port, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_port_Unit(key: cypressLib.cypressLibStrings.port): scala.Unit = js.native
  @JSName("config")
  def config_reporter(key: cypressLib.cypressLibStrings.reporter): java.lang.String = js.native
  @JSName("config")
  def config_reporter(key: cypressLib.cypressLibStrings.reporter, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_requestTimeout(key: cypressLib.cypressLibStrings.requestTimeout): scala.Double = js.native
  @JSName("config")
  def config_requestTimeout(key: cypressLib.cypressLibStrings.requestTimeout, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_responseTimeout(key: cypressLib.cypressLibStrings.responseTimeout): scala.Double = js.native
  @JSName("config")
  def config_responseTimeout(key: cypressLib.cypressLibStrings.responseTimeout, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_screenshotsFolder(key: cypressLib.cypressLibStrings.screenshotsFolder): java.lang.String = js.native
  @JSName("config")
  def config_screenshotsFolder(key: cypressLib.cypressLibStrings.screenshotsFolder, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_supportFile(key: cypressLib.cypressLibStrings.supportFile): java.lang.String = js.native
  @JSName("config")
  def config_supportFile(key: cypressLib.cypressLibStrings.supportFile, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_trashAssetsBeforeRuns(key: cypressLib.cypressLibStrings.trashAssetsBeforeRuns): scala.Boolean = js.native
  @JSName("config")
  def config_trashAssetsBeforeRuns(key: cypressLib.cypressLibStrings.trashAssetsBeforeRuns, value: scala.Boolean): scala.Unit = js.native
  @JSName("config")
  def config_video(key: cypressLib.cypressLibStrings.video): scala.Boolean = js.native
  @JSName("config")
  def config_video(key: cypressLib.cypressLibStrings.video, value: scala.Boolean): scala.Unit = js.native
  @JSName("config")
  def config_videoCompression(key: cypressLib.cypressLibStrings.videoCompression): scala.Double = js.native
  @JSName("config")
  def config_videoCompression(key: cypressLib.cypressLibStrings.videoCompression, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_videoUploadOnPasses(key: cypressLib.cypressLibStrings.videoUploadOnPasses): scala.Boolean = js.native
  @JSName("config")
  def config_videoUploadOnPasses(key: cypressLib.cypressLibStrings.videoUploadOnPasses, value: scala.Boolean): scala.Unit = js.native
  @JSName("config")
  def config_videosFolder(key: cypressLib.cypressLibStrings.videosFolder): java.lang.String = js.native
  @JSName("config")
  def config_videosFolder(key: cypressLib.cypressLibStrings.videosFolder, value: java.lang.String): scala.Unit = js.native
  @JSName("config")
  def config_viewportHeight(key: cypressLib.cypressLibStrings.viewportHeight): scala.Double = js.native
  @JSName("config")
  def config_viewportHeight(key: cypressLib.cypressLibStrings.viewportHeight, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_viewportWidth(key: cypressLib.cypressLibStrings.viewportWidth): scala.Double = js.native
  @JSName("config")
  def config_viewportWidth(key: cypressLib.cypressLibStrings.viewportWidth, value: scala.Double): scala.Unit = js.native
  @JSName("config")
  def config_waitForAnimations(key: cypressLib.cypressLibStrings.waitForAnimations): scala.Boolean = js.native
  @JSName("config")
  def config_waitForAnimations(key: cypressLib.cypressLibStrings.waitForAnimations, value: scala.Boolean): scala.Unit = js.native
  @JSName("config")
  def config_watchForFileChanges(key: cypressLib.cypressLibStrings.watchForFileChanges): scala.Boolean = js.native
  @JSName("config")
  def config_watchForFileChanges(key: cypressLib.cypressLibStrings.watchForFileChanges, value: scala.Boolean): scala.Unit = js.native
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
  def env(key: java.lang.String): js.Any = js.native
  /**
    * Set value for a variable.
    * Any value you change will be permanently changed for the remainder of your tests.
    * @see https://on.cypress.io/env
    * @example
    *    Cypress.env("host", "http://server.dev.local")
    */
  def env(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    * Set values for multiple variables at once. Values are merged with existing values.
    * @see https://on.cypress.io/env
    * @example
    *    Cypress.env({ host: "http://server.dev.local", foo: "foo" })
    */
  def env(`object`: ObjectLike): scala.Unit = js.native
  /**
    * Internal options for "cy.log" used in custom commands.
    *
    * @see https://on.cypress.io/cypress-log
    */
  def log(options: stdLib.Partial[LogConfig]): Log = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(): momentLib.momentMod.momentNs.Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(inp: momentLib.momentMod.momentNs.MomentInput): momentLib.momentMod.momentNs.Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification
  ): momentLib.momentMod.momentNs.Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String
  ): momentLib.momentMod.momentNs.Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    language: java.lang.String,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  /**
    * Cypress automatically includes moment.js and exposes it as Cypress.moment.
    *
    * @see https://on.cypress.io/moment
    * @see http://momentjs.com/
    * @example
    *    const todaysDate = Cypress.moment().format("MMM DD, YYYY")
    */
  def moment(
    inp: momentLib.momentMod.momentNs.MomentInput,
    format: momentLib.momentMod.momentNs.MomentFormatSpecification,
    strict: scala.Boolean
  ): momentLib.momentMod.momentNs.Moment = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_command:end`(
    action: cypressLib.cypressLibStrings.`command:end`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_command:enqueued`(
    action: cypressLib.cypressLibStrings.`command:enqueued`,
    fn: js.Function1[/* command */ EnqueuedCommand, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_command:retry`(
    action: cypressLib.cypressLibStrings.`command:retry`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_command:start`(
    action: cypressLib.cypressLibStrings.`command:start`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_fail(
    action: cypressLib.cypressLibStrings.fail,
    fn: js.Function2[/* error */ nodeLib.Error, /* mocha */ mochaLib.MochaNs.IRunnable, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_log:added`(
    action: cypressLib.cypressLibStrings.`log:added`,
    fn: js.Function2[/* log */ js.Any, /* interactive */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_log:changed`(
    action: cypressLib.cypressLibStrings.`log:changed`,
    fn: js.Function2[/* log */ js.Any, /* interactive */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def off_scrolled(
    action: cypressLib.cypressLibStrings.scrolled,
    fn: js.Function1[/* $el */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_test:after:run`(
    action: cypressLib.cypressLibStrings.`test:after:run`,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ mochaLib.MochaNs.ITest, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_test:before:run`(
    action: cypressLib.cypressLibStrings.`test:before:run`,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ mochaLib.MochaNs.ITest, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @example
    * // likely want to do this in a support file
    * // so it's applied to all spec files
    * // cypress/support/index.js
    *
    * Cypress.on('uncaught:exception', (err, runnable) => {
    *   // returning false here prevents Cypress from
    *   // failing the test
    *   return false
    * })
    * // stub "window.alert" in a single test
    * it('shows alert', () => {
    *    const stub = cy.stub()
    *    cy.on('window:alert', stub)
    *    // trigger application code that calls alert(...)
    *    .then(() => {
    *      expect(stub).to.have.been.calledOnce
    *    })
    * })
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_uncaught:exception`(
    action: cypressLib.cypressLibStrings.`uncaught:exception`,
    fn: js.Function2[
      /* error */ nodeLib.Error, 
      /* runnable */ mochaLib.MochaNs.IRunnable, 
      cypressLib.cypressLibNumbers.`false` | scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_url:changed`(
    action: cypressLib.cypressLibStrings.`url:changed`,
    fn: js.Function1[/* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_viewport:changed`(
    action: cypressLib.cypressLibStrings.`viewport:changed`,
    fn: js.Function1[/* viewport */ Viewport, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_window:alert`(action: cypressLib.cypressLibStrings.`window:alert`, fn: Agent[sinonLib.sinonMod.SinonNs.SinonSpy]): scala.Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    *    const stub = cy.stub()
    *    cy.on('window:alert', stub)
    *    // assume the button calls window.alert()
    *    cy.get('.my-button').click()
    *    .then(() => {
    *      expect(stub).to.have.been.calledOnce
    *    })
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_window:alert`(
    action: cypressLib.cypressLibStrings.`window:alert`,
    fn: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_window:before:load`(
    action: cypressLib.cypressLibStrings.`window:before:load`,
    fn: js.Function1[/* win */ mochaLib.Window, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_window:before:unload`(
    action: cypressLib.cypressLibStrings.`window:before:unload`,
    fn: js.Function1[/* event */ stdLib.BeforeUnloadEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def `off_window:confirm`(
    action: cypressLib.cypressLibStrings.`window:confirm`,
    fn: Agent[sinonLib.sinonMod.SinonNs.SinonSpy]
  ): scala.Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be cancelled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    *    cy.on('window:confirm', (str) => {
    *      console.log(str)
    *      return false // simulate "Cancel"
    *    })
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_window:confirm`(
    action: cypressLib.cypressLibStrings.`window:confirm`,
    fn: js.Function1[/* text */ java.lang.String, cypressLib.cypressLibNumbers.`false` | scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_window:load`(
    action: cypressLib.cypressLibStrings.`window:load`,
    fn: js.Function1[/* win */ mochaLib.Window, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("off")
  def `off_window:unload`(
    action: cypressLib.cypressLibStrings.`window:unload`,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when cy finishes running and executing your command. Useful for debugging and understanding how commands are handled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_command:end`(
    action: cypressLib.cypressLibStrings.`command:end`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when a cy command is first invoked and enqueued to be run later. Useful for debugging purposes if you're confused about the order in which commands will execute.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_command:enqueued`(
    action: cypressLib.cypressLibStrings.`command:enqueued`,
    fn: js.Function1[/* command */ EnqueuedCommand, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command begins its retrying routines. This is called on the trailing edge after Cypress has internally waited for the retry interval. Useful to understand **why** a command is retrying, and generally includes the actual error causing the retry to happen. When commands fail the final error is the one that actually bubbles up to fail the test. This event is essentially to debug why Cypress is failing.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_command:retry`(
    action: cypressLib.cypressLibStrings.`command:retry`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when cy begins actually running and executing your command. Useful for debugging and understanding how the command queue is async.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_command:start`(
    action: cypressLib.cypressLibStrings.`command:start`,
    fn: js.Function1[/* command */ CommandQueue, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when the test has failed. It is technically possible to prevent the test from actually failing by binding to this event and invoking an async `done` callback. However this is **strongly discouraged**. Tests should never legitimately fail. This event exists because it's extremely useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_fail(
    action: cypressLib.cypressLibStrings.fail,
    fn: js.Function2[/* error */ nodeLib.Error, /* mocha */ mochaLib.MochaNs.IRunnable, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command emits this event so it can be displayed in the Command Log. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_log:added`(
    action: cypressLib.cypressLibStrings.`log:added`,
    fn: js.Function2[/* log */ js.Any, /* interactive */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever a command's attributes changes. This event is debounced to prevent it from firing too quickly and too often. Useful to see how internal cypress commands utilize the {% url 'Cypress.log()' cypress-log %} API.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_log:changed`(
    action: cypressLib.cypressLibStrings.`log:changed`,
    fn: js.Function2[/* log */ js.Any, /* interactive */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever **Cypress** is scrolling your application. This event is fired when Cypress is {% url 'waiting for and calculating actionability' interacting-with-elements %}. It will scroll to 'uncover' elements currently being covered. This event is extremely useful to debug why Cypress may think an element is not interactive.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def on_scrolled(
    action: cypressLib.cypressLibStrings.scrolled,
    fn: js.Function1[/* $el */ jqueryLib.JQuery[stdLib.HTMLElement], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires after the test and all **afterEach** and **after** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_test:after:run`(
    action: cypressLib.cypressLibStrings.`test:after:run`,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ mochaLib.MochaNs.ITest, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires before the test and all **before** and **beforeEach** hooks run.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_test:before:run`(
    action: cypressLib.cypressLibStrings.`test:before:run`,
    fn: js.Function2[/* attributes */ ObjectLike, /* test */ mochaLib.MochaNs.ITest, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when an uncaught exception occurs in your application.
    * Cypress will fail the test when this fires.
    * Return `false` from this event and Cypress will not fail the test. Also useful for debugging purposes because the actual `error` instance is provided to you.
    * @example
    * // likely want to do this in a support file
    * // so it's applied to all spec files
    * // cypress/support/index.js
    *
    * Cypress.on('uncaught:exception', (err, runnable) => {
    *   // returning false here prevents Cypress from
    *   // failing the test
    *   return false
    * })
    * // stub "window.alert" in a single test
    * it('shows alert', () => {
    *    const stub = cy.stub()
    *    cy.on('window:alert', stub)
    *    // trigger application code that calls alert(...)
    *    .then(() => {
    *      expect(stub).to.have.been.calledOnce
    *    })
    * })
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_uncaught:exception`(
    action: cypressLib.cypressLibStrings.`uncaught:exception`,
    fn: js.Function2[
      /* error */ nodeLib.Error, 
      /* runnable */ mochaLib.MochaNs.IRunnable, 
      cypressLib.cypressLibNumbers.`false` | scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Fires whenever Cypress detects that your application's URL has changed.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_url:changed`(
    action: cypressLib.cypressLibStrings.`url:changed`,
    fn: js.Function1[/* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires whenever the viewport changes via a `cy.viewport()` or naturally when Cypress resets the viewport to the default between tests. Useful for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_viewport:changed`(
    action: cypressLib.cypressLibStrings.`viewport:changed`,
    fn: js.Function1[/* viewport */ Viewport, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_window:alert`(action: cypressLib.cypressLibStrings.`window:alert`, fn: Agent[sinonLib.sinonMod.SinonNs.SinonSpy]): scala.Unit = js.native
  /**
    * Fires when your app calls the global `window.alert()` method.
    * Cypress will auto accept alerts. You cannot change this behavior.
    * @example
    *    const stub = cy.stub()
    *    cy.on('window:alert', stub)
    *    // assume the button calls window.alert()
    *    cy.get('.my-button').click()
    *    .then(() => {
    *      expect(stub).to.have.been.calledOnce
    *    })
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_window:alert`(
    action: cypressLib.cypressLibStrings.`window:alert`,
    fn: js.Function1[/* text */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires as the page begins to load, but before any of your applications JavaScript has executed. This fires at the exact same time as `cy.visit()` `onBeforeLoad` callback. Useful to modify the window on a page transition.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_window:before:load`(
    action: cypressLib.cypressLibStrings.`window:before:load`,
    fn: js.Function1[/* win */ mochaLib.Window, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when your application is about to navigate away. The real event object is provided to you. Your app may have set a `returnValue` on the event, which is useful to assert on.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_window:before:unload`(
    action: cypressLib.cypressLibStrings.`window:before:unload`,
    fn: js.Function1[/* event */ stdLib.BeforeUnloadEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_window:confirm`(
    action: cypressLib.cypressLibStrings.`window:confirm`,
    fn: Agent[sinonLib.sinonMod.SinonNs.SinonSpy]
  ): scala.Unit = js.native
  /**
    * Fires when your app calls the global `window.confirm()` method.
    * Cypress will auto accept confirmations. Return `false` from this event and the confirmation will be cancelled.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    * @example
    *    cy.on('window:confirm', (str) => {
    *      console.log(str)
    *      return false // simulate "Cancel"
    *    })
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_window:confirm`(
    action: cypressLib.cypressLibStrings.`window:confirm`,
    fn: js.Function1[/* text */ java.lang.String, cypressLib.cypressLibNumbers.`false` | scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires after all your resources have finished loading after a page transition. This fires at the exact same time as a `cy.visit()` `onLoad` callback.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_window:load`(
    action: cypressLib.cypressLibStrings.`window:load`,
    fn: js.Function1[/* win */ mochaLib.Window, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Fires when your application is has unloaded and is navigating away. The real event object is provided to you. This event is not cancelable.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  /**
    * These events come from Cypress as it issues commands and reacts to their state. These are all useful to listen to for debugging purposes.
    * @see https://on.cypress.io/catalog-of-events#App-Events
    */
  @JSName("on")
  def `on_window:unload`(
    action: cypressLib.cypressLibStrings.`window:unload`,
    fn: js.Function1[/* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
}

