package typings.binaryDashParser.binaryDashParserMod.Parser

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceOptions extends Options {
  var choices: NumberDictionary[typings.binaryDashParser.binaryDashParserMod.Parser[_] | String]
  var defaultChoice: js.UndefOr[typings.binaryDashParser.binaryDashParserMod.Parser[_] | String] = js.undefined
  var tag: String | (js.ThisFunction0[/* this */ typings.binaryDashParser.binaryDashParserMod.Parser[_], Double])
}

object ChoiceOptions {
  @scala.inline
  def apply(
    choices: NumberDictionary[typings.binaryDashParser.binaryDashParserMod.Parser[_] | String],
    tag: String | (js.ThisFunction0[/* this */ typings.binaryDashParser.binaryDashParserMod.Parser[_], Double]),
    assert: String | Double | (js.Function1[/* value */ Data, Boolean]) = null,
    defaultChoice: typings.binaryDashParser.binaryDashParserMod.Parser[_] | String = null,
    formatter: /* value */ Data => _ = null
  ): ChoiceOptions = {
    val __obj = js.Dynamic.literal(choices = choices, tag = tag.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (defaultChoice != null) __obj.updateDynamic("defaultChoice")(defaultChoice.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1(formatter))
    __obj.asInstanceOf[ChoiceOptions]
  }
}

