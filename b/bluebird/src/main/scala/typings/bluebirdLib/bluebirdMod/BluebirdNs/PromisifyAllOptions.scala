package typings
package bluebirdLib.bluebirdMod.BluebirdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyAllOptions[T] extends PromisifyOptions {
  var filter: js.UndefOr[
    js.Function4[
      /* name */ java.lang.String, 
      /* func */ js.Function1[/* repeated */ js.Any, _], 
      /* target */ js.UndefOr[js.Any], 
      /* passesDefaultFilter */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ]
  ] = js.undefined
  // The promisifier gets a reference to the original method and should return a function which returns a promise
  var promisifier: js.UndefOr[
    js.ThisFunction2[
      /* this */ T, 
      /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultPromisifer */ js.Function1[
        /* repeated */ js.Any, 
        js.Function1[/* repeated */ _, bluebirdLib.bluebirdMod.Bluebird[_]]
      ], 
      js.Function0[js.Thenable[_]]
    ]
  ] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object PromisifyAllOptions {
  @scala.inline
  def apply[T](
    context: js.Any = null,
    filter: js.Function4[
      /* name */ java.lang.String, 
      /* func */ js.Function1[/* repeated */ js.Any, _], 
      /* target */ js.UndefOr[js.Any], 
      /* passesDefaultFilter */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ] = null,
    multiArgs: js.UndefOr[scala.Boolean] = js.undefined,
    promisifier: js.ThisFunction2[
      /* this */ T, 
      /* originalMethod */ js.Function1[/* repeated */ js.Any, _], 
      /* defaultPromisifer */ js.Function1[
        /* repeated */ js.Any, 
        js.Function1[/* repeated */ _, bluebirdLib.bluebirdMod.Bluebird[_]]
      ], 
      js.Function0[js.Thenable[_]]
    ] = null,
    suffix: java.lang.String = null
  ): PromisifyAllOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs)
    if (promisifier != null) __obj.updateDynamic("promisifier")(promisifier)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[PromisifyAllOptions[T]]
  }
}

