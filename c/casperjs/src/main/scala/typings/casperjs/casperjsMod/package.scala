package typings.casperjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object casperjsMod {
  type FunctionOnTimeout = js.ThisFunction2[/* this */ Casper, /* timeout */ Double, /* details */ js.Any, Unit]
  type FunctionThen = js.ThisFunction1[/* this */ Casper, /* response */ HttpResponse, Unit]
}
