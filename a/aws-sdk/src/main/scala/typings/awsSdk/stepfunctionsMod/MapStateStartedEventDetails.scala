package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStateStartedEventDetails extends StObject {
  
  /**
    * The size of the array for Map state iterations.
    */
  var length: js.UndefOr[UnsignedInteger] = js.undefined
}
object MapStateStartedEventDetails {
  
  @scala.inline
  def apply(): MapStateStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapStateStartedEventDetails]
  }
  
  @scala.inline
  implicit class MapStateStartedEventDetailsMutableBuilder[Self <: MapStateStartedEventDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: UnsignedInteger): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
  }
}
