package typings.babelJest.mod

import typings.babelJest.babelJestBooleans.`true`
import typings.std.TransformStreamDefaultController
import typings.std.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelJestTransformer
  extends Transformer[js.Any, js.Any] {
  var canInstrument: `true`
}

object BabelJestTransformer {
  @scala.inline
  def apply(
    canInstrument: `true`,
    flush: /* controller */ TransformStreamDefaultController[js.Any] => Unit | js.Thenable[Unit] = null,
    start: /* controller */ TransformStreamDefaultController[js.Any] => Unit | js.Thenable[Unit] = null,
    transform: (js.Any, /* controller */ TransformStreamDefaultController[js.Any]) => Unit | js.Thenable[Unit] = null
  ): BabelJestTransformer = {
    val __obj = js.Dynamic.literal(canInstrument = canInstrument.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(js.Any.fromFunction1(flush))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1(start))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    __obj.asInstanceOf[BabelJestTransformer]
  }
}

