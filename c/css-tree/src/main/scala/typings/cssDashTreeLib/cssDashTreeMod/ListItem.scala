package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem[TData] extends js.Object {
  var data: TData
  var next: ListItem[TData] | scala.Null
  var prev: ListItem[TData] | scala.Null
}

