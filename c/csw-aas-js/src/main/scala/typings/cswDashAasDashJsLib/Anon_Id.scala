package typings
package cswDashAasDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  def onClick(): scala.Unit
}

object Anon_Id {
  @scala.inline
  def apply(id: java.lang.String, onClick: () => scala.Unit): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, onClick = js.Any.fromFunction0(onClick))
  
    __obj.asInstanceOf[Anon_Id]
  }
}

