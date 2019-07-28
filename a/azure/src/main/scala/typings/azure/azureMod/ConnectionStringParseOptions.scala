package typings.azure.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStringParseOptions extends js.Object {
  var skipLowerCase: Boolean
}

object ConnectionStringParseOptions {
  @scala.inline
  def apply(skipLowerCase: Boolean): ConnectionStringParseOptions = {
    val __obj = js.Dynamic.literal(skipLowerCase = skipLowerCase)
  
    __obj.asInstanceOf[ConnectionStringParseOptions]
  }
}

