package typings.cleaveDotJs

import typings.cleaveDotJs.cleaveDotJsMod.^
import typings.cleaveDotJs.optionsCreditCardMod.CreditCardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cleave.js/options/creditCard", JSImport.Namespace)
@js.native
object optionsCreditCardMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.cleaveDotJs.cleaveDotJsStrings.amex
    - typings.cleaveDotJs.cleaveDotJsStrings.dankort
    - typings.cleaveDotJs.cleaveDotJsStrings.diners
    - typings.cleaveDotJs.cleaveDotJsStrings.discover
    - typings.cleaveDotJs.cleaveDotJsStrings.instapayment
    - typings.cleaveDotJs.cleaveDotJsStrings.jcb
    - typings.cleaveDotJs.cleaveDotJsStrings.maestro
    - typings.cleaveDotJs.cleaveDotJsStrings.mastercard
    - typings.cleaveDotJs.cleaveDotJsStrings.uatp
    - typings.cleaveDotJs.cleaveDotJsStrings.unknown
    - typings.cleaveDotJs.cleaveDotJsStrings.unionPay
    - typings.cleaveDotJs.cleaveDotJsStrings.mir
    - typings.cleaveDotJs.cleaveDotJsStrings.visa
  */
  trait CreditCardType extends js.Object
  
  type CreditCardTypeChangeHandler = js.ThisFunction1[/* this */ ^, /* type */ CreditCardType, Unit]
}

