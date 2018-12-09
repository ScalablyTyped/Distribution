package typings
package bluebirdDashLstLib.bluebirdDashLstMod.BluebirdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromisifyAllOptions extends PromisifyOptions {
  var filter: js.UndefOr[
    js.Function4[
      /* name */ java.lang.String, 
      /* func */ js.Function1[/* repeated */js.Any, _], 
      /* target */ js.UndefOr[js.Any], 
      /* passesDefaultFilter */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ]
  ] = js.undefined
  // The promisifier gets a reference to the original method and should return a function which returns a promise
  var promisifier: js.UndefOr[
    js.Function2[
      /* originalMethod */ js.Function1[/* repeated */js.Any, _], 
      /* defaultPromisifer */ js.Function1[
        /* repeated */js.Any, 
        js.Function1[/* repeated */_, bluebirdDashLstLib.bluebirdDashLstMod.Bluebird[_]]
      ], 
      js.Function0[js.Thenable[_]]
    ]
  ] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

