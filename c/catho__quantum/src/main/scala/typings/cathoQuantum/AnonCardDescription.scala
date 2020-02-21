package typings.cathoQuantum

import typings.cathoQuantum.cathoQuantumStrings.CardDotDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardDescription extends js.Object {
  var displayName: CardDotDescription
}

object AnonCardDescription {
  @scala.inline
  def apply(displayName: CardDotDescription): AnonCardDescription = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCardDescription]
  }
}

