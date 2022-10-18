package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.babelPluginReactHtmlAttrs.anon.Default
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.input
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.mount
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.update
import typings.babelPluginReactHtmlAttrs.mod.^
import typings.csstype.mod.Properties
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.Exclude
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.Partial
import typings.std.SVGElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Children: ReactChildren = ^.asInstanceOf[js.Dynamic].selectDynamic("Children").asInstanceOf[ReactChildren]

inline def Fragment: ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children] = ^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children]]

inline def Profiler: ExoticComponent[ProfilerProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Profiler").asInstanceOf[ExoticComponent[ProfilerProps]]

inline def StrictMode: ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children] = ^.asInstanceOf[js.Dynamic].selectDynamic("StrictMode").asInstanceOf[ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children]]

/**
  * This feature is not yet available for server-side rendering.
  * Suspense support will be added in a later release.
  */
inline def Suspense: ExoticComponent[SuspenseProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Suspense").asInstanceOf[ExoticComponent[SuspenseProps]]

inline def SuspenseList: ExoticComponent[
typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("SuspenseList").asInstanceOf[ExoticComponent[
typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListProps]]

// Custom components
inline def cloneElement[P](element: FunctionComponentElement[P], props: Partial[P] & Attributes, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def cloneElement[P](element: FunctionComponentElement[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def cloneElement[P](
  element: ReactElement[P, String | JSXElementConstructor[Any]],
  props: Partial[P] & Attributes,
  children: ReactNode*
): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def cloneElement[P](element: ReactElement[P, String | JSXElementConstructor[Any]], props: Unit, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def cloneElement[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], props: Partial[P] & ClassAttributes[T], children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def cloneElement[P, T /* <: Component[P, ComponentState, Any] */](element: CElement[P, T], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
// DOM Element (has to be the last, because type checking stops at first overload that fits)
inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: DOMAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def cloneElement[P /* <: DOMAttributes[T] */, T /* <: Element */](element: DOMElement[P, T], props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
// DOM Elements
// ReactHTMLElement
inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: P, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def cloneElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: DetailedReactHTMLElement[P, T], props: Unit, children: ReactNode*): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
// SVGElement
inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: P, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def cloneElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](element: ReactSVGElement, props: Unit, children: ReactNode*): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

// ReactHTMLElement, less specific
inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: P, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]
inline def cloneElement_PT_ReactHTMLElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](element: ReactHTMLElement[T], props: Unit, children: ReactNode*): ReactHTMLElement[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")((scala.List(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactHTMLElement[T]]

inline def createContext[T](
  // If you thought this should be optional, see
// https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
defaultValue: T
): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
inline def createContext[T](
  // If you thought this should be optional, see
// https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
defaultValue: T,
  calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]
): Context[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[Context[T]]

inline def createElement[P /* <: js.Object */](`type`: String, props: Attributes & P, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: String, props: Null, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: String, props: Unit, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: (ClassAttributes[ClassicComponent[P, ComponentState]]) & P,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Null,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](
  `type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]],
  props: Unit,
  children: ReactNode*
): CElement[P, ClassicComponent[P, ComponentState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, ClassicComponent[P, ComponentState]]]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Attributes & P, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Null, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: ComponentClass[P, ComponentState], props: Unit, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): ReactElement[P, String | JSXElementConstructor[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactElement[P, String | JSXElementConstructor[Any]]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.abbr, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.address */ Any,
  props: ClassAttributes[T] & P,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.abbr, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.address */ Any,
  props: Null,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]
inline def createElement[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.abbr, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.address */ Any,
  props: Unit,
  children: ReactNode*
): DetailedReactHTMLElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[P, T]]

inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: ClassAttributes[T] & P, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Null, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]
inline def createElement_PTC_CElement[P /* <: js.Object */, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C], props: Unit, children: ReactNode*): CElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[CElement[P, T]]

inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: ClassAttributes[T] & P, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Null, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]
inline def createElement_PT_DOMElement[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String, props: Unit, children: ReactNode*): DOMElement[P, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement[P, T]]

inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.animate, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.circle, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.clipPath */ Any,
  props: ClassAttributes[T] & P,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.animate, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.circle, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.clipPath */ Any,
  props: Null,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]
inline def createElement_PT_ReactSVGElement[P /* <: SVGAttributes[T] */, T /* <: SVGElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.animate, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.circle, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.clipPath */ Any,
  props: Unit,
  children: ReactNode*
): ReactSVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ReactSVGElement]

// Custom components
inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Attributes & P, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Null, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]
inline def createElement_P_FunctionComponentElement[P /* <: js.Object */](`type`: FunctionComponent[P], props: Unit, children: ReactNode*): FunctionComponentElement[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentElement[P]]

// DOM Elements
// TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
inline def createElement_input(
  `type`: input,
  props: InputHTMLAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: ReactNode*
): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Null, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]
inline def createElement_input(`type`: input, props: Unit, children: ReactNode*): DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DetailedReactHTMLElement[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]]

inline def createFactory(
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.animate, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.circle, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.clipPath */ Any
): SVGFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGFactory]
inline def createFactory[P](`type`: ClassType[P, ClassicComponent[P, ComponentState], ClassicComponentClass[P]]): CFactory[P, ClassicComponent[P, ComponentState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, ClassicComponent[P, ComponentState]]]
inline def createFactory[P](`type`: ComponentClass[P, ComponentState]): Factory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[Factory[P]]
// Custom components
inline def createFactory[P](`type`: FunctionComponent[P]): FunctionComponentFactory[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[FunctionComponentFactory[P]]
inline def createFactory[P /* <: DOMAttributes[T] */, T /* <: Element */](`type`: String): DOMFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DOMFactory[P, T]]

inline def createFactory_PTC_CFactory[P, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */](`type`: ClassType[P, T, C]): CFactory[P, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[CFactory[P, T]]

//
// Top Level API
// ----------------------------------------------------------------------
// DOM Elements
inline def createFactory_T_HTMLFactory[T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.abbr, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.address */ Any
): HTMLFactory[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[HTMLFactory[T]]

inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]

inline def forwardRef[T, P](render: ForwardRefRenderFunction[T, P]): ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[PropsWithoutRef[P] & RefAttributes[T]]]

inline def isValidElement[P](): /* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ Boolean]
inline def isValidElement[P](`object`: js.Object): /* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ Boolean]

inline def `lazy`[T /* <: ComponentType[Any] */](factory: js.Function0[js.Promise[Default[T]]]): LazyExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[LazyExoticComponent[T]]

inline def memo[T /* <: ComponentType[Any] */](Component: T): MemoExoticComponent[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[MemoExoticComponent[T]]
inline def memo[T /* <: ComponentType[Any] */](
  Component: T,
  propsAreEqual: js.Function2[/* prevProps */ ComponentProps[T], /* nextProps */ ComponentProps[T], Boolean]
): MemoExoticComponent[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[MemoExoticComponent[T]]
inline def memo[P /* <: js.Object */](Component: SFC[P]): NamedExoticComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[NamedExoticComponent[P]]
inline def memo[P /* <: js.Object */](
  Component: SFC[P],
  propsAreEqual: js.Function2[/* prevProps */ PropsWithChildren[P], /* nextProps */ PropsWithChildren[P], Boolean]
): NamedExoticComponent[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[NamedExoticComponent[P]]

inline def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def unstableWithSuspenseConfig(
  scope: js.Function0[js.UndefOr[Unit]],
  config: typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseConfig
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]

// I made 'inputs' required here and in useMemo as there's no point to memoizing without the memoization key
// useCallback(X) is identical to just using X, useMemo(() => Y) is identical to just using Y.
/**
  * `useCallback` will return a memoized version of the callback that only changes if one of the `inputs`
  * has changed.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usecallback
  */
// TODO (TypeScript 3.0): <T extends (...args: never[]) => unknown>
inline def useCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T, deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

// This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
/**
  * Accepts a context object (the value returned from `React.createContext`) and returns the current
  * context value, as given by the nearest context provider for the given context.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usecontext
  */
inline def useContext[T](context: Context[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]

/**
  * `useDebugValue` can be used to display a label for custom hooks in React DevTools.
  *
  * NOTE: We don’t recommend adding debug values to every custom hook.
  * It’s most valuable for custom hooks that are part of shared libraries.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usedebugvalue
  */
// the name of the custom hook is itself derived from the function name at runtime:
// it's just the function name without the "use" prefix.
inline def useDebugValue[T](value: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useDebugValue[T](value: T, format: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useDeferredValue[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
inline def useDeferredValue[T](
  value: T,
  config: typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TimeoutConfig
): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Accepts a function that contains imperative, possibly effectful code.
  *
  * @param effect Imperative function that can return a cleanup function
  * @param deps If present, effect will only activate if the values in the list change.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useeffect
  */
inline def useEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Unit, init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
// NOTE: this does not accept strings, but this will have to be fixed by removing strings from type Ref<T>
/**
  * `useImperativeHandle` customizes the instance value that is exposed to parent components when using
  * `ref`. As always, imperative code using refs should be avoided in most cases.
  *
  * `useImperativeHandle` should be used with `React.forwardRef`.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useimperativehandle
  */
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def useImperativeHandle[T, R /* <: T */](ref: Ref[T], init: js.Function0[R], deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * The signature is identical to `useEffect`, but it fires synchronously after all DOM mutations.
  * Use this to read layout from the DOM and synchronously re-render. Updates scheduled inside
  * `useLayoutEffect` will be flushed synchronously, before the browser has a chance to paint.
  *
  * Prefer the standard `useEffect` when possible to avoid blocking visual updates.
  *
  * If you’re migrating code from a class component, `useLayoutEffect` fires in the same phase as
  * `componentDidMount` and `componentDidUpdate`.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#uselayouteffect
  */
inline def useLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def useLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * `useMemo` will only recompute the memoized value when one of the `deps` has changed.
  *
  * Usage note: if calling `useMemo` with a referentially stable function, also give it as the input in
  * the second argument.
  *
  * ```ts
  * function expensive () { ... }
  *
  * function Component () {
  *   const expensiveResult = useMemo(expensive, [expensive])
  *   return ...
  * }
  * ```
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usememo
  */
// allow undefined, but don't make it optional as that is very likely a mistake
inline def useMemo[T](factory: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
inline def useMemo[T](factory: js.Function0[T], deps: DependencyList): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// I'm not sure if I keep this 2-ary or if I make it (2,3)-ary; it's currently (2,3)-ary.
// The Flow types do have an overload for 3-ary invocation with undefined initializer.
// NOTE: without the ReducerState indirection, TypeScript would reduce S to be the most common
// supertype between the reducer's return type and the initialState (or the initializer's return type),
// which would prevent autocompletion from ever working.
// TODO: double-check if this weird overload logic is necessary. It is possible it's either a bug
// in older versions, or a regression in newer versions of the typescript completion service.
inline def useReducer[R /* <: Reducer[Any, Any] */](reducer: R, initialState: ReducerState[R], initializer: Unit): js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerState[R], Dispatch[ReducerAction[R]]]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// overload where dispatch could accept 0 arguments.
inline def useReducer[R /* <: ReducerWithoutAction[Any] */](reducer: R, initializerArg: ReducerStateWithoutAction[R], initializer: Unit): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]
/**
  * An alternative to `useState`.
  *
  * `useReducer` is usually preferable to `useState` when you have complex state logic that involves
  * multiple sub-values. It also lets you optimize performance for components that trigger deep
  * updates because you can pass `dispatch` down instead of callbacks.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usereducer
  */
// overload where dispatch could accept 0 arguments.
// overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
// If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
// the last overload effectively behaves as if the identity function (x => x) is the initializer.
// overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
inline def useReducer[R /* <: ReducerWithoutAction[Any] */, I](
  reducer: R,
  initializerArg: (I & ReducerState[R]) | I,
  initializer: js.Function1[
  (/* arg */ I & ReducerState[R]) | (/* arg */ I), 
  ReducerState[R] | ReducerStateWithoutAction[R]
]
): js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[ReducerStateWithoutAction[R], DispatchWithoutAction]]

// convenience overload for potentially undefined initialValue / call with 0 arguments
// has a default to stop it from defaulting to {} instead
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
// TODO (TypeScript 3.0): <T extends unknown>
inline def useRef[T](): MutableRefObject[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[MutableRefObject[js.UndefOr[T]]]
inline def useRef[T](initialValue: T): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]

/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
// TODO (TypeScript 3.0): <T extends unknown>
inline def useRef_T_MutableRefObject[T](initialValue: T): MutableRefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T]]

// convenience overload for refs given as a ref prop as they typically start with a null value
/**
  * `useRef` returns a mutable ref object whose `.current` property is initialized to the passed argument
  * (`initialValue`). The returned object will persist for the full lifetime of the component.
  *
  * Note that `useRef()` is useful for more than the `ref` attribute. It’s handy for keeping any mutable
  * value around similar to how you’d use instance fields in classes.
  *
  * Usage note: if you need the result of useRef to be directly mutable, include `| null` in the type
  * of the generic argument.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#useref
  */
// TODO (TypeScript 3.0): <T extends unknown>
inline def useRef_T_RefObject[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[RefObject[T]]

// convenience overload when first argument is ommitted
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usestate
  */
inline def useState[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]]]
/**
  * Returns a stateful value, and a function to update it.
  *
  * @version 16.8.0
  * @see https://reactjs.org/docs/hooks-reference.html#usestate
  */
inline def useState[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]
inline def useState[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[S, Dispatch[SetStateAction[S]]]]

inline def useTransition(): js.Tuple2[
typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[
typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
Boolean]]
inline def useTransition(
  config: typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseConfig
): js.Tuple2[
typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
Boolean]]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type AnimationEventHandler[T] = EventHandler[AnimationEvent[T]]

type AudioHTMLAttributes[T] = MediaHTMLAttributes[T]

type Booleanish = Boolean

type CElement[P, T /* <: Component[P, ComponentState, Any] */] = ComponentElement[P, T]

type CFactory[P, T /* <: Component[P, ComponentState, Any] */] = ComponentFactory[P, T]

type CSSProperties = Properties[String | Double, String]

type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]

/**
  * We use an intersection type to infer multiple type parameters from
  * a single argument, which is useful for many top-level API defs.
  * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
  */
type ClassType[P, T /* <: Component[P, ComponentState, Any] */, C /* <: ComponentClass[P, ComponentState] */] = C & (Instantiable2[/* props */ P, /* context */ js.UndefOr[Any], T])

type ClassicElement[P] = CElement[P, ClassicComponent[P, ComponentState]]

type ClassicFactory[P] = CFactory[P, ClassicComponent[P, ComponentState]]

type ClipboardEventHandler[T] = EventHandler[ClipboardEvent[T]]

type ComponentPropsWithoutRef[T /* <: ElementType[Any] */] = PropsWithoutRef[ComponentProps[T]]

type ComponentState = Any

type ComponentType[P] = (ComponentClass[P, ComponentState]) | FunctionComponent[P]

type CompositionEventHandler[T] = EventHandler[CompositionEvent[T]]

type Consumer[T] = ExoticComponent[ConsumerProps[T]]

// TODO (TypeScript 3.0): ReadonlyArray<unknown>
type DependencyList = js.Array[Any]

type DetailedHTMLProps[E /* <: HTMLAttributes[T] */, T] = ClassAttributes[T] & E

// this technically does accept a second argument, but it's already under a deprecation warning
// and it's not even released so probably better to not define it.
type Dispatch[A] = js.Function1[/* value */ A, Unit]

// Since action _can_ be undefined, dispatch may be called without any parameters.
type DispatchWithoutAction = js.Function0[Unit]

type DragEventHandler[T] = EventHandler[DragEvent[T]]

// NOTE: callbacks are _only_ allowed to return either void, or a destructor.
// The destructor is itself only allowed to return void.
type EffectCallback = js.Function0[Unit | js.Function0[js.UndefOr[Unit]]]

//
// React Elements
// ----------------------------------------------------------------------
type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: P extends babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'] */ js.Any) | ComponentType[P]

//
// Event Handler Types
// ----------------------------------------------------------------------
type EventHandler[E /* <: SyntheticEvent[Any, Event] */] = js.Function1[/* event */ E, Unit]

type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any

type FC[P] = FunctionComponent[P]

type FocusEventHandler[T] = EventHandler[FocusEvent[T]]

type FormEvent[T] = SyntheticEvent[T, Event]

type FormEventHandler[T] = EventHandler[FormEvent[T]]

type GetDerivedStateFromError[P, S] = /**
  * This lifecycle is invoked after an error has been thrown by a descendant component.
  * It receives the error that was thrown as a parameter and should return a value to update state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function1[/* error */ Any, Partial[S] | Null]

type GetDerivedStateFromProps[P, S] = /**
  * Returns an update to a component's state based on its new props and old state.
  *
  * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
  */
js.Function2[/* nextProps */ P, /* prevState */ S, Partial[S] | Null]

type HTMLFactory[T /* <: HTMLElement */] = DetailedHTMLFactory[AllHTMLAttributes[T], T]

type JSXElementConstructor[P] = (js.Function1[/* props */ P, (ReactElement[Any, String | Any]) | Null]) | (Instantiable1[/* props */ P, Component[P, Any, Any]])

type Key = String | Double

type KeyboardEventHandler[T] = EventHandler[KeyboardEvent[T]]

type LegacyRef[T] = String | Ref[T]

type MouseEventHandler[T] = EventHandler[MouseEvent[T, NativeMouseEvent]]

type NativeAnimationEvent = typings.std.AnimationEvent

type NativeClipboardEvent = typings.std.ClipboardEvent

type NativeCompositionEvent = typings.std.CompositionEvent

type NativeDragEvent = typings.std.DragEvent

type NativeFocusEvent = typings.std.FocusEvent

type NativeKeyboardEvent = typings.std.KeyboardEvent

type NativeMouseEvent = typings.std.MouseEvent

type NativePointerEvent = typings.std.PointerEvent

type NativeTouchEvent = typings.std.TouchEvent

type NativeTransitionEvent = typings.std.TransitionEvent

type NativeUIEvent = typings.std.UIEvent

type NativeWheelEvent = typings.std.WheelEvent

type NotExactlyAnyPropertyKeys[T] = Exclude[/* keyof T */ String, ExactlyAnyPropertyKeys[T]]

type PointerEventHandler[T] = EventHandler[PointerEvent[T]]

/**
  * {@link https://github.com/bvaughn/rfcs/blob/profiler/text/0000-profiler.md#detailed-design | API}
  */
type ProfilerOnRenderCallback = js.Function7[
/* id */ String, 
/* phase */ mount | update, 
/* actualDuration */ Double, 
/* baseDuration */ Double, 
/* startTime */ Double, 
/* commitTime */ Double, 
/* interactions */ Set[SchedulerInteraction], 
Unit]

type PropsWithChildren[P] = P & typings.babelPluginReactHtmlAttrs.anon.Children

// NOTE: only the Context object itself can get a displayName
// https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
type Provider[T] = ProviderExoticComponent[ProviderProps[T]]

type ReactChild = (ReactElement[Any, String | Any]) | ReactText

type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176, starting with typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.a_, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.abbr, typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.address */ Any */, P] = ReactElement[P, Exclude[T, Double]]

type ReactEventHandler[T] = EventHandler[SyntheticEvent[T, Event]]

type ReactFragment = js.Object | ReactNodeArray

// ReactHTML for ReactHTMLElement
type ReactHTMLElement[T /* <: HTMLElement */] = DetailedReactHTMLElement[AllHTMLAttributes[T], T]

//
// Component API
// ----------------------------------------------------------------------
type ReactInstance = (Component[Any, js.Object, Any]) | Element

type ReactNode = js.UndefOr[Any | ReactFragment | ReactPortal | Boolean | Null]

//
// React Nodes
// http://facebook.github.io/react/docs/glossary.html
// ----------------------------------------------------------------------
type ReactText = String | Double

/**
  * @deprecated Please use `ElementType`
  */
type ReactType[P] = ElementType[P]

// Unlike redux, the actions _can_ be anything
type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]

// If useReducer accepts a reducer without action, dispatch may be called without any parameters.
type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]

type Ref[T] = RefCallback[T] | RefObject[T] | Null

type RefCallback[T] = js.Function1[/* instance */ T | Null, Unit]

/**
  * @deprecated Use ForwardRefRenderFunction. forwardRef doesn't accept a
  *             "real" component.
  */
type RefForwardingComponent[T, P] = ForwardRefRenderFunction[T, P]

type Requireable[T] = typings.propTypes.mod.Requireable[T]

//
// Class Interfaces
// ----------------------------------------------------------------------
/**
  * @deprecated as of recent React versions, function components can no
  * longer be considered 'stateless'. Please use `FunctionComponent` instead.
  *
  * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
  */
type SFC[P] = FunctionComponent[P]

/**
  * @deprecated Please use `FunctionComponentElement`
  */
type SFCElement[P] = FunctionComponentElement[P]

/**
  * @deprecated Please use `FunctionComponentFactory`
  */
type SFCFactory[P] = FunctionComponentFactory[P]

//
// React Hooks
// ----------------------------------------------------------------------
// based on the code in https://github.com/facebook/react/pull/13968
// Unlike the class component setState, the updates are not allowed to be partial
type SetStateAction[S] = S | (js.Function1[/* prevState */ S, S])

/**
  * @deprecated as of recent React versions, function components can no
  * longer be considered 'stateless'. Please use `FunctionComponent` instead.
  *
  * @see [React Hooks](https://reactjs.org/docs/hooks-intro.html)
  */
type StatelessComponent[P] = FunctionComponent[P]

/**
  * currentTarget - a reference to the element on which the event listener is registered.
  *
  * target - a reference to the element from which the event was originally dispatched.
  * This might be a child element to the element on which the event listener is registered.
  * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
  */
type SyntheticEvent[T, E] = BaseSyntheticEvent[E, EventTarget & T, EventTarget]

type TouchEventHandler[T] = EventHandler[TouchEvent[T]]

type TransitionEventHandler[T] = EventHandler[TransitionEvent[T]]

type TransitionFunction = js.Function0[js.UndefOr[Unit]]

type TransitionStartFunction = js.Function1[
/* callback */ typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionFunction, 
Unit]

type UIEventHandler[T] = EventHandler[UIEvent[T, NativeUIEvent]]

type ValidationMap[T] = typings.propTypes.mod.ValidationMap[T]

//
// React.PropTypes
// ----------------------------------------------------------------------
type Validator[T] = typings.propTypes.mod.Validator[T]

type WheelEventHandler[T] = EventHandler[WheelEvent[T]]
