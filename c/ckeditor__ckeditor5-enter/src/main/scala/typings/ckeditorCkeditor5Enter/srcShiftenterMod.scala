package typings.ckeditorCkeditor5Enter

import typings.std.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcShiftenterMod {
  
  @JSImport("@ckeditor/ckeditor5-enter/src/shiftenter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ShiftEnter
  /* static members */
  object default {
    
    @JSImport("@ckeditor/ckeditor5-enter/src/shiftenter", "default.pluginName")
    @js.native
    val pluginName: typings.ckeditorCkeditor5Enter.ckeditorCkeditor5EnterStrings.ShiftEnter = js.native
  }
  
  @js.native
  trait ShiftEnter
    extends StObject
       with Plugin {
    
    def init(): Unit = js.native
  }
  
  /* augmented module */
  object ckeditorCkeditor5CoreSrcPlugincollectionAugmentingMod {
    
    trait Plugins extends StObject {
      
      var ShiftEnter: typings.ckeditorCkeditor5Enter.srcShiftenterMod.ShiftEnter
    }
    object Plugins {
      
      inline def apply(ShiftEnter: ShiftEnter): Plugins = {
        val __obj = js.Dynamic.literal(ShiftEnter = ShiftEnter.asInstanceOf[js.Any])
        __obj.asInstanceOf[Plugins]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Plugins] (val x: Self) extends AnyVal {
        
        inline def setShiftEnter(value: ShiftEnter): Self = StObject.set(x, "ShiftEnter", value.asInstanceOf[js.Any])
      }
    }
  }
}
