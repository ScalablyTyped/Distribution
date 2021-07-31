package typings.baseui

import typings.baseui.baseuiStrings.LARGE
import typings.baseui.baseuiStrings.MEDIUM
import typings.baseui.baseuiStrings.SMALL
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLLIElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  trait ARTWORK_SIZES extends StObject {
    
    var LARGE: typings.baseui.baseuiStrings.LARGE
    
    var MEDIUM: typings.baseui.baseuiStrings.MEDIUM
    
    var SMALL: typings.baseui.baseuiStrings.SMALL
  }
  object ARTWORK_SIZES {
    
    @JSImport("baseui/list", "ARTWORK_SIZES")
    @js.native
    val ^ : ARTWORK_SIZES = js.native
    
    @scala.inline
    implicit class ARTWORK_SIZESMutableBuilder[Self <: ARTWORK_SIZES] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLARGE(value: LARGE): Self = StObject.set(x, "LARGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEDIUM(value: MEDIUM): Self = StObject.set(x, "MEDIUM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMALL(value: SMALL): Self = StObject.set(x, "SMALL", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/list", "ListItem")
  @js.native
  val ListItem: ForwardRefExoticComponent[PropsT & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("baseui/list", "ListItemLabel")
  @js.native
  val ListItemLabel: FC[LabelPropsT] = js.native
  
  @JSImport("baseui/list", "MenuAdapter")
  @js.native
  val MenuAdapter: FC[MenuAdapterPropsT] = js.native
  
  @JSImport("baseui/list", "StyledArtworkContainer")
  @js.native
  val StyledArtworkContainer: StyletronComponent[StyledArtworkContainerPropsT] = js.native
  
  @JSImport("baseui/list", "StyledContent")
  @js.native
  val StyledContent: StyletronComponent[StyledContentPropsT] = js.native
  
  @JSImport("baseui/list", "StyledEndEnhancerContainer")
  @js.native
  val StyledEndEnhancerContainer: StyletronComponent[js.Object] = js.native
  
  @JSImport("baseui/list", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Object] = js.native
  
  /* Inlined baseui.baseui/list.ARTWORK_SIZES['SMALL'] | baseui.baseui/list.ARTWORK_SIZES['MEDIUM'] | baseui.baseui/list.ARTWORK_SIZES['LARGE'] */
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.SMALL
    - typings.baseui.baseuiStrings.MEDIUM
    - typings.baseui.baseuiStrings.LARGE
  */
  trait ArtworkSizesT extends StObject
  object ArtworkSizesT {
    
    @scala.inline
    def LARGE: typings.baseui.baseuiStrings.LARGE = "LARGE".asInstanceOf[typings.baseui.baseuiStrings.LARGE]
    
    @scala.inline
    def MEDIUM: typings.baseui.baseuiStrings.MEDIUM = "MEDIUM".asInstanceOf[typings.baseui.baseuiStrings.MEDIUM]
    
    @scala.inline
    def SMALL: typings.baseui.baseuiStrings.SMALL = "SMALL".asInstanceOf[typings.baseui.baseuiStrings.SMALL]
  }
  
  trait LabelPropsT extends StObject {
    
    var children: ReactNode
    
    var description: js.UndefOr[ReactNode] = js.undefined
    
    var sublist: js.UndefOr[Boolean] = js.undefined
  }
  object LabelPropsT {
    
    @scala.inline
    def apply(): LabelPropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelPropsT]
    }
    
    @scala.inline
    implicit class LabelPropsTMutableBuilder[Self <: LabelPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setSublist(value: Boolean): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSublistUndefined: Self = StObject.set(x, "sublist", js.undefined)
    }
  }
  
  trait ListOverrides extends StObject {
    
    var ArtworkContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any
      ] = js.undefined
    
    var Content: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any
      ] = js.undefined
    
    var EndEnhancerContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ] = js.undefined
  }
  object ListOverrides {
    
    @scala.inline
    def apply(): ListOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListOverrides]
    }
    
    @scala.inline
    implicit class ListOverridesMutableBuilder[Self <: ListOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtworkContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any
      ): Self = StObject.set(x, "ArtworkContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkContainerUndefined: Self = StObject.set(x, "ArtworkContainer", js.undefined)
      
      @scala.inline
      def setContent(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any
      ): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setEndEnhancerContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "EndEnhancerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerContainerUndefined: Self = StObject.set(x, "EndEnhancerContainer", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait MenuAdapterPropsT
    extends StObject
       with PropsT {
    
    @JSName("$disabled")
    var $disabled: Boolean
    
    @JSName("$isHighlighted")
    var $isHighlighted: Boolean
    
    @JSName("$size")
    var $size: String
    
    // eslint-disable-next-line flowtype/no-weak-types
    var item: js.Any
    
    def onClick(event: MouseEvent[HTMLLIElement, NativeMouseEvent]): js.Any
    
    def onMouseEnter(event: MouseEvent[HTMLLIElement, NativeMouseEvent]): js.Any
  }
  object MenuAdapterPropsT {
    
    @scala.inline
    def apply(
      $disabled: Boolean,
      $isHighlighted: Boolean,
      $size: String,
      item: js.Any,
      onClick: MouseEvent[HTMLLIElement, NativeMouseEvent] => js.Any,
      onMouseEnter: MouseEvent[HTMLLIElement, NativeMouseEvent] => js.Any
    ): MenuAdapterPropsT = {
      val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter))
      __obj.asInstanceOf[MenuAdapterPropsT]
    }
    
    @scala.inline
    implicit class MenuAdapterPropsTMutableBuilder[Self <: MenuAdapterPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLLIElement, NativeMouseEvent] => js.Any): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
    }
  }
  
  trait PropsT extends StObject {
    
    var artwork: js.UndefOr[ReactNode] = js.undefined
    
    var artworkSize: js.UndefOr[ArtworkSizesT | Double] = js.undefined
    
    var children: ReactNode
    
    var endEnhancer: js.UndefOr[ReactNode] = js.undefined
    
    var overrides: js.UndefOr[ListOverrides] = js.undefined
    
    var sublist: js.UndefOr[Boolean] = js.undefined
  }
  object PropsT {
    
    @scala.inline
    def apply(): PropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsT]
    }
    
    @scala.inline
    implicit class PropsTMutableBuilder[Self <: PropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtwork(value: ReactNode): Self = StObject.set(x, "artwork", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkSize(value: ArtworkSizesT | Double): Self = StObject.set(x, "artworkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtworkSizeUndefined: Self = StObject.set(x, "artworkSize", js.undefined)
      
      @scala.inline
      def setArtworkUndefined: Self = StObject.set(x, "artwork", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEndEnhancer(value: ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      @scala.inline
      def setOverrides(value: ListOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSublist(value: Boolean): Self = StObject.set(x, "sublist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSublistUndefined: Self = StObject.set(x, "sublist", js.undefined)
    }
  }
  
  trait StyledArtworkContainerPropsT extends StObject {
    
    @JSName("$artworkSize")
    var $artworkSize: ArtworkSizesT
    
    @JSName("$sublist")
    var $sublist: js.UndefOr[Boolean] = js.undefined
  }
  object StyledArtworkContainerPropsT {
    
    @scala.inline
    def apply($artworkSize: ArtworkSizesT): StyledArtworkContainerPropsT = {
      val __obj = js.Dynamic.literal($artworkSize = $artworkSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledArtworkContainerPropsT]
    }
    
    @scala.inline
    implicit class StyledArtworkContainerPropsTMutableBuilder[Self <: StyledArtworkContainerPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$artworkSize(value: ArtworkSizesT): Self = StObject.set(x, "$artworkSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sublist(value: Boolean): Self = StObject.set(x, "$sublist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sublistUndefined: Self = StObject.set(x, "$sublist", js.undefined)
    }
  }
  
  trait StyledContentPropsT extends StObject {
    
    @JSName("$mLeft")
    var $mLeft: Boolean
    
    @JSName("$sublist")
    var $sublist: Boolean
  }
  object StyledContentPropsT {
    
    @scala.inline
    def apply($mLeft: Boolean, $sublist: Boolean): StyledContentPropsT = {
      val __obj = js.Dynamic.literal($mLeft = $mLeft.asInstanceOf[js.Any], $sublist = $sublist.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledContentPropsT]
    }
    
    @scala.inline
    implicit class StyledContentPropsTMutableBuilder[Self <: StyledContentPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$mLeft(value: Boolean): Self = StObject.set(x, "$mLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$sublist(value: Boolean): Self = StObject.set(x, "$sublist", value.asInstanceOf[js.Any])
    }
  }
}
