package typings.babelPluginReactHtmlAttrs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimationEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.AnimationEvent[T]]
  // tslint:disable-next-line:no-empty-interface
  type AudioHTMLAttributes[T] = typings.babelPluginReactHtmlAttrs.mod.MediaHTMLAttributes[T]
  type Booleanish = scala.Boolean
  type CElement[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typings.babelPluginReactHtmlAttrs.mod.ComponentElement[P, T]
  type CFactory[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */] = typings.babelPluginReactHtmlAttrs.mod.ComponentFactory[P, T]
  type ChangeEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.ChangeEvent[T]]
  /**
    * We use an intersection type to infer multiple type parameters from
    * a single argument, which is useful for many top-level API defs.
    * See https://github.com/Microsoft/TypeScript/issues/7234 for more info.
    */
  type ClassType[P, T /* <: typings.babelPluginReactHtmlAttrs.mod.Component[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState, _] */, C /* <: typings.babelPluginReactHtmlAttrs.mod.ComponentClass[P, typings.babelPluginReactHtmlAttrs.mod.ComponentState] */] = C with (org.scalablytyped.runtime.Instantiable2[/* props */ P, js.UndefOr[/* context */ js.Any], T])
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
  // tslint:disable-next-line:no-empty-interface
  type FormEvent[T] = typings.babelPluginReactHtmlAttrs.mod.SyntheticEvent[T, typings.std.Event]
  type FormEventHandler[T] = typings.babelPluginReactHtmlAttrs.mod.EventHandler[typings.babelPluginReactHtmlAttrs.mod.FormEvent[T]]
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
  // tslint:disable-next-line:no-empty-interface
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
  type PropsWithRef[P] = P | (typings.babelPluginReactHtmlAttrs.mod.PropsWithoutRef[P] with typings.babelPluginReactHtmlAttrs.anon.RefExclude)
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
  // tslint:disable-next-line:no-empty-interface
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
}
