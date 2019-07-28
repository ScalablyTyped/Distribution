package typings.cassandraDashDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ignore extends js.Object {
  var ignore: Double
  var rethrow: Double
  var retry: Double
}

object Anon_Ignore {
  @scala.inline
  def apply(ignore: Double, rethrow: Double, retry: Double): Anon_Ignore = {
    val __obj = js.Dynamic.literal(ignore = ignore, rethrow = rethrow, retry = retry)
  
    __obj.asInstanceOf[Anon_Ignore]
  }
}

