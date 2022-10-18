package typings.baseui

import typings.baseui.anon.IsText
import typings.baseui.anon.itemanyundefinedonMouseEn
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.p
import typings.baseui.listTypesMod.ArtworkSizes
import typings.baseui.listTypesMod.HeadingProps
import typings.baseui.listTypesMod.LabelProps
import typings.baseui.listTypesMod.ListProps
import typings.baseui.listTypesMod.MenuAdapterProps
import typings.baseui.listTypesMod.Shape
import typings.baseui.listTypesMod.StyledArtworkContainerProps
import typings.baseui.listTypesMod.StyledContentProps
import typings.baseui.listTypesMod.StyledHeadingHeadingProps
import typings.baseui.listTypesMod.StyledRootProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLLIElement
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("baseui/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ARTWORK_SIZES {
    
    @JSImport("baseui/list", "ARTWORK_SIZES.LARGE")
    @js.native
    val LARGE: typings.baseui.baseuiStrings.LARGE = js.native
    
    @JSImport("baseui/list", "ARTWORK_SIZES.MEDIUM")
    @js.native
    val MEDIUM: typings.baseui.baseuiStrings.MEDIUM = js.native
    
    @JSImport("baseui/list", "ARTWORK_SIZES.SMALL")
    @js.native
    val SMALL: typings.baseui.baseuiStrings.SMALL = js.native
  }
  
  @JSImport("baseui/list", "ListHeading")
  @js.native
  val ListHeading: ForwardRefExoticComponent[HeadingProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("baseui/list", "ListItem")
  @js.native
  val ListItem: ForwardRefExoticComponent[ListProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def ListItemLabel(props: LabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemLabel")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/list", "MenuAdapter")
  @js.native
  val MenuAdapter: ForwardRefExoticComponent[itemanyundefinedonMouseEn] = js.native
  
  object SHAPE {
    
    @JSImport("baseui/list", "SHAPE.DEFAULT")
    @js.native
    val DEFAULT: typings.baseui.baseuiStrings.DEFAULT = js.native
    
    @JSImport("baseui/list", "SHAPE.ROUND")
    @js.native
    val ROUND: typings.baseui.baseuiStrings.ROUND = js.native
  }
  
  @JSImport("baseui/list", "StyledArtworkContainer")
  @js.native
  val StyledArtworkContainer: StyletronComponent[div, StyledArtworkContainerProps] = js.native
  
  @JSImport("baseui/list", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[div, StyledContentProps] = js.native
  
  @JSImport("baseui/list", "StyledEndEnhancerContainer")
  @js.native
  val StyledEndEnhancerContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/list", "StyledHeadingContent")
  @js.native
  val StyledHeadingContent: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/list", "StyledHeadingContentRow")
  @js.native
  val StyledHeadingContentRow: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/list", "StyledHeadingEndEnhancerContainer")
  @js.native
  val StyledHeadingEndEnhancerContainer: StyletronComponent[div, IsText] = js.native
  
  @JSImport("baseui/list", "StyledHeadingEndEnhancerDescriptionContainer")
  @js.native
  val StyledHeadingEndEnhancerDescriptionContainer: StyletronComponent[p, js.Object] = js.native
  
  @JSImport("baseui/list", "StyledHeadingMainHeading")
  @js.native
  val StyledHeadingMainHeading: StyletronComponent[p, StyledHeadingHeadingProps] = js.native
  
  @JSImport("baseui/list", "StyledHeadingRoot")
  @js.native
  val StyledHeadingRoot: StyletronComponent[div, StyledRootProps] = js.native
  
  @JSImport("baseui/list", "StyledHeadingSubHeading")
  @js.native
  val StyledHeadingSubHeading: StyletronComponent[p, StyledHeadingHeadingProps] = js.native
  
  @JSImport("baseui/list", "StyledLabelContent")
  @js.native
  val StyledLabelContent: StyletronComponent[p, js.Object] = js.native
  
  @JSImport("baseui/list", "StyledLabelDescription")
  @js.native
  val StyledLabelDescription: StyletronComponent[p, js.Object] = js.native
  
  @JSImport("baseui/list", "StyledLabelSublistContent")
  @js.native
  val StyledLabelSublistContent: StyletronComponent[p, js.Object] = js.native
  
  @JSImport("baseui/list", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[li_, StyledRootProps] = js.native
  
  type ArtworkSizesT = ArtworkSizes
  
  type HeadingPropsT = HeadingProps
  
  type LabelPropsT = LabelProps
  
  type MenuAdapterPropsT = MenuAdapterProps
  
  type PropsT = ListProps
  
  type ShapeT = Shape
  
  type StyledArtworkContainerPropsT = StyledArtworkContainerProps
  
  type StyledContentPropsT = StyledContentProps
  
  trait StyledHeadingEndEnhancerContainerPropsT extends StObject {
    
    @JSName("$isText")
    var $isText: Boolean
  }
  object StyledHeadingEndEnhancerContainerPropsT {
    
    inline def apply($isText: Boolean): StyledHeadingEndEnhancerContainerPropsT = {
      val __obj = js.Dynamic.literal($isText = $isText.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledHeadingEndEnhancerContainerPropsT]
    }
    
    extension [Self <: StyledHeadingEndEnhancerContainerPropsT](x: Self) {
      
      inline def set$isText(value: Boolean): Self = StObject.set(x, "$isText", value.asInstanceOf[js.Any])
    }
  }
  
  type StyledHeadingHeadingPropsT = StyledHeadingHeadingProps
  
  type StyledRootPropsT = StyledRootProps
}
