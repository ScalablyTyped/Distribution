package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property extends js.Object {
  val basename: java.lang.String
  val custom: scala.Boolean
  val hack: java.lang.String
  val name: java.lang.String
  val prefix: java.lang.String
  val vendor: java.lang.String
}

object Property {
  @scala.inline
  def apply(
    basename: java.lang.String,
    custom: scala.Boolean,
    hack: java.lang.String,
    name: java.lang.String,
    prefix: java.lang.String,
    vendor: java.lang.String
  ): Property = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("basename")(basename)
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("hack")(hack)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("prefix")(prefix)
    __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[Property]
  }
}

