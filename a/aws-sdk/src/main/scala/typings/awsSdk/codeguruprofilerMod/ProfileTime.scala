package typings.awsSdk.codeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfileTime extends StObject {
  
  /**
    * The start time of a profile. It is specified using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.
    */
  var start: js.UndefOr[Timestamp] = js.native
}
object ProfileTime {
  
  @scala.inline
  def apply(): ProfileTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileTime]
  }
  
  @scala.inline
  implicit class ProfileTimeMutableBuilder[Self <: ProfileTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStart(value: Timestamp): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
