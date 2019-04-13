package typings
package cldrjsLib.cldrjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name Attributes
  * @memberof cldr
  * @kind interface
  *
  * @description
  * The object created during instance initialization and used internally by .get()
  * to replace dynamic parts of an item path.
  */
trait Attributes extends js.Object {
  /**
    * @name language
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Language subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var language: js.Any
  /**
    * @name languageId
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Language Id {@link http://www.unicode.org/reports/tr35/#Unicode_language_identifier}
    */
  var languageId: js.Any
  /**
    * @name maxLanguageId
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Maximized Language Id {@link http://www.unicode.org/reports/tr35/#Likely_Subtags}
    */
  var maxLanguageId: js.Any
  /**
    * @name minLanguageId
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Minimized Language Id {@link http://www.unicode.org/reports/tr35/#Likely_Subtags}
    */
  var minLanguageId: js.Any
  /**
    * @name region
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Region subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var region: js.Any
  /**
    * @name script
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Script subtag {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var script: js.Any
  /**
    * @name territory
    * @memberof cldr.Attributes
    * @kind property
    * @access public
    *
    * @type {any}
    *
    * @description
    * Region subtag (territory variant) {@link http://www.unicode.org/reports/tr35/#Language_Locale_Field_Definitions}
    */
  var territory: js.Any
}

object Attributes {
  @scala.inline
  def apply(
    language: js.Any,
    languageId: js.Any,
    maxLanguageId: js.Any,
    minLanguageId: js.Any,
    region: js.Any,
    script: js.Any,
    territory: js.Any
  ): Attributes = {
    val __obj = js.Dynamic.literal(language = language, languageId = languageId, maxLanguageId = maxLanguageId, minLanguageId = minLanguageId, region = region, script = script, territory = territory)
  
    __obj.asInstanceOf[Attributes]
  }
}

