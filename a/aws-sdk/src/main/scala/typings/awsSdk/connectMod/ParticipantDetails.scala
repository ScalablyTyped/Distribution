package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantDetails extends StObject {
  
  /**
    * Display name of the participant.
    */
  var DisplayName: typings.awsSdk.connectMod.DisplayName
}
object ParticipantDetails {
  
  @scala.inline
  def apply(DisplayName: DisplayName): ParticipantDetails = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantDetails]
  }
  
  @scala.inline
  implicit class ParticipantDetailsMutableBuilder[Self <: ParticipantDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: DisplayName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
  }
}
