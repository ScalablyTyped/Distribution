package typings
package binaryDashParserLib.binaryDashParserMod.ParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceOptions extends Options {
  var choices: org.scalablytyped.runtime.NumberDictionary[binaryDashParserLib.binaryDashParserMod.Parser[_] | java.lang.String]
  var defaultChoice: js.UndefOr[binaryDashParserLib.binaryDashParserMod.Parser[_] | java.lang.String] = js.undefined
  var tag: java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double])
}

object ChoiceOptions {
  @scala.inline
  def apply(
    choices: org.scalablytyped.runtime.NumberDictionary[binaryDashParserLib.binaryDashParserMod.Parser[_] | java.lang.String],
    tag: java.lang.String | (js.ThisFunction0[/* this */ binaryDashParserLib.binaryDashParserMod.Parser[_], scala.Double]),
    assert: java.lang.String | scala.Double | (js.Function1[/* value */ Data, scala.Boolean]) = null,
    defaultChoice: binaryDashParserLib.binaryDashParserMod.Parser[_] | java.lang.String = null,
    formatter: js.Function1[/* value */ Data, _] = null
  ): ChoiceOptions = {
    val __obj = js.Dynamic.literal(choices = choices, tag = tag.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (defaultChoice != null) __obj.updateDynamic("defaultChoice")(defaultChoice.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    __obj.asInstanceOf[ChoiceOptions]
  }
}

