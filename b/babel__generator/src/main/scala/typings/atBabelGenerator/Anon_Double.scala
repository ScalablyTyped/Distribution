package typings.atBabelGenerator

import typings.atBabelGenerator.atBabelGeneratorStrings.double
import typings.atBabelGenerator.atBabelGeneratorStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Double extends js.Object {
  /**
    * The type of quote to use in the output. If omitted, autodetects based on `ast.tokens`.
    */
  var quotes: js.UndefOr[single | double] = js.undefined
  /**
    * When enabled, the output is a valid JavaScript string literal wrapped in quotes. The type of quotes can be specified through the quotes setting.
    * Defaults to `true`.
    */
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object Anon_Double {
  @scala.inline
  def apply(quotes: single | double = null, wrap: js.UndefOr[Boolean] = js.undefined): Anon_Double = {
    val __obj = js.Dynamic.literal()
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[Anon_Double]
  }
}

