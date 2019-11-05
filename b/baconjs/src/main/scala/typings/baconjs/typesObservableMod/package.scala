package typings.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesObservableMod {
  import typings.baconjs.typesDescribeMod.Desc
  import typings.baconjs.typesTypesMod.Subscribe

  type ObservableConstructor = js.Function2[/* description */ Desc, /* subscribe */ Subscribe[js.Any], Observable[js.Any]]
}
