package typings.bemCn

import typings.bemCn.mod.BemStatePrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bemCnStrings {
  @js.native
  sealed trait `has-` extends BemStatePrefix
  
  @js.native
  sealed trait `is-` extends BemStatePrefix
  
  @scala.inline
  def `has-`: `has-` = "has-".asInstanceOf[`has-`]
  @scala.inline
  def `is-`: `is-` = "is-".asInstanceOf[`is-`]
}

