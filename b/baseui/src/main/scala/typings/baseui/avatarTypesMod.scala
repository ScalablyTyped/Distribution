package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarTypesMod {
  
  trait AvatarOverrides extends StObject {
    
    var Avatar: js.UndefOr[Override[Any]] = js.undefined
    
    var Initials: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
  }
  object AvatarOverrides {
    
    inline def apply(): AvatarOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarOverrides] (val x: Self) extends AnyVal {
      
      inline def setAvatar(value: Override[Any]): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
      
      inline def setInitials(value: Override[Any]): Self = StObject.set(x, "Initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsUndefined: Self = StObject.set(x, "Initials", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait AvatarProps extends StObject {
    
    /** Bypasses initial generation from provided name with this value. */
    var initials: js.UndefOr[String] = js.undefined
    
    /** Defines an alternative text description of the image. */
    var name: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[AvatarOverrides] = js.undefined
    
    /** Defines the width/height of the image. Accepts labels from theme.sizing, or passes value to height/width. */
    var size: js.UndefOr[String] = js.undefined
    
    /** Image to display. */
    var src: js.UndefOr[String] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarProps] (val x: Self) extends AnyVal {
      
      inline def setInitials(value: String): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOverrides(value: AvatarOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  trait AvatarStyleProps extends StObject {
    
    @JSName("$didImageFailToLoad")
    var $didImageFailToLoad: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$imageLoaded")
    var $imageLoaded: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[String] = js.undefined
  }
  object AvatarStyleProps {
    
    inline def apply(): AvatarStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarStyleProps] (val x: Self) extends AnyVal {
      
      inline def set$didImageFailToLoad(value: Boolean): Self = StObject.set(x, "$didImageFailToLoad", value.asInstanceOf[js.Any])
      
      inline def set$didImageFailToLoadUndefined: Self = StObject.set(x, "$didImageFailToLoad", js.undefined)
      
      inline def set$imageLoaded(value: Boolean): Self = StObject.set(x, "$imageLoaded", value.asInstanceOf[js.Any])
      
      inline def set$imageLoadedUndefined: Self = StObject.set(x, "$imageLoaded", js.undefined)
      
      inline def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
  
  type InitialsStyleProps = js.Object
  
  trait RootStyleProps extends StObject {
    
    @JSName("$didImageFailToLoad")
    var $didImageFailToLoad: Boolean
    
    @JSName("$size")
    var $size: js.UndefOr[String] = js.undefined
  }
  object RootStyleProps {
    
    inline def apply($didImageFailToLoad: Boolean): RootStyleProps = {
      val __obj = js.Dynamic.literal($didImageFailToLoad = $didImageFailToLoad.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RootStyleProps] (val x: Self) extends AnyVal {
      
      inline def set$didImageFailToLoad(value: Boolean): Self = StObject.set(x, "$didImageFailToLoad", value.asInstanceOf[js.Any])
      
      inline def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
  
  type StyleProps = RootStyleProps
}
