package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var abbreviation: java.lang.String
  var name: java.lang.String
}

object Name {
  @scala.inline
  def apply(abbreviation: java.lang.String, name: java.lang.String): Name = {
    val __obj = js.Dynamic.literal(abbreviation = abbreviation, name = name)
  
    __obj.asInstanceOf[Name]
  }
}

