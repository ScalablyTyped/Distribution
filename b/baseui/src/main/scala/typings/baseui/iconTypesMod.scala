package typings.baseui

import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconTypesMod {
  
  type Color = String
  
  trait IconOverrides extends StObject {
    
    var Svg: js.UndefOr[Override[Any]] = js.undefined
  }
  object IconOverrides {
    
    inline def apply(): IconOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconOverrides] (val x: Self) extends AnyVal {
      
      inline def setSvg(value: Override[Any]): Self = StObject.set(x, "Svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "Svg", js.undefined)
    }
  }
  
  trait IconProps
    extends StObject
       with SVGAttributes[SVGElement]
       with StyledComponentArgs {
    
    /** Color of icon, will be used as svg fill */
    @JSName("color")
    var color_IconProps: js.UndefOr[Color] = js.undefined
    
    var overrides: js.UndefOr[IconOverrides] = js.undefined
    
    /** Size of element, will be passed to the svg width/height style. Can also be a value included in */
    var size: js.UndefOr[Size] = js.undefined
    
    /** Allows you to set the SVG `<title>` label, which is used for accessibility */
    var title: js.UndefOr[String] = js.undefined
  }
  object IconProps {
    
    inline def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOverrides(value: IconOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type Size = Double | String
  
  trait StyledComponentArgs extends StObject {
    
    @JSName("$color")
    var $color: js.UndefOr[Color] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[Size] = js.undefined
  }
  object StyledComponentArgs {
    
    inline def apply(): StyledComponentArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledComponentArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyledComponentArgs] (val x: Self) extends AnyVal {
      
      inline def set$color(value: Color): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
      
      inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
