package typings.cathoQuantum

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("@catho/quantum/Avatar", JSImport.Default)
  @js.native
  class default ()
    extends Component[AvatarProps, js.Object, js.Any]
  
  type Avatar = Component[AvatarProps, js.Object, js.Any]
  
  @js.native
  trait AvatarProps extends StObject {
    
    var hasNotification: js.UndefOr[Boolean] = js.native
    
    var hasToggle: js.UndefOr[Boolean] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var onClick: js.UndefOr[js.Function0[js.Object]] = js.native
    
    var picture: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object AvatarProps {
    
    @scala.inline
    def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit class AvatarPropsMutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasNotification(value: Boolean): Self = StObject.set(x, "hasNotification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasNotificationUndefined: Self = StObject.set(x, "hasNotification", js.undefined)
      
      @scala.inline
      def setHasToggle(value: Boolean): Self = StObject.set(x, "hasToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasToggleUndefined: Self = StObject.set(x, "hasToggle", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => js.Object): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
