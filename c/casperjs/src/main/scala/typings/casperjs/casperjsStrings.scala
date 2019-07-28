package typings.casperjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object casperjsStrings {
  @js.native
  sealed trait css extends js.Object
  
  @js.native
  sealed trait xpath extends js.Object
  
  @scala.inline
  def css: css = "css".asInstanceOf[css]
  @scala.inline
  def xpath: xpath = "xpath".asInstanceOf[xpath]
}

