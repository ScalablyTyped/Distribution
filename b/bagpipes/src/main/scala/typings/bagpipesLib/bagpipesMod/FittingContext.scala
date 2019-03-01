package typings
package bagpipesLib.bagpipesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FittingContext
  extends /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * The input defined in the fitting definition
    * (string, number, object, array)
    */
  var input: js.Any
  /** Output to be delivered to the next fitting or client */
  var output: js.Any
}

object FittingContext {
  @scala.inline
  def apply(
    input: js.Any,
    output: js.Any,
    StringDictionary: /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): FittingContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    __obj.updateDynamic("output")(output)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FittingContext]
  }
}

