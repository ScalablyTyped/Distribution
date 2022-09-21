package typings.channelIo

import typings.channelIo.ChannelIO.Profile
import typings.channelIo.ChannelIO.Tags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<channel-io.ChannelIO.UpdateUserOption> */
  trait PartialUpdateUserOption extends StObject {
    
    var language: js.UndefOr[String] = js.undefined
    
    var profile: js.UndefOr[Profile | Null] = js.undefined
    
    var profileOnce: js.UndefOr[Profile | Null] = js.undefined
    
    var tags: js.UndefOr[Tags | Null] = js.undefined
    
    var unsubscribeEmail: js.UndefOr[Boolean] = js.undefined
    
    var unsubscribeTexting: js.UndefOr[Boolean] = js.undefined
  }
  object PartialUpdateUserOption {
    
    inline def apply(): PartialUpdateUserOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialUpdateUserOption]
    }
    
    extension [Self <: PartialUpdateUserOption](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setProfile(value: Profile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileNull: Self = StObject.set(x, "profile", null)
      
      inline def setProfileOnce(value: Profile): Self = StObject.set(x, "profileOnce", value.asInstanceOf[js.Any])
      
      inline def setProfileOnceNull: Self = StObject.set(x, "profileOnce", null)
      
      inline def setProfileOnceUndefined: Self = StObject.set(x, "profileOnce", js.undefined)
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsNull: Self = StObject.set(x, "tags", null)
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setUnsubscribeEmail(value: Boolean): Self = StObject.set(x, "unsubscribeEmail", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeEmailUndefined: Self = StObject.set(x, "unsubscribeEmail", js.undefined)
      
      inline def setUnsubscribeTexting(value: Boolean): Self = StObject.set(x, "unsubscribeTexting", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeTextingUndefined: Self = StObject.set(x, "unsubscribeTexting", js.undefined)
    }
  }
}
