package typings.chenfengyuanVueQrcode

import org.scalablytyped.runtime.Shortcut
import typings.chenfengyuanVueQrcode.anon.Color
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@chenfengyuan/vue-qrcode", JSImport.Namespace)
  @js.native
  val ^ : QrCodeConstructor = js.native
  
  @js.native
  trait QrCodeConstructor
    extends StObject
       with VueConstructor[Vue] {
    
    var methods: QrCodeMethods = js.native
    
    var props: QrCodePorps = js.native
    
    var watch: QrCodeWatch = js.native
  }
  
  trait QrCodeMethods extends StObject {
    
    // Generate QR code.
    def generate(): Unit
  }
  object QrCodeMethods {
    
    @scala.inline
    def apply(generate: () => Unit): QrCodeMethods = {
      val __obj = js.Dynamic.literal(generate = js.Any.fromFunction0(generate))
      __obj.asInstanceOf[QrCodeMethods]
    }
    
    @scala.inline
    implicit class QrCodeMethodsMutableBuilder[Self <: QrCodeMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenerate(value: () => Unit): Self = StObject.set(x, "generate", js.Any.fromFunction0(value))
    }
  }
  
  trait QrCodePorps extends StObject {
    
    // The options for the QR code generator.
    var options: Color
    
    // The tag name of the component's root element.
    var tag: String
    
    // The value of the QR code.
    var value: String | Null
  }
  object QrCodePorps {
    
    @scala.inline
    def apply(options: Color, tag: String): QrCodePorps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[QrCodePorps]
    }
    
    @scala.inline
    implicit class QrCodePorpsMutableBuilder[Self <: QrCodePorps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Color): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
  
  trait QrCodeWatch extends StObject {
    
    @JSName("$props")
    def $props(`val`: js.Any): Unit
  }
  object QrCodeWatch {
    
    @scala.inline
    def apply($props: js.Any => Unit): QrCodeWatch = {
      val __obj = js.Dynamic.literal($props = js.Any.fromFunction1($props))
      __obj.asInstanceOf[QrCodeWatch]
    }
    
    @scala.inline
    implicit class QrCodeWatchMutableBuilder[Self <: QrCodeWatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$props(value: js.Any => Unit): Self = StObject.set(x, "$props", js.Any.fromFunction1(value))
    }
  }
  
  type _To = QrCodeConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: QrCodeConstructor = ^
}
