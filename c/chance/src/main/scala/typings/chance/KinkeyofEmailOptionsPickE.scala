package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof chance.Chance.EmailOptions ]: std.Pick<chance.Chance.EmailOptions, K>} */
trait KinkeyofEmailOptionsPickE extends js.Object {
  var domain: PickEmailOptionsdomain
  var length: PickEmailOptionslength
}

object KinkeyofEmailOptionsPickE {
  @scala.inline
  def apply(domain: PickEmailOptionsdomain, length: PickEmailOptionslength): KinkeyofEmailOptionsPickE = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinkeyofEmailOptionsPickE]
  }
}

