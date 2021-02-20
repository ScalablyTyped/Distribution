package typings.classValidator

import typings.classValidator.isIPMod.IsIpVersion
import typings.classValidator.isISBNMod.IsISBNVersion
import typings.classValidator.isUUIDMod.UUIDVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classValidatorStrings {
  
  @js.native
  sealed trait `10` extends IsISBNVersion
  @scala.inline
  def `10`: `10` = "10".asInstanceOf[`10`]
  
  @js.native
  sealed trait `13` extends IsISBNVersion
  @scala.inline
  def `13`: `13` = "13".asInstanceOf[`13`]
  
  @js.native
  sealed trait `3` extends UUIDVersion
  @scala.inline
  def `3`: `3` = "3".asInstanceOf[`3`]
  
  @js.native
  sealed trait `4`
    extends IsIpVersion
       with UUIDVersion
  @scala.inline
  def `4`: `4` = "4".asInstanceOf[`4`]
  
  @js.native
  sealed trait `5` extends UUIDVersion
  @scala.inline
  def `5`: `5` = "5".asInstanceOf[`5`]
  
  @js.native
  sealed trait `6` extends IsIpVersion
  @scala.inline
  def `6`: `6` = "6".asInstanceOf[`6`]
  
  @js.native
  sealed trait all extends UUIDVersion
  @scala.inline
  def all: all = "all".asInstanceOf[all]
}
