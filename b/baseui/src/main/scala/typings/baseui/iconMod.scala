package typings.baseui

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("baseui/icon", "Alert")
  @js.native
  val Alert: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ArrowDown")
  @js.native
  val ArrowDown: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ArrowLeft")
  @js.native
  val ArrowLeft: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ArrowRight")
  @js.native
  val ArrowRight: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ArrowUp")
  @js.native
  val ArrowUp: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Blank")
  @js.native
  val Blank: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Check")
  @js.native
  val Check: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "CheckIndeterminate")
  @js.native
  val CheckIndeterminate: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ChevronDown")
  @js.native
  val ChevronDown: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ChevronLeft")
  @js.native
  val ChevronLeft: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ChevronRight")
  @js.native
  val ChevronRight: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "ChevronUp")
  @js.native
  val ChevronUp: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Delete")
  @js.native
  val Delete: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "DeleteAlt")
  @js.native
  val DeleteAlt: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Filter")
  @js.native
  val Filter: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Grab")
  @js.native
  val Grab: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Hide")
  @js.native
  val Hide: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Icon")
  @js.native
  val Icon: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Menu")
  @js.native
  val Menu: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Overflow")
  @js.native
  val Overflow: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Plus")
  @js.native
  val Plus: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Search")
  @js.native
  val Search: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Show")
  @js.native
  val Show: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Spinner")
  @js.native
  val Spinner: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "StyledSvg")
  @js.native
  val StyledSvg: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/icon", "TriangleDown")
  @js.native
  val TriangleDown: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "TriangleLeft")
  @js.native
  val TriangleLeft: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "TriangleRight")
  @js.native
  val TriangleRight: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "TriangleUp")
  @js.native
  val TriangleUp: FC[IconProps] = js.native
  
  @JSImport("baseui/icon", "Upload")
  @js.native
  val Upload: FC[IconProps] = js.native
  
  trait IconOverrides extends StObject {
    
    var Svg: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledComponentArgsT> */ js.Any
      ] = js.undefined
  }
  object IconOverrides {
    
    inline def apply(): IconOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOverrides]
    }
    
    extension [Self <: IconOverrides](x: Self) {
      
      inline def setSvg(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledComponentArgsT> */ js.Any
      ): Self = StObject.set(x, "Svg", value.asInstanceOf[js.Any])
      
      inline def setSvgUndefined: Self = StObject.set(x, "Svg", js.undefined)
    }
  }
  
  trait IconProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[IconOverrides] = js.undefined
    
    var size: js.UndefOr[Double | String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object IconProps {
    
    inline def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOverrides(value: IconOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait StyledComponentArgsT extends StObject {
    
    @JSName("$color")
    var $color: js.UndefOr[String] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[Double | String] = js.undefined
  }
  object StyledComponentArgsT {
    
    inline def apply(): StyledComponentArgsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledComponentArgsT]
    }
    
    extension [Self <: StyledComponentArgsT](x: Self) {
      
      inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
      
      inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
      
      inline def set$size(value: Double | String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
