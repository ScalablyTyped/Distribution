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
    
    inline def apply[T](): AvatarOverrides[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarOverrides[T]]
    }
    
    extension [Self <: AvatarOverrides[?], T](x: Self & AvatarOverrides[T]) {
      
      inline def setAvatar(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
      
      inline def setInitials(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsUndefined: Self = StObject.set(x, "Initials", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait AvatarProps extends StObject {
    
    var name: String
    
    var overrides: js.UndefOr[AvatarOverrides[StyleProps]] = js.undefined
    
    var size: js.UndefOr[String] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(name: String): AvatarProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOverrides(value: AvatarOverrides[StyleProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait AvatarState extends StObject {
    
    var noImageAvailable: Boolean
  }
  object AvatarState {
    
    inline def apply(noImageAvailable: Boolean): AvatarState = {
      val __obj = js.Dynamic.literal(noImageAvailable = noImageAvailable.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarState]
    }
    
    extension [Self <: AvatarState](x: Self) {
      
      inline def setNoImageAvailable(value: Boolean): Self = StObject.set(x, "noImageAvailable", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyleProps extends StObject {
    
    @JSName("$didImageFailToLoad")
    var $didImageFailToLoad: Boolean
    
    @JSName("$size")
    var $size: js.UndefOr[String] = js.undefined
  }
  object StyleProps {
    
    inline def apply($didImageFailToLoad: Boolean): StyleProps = {
      val __obj = js.Dynamic.literal($didImageFailToLoad = $didImageFailToLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleProps]
    }
    
    extension [Self <: StyleProps](x: Self) {
      
      inline def set$didImageFailToLoad(value: Boolean): Self = StObject.set(x, "$didImageFailToLoad", value.asInstanceOf[js.Any])
      
      inline def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
