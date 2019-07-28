package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowIncomplete extends js.Object {
  def check(script: Buffer, allowIncomplete: Boolean): Boolean
}

object Anon_AllowIncomplete {
  @scala.inline
  def apply(check: (Buffer, Boolean) => Boolean): Anon_AllowIncomplete = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction2(check))
  
    __obj.asInstanceOf[Anon_AllowIncomplete]
  }
}

