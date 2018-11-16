package typings
package casperjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object casperjsMod {
  type FunctionOnTimeout = js.ThisFunction2[/* this */ Casper, /* timeout */ scala.Double, /* details */ js.Any, scala.Unit]
  type FunctionThen = js.ThisFunction1[/* this */ Casper, /* response */ HttpResponse, scala.Unit]
}
