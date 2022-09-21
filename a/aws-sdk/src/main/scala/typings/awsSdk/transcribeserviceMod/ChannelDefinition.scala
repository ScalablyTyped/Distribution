package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelDefinition extends StObject {
  
  /**
    * Specify the audio channel you want to define.
    */
  var ChannelId: js.UndefOr[typings.awsSdk.transcribeserviceMod.ChannelId] = js.undefined
  
  /**
    * Specify the speaker you want to define. Omitting this parameter is equivalent to specifying both participants.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.transcribeserviceMod.ParticipantRole] = js.undefined
}
object ChannelDefinition {
  
  inline def apply(): ChannelDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelDefinition]
  }
  
  extension [Self <: ChannelDefinition](x: Self) {
    
    inline def setChannelId(value: ChannelId): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setChannelIdUndefined: Self = StObject.set(x, "ChannelId", js.undefined)
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
  }
}
