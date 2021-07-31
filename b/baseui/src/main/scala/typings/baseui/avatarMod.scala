package typings.baseui

import typings.react.mod.Component
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("baseui/avatar", "Avatar")
  @js.native
  class Avatar protected ()
    extends Component[AvatarProps, AvatarState, js.Any] {
    def this(props: AvatarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AvatarProps, context: js.Any) = this()
    
    def handleError(): Unit = js.native
  }
  
  @JSImport("baseui/avatar", "StyledAvatar")
  @js.native
  val StyledAvatar: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/avatar", "StyledInitials")
  @js.native
  val StyledInitials: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/avatar", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  trait AvatarOverrides[T] extends StObject {
    
    var Avatar: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var Initials: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ] = js.undefined
  }
  object AvatarOverrides {
    
    @scala.inline
    def apply[T](): AvatarOverrides[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarOverrides[T]]
    }
    
    @scala.inline
    implicit class AvatarOverridesMutableBuilder[Self <: AvatarOverrides[?], T] (val x: Self & AvatarOverrides[T]) extends AnyVal {
      
      @scala.inline
      def setAvatar(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
      
      @scala.inline
      def setInitials(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialsUndefined: Self = StObject.set(x, "Initials", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait AvatarProps extends StObject {
    
    var name: String
    
    var overrides: js.UndefOr[AvatarOverrides[StyleProps]] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    @scala.inline
    def apply(name: String): AvatarProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit class AvatarPropsMutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrides(value: AvatarOverrides[StyleProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait AvatarState extends StObject {
    
    var noImageAvailable: Boolean
  }
  object AvatarState {
    
    @scala.inline
    def apply(noImageAvailable: Boolean): AvatarState = {
      val __obj = js.Dynamic.literal(noImageAvailable = noImageAvailable.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarState]
    }
    
    @scala.inline
    implicit class AvatarStateMutableBuilder[Self <: AvatarState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoImageAvailable(value: Boolean): Self = StObject.set(x, "noImageAvailable", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleProps extends StObject {
    
    @JSName("$didImageFailToLoad")
    var $didImageFailToLoad: Boolean
    
    @JSName("$size")
    var $size: js.UndefOr[String] = js.undefined
  }
  object StyleProps {
    
    @scala.inline
    def apply($didImageFailToLoad: Boolean): StyleProps = {
      val __obj = js.Dynamic.literal($didImageFailToLoad = $didImageFailToLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleProps]
    }
    
    @scala.inline
    implicit class StylePropsMutableBuilder[Self <: StyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$didImageFailToLoad(value: Boolean): Self = StObject.set(x, "$didImageFailToLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
