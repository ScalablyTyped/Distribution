package typings.cathoQuantum

import typings.cathoQuantum.anon.`13`
import typings.cathoQuantum.anon.`1`
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
  class default ()
    extends Component[SkeletonProps, js.Object, js.Any]
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
  
  type Skeleton = Component[SkeletonProps, js.Object, js.Any]
  
  type SkeletonButton = ComponentType[SkeletonButtonProps]
  
  trait SkeletonButtonProps extends StObject {
    
    var size: xsmall | small | medium | large
    
    var theme: `1`
  }
  object SkeletonButtonProps {
    
    inline def apply(size: xsmall | small | medium | large, theme: `1`): SkeletonButtonProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonButtonProps]
    }
    
    extension [Self <: SkeletonButtonProps](x: Self) {
      
      inline def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: `1`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type SkeletonCircle = ComponentType[js.Object]
  
  trait SkeletonProps extends StObject {
    
    var height: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large] = js.undefined
    
    var theme: js.UndefOr[`13`] = js.undefined
    
    var `type`: js.UndefOr[rect | circle | text | button | tag] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object SkeletonProps {
    
    inline def apply(): SkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonProps]
    }
    
    extension [Self <: SkeletonProps](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: `13`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: rect | circle | text | button | tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type SkeletonTag = ComponentType[SkeletonTagProps]
  
  trait SkeletonTagProps extends StObject {
    
    var size: xsmall | small | medium | large
    
    var theme: `13`
  }
  object SkeletonTagProps {
    
    inline def apply(size: xsmall | small | medium | large, theme: `13`): SkeletonTagProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTagProps]
    }
    
    extension [Self <: SkeletonTagProps](x: Self) {
      
      inline def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: `13`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type SkeletonText = ComponentType[js.Object]
}
