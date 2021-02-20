package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.new_note_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NEWNOTE extends StObject {
  
  var NEW_NOTE: new_note_ = js.native
}
object NEWNOTE {
  
  @scala.inline
  def apply(NEW_NOTE: new_note_): NEWNOTE = {
    val __obj = js.Dynamic.literal(NEW_NOTE = NEW_NOTE.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEWNOTE]
  }
  
  @scala.inline
  implicit class NEWNOTEMutableBuilder[Self <: NEWNOTE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNEW_NOTE(value: new_note_): Self = StObject.set(x, "NEW_NOTE", value.asInstanceOf[js.Any])
  }
}
