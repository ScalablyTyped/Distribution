package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStringParseOptions extends js.Object {
  var skipLowerCase: scala.Boolean
}

object ConnectionStringParseOptions {
  @scala.inline
  def apply(skipLowerCase: scala.Boolean): ConnectionStringParseOptions = {
    val __obj = js.Dynamic.literal(skipLowerCase = skipLowerCase)
  
    __obj.asInstanceOf[ConnectionStringParseOptions]
  }
}

