package typings.atBlueprintjsTimezone

import typings.atBlueprintjsTimezone.libEsmComponentsTimezoneDashPickerTimezoneDisplayFormatMod.TimezoneDisplayFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atBlueprintjsTimezoneStrings {
  @js.native
  sealed trait abbreviation extends TimezoneDisplayFormat
  
  @js.native
  sealed trait composite extends TimezoneDisplayFormat
  
  @js.native
  sealed trait name extends TimezoneDisplayFormat
  
  @js.native
  sealed trait offset extends TimezoneDisplayFormat
  
  @scala.inline
  def abbreviation: abbreviation = "abbreviation".asInstanceOf[abbreviation]
  @scala.inline
  def composite: composite = "composite".asInstanceOf[composite]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def offset: offset = "offset".asInstanceOf[offset]
}

