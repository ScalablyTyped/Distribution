package typings.blissfuljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Add extends js.Object {
  def add(name: String, callback: js.Function): Unit
  def run(name: String, env: js.Object): Unit
}

object Add {
  @scala.inline
  def apply(add: (String, js.Function) => Unit, run: (String, js.Object) => Unit): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[Add]
  }
}

