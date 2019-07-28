package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Check extends js.Object {
  def check(script: Buffer): Boolean
}

object Anon_Check {
  @scala.inline
  def apply(check: Buffer => Boolean): Anon_Check = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check))
  
    __obj.asInstanceOf[Anon_Check]
  }
}

