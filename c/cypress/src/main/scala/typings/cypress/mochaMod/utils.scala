package typings.cypress.mochaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("mocha", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Return a new Thing that has the keys in sorted order. Recursive.
    *
    * If the Thing...
    * - has already been seen, return string `'[Circular]'`
    * - is `undefined`, return string `'[undefined]'`
    * - is `null`, return value `null`
    * - is some other primitive, return the value
    * - is not a primitive or an `Array`, `Object`, or `Function`, return the value of the Thing's `toString()` method
    * - is a non-empty `Array`, `Object`, or `Function`, return the result of calling this function again.
    * - is an empty `Array`, `Object`, or `Function`, returns `'[]'`, `'{}'`, or `'[Function]'` respectively.
    *
    * @see https://mochajs.org/api/module-utils.html#.canonicalize
    */
  inline def canonicalize(value: Any, stack: js.Array[Any], typeHint: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("canonicalize")(value.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], typeHint.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /**
    * Strip the function definition from `str`, and re-indent for pre whitespace.
    *
    * @see https://mochajs.org/api/module-utils.html#.clean
    */
  inline def clean(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("clean")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generate an undefined error if `err` is not defined.
    *
    * @see https://mochajs.org/api/module-utils.html#.getError
    */
  inline def getError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getError")().asInstanceOf[js.Error]
  inline def getError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /**
    * Highlight the given string of `js`.
    */
  inline def highlight(js_ : String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(js_.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Lookup file names at the given `path`.
    *
    * @see https://mochajs.org/api/Mocha.utils.html#.exports.lookupFiles
    */
  inline def lookupFiles(filepath: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("lookupFiles")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def lookupFiles(filepath: String, extensions: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupFiles")(filepath.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def lookupFiles(filepath: String, extensions: js.Array[String], recursive: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupFiles")(filepath.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def lookupFiles(filepath: String, extensions: Unit, recursive: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupFiles")(filepath.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * Compute a slug from the given `str`.
    *
    * @see https://mochajs.org/api/module-utils.html#.slug
    */
  inline def slug(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slug")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * When invoking this function you get a filter function that get the Error.stack as an
    * input, and return a prettify output. (i.e: strip Mocha and internal node functions from
    * stack trace).
    *
    * @see https://mochajs.org/api/module-utils.html#.stackTraceFilter
    */
  inline def stackTraceFilter(): js.Function1[/* stack */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stackTraceFilter")().asInstanceOf[js.Function1[/* stack */ String, String]]
  
  /**
    * Stringify `value`. Different behavior depending on type of value:
    *
    * - If `value` is undefined or null, return `'[undefined]'` or `'[null]'`, respectively.
    * - If `value` is not an object, function or array, return result of `value.toString()` wrapped in double-quotes.
    * - If `value` is an *empty* object, function, or array, returns `'{}'`, `'[Function]'`, or `'[]'` respectively.
    * - If `value` has properties, call canonicalize} on it, then return result of `JSON.stringify()`
    *
    * @see https://mochajs.org/api/module-utils.html#.stringify
    */
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Takes some variable and asks `Object.prototype.toString()` what it thinks it is.
    */
  inline def `type`(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generate an undefined error with a message warning the user.
    *
    * @see https://mochajs.org/api/module-utils.html#.undefinedError
    */
  inline def undefinedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("undefinedError")().asInstanceOf[js.Error]
}
