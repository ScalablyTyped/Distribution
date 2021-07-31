package typings.derhuerstCliOnKey

import typings.node.processMod.global.NodeJS.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(stream: ReadStream, callback: Callback): OffKeyPress = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[OffKeyPress]
  
  @JSImport("@derhuerst/cli-on-key", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* key */ Key, Unit]
  
  trait Key extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var ctrl: Boolean
    
    var meta: Boolean
    
    var name: js.UndefOr[String] = js.undefined
    
    // ansi code leaving out leading \x1b's
    var raw: String
    
    var sequence: String
    
    var shift: Boolean
  }
  object Key {
    
    @scala.inline
    def apply(ctrl: Boolean, meta: Boolean, raw: String, sequence: String, shift: Boolean): Key = {
      val __obj = js.Dynamic.literal(ctrl = ctrl.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setCtrl(value: Boolean): Self = StObject.set(x, "ctrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
    }
  }
  
  type OffKeyPress = js.Function1[/* key */ Key, Unit]
}
