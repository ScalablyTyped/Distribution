package typings.carbonComponentsReact

import org.scalablytyped.runtime.Instantiable1
import typings.carbonComponentsReact.carbonComponentsReactStrings.ref
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.Component
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
    
    inline def lg: typings.carbonComponentsReact.carbonComponentsReactStrings.lg = "lg".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.lg]
    
    inline def sm: typings.carbonComponentsReact.carbonComponentsReactStrings.sm = "sm".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.sm]
    
    inline def xl: typings.carbonComponentsReact.carbonComponentsReactStrings.xl = "xl".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.xl]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.lg
    - typings.carbonComponentsReact.carbonComponentsReactStrings.sm
    - typings.carbonComponentsReact.carbonComponentsReactStrings.xs
  */
  trait CarbonSize extends StObject
  object CarbonSize {
    
    inline def lg: typings.carbonComponentsReact.carbonComponentsReactStrings.lg = "lg".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.lg]
    
    inline def sm: typings.carbonComponentsReact.carbonComponentsReactStrings.sm = "sm".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.sm]
    
    inline def xs: typings.carbonComponentsReact.carbonComponentsReactStrings.xs = "xs".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.xs]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.left
    - typings.carbonComponentsReact.carbonComponentsReactStrings.right
    - typings.carbonComponentsReact.carbonComponentsReactStrings.bottom
    - typings.carbonComponentsReact.carbonComponentsReactStrings.top
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottom: typings.carbonComponentsReact.carbonComponentsReactStrings.bottom = "bottom".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.bottom]
    
    inline def left: typings.carbonComponentsReact.carbonComponentsReactStrings.left = "left".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.left]
    
    inline def right: typings.carbonComponentsReact.carbonComponentsReactStrings.right = "right".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.right]
    
    inline def top: typings.carbonComponentsReact.carbonComponentsReactStrings.top = "top".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.top]
  }
  
  trait DownshiftTypedProps[ItemType] extends StObject {
    
    var itemToString: js.UndefOr[js.Function1[/* item */ ItemType, String]] = js.undefined
  }
  object DownshiftTypedProps {
    
    inline def apply[ItemType](): DownshiftTypedProps[ItemType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownshiftTypedProps[ItemType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownshiftTypedProps[?], ItemType] (val x: Self & DownshiftTypedProps[ItemType]) extends AnyVal {
      
      inline def setItemToString(value: /* item */ ItemType => String): Self = StObject.set(x, "itemToString", js.Any.fromFunction1(value))
      
      inline def setItemToStringUndefined: Self = StObject.set(x, "itemToString", js.undefined)
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
    
    inline def left: typings.carbonComponentsReact.carbonComponentsReactStrings.left = "left".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.left]
    
    inline def right: typings.carbonComponentsReact.carbonComponentsReactStrings.right = "right".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.right]
  }
  
  trait InternationalProps[MID, ARGS] extends StObject {
    
    var translateWithId: js.UndefOr[js.Function2[/* messageId */ MID, /* args */ js.UndefOr[ARGS], String]] = js.undefined
  }
  object InternationalProps {
    
    inline def apply[MID, ARGS](): InternationalProps[MID, ARGS] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InternationalProps[MID, ARGS]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternationalProps[?, ?], MID, ARGS] (val x: Self & (InternationalProps[MID, ARGS])) extends AnyVal {
      
      inline def setTranslateWithId(value: (/* messageId */ MID, /* args */ js.UndefOr[ARGS]) => String): Self = StObject.set(x, "translateWithId", js.Any.fromFunction2(value))
      
      inline def setTranslateWithIdUndefined: Self = StObject.set(x, "translateWithId", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    REF extends true ? react.react.<global>.JSX.IntrinsicElements[K] : std.Omit<react.react.<global>.JSX.IntrinsicElements[K], 'ref'>
    }}}
    */
  type JSXIntrinsicElementProps[K /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175, starting with typings.carbonComponentsReact.carbonComponentsReactStrings.a, typings.carbonComponentsReact.carbonComponentsReactStrings.abbr, typings.carbonComponentsReact.carbonComponentsReactStrings.address */ Any */, REF /* <: Boolean */] = Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[K] */ js.Any, 
    ref
  ]
  
  type ListBoxBaseItemType = js.Object | String
  
  trait MenuOffsetData extends StObject {
    
    var left: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object MenuOffsetData {
    
    inline def apply(): MenuOffsetData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuOffsetData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuOffsetData] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [never] ? U : std.Omit<T, keyof U> & U
    }}}
    */
  type Overwrite[T, U] = U
  
  type ReactAnchorAttr[T] = AnchorHTMLAttributes[T]
  
  type ReactAttr[T] = HTMLAttributes[T]
  
  type ReactButtonAttr[T] = ButtonHTMLAttributes[T]
  
  type ReactComponentConstructor[P] = (js.Function1[/* props */ P, FCReturn]) | (Instantiable1[/* props */ P, Component[Any, Any, Any]])
  
  type ReactDivAttr = ReactAttr[HTMLDivElement]
  
  type ReactInputAttr[T] = InputHTMLAttributes[T]
  
  type ReactLIAttr[T] = LiHTMLAttributes[T]
  
  type ReactLabelAttr[T] = LabelHTMLAttributes[T]
  
  trait RenderIconProps[P] extends StObject {
    
    var renderIcon: js.UndefOr[ComponentType[P]] = js.undefined
  }
  object RenderIconProps {
    
    inline def apply[P](): RenderIconProps[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderIconProps[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderIconProps[?], P] (val x: Self & RenderIconProps[P]) extends AnyVal {
      
      inline def setRenderIcon(value: ComponentType[P]): Self = StObject.set(x, "renderIcon", value.asInstanceOf[js.Any])
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
    }
  }
  
  trait RequiresChildrenProps[T] extends StObject {
    
    var children: NonNullable[T]
  }
  object RequiresChildrenProps {
    
    inline def apply[T](children: NonNullable[T]): RequiresChildrenProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiresChildrenProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiresChildrenProps[?], T] (val x: Self & RequiresChildrenProps[T]) extends AnyVal {
      
      inline def setChildren(value: NonNullable[T]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequiresIdProps[T] extends StObject {
    
    var id: NonNullable[T]
  }
  object RequiresIdProps {
    
    inline def apply[T](id: NonNullable[T]): RequiresIdProps[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiresIdProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequiresIdProps[?], T] (val x: Self & RequiresIdProps[T]) extends AnyVal {
      
      inline def setId(value: NonNullable[T]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type ShapeOf[B /* <: js.Object */, E /* <: js.Object */] = (/* import warning: importer.ImportType#apply Failed type conversion: E extends never ? {} : E */ js.Any) & B
  
  trait SideNavSharedProps extends StObject {
    
    var isSideNavExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object SideNavSharedProps {
    
    inline def apply(): SideNavSharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavSharedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavSharedProps] (val x: Self) extends AnyVal {
      
      inline def setIsSideNavExpanded(value: Boolean): Self = StObject.set(x, "isSideNavExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsSideNavExpandedUndefined: Self = StObject.set(x, "isSideNavExpanded", js.undefined)
    }
  }
  
  trait SideNavSizingProps extends StObject {
    
    var large: js.UndefOr[Boolean] = js.undefined
  }
  object SideNavSizingProps {
    
    inline def apply(): SideNavSizingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavSizingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavSizingProps] (val x: Self) extends AnyVal {
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    }
  }
  
  trait SizingProps extends StObject {
    
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object SizingProps {
    
    inline def apply(): SizingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizingProps] (val x: Self) extends AnyVal {
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.center
    - typings.carbonComponentsReact.carbonComponentsReactStrings.end
    - typings.carbonComponentsReact.carbonComponentsReactStrings.start
  */
  trait TooltipAlignment extends StObject
  object TooltipAlignment {
    
    inline def center: typings.carbonComponentsReact.carbonComponentsReactStrings.center = "center".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.center]
    
    inline def end: typings.carbonComponentsReact.carbonComponentsReactStrings.end = "end".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.end]
    
    inline def start: typings.carbonComponentsReact.carbonComponentsReactStrings.start = "start".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.start]
  }
  
  type TooltipPosition = Direction
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.bottom
    - typings.carbonComponentsReact.carbonComponentsReactStrings.top
  */
  trait VerticalDirection extends StObject
  object VerticalDirection {
    
    inline def bottom: typings.carbonComponentsReact.carbonComponentsReactStrings.bottom = "bottom".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.bottom]
    
    inline def top: typings.carbonComponentsReact.carbonComponentsReactStrings.top = "top".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.top]
  }
}
