package typings.cldrjs.cldrjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name CldrStatic
  * @memberof cldr
  * @kind interface
  *
  * @description
  * The cldr class definition.
  */
@js.native
trait CldrStatic extends js.Object {
  /**
    * @name attributes
    * @memberof cldr.CldrStatic
    * @kind property
    * @access public
    *
    * @type {cldr.Attributes}
    *
    * @declaration
    * The object created during instance initialization and used internally by .get()
    * to replace dynamic parts of an item path.
    */
  var attributes: Attributes = js.native
  /**
    * @name locale
    * @memberof cldr.CldrStatic
    * @kind property
    * @access public
    *
    * @type {string}
    *
    * @declaration
    * The locale string.
    */
  var locale: String = js.native
  /**
    * @name get
    * @memberof cldr.CldrStatic
    * @kind function
    * @access public
    *
    * @description
    * Get the item data given its path, or 'undefined' if missing.
    *
    * @param {string} path The path to the cldr member.
    *
    * @returns {any} The cldr member.
    */
  def get(path: String): js.Any = js.native
  /**
    * @name get
    * @memberof cldr.CldrStatic
    * @kind function
    * @access public
    *
    * @description
    * Get the item data given its path, or 'undefined' if missing.
    *
    * @param {Array<string>} paths The array with path parts to the cldr member.
    *
    * @returns {any} The cldr member.
    */
  def get(paths: js.Array[String]): js.Any = js.native
  /**
    * @name main
    * @memberof cldr.CldrStatic
    * @kind function
    * @access public
    *
    * @description
    * It's an alias for .get(["main/{languageId}, ...])"
    *
    * @param {string} path The path to the cldr member.
    *
    * @returns {any} The cldr member.
    */
  def main(path: String): js.Any = js.native
  /**
    * @name main
    * @memberof cldr.CldrStatic
    * @kind function
    * @access public
    *
    * @declaration
    * It's an alias for .get(["main/{languageId}, ...])"
    *
    * @param {Array<string>} paths The array with path parts to the cldr member.
    *
    * @returns {any} The cldr member.
    */
  def main(paths: js.Array[String]): js.Any = js.native
  def off(event: String, listener: js.Function2[/* path */ String, /* value */ js.Any, Unit]): Unit = js.native
  def on(event: String, listener: js.Function2[/* path */ String, /* value */ js.Any, Unit]): Unit = js.native
  def once(event: String, listener: js.Function2[/* path */ String, /* value */ js.Any, Unit]): Unit = js.native
}

