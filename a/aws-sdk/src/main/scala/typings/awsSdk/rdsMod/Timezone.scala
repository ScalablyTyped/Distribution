package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timezone extends StObject {
  
  /**
    * The name of the time zone.
    */
  var TimezoneName: js.UndefOr[String] = js.native
}
object Timezone {
  
  @scala.inline
  def apply(): Timezone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timezone]
  }
  
  @scala.inline
  implicit class TimezoneMutableBuilder[Self <: Timezone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimezoneName(value: String): Self = StObject.set(x, "TimezoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneNameUndefined: Self = StObject.set(x, "TimezoneName", js.undefined)
  }
}
