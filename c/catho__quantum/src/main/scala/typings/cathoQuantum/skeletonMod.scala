package typings.cathoQuantum

import typings.cathoQuantum.anon.`16`
import typings.cathoQuantum.anon.`17`
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.circle
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.rect
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.tag
import typings.cathoQuantum.cathoQuantumStrings.text
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("@catho/quantum/Skeleton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SkeletonProps, js.Object, Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Skeleton", "default.Button")
    @js.native
    def Button: SkeletonButton = js.native
    inline def Button_=(x: SkeletonButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Skeleton", "default.Circle")
    @js.native
    def Circle: SkeletonCircle = js.native
    inline def Circle_=(x: SkeletonCircle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Skeleton", "default.Tag")
    @js.native
    def Tag: SkeletonTag = js.native
    inline def Tag_=(x: SkeletonTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tag")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Skeleton", "default.Text")
    @js.native
    def Text: SkeletonText = js.native
    inline def Text_=(x: SkeletonText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  }
  
  type Skeleton = Component[SkeletonProps, js.Object, Any]
  
  type SkeletonButton = ComponentType[SkeletonButtonProps]
  
  trait SkeletonButtonProps extends StObject {
    
    var size: js.UndefOr[xsmall | small | medium | large] = js.undefined
    
    var theme: js.UndefOr[`17`] = js.undefined
  }
  object SkeletonButtonProps {
    
    inline def apply(): SkeletonButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkeletonButtonProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: `17`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type SkeletonCircle = ComponentType[js.Object]
  
  trait SkeletonProps extends StObject {
    
    var height: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large] = js.undefined
    
    var theme: js.UndefOr[`16`] = js.undefined
    
    var `type`: js.UndefOr[rect | circle | text | button | tag] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object SkeletonProps {
    
    inline def apply(): SkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkeletonProps] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: `16`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: rect | circle | text | button | tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type SkeletonTag = ComponentType[SkeletonTagProps]
  
  trait SkeletonTagProps extends StObject {
    
    var size: js.UndefOr[xsmall | small | medium | large] = js.undefined
    
    var theme: js.UndefOr[`16`] = js.undefined
  }
  object SkeletonTagProps {
    
    inline def apply(): SkeletonTagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonTagProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkeletonTagProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: `16`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type SkeletonText = ComponentType[SkeletonProps]
}
