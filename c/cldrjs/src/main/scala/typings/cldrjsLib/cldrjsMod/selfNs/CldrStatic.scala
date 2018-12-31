package typings
package cldrjsLib.cldrjsMod.selfNs

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
  var locale: java.lang.String = js.native
  @JSName("supplemental")
  var supplemental_Original: SupplementalStatic = js.native
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
  def get(path: java.lang.String): js.Any = js.native
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
  def get(paths: js.Array[java.lang.String]): js.Any = js.native
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
  def main(path: java.lang.String): js.Any = js.native
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
  def main(paths: js.Array[java.lang.String]): js.Any = js.native
  def off(
    event: java.lang.String,
    listener: js.Function2[/* path */ java.lang.String, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: java.lang.String,
    listener: js.Function2[/* path */ java.lang.String, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def once(
    event: java.lang.String,
    listener: js.Function2[/* path */ java.lang.String, /* value */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def supplemental(path: java.lang.String): js.Any = js.native
  def supplemental(paths: js.Array[java.lang.String]): js.Any = js.native
}

