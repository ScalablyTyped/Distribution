package typings
package blissfuljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Add extends js.Object {
  def add(name: java.lang.String, callback: js.Function): scala.Unit
  def run(name: java.lang.String, env: js.Object): scala.Unit
}

object Anon_Add {
  @scala.inline
  def apply(
    add: (java.lang.String, js.Function) => scala.Unit,
    run: (java.lang.String, js.Object) => scala.Unit
  ): Anon_Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), run = js.Any.fromFunction2(run))
  
    __obj.asInstanceOf[Anon_Add]
  }
}

