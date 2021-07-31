package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.ref
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.ComponentType
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.LabelHTMLAttributes
import typings.react.mod.LiHTMLAttributes
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import typings.std.NonNullable
import typings.std.Omit
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsSharedMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.sm
    - typings.carbonComponentsReact.carbonComponentsReactStrings.lg
    - typings.carbonComponentsReact.carbonComponentsReactStrings.xl
  */
  trait CarbonInputSize extends StObject
  object CarbonInputSize {
    
    @scala.inline
    def lg: typings.carbonComponentsReact.carbonComponentsReactStrings.lg = "lg".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.lg]
    
    @scala.inline
    def sm: typings.carbonComponentsReact.carbonComponentsReactStrings.sm = "sm".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.sm]
    
    @scala.inline
    def xl: typings.carbonComponentsReact.carbonComponentsReactStrings.xl = "xl".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.xl]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.lg
    - typings.carbonComponentsReact.carbonComponentsReactStrings.sm
    - typings.carbonComponentsReact.carbonComponentsReactStrings.xs
  */
  trait CarbonSize extends StObject
  object CarbonSize {
    
    @scala.inline
    def lg: typings.carbonComponentsReact.carbonComponentsReactStrings.lg = "lg".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.lg]
    
    @scala.inline
    def sm: typings.carbonComponentsReact.carbonComponentsReactStrings.sm = "sm".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.sm]
    
    @scala.inline
    def xs: typings.carbonComponentsReact.carbonComponentsReactStrings.xs = "xs".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.xs]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.left
    - typings.carbonComponentsReact.carbonComponentsReactStrings.right
    - typings.carbonComponentsReact.carbonComponentsReactStrings.bottom
    - typings.carbonComponentsReact.carbonComponentsReactStrings.top
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def bottom: typings.carbonComponentsReact.carbonComponentsReactStrings.bottom = "bottom".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.bottom]
    
    @scala.inline
    def left: typings.carbonComponentsReact.carbonComponentsReactStrings.left = "left".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.left]
    
    @scala.inline
    def right: typings.carbonComponentsReact.carbonComponentsReactStrings.right = "right".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.right]
    
    @scala.inline
    def top: typings.carbonComponentsReact.carbonComponentsReactStrings.top = "top".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.top]
  }
  
  trait DownshiftTypedProps[ItemType] extends StObject {
    
    var itemToString: js.UndefOr[js.Function1[/* item */ ItemType, String]] = js.undefined
  }
  object DownshiftTypedProps {
    
    @scala.inline
    def apply[ItemType](): DownshiftTypedProps[ItemType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownshiftTypedProps[ItemType]]
    }
    
    @scala.inline
    implicit class DownshiftTypedPropsMutableBuilder[Self <: DownshiftTypedProps[?], ItemType] (val x: Self & DownshiftTypedProps[ItemType]) extends AnyVal {
      
      @scala.inline
      def setItemToString(value: /* item */ ItemType => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
    }
  }
  
  type FCProps[P] = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react.react.FC<P>>[0] */ js.Any
  
  type FCReturn = ReturnType[FC[js.Object]]
  
  type ForwardRefProps[T, P] = PropsWithoutRef[PropsWithChildren[P]] & RefAttributes[T]
  
  type ForwardRefReturn[T, P] = ForwardRefExoticComponent[ForwardRefProps[T, P]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.left
    - typings.carbonComponentsReact.carbonComponentsReactStrings.right
  */
  trait HorizontalDirection extends StObject
  object HorizontalDirection {
    
    @scala.inline
    def left: typings.carbonComponentsReact.carbonComponentsReactStrings.left = "left".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.left]
    
    @scala.inline
    def right: typings.carbonComponentsReact.carbonComponentsReactStrings.right = "right".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.right]
  }
  
  trait InternationalProps[MID] extends StObject {
    
    var translateWithId: js.UndefOr[js.Function1[/* messageId */ MID, String]] = js.undefined
  }
  object InternationalProps {
    
    @scala.inline
    def apply[MID](): InternationalProps[MID] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternationalProps[MID]]
    }
    
    @scala.inline
    implicit class InternationalPropsMutableBuilder[Self <: InternationalProps[?], MID] (val x: Self & InternationalProps[MID]) extends AnyVal {
      
      @scala.inline
      def setTranslateWithId(value: /* messageId */ MID => String): Self = StObject.set(x, "translateWithId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTranslateWithIdUndefined: Self = StObject.set(x, "translateWithId", js.undefined)
    }
  }
  
  type JSXIntrinsicElementProps[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, REF /* <: Boolean */] = (Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[K] */ js.Any, 
    ref
  ]) | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[K] */ js.Any)
  
  type ListBoxBaseItemType = js.Object | String
  
  trait MenuOffsetData extends StObject {
    
    var left: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object MenuOffsetData {
    
    @scala.inline
    def apply(): MenuOffsetData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuOffsetData]
    }
    
    @scala.inline
    implicit class MenuOffsetDataMutableBuilder[Self <: MenuOffsetData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  type Overwrite[T, U] = ((Omit[T, /* keyof U */ String]) & U) | U
  
  type ReactAnchorAttr[T] = AnchorHTMLAttributes[T]
  
  type ReactAttr[T] = HTMLAttributes[T]
  
  type ReactButtonAttr[T] = ButtonHTMLAttributes[T]
  
  type ReactCreateElementParam = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<carbon-components-react.anon.FnCall>[0] */ js.Any
  
  type ReactDivAttr = ReactAttr[HTMLDivElement]
  
  type ReactInputAttr[T] = InputHTMLAttributes[T]
  
  type ReactLIAttr[T] = LiHTMLAttributes[T]
  
  type ReactLabelAttr[T] = LabelHTMLAttributes[T]
  
  trait RenderIconProps[P] extends StObject {
    
    var renderIcon: js.UndefOr[ComponentType[P]] = js.undefined
  }
  object RenderIconProps {
    
    @scala.inline
    def apply[P](): RenderIconProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderIconProps[P]]
    }
    
    @scala.inline
    implicit class RenderIconPropsMutableBuilder[Self <: RenderIconProps[?], P] (val x: Self & RenderIconProps[P]) extends AnyVal {
      
      @scala.inline
      def setRenderIcon(value: ComponentType[P]): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
    }
  }
  
  trait RequiresChildrenProps[T] extends StObject {
    
    var children: NonNullable[T]
  }
  object RequiresChildrenProps {
    
    @scala.inline
    def apply[T](children: NonNullable[T]): RequiresChildrenProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiresChildrenProps[T]]
    }
    
    @scala.inline
    implicit class RequiresChildrenPropsMutableBuilder[Self <: RequiresChildrenProps[?], T] (val x: Self & RequiresChildrenProps[T]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: NonNullable[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequiresIdProps[T] extends StObject {
    
    var id: NonNullable[T]
  }
  object RequiresIdProps {
    
    @scala.inline
    def apply[T](id: NonNullable[T]): RequiresIdProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiresIdProps[T]]
    }
    
    @scala.inline
    implicit class RequiresIdPropsMutableBuilder[Self <: RequiresIdProps[?], T] (val x: Self & RequiresIdProps[T]) extends AnyVal {
      
      @scala.inline
      def setId(value: NonNullable[T]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type ShapeOf[B /* <: js.Object */, E /* <: js.Object */] = (E | js.Object) & B
  
  trait SideNavSharedProps extends StObject {
    
    var isSideNavExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object SideNavSharedProps {
    
    @scala.inline
    def apply(): SideNavSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavSharedProps]
    }
    
    @scala.inline
    implicit class SideNavSharedPropsMutableBuilder[Self <: SideNavSharedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSideNavExpanded(value: Boolean): Self = StObject.set(x, "isSideNavExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSideNavExpandedUndefined: Self = StObject.set(x, "isSideNavExpanded", js.undefined)
    }
  }
  
  trait SideNavSizingProps extends StObject {
    
    var large: js.UndefOr[Boolean] = js.undefined
  }
  object SideNavSizingProps {
    
    @scala.inline
    def apply(): SideNavSizingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavSizingProps]
    }
    
    @scala.inline
    implicit class SideNavSizingPropsMutableBuilder[Self <: SideNavSizingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    }
  }
  
  trait SizingProps extends StObject {
    
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object SizingProps {
    
    @scala.inline
    def apply(): SizingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizingProps]
    }
    
    @scala.inline
    implicit class SizingPropsMutableBuilder[Self <: SizingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.center
    - typings.carbonComponentsReact.carbonComponentsReactStrings.end
    - typings.carbonComponentsReact.carbonComponentsReactStrings.start
  */
  trait TooltipAlignment extends StObject
  object TooltipAlignment {
    
    @scala.inline
    def center: typings.carbonComponentsReact.carbonComponentsReactStrings.center = "center".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.center]
    
    @scala.inline
    def end: typings.carbonComponentsReact.carbonComponentsReactStrings.end = "end".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.end]
    
    @scala.inline
    def start: typings.carbonComponentsReact.carbonComponentsReactStrings.start = "start".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.start]
  }
  
  type TooltipPosition = Direction
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.bottom
    - typings.carbonComponentsReact.carbonComponentsReactStrings.top
  */
  trait VerticalDirection extends StObject
  object VerticalDirection {
    
    @scala.inline
    def bottom: typings.carbonComponentsReact.carbonComponentsReactStrings.bottom = "bottom".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.bottom]
    
    @scala.inline
    def top: typings.carbonComponentsReact.carbonComponentsReactStrings.top = "top".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.top]
  }
}
