package typings.dbDotJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescableQuery[T] extends js.Object {
  def desc(): DescQuery[T]
}

object DescableQuery {
  @scala.inline
  def apply[T](desc: () => DescQuery[T]): DescableQuery[T] = {
    val __obj = js.Dynamic.literal(desc = js.Any.fromFunction0(desc))
  
    __obj.asInstanceOf[DescableQuery[T]]
  }
}

