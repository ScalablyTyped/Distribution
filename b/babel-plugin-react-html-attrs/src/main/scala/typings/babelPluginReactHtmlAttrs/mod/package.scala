package typings.babelPluginReactHtmlAttrs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnimationEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.AnimationEvent[T]]
  
  type AudioHTMLAttributes[T] = typings.babelPluginReactHtmlAttrs.mod.MediaHTMLAttributes[T]
  
  type Booleanish = scala.Boolean
  
  type CElement[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typings.babelPluginReactHtmlAttrs.mod.ComponentElement[P, T]
  
  type CFactory[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typings.babelPluginReactHtmlAttrs.mod.ComponentFactory[P, T]
  
  type CSSProperties = typings.csstype.mod.Properties[java.lang.String | scala.Double]
  
  type ChangeEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.ChangeEvent[T]]
  
  @scala.inline
  def Children: typings.babelPluginReactHtmlAttrs.mod.ReactChildren = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Children").asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactChildren]
  
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, /* context */ js.UndefOr[js.Any], T])
  
  type ClassicElement[P] = typings.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]
  
  type ClassicFactory[P] = typings.babelPluginReactHtmlAttrs.mod.CFactory[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]
  
  type ClipboardEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.ClipboardEvent[T]]
  
  type ComponentFactory[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = js.Function2[
    /* props */ js.UndefOr[typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P], 
    /* repeated */ typings.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typings.babelPluginReactHtmlAttrs.mod.CElement[P, T]
  ]
  
  /**
    * NOTE: prefer ComponentPropsWithRef, if the ref is forwarded,
    * or ComponentPropsWithoutRef when refs are not supported.
    */
  type ComponentProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */] = js.Object | (/* import warning: importer.ImportType#apply Failed type conversion: babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.<global>.JSX.IntrinsicElements[T] */ js.Any)
  
  type ComponentPropsWithRef[T /* <: typings.babelPluginReactHtmlAttrs.mod.ElementType[_] */] = typings.babelPluginReactHtmlAttrs.mod.PropsWithRef[typings.babelPluginReactHtmlAttrs.mod.ComponentProps[T]] | (typings.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[_] with typings.babelPluginReactHtmlAttrs.mod.RefAttributes[typings.std.InstanceType[T]])
  
  type ComponentPropsWithoutRef[T /* <: typings.babelPluginReactHtmlAttrs.mod.ElementType[_] */] = typings.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[typings.babelPluginReactHtmlAttrs.mod.ComponentProps[T]]
  
  type ComponentState = js.Any
  
  type ComponentType[P] = (typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]) | typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  type CompositionEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.CompositionEvent[T]]
  
  type Consumer[T] = typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.mod.ConsumerProps[T]]
  
  type ContextType[C /* <: typings.babelPluginReactHtmlAttrs.mod.Context[_] */] = js.Any
  
  type DOMFactory[P /* <: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: typings.std.Element */] = js.Function2[
    /* props */ js.UndefOr[(typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P) | scala.Null], 
    /* repeated */ typings.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]
  ]
  
  // Any prop that has a default prop becomes optional, but its type is unchanged
  // Undeclared default props are augmented into the resulting allowable attributes
  // If declared props have indexed properties, ignore default props entirely as keyof gets widened
  // Wrap in an outer-level conditional type to allow distribution over props that are unions
  type Defaultize[P, D] = ((typings.std.Pick[
    P, 
    typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
  ]) with (typings.std.Partial[
    typings.std.Pick[
      P, 
      typings.std.Extract[/* keyof P */ java.lang.String, /* keyof D */ java.lang.String]
    ]
  ]) with (typings.std.Partial[
    typings.std.Pick[
      D, 
      typings.std.Exclude[/* keyof D */ java.lang.String, /* keyof P */ java.lang.String]
    ]
  ])) | P
  
  // TODO (TypeScript 3.0): ReadonlyArray<unknown>
  type DependencyList = js.Array[js.Any]
  
  type DetailedHTMLProps[E /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T] = typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with E
  
  // this technically does accept a second argument, but it's already under a deprecation warning
  // and it's not even released so probably better to not define it.
  type Dispatch[A] = js.Function1[/* value */ A, scala.Unit]
  
  // Since action _can_ be undefined, dispatch may be called without any parameters.
  type DispatchWithoutAction = js.Function0[scala.Unit]
  
  type DragEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.DragEvent[T]]
  
  // NOTE: callbacks are _only_ allowed to return either void, or a destructor.
  // The destructor is itself only allowed to return void.
  type EffectCallback = js.Function0[scala.Unit | js.Function0[js.UndefOr[scala.Unit]]]
  
  /**
    * Gets the instance type for a React element. The instance will be different for various component types:
    *
    * - React class components will be the class instance. So if you had `class Foo extends React.Component<{}> {}`
    *   and used `React.ElementRef<typeof Foo>` then the type would be the instance of `Foo`.
    * - React stateless functional components do not have a backing instance and so `React.ElementRef<typeof Bar>`
    *   (when `Bar` is `function Bar() {}`) will give you the `undefined` type.
    * - JSX intrinsics like `div` will give you their DOM instance. For `React.ElementRef<'div'>` that would be
    *   `HTMLDivElement`. For `React.ElementRef<'input'>` that would be `HTMLInputElement`.
    * - React stateless functional components that forward a `ref` will give you the `ElementRef` of the forwarded
    *   to component.
    *
    * `C` must be the type _of_ a React component so you need to use typeof as in React.ElementRef<typeof MyComponent>.
    *
    * @todo In Flow, this works a little different with forwarded refs and the `AbstractComponent` that
    *       `React.forwardRef()` returns.
    */
  type ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178 */ js.Any */] = js.UndefOr[js.Any | typings.std.InstanceType[C]]
  
  //
  // React Elements
  // ----------------------------------------------------------------------
  type ElementType[P] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ]: P extends babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.<global>.JSX.IntrinsicElements[K]? K : never}['a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view'] */ js.Any) | typings.babelPluginReactHtmlAttrs.mod.ComponentType[P]
  
  //
  // Event Handler Types
  // ----------------------------------------------------------------------
  type EventHandler[E /* <: typings.babelPluginReactHtmlAttrs.mod.SyntheticEvent[_, typings.std.Event] */] = js.Function1[/* event */ E, scala.Unit]
  
  type ExactlyAnyPropertyKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.IsExactlyAny<T[K]> extends true? K : never}[keyof T] */ js.Any
  
  type FC[P] = typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  //
  // Factories
  // ----------------------------------------------------------------------
  type Factory[P] = js.Function2[
    /* props */ js.UndefOr[typings.babelPluginReactHtmlAttrs.mod.Attributes with P], 
    /* repeated */ typings.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typings.babelPluginReactHtmlAttrs.mod.ReactElement[
      P, 
      java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[js.Any]
    ]
  ]
  
  type FocusEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.FocusEvent[T]]
  
  type FormEvent[T] = typings.babelPluginReactHtmlAttrs.mod.SyntheticEvent[T, typings.std.Event]
  
  type FormEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.FormEvent[T]]
  
  @scala.inline
  def Fragment: typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Fragment").asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children]]
  
  type FunctionComponentFactory[P] = js.Function2[
    /* props */ js.UndefOr[typings.babelPluginReactHtmlAttrs.mod.Attributes with P], 
    /* repeated */ typings.babelPluginReactHtmlAttrs.mod.ReactNode, 
    typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]
  ]
  
  type GetDerivedStateFromError[P, S] = /**
    * This lifecycle is invoked after an error has been thrown by a descendant component.
    * It receives the error that was thrown as a parameter and should return a value to update state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function1[/* error */ js.Any, typings.std.Partial[S] | scala.Null]
  
  type GetDerivedStateFromProps[P, S] = /**
    * Returns an update to a component's state based on its new props and old state.
    *
    * Note: its presence prevents any of the deprecated lifecycle methods from being invoked
    */
  js.Function2[/* nextProps */ P, /* prevState */ S, typings.std.Partial[S] | scala.Null]
  
  type HTMLFactory[T /* <: typings.std.HTMLElement */] = typings.babelPluginReactHtmlAttrs.mod.DetailedHTMLFactory[typings.babelPluginReactHtmlAttrs.mod.AllHTMLAttributes[T], T]
  
  type JSXElementConstructor[P] = (js.Function1[
    /* props */ P, 
    (typings.babelPluginReactHtmlAttrs.mod.ReactElement[
      js.Any, 
      java.lang.String | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any> */ js.Object)
    ]) | scala.Null
  ]) | (org.scalablytyped.runtime.Instantiable1[/* props */ P, typings.babelPluginReactHtmlAttrs.mod.Component[P, js.Any, js.Any]])
  
  type Key = java.lang.String | scala.Double
  
  type KeyboardEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.KeyboardEvent[T]]
  
  type LegacyRef[T] = java.lang.String | typings.babelPluginReactHtmlAttrs.mod.Ref[T]
  
  // Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
  type MergePropTypes[P, T] = ((typings.std.Pick[P, typings.babelPluginReactHtmlAttrs.mod.NotExactlyAnyPropertyKeys[P]]) with (// For props which are exactly any, use the type inferred from propTypes if present
  typings.std.Pick[
    T, 
    typings.std.Exclude[
      /* keyof T */ java.lang.String, 
      typings.babelPluginReactHtmlAttrs.mod.NotExactlyAnyPropertyKeys[P]
    ]
  ]) with (// Keep leftover props not specified in propTypes
  typings.std.Pick[
    P, 
    typings.std.Exclude[/* keyof P */ java.lang.String, /* keyof T */ java.lang.String]
  ])) | P | T
  
  type MouseEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[
    typings.babelPluginReactHtmlAttrs.mod.MouseEvent[T, typings.babelPluginReactHtmlAttrs.mod.NativeMouseEvent]
  ]
  
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
  
  type NotExactlyAnyPropertyKeys[T] = typings.std.Exclude[
    /* keyof T */ java.lang.String, 
    typings.babelPluginReactHtmlAttrs.mod.ExactlyAnyPropertyKeys[T]
  ]
  
  type PointerEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.PointerEvent[T]]
  
  @scala.inline
  def Profiler: typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.mod.ProfilerProps] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Profiler").asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.mod.ProfilerProps]]
  
  /**
    * {@link https://github.com/bvaughn/rfcs/blob/profiler/text/0000-profiler.md#detailed-design | API}
    */
  type ProfilerOnRenderCallback = js.Function7[
    /* id */ java.lang.String, 
    /* phase */ typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.mount | typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.update, 
    /* actualDuration */ scala.Double, 
    /* baseDuration */ scala.Double, 
    /* startTime */ scala.Double, 
    /* commitTime */ scala.Double, 
    /* interactions */ typings.std.Set[typings.babelPluginReactHtmlAttrs.mod.SchedulerInteraction], 
    scala.Unit
  ]
  
  type PropsWithChildren[P] = P with typings.babelPluginReactHtmlAttrs.anon.Children
  
  /** Ensures that the props do not include string ref, which cannot be forwarded */
  type PropsWithRef[P] = P | (typings.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typings.babelPluginReactHtmlAttrs.anon.`1`)
  
  /** Ensures that the props do not include ref at all */
  type PropsWithoutRef[P] = P | (typings.std.Pick[
    P, 
    typings.std.Exclude[
      /* keyof P */ java.lang.String, 
      typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.ref
    ]
  ])
  
  // NOTE: only the Context object itself can get a displayName
  // https://github.com/facebook/react-devtools/blob/e0b854e4c/backend/attachRendererFiber.js#L310-L325
  type Provider[T] = typings.babelPluginReactHtmlAttrs.mod.ProviderExoticComponent[typings.babelPluginReactHtmlAttrs.mod.ProviderProps[T]]
  
  type ReactChild = (typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    js.Any, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[js.Any]
  ]) | typings.babelPluginReactHtmlAttrs.mod.ReactText
  
  type ReactComponentElement[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any */, P] = typings.babelPluginReactHtmlAttrs.mod.ReactElement[P, typings.std.Exclude[T, scala.Double]]
  
  type ReactEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.SyntheticEvent[T, typings.std.Event]]
  
  type ReactFragment = js.Object | typings.babelPluginReactHtmlAttrs.mod.ReactNodeArray
  
  // ReactHTML for ReactHTMLElement
  type ReactHTMLElement[T /* <: typings.std.HTMLElement */] = typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[typings.babelPluginReactHtmlAttrs.mod.AllHTMLAttributes[T], T]
  
  //
  // Component API
  // ----------------------------------------------------------------------
  type ReactInstance = (typings.babelPluginReactHtmlAttrs.mod.Component[js.Any, js.Object, js.Any]) | typings.std.Element
  
  type ReactManagedAttributes[C, P] = P | (typings.babelPluginReactHtmlAttrs.mod.Defaultize[
    (typings.babelPluginReactHtmlAttrs.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]]) | P, 
    js.Any
  ]) | (typings.babelPluginReactHtmlAttrs.mod.MergePropTypes[P, typings.propTypes.mod.InferProps[js.Any]])
  
  type ReactNode = js.UndefOr[
    typings.babelPluginReactHtmlAttrs.mod.ReactChild | typings.babelPluginReactHtmlAttrs.mod.ReactFragment | typings.babelPluginReactHtmlAttrs.mod.ReactPortal | scala.Boolean | scala.Null
  ]
  
  //
  // React Nodes
  // http://facebook.github.io/react/docs/glossary.html
  // ----------------------------------------------------------------------
  type ReactText = java.lang.String | scala.Double
  
  /**
    * @deprecated Please use `ElementType`
    */
  type ReactType[P] = typings.babelPluginReactHtmlAttrs.mod.ElementType[P]
  
  // Unlike redux, the actions _can_ be anything
  type Reducer[S, A] = js.Function2[/* prevState */ S, /* action */ A, S]
  
  type ReducerAction[R /* <: typings.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */] = js.Any
  
  // types used to try and prevent the compiler from reducing S
  // to a supertype common with the second argument to useReducer()
  type ReducerState[R /* <: typings.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */] = js.Any
  
  // The identity check is done with the SameValue algorithm (Object.is), which is stricter than ===
  type ReducerStateWithoutAction[R /* <: typings.babelPluginReactHtmlAttrs.mod.ReducerWithoutAction[_] */] = js.Any
  
  // If useReducer accepts a reducer without action, dispatch may be called without any parameters.
  type ReducerWithoutAction[S] = js.Function1[/* prevState */ S, S]
  
  type Ref[T] = typings.babelPluginReactHtmlAttrs.mod.RefCallback[T] | typings.babelPluginReactHtmlAttrs.mod.RefObject[T] | scala.Null
  
  type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]
  
  /**
    * @deprecated Use ForwardRefRenderFunction. forwardRef doesn't accept a
    *             "real" component.
    */
  type RefForwardingComponent[T, P] = typings.babelPluginReactHtmlAttrs.mod.ForwardRefRenderFunction[T, P]
  
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
  type SFC[P] = typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  /**
    * @deprecated Please use `FunctionComponentElement`
    */
  type SFCElement[P] = typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]
  
  /**
    * @deprecated Please use `FunctionComponentFactory`
    */
  type SFCFactory[P] = typings.babelPluginReactHtmlAttrs.mod.FunctionComponentFactory[P]
  
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
  type StatelessComponent[P] = typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]
  
  @scala.inline
  def StrictMode: typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("StrictMode").asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.anon.Children]]
  
  /**
    * This feature is not yet available for server-side rendering.
    * Suspense support will be added in a later release.
    */
  @scala.inline
  def Suspense: typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.mod.SuspenseProps] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Suspense").asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[typings.babelPluginReactHtmlAttrs.mod.SuspenseProps]]
  
  @scala.inline
  def SuspenseList: typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[
    typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListProps
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("SuspenseList").asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ExoticComponent[
    typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseListProps
  ]]
  
  /**
    * currentTarget - a reference to the element on which the event listener is registered.
    *
    * target - a reference to the element from which the event was originally dispatched.
    * This might be a child element to the element on which the event listener is registered.
    * If you thought this should be `EventTarget & T`, see https://github.com/DefinitelyTyped/DefinitelyTyped/pull/12239
    */
  type SyntheticEvent[T, E] = typings.babelPluginReactHtmlAttrs.mod.BaseSyntheticEvent[E, typings.std.EventTarget with T, typings.std.EventTarget]
  
  type TouchEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.TouchEvent[T]]
  
  type TransitionEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.TransitionEvent[T]]
  
  type TransitionFunction = js.Function0[js.UndefOr[scala.Unit]]
  
  type TransitionStartFunction = js.Function1[
    /* callback */ typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionFunction, 
    scala.Unit
  ]
  
  type UIEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[
    typings.babelPluginReactHtmlAttrs.mod.UIEvent[T, typings.babelPluginReactHtmlAttrs.mod.NativeUIEvent]
  ]
  
  type ValidationMap[T] = typings.propTypes.mod.ValidationMap[T]
  
  //
  // React.PropTypes
  // ----------------------------------------------------------------------
  type Validator[T] = typings.propTypes.mod.Validator[T]
  
  type WeakValidationMap[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? null extends T[K]? babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.Validator<T[K] | null | undefined> : undefined extends T[K]? babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.Validator<T[K] | null | undefined> : babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.Validator<T[K]>}
    */ typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.WeakValidationMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type WheelEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.WheelEvent[T]]
  
  // Custom components
  @scala.inline
  def cloneElement[P](
    element: typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P],
    props: typings.std.Partial[P] with typings.babelPluginReactHtmlAttrs.mod.Attributes,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](
    element: typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def cloneElement[P](
    element: typings.babelPluginReactHtmlAttrs.mod.ReactElement[
      P, 
      java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
    ],
    props: typings.std.Partial[P] with typings.babelPluginReactHtmlAttrs.mod.Attributes,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def cloneElement[P](
    element: typings.babelPluginReactHtmlAttrs.mod.ReactElement[
      P, 
      java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
    ],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def cloneElement[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */](
    element: typings.babelPluginReactHtmlAttrs.mod.CElement[P, T],
    props: typings.std.Partial[P] with typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  @scala.inline
  def cloneElement[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */](
    element: typings.babelPluginReactHtmlAttrs.mod.CElement[P, T],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  // DOM Element (has to be the last, because type checking stops at first overload that fits)
  @scala.inline
  def cloneElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
    element: typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T],
    props: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  @scala.inline
  def cloneElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
    element: typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  // DOM Elements
  // ReactHTMLElement
  @scala.inline
  def cloneElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
    element: typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T],
    props: P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def cloneElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
    element: typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  // SVGElement
  @scala.inline
  def cloneElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
    element: typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement,
    props: P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  @scala.inline
  def cloneElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
    element: typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement,
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  
  // ReactHTMLElement, less specific
  @scala.inline
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
    element: typings.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T],
    props: P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T]]
  @scala.inline
  def cloneElement_P_HTMLAttributesTT_HTMLElement_ReactHTMLElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
    element: typings.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(element.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactHTMLElement[T]]
  
  @scala.inline
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T
  ): typings.babelPluginReactHtmlAttrs.mod.Context[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.Context[T]]
  @scala.inline
  def createContext[T](
    // If you thought this should be optional, see
  // https://github.com/DefinitelyTyped/DefinitelyTyped/pull/24509#issuecomment-382213106
  defaultValue: T,
    calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, scala.Double]
  ): typings.babelPluginReactHtmlAttrs.mod.Context[T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.Context[T]]
  
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: typings.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: java.lang.String,
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ],
    props: (typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
    ]) with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ],
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState],
    props: typings.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState],
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  // Custom components
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: typings.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.FunctionComponentElement[P]]
  @scala.inline
  def createElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
    `type`: java.lang.String,
    props: typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  @scala.inline
  def createElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.HTMLAttributes[T] */, T /* <: typings.std.HTMLElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any,
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState] */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C],
    props: typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState] */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  @scala.inline
  def createElement[P /* <: js.Object */, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState] */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C],
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.CElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CElement[P, T]]
  
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
    `type`: java.lang.String,
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  @scala.inline
  def createElement_P_DOMAttributesTT_Element_DOMElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](
    `type`: java.lang.String,
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DOMElement[P, T]]
  
  @scala.inline
  def createElement_P_Object_ReactElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: typings.babelPluginReactHtmlAttrs.mod.Attributes with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement_P_Object_ReactElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  @scala.inline
  def createElement_P_Object_ReactElement[P /* <: js.Object */](
    `type`: typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P],
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactElement[
    P, 
    java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[_]
  ]]
  
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[T] with P,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  @scala.inline
  def createElement_P_SVGAttributesTT_SVGElement_ReactSVGElement[P /* <: typings.babelPluginReactHtmlAttrs.mod.SVGAttributes[T] */, T /* <: typings.std.SVGElement */](
    `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any,
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ReactSVGElement]
  
  // DOM Elements
  // TODO: generalize this to everything in `keyof ReactHTML`, not just "input"
  @scala.inline
  def createElement_input(
    `type`: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.input,
    props: typings.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[typings.std.HTMLInputElement] with typings.babelPluginReactHtmlAttrs.mod.ClassAttributes[typings.std.HTMLInputElement],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typings.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typings.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(
    `type`: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.input,
    props: js.UndefOr[scala.Nothing],
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typings.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typings.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ]]
  @scala.inline
  def createElement_input(
    `type`: typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.input,
    props: scala.Null,
    children: typings.babelPluginReactHtmlAttrs.mod.ReactNode*
  ): typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typings.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DetailedReactHTMLElement[
    typings.babelPluginReactHtmlAttrs.mod.InputHTMLAttributes[typings.std.HTMLInputElement], 
    typings.std.HTMLInputElement
  ]]
  
  @scala.inline
  def createFactory(`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55 */ js.Any): typings.babelPluginReactHtmlAttrs.mod.SVGFactory = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.SVGFactory]
  @scala.inline
  def createFactory[P](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[
      P, 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState], 
      typings.babelPluginReactHtmlAttrs.mod.ClassicComponentClass[P]
    ]
  ): typings.babelPluginReactHtmlAttrs.mod.CFactory[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CFactory[
    P, 
    typings.babelPluginReactHtmlAttrs.mod.ClassicComponent[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ]]
  @scala.inline
  def createFactory[P](
    `type`: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState]
  ): typings.babelPluginReactHtmlAttrs.mod.Factory[P] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.Factory[P]]
  // Custom components
  @scala.inline
  def createFactory[P](`type`: typings.babelPluginReactHtmlAttrs.mod.FunctionComponent[P]): typings.babelPluginReactHtmlAttrs.mod.FunctionComponentFactory[P] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.FunctionComponentFactory[P]]
  @scala.inline
  def createFactory[P /* <: typings.babelPluginReactHtmlAttrs.mod.DOMAttributes[T] */, T /* <: typings.std.Element */](`type`: java.lang.String): typings.babelPluginReactHtmlAttrs.mod.DOMFactory[P, T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.DOMFactory[P, T]]
  @scala.inline
  def createFactory[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState] */](`type`: typings.babelPluginReactHtmlAttrs.mod.ClassType[P, T, C]): typings.babelPluginReactHtmlAttrs.mod.CFactory[P, T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.CFactory[P, T]]
  
  //
  // Top Level API
  // ----------------------------------------------------------------------
  // DOM Elements
  @scala.inline
  def createFactory_T_HTMLElement_HTMLFactory[T /* <: typings.std.HTMLElement */](`type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 116 */ js.Any): typings.babelPluginReactHtmlAttrs.mod.HTMLFactory[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createFactory")(`type`.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.HTMLFactory[T]]
  
  @scala.inline
  def createRef[T](): typings.babelPluginReactHtmlAttrs.mod.RefObject[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.RefObject[T]]
  
  @scala.inline
  def forwardRef[T, P](render: typings.babelPluginReactHtmlAttrs.mod.ForwardRefRenderFunction[T, P]): typings.babelPluginReactHtmlAttrs.mod.ForwardRefExoticComponent[
    typings.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typings.babelPluginReactHtmlAttrs.mod.RefAttributes[T]
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("forwardRef")(render.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.ForwardRefExoticComponent[
    typings.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typings.babelPluginReactHtmlAttrs.mod.RefAttributes[T]
  ]]
  
  @scala.inline
  def isValidElement[P](): /* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")().asInstanceOf[/* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean]
  @scala.inline
  def isValidElement[P](`object`: js.Object): /* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<P, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> */ scala.Boolean]
  
  @scala.inline
  def `lazy`[T /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentType[_] */](factory: js.Function0[js.Promise[typings.babelPluginReactHtmlAttrs.anon.Default[T]]]): typings.babelPluginReactHtmlAttrs.mod.LazyExoticComponent[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(factory.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.LazyExoticComponent[T]]
  
  @scala.inline
  def memo[T /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentType[_] */](Component: T): typings.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T]]
  @scala.inline
  def memo[T /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentType[_] */](
    Component: T,
    propsAreEqual: js.Function2[
      /* prevProps */ typings.babelPluginReactHtmlAttrs.mod.ComponentProps[T], 
      /* nextProps */ typings.babelPluginReactHtmlAttrs.mod.ComponentProps[T], 
      scala.Boolean
    ]
  ): typings.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.MemoExoticComponent[T]]
  @scala.inline
  def memo[P /* <: js.Object */](Component: typings.babelPluginReactHtmlAttrs.mod.SFC[P]): typings.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P]]
  @scala.inline
  def memo[P /* <: js.Object */](
    Component: typings.babelPluginReactHtmlAttrs.mod.SFC[P],
    propsAreEqual: js.Function2[
      /* prevProps */ typings.babelPluginReactHtmlAttrs.mod.PropsWithChildren[P], 
      /* nextProps */ typings.babelPluginReactHtmlAttrs.mod.PropsWithChildren[P], 
      scala.Boolean
    ]
  ): typings.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("memo")(Component.asInstanceOf[js.Any], propsAreEqual.asInstanceOf[js.Any])).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.NamedExoticComponent[P]]
  
  @scala.inline
  def unstableWithSuspenseConfig(scope: js.Function0[js.UndefOr[scala.Unit]]): scala.Unit = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def unstableWithSuspenseConfig(
    scope: js.Function0[js.UndefOr[scala.Unit]],
    config: typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseConfig
  ): scala.Unit = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unstable_withSuspenseConfig")(scope.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T, deps: typings.babelPluginReactHtmlAttrs.mod.DependencyList): T = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // This will technically work if you give a Consumer<T> or Provider<T> but it's deprecated and warns
  /**
    * Accepts a context object (the value returned from `React.createContext`) and returns the current
    * context value, as given by the nearest context provider for the given context.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usecontext
    */
  @scala.inline
  def useContext[T](context: typings.babelPluginReactHtmlAttrs.mod.Context[T]): T = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useContext")(context.asInstanceOf[js.Any]).asInstanceOf[T]
  
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
  @scala.inline
  def useDebugValue[T](value: T): scala.Unit = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useDebugValue[T](value: T, format: js.Function1[/* value */ T, _]): scala.Unit = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDebugValue")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def useDeferredValue[T](value: T): T = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useDeferredValue[T](
    value: T,
    config: typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TimeoutConfig
  ): T = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useDeferredValue")(value.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#useeffect
    */
  @scala.inline
  def useEffect(effect: typings.babelPluginReactHtmlAttrs.mod.EffectCallback): scala.Unit = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useEffect(
    effect: typings.babelPluginReactHtmlAttrs.mod.EffectCallback,
    deps: typings.babelPluginReactHtmlAttrs.mod.DependencyList
  ): scala.Unit = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](ref: js.UndefOr[typings.babelPluginReactHtmlAttrs.mod.Ref[T]], init: js.Function0[R]): scala.Unit = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def useImperativeHandle[T, R /* <: T */](
    ref: js.UndefOr[typings.babelPluginReactHtmlAttrs.mod.Ref[T]],
    init: js.Function0[R],
    deps: typings.babelPluginReactHtmlAttrs.mod.DependencyList
  ): scala.Unit = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useImperativeHandle")(ref.asInstanceOf[js.Any], init.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useLayoutEffect(effect: typings.babelPluginReactHtmlAttrs.mod.EffectCallback): scala.Unit = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def useLayoutEffect(
    effect: typings.babelPluginReactHtmlAttrs.mod.EffectCallback,
    deps: typings.babelPluginReactHtmlAttrs.mod.DependencyList
  ): scala.Unit = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
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
  @scala.inline
  def useMemo[T](factory: js.Function0[T]): T = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useMemo[T](factory: js.Function0[T], deps: typings.babelPluginReactHtmlAttrs.mod.DependencyList): T = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(factory.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[T]
  
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
  @scala.inline
  def useReducer[R /* <: typings.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */](
    reducer: R,
    initialState: typings.babelPluginReactHtmlAttrs.mod.ReducerState[R],
    initializer: js.UndefOr[scala.Nothing]
  ): js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ]]
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
  // overload where "I" may be a subset of ReducerState<R>; used to provide autocompletion.
  // If "I" matches ReducerState<R> exactly then the last overload will allow initializer to be ommitted.
  // the last overload effectively behaves as if the identity function (x => x) is the initializer.
  // overload for free "I"; all goes as long as initializer converts it into "ReducerState<R>".
  @scala.inline
  def useReducer[R /* <: typings.babelPluginReactHtmlAttrs.mod.Reducer[_, _] */, I](
    reducer: R,
    initializerArg: (I with typings.babelPluginReactHtmlAttrs.mod.ReducerState[R]) | I,
    initializer: js.Function1[
      (/* arg */ I with typings.babelPluginReactHtmlAttrs.mod.ReducerState[R]) | (/* arg */ I), 
      typings.babelPluginReactHtmlAttrs.mod.ReducerState[R]
    ]
  ): js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerState[R], 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.ReducerAction[R]]
  ]]
  
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
  @scala.inline
  def useReducer_R_ReducerWithoutActionWildcard[R /* <: typings.babelPluginReactHtmlAttrs.mod.ReducerWithoutAction[_] */](
    reducer: R,
    initializerArg: typings.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R],
    initializer: js.UndefOr[scala.Nothing]
  ): js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typings.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typings.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ]]
  
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
  @scala.inline
  def useReducer_R_ReducerWithoutActionWildcardI[R /* <: typings.babelPluginReactHtmlAttrs.mod.ReducerWithoutAction[_] */, I](
    reducer: R,
    initializerArg: I,
    initializer: js.Function1[/* arg */ I, typings.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R]]
  ): js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typings.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ] = (typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useReducer")(reducer.asInstanceOf[js.Any], initializerArg.asInstanceOf[js.Any], initializer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    typings.babelPluginReactHtmlAttrs.mod.ReducerStateWithoutAction[R], 
    typings.babelPluginReactHtmlAttrs.mod.DispatchWithoutAction
  ]]
  
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
  @scala.inline
  def useRef[T](): typings.babelPluginReactHtmlAttrs.mod.RefObject[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.RefObject[T]]
  @scala.inline
  def useRef[T](initialValue: T): typings.babelPluginReactHtmlAttrs.mod.RefObject[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.RefObject[T]]
  
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
  @scala.inline
  def useRef_T_MutableRefObject[T](): typings.babelPluginReactHtmlAttrs.mod.MutableRefObject[js.UndefOr[T]] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")().asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.MutableRefObject[js.UndefOr[T]]]
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
  @scala.inline
  def useRef_T_MutableRefObject[T](initialValue: T): typings.babelPluginReactHtmlAttrs.mod.MutableRefObject[T] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useRef")(initialValue.asInstanceOf[js.Any]).asInstanceOf[typings.babelPluginReactHtmlAttrs.mod.MutableRefObject[T]]
  
  // convenience overload when first argument is ommitted
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @scala.inline
  def useState[S](): js.Tuple2[
    js.UndefOr[S], 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.SetStateAction[js.UndefOr[S]]]
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")().asInstanceOf[js.Tuple2[
    js.UndefOr[S], 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.SetStateAction[js.UndefOr[S]]]
  ]]
  /**
    * Returns a stateful value, and a function to update it.
    *
    * @version 16.8.0
    * @see https://reactjs.org/docs/hooks-reference.html#usestate
    */
  @scala.inline
  def useState[S](initialState: S): js.Tuple2[
    S, 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ]]
  @scala.inline
  def useState[S](initialState: js.Function0[S]): js.Tuple2[
    S, 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useState")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    S, 
    typings.babelPluginReactHtmlAttrs.mod.Dispatch[typings.babelPluginReactHtmlAttrs.mod.SetStateAction[S]]
  ]]
  
  @scala.inline
  def useTransition(): js.Tuple2[
    typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")().asInstanceOf[js.Tuple2[
    typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ]]
  @scala.inline
  def useTransition(
    config: typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.SuspenseConfig
  ): js.Tuple2[
    typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ] = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("useTransition")(config.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    typings.babelPluginReactHtmlAttrs.experimentalMod.babelPluginReactHtmlAttrsAugmentingMod.TransitionStartFunction, 
    scala.Boolean
  ]]
  
  @scala.inline
  def version: java.lang.String = typings.babelPluginReactHtmlAttrs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
