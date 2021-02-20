package typings.bgiframe

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BgiFrame {
  
  @js.native
  trait IBgiframe extends StObject {
    
    def createIframe(): HTMLElement = js.native
    
    def fire(element: HTMLElement): Unit = js.native
    
    def getIframe(element: HTMLElement): HTMLElement = js.native
    
    def prop(n: js.Any): String = js.native
    
    var s: ISettings = js.native
  }
  object IBgiframe {
    
    @scala.inline
    def apply(
      createIframe: () => HTMLElement,
      fire: HTMLElement => Unit,
      getIframe: HTMLElement => HTMLElement,
      prop: js.Any => String,
      s: ISettings
    ): IBgiframe = {
      val __obj = js.Dynamic.literal(createIframe = js.Any.fromFunction0(createIframe), fire = js.Any.fromFunction1(fire), getIframe = js.Any.fromFunction1(getIframe), prop = js.Any.fromFunction1(prop), s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBgiframe]
    }
    
    @scala.inline
    implicit class IBgiframeMutableBuilder[Self <: IBgiframe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateIframe(value: () => HTMLElement): Self = StObject.set(x, "createIframe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFire(value: HTMLElement => Unit): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetIframe(value: HTMLElement => HTMLElement): Self = StObject.set(x, "getIframe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setProp(value: js.Any => String): Self = StObject.set(x, "prop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setS(value: ISettings): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISettings extends StObject {
    
    var conditional: Boolean = js.native
    
    var height: String = js.native
    
    var left: String = js.native
    
    var opacity: Boolean = js.native
    
    var src: String = js.native
    
    var top: String = js.native
    
    var width: String = js.native
  }
  object ISettings {
    
    @scala.inline
    def apply(
      conditional: Boolean,
      height: String,
      left: String,
      opacity: Boolean,
      src: String,
      top: String,
      width: String
    ): ISettings = {
      val __obj = js.Dynamic.literal(conditional = conditional.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISettings]
    }
    
    @scala.inline
    implicit class ISettingsMutableBuilder[Self <: ISettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditional(value: Boolean): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacity(value: Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
