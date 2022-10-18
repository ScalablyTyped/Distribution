package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  * `C` must be the type _of_ a React component so you need to use typeof as in `React.ElementRef<typeof MyComponent>`.
  *
  * @todo In Flow, this works a little different with forwarded refs and the `AbstractComponent` that
  *       `React.forwardRef()` returns.
  */
/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * You'll have to cast your way around this structure, unfortunately. 
  * TS definition: {{{
  C extends babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ForwardRefExoticComponent<infer FP> ? FP extends babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.RefAttributes<infer FC> ? FC : never : C extends {new (props : any): babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.Component<any, {}, any>} ? std.InstanceType<C> : C extends (props : any, context : any | undefined): babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.ReactElement<any, string | babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.JSXElementConstructor<any>> | null ? undefined : C extends 'a' | 'abbr' | 'address' | 'area' | 'article' | 'aside' | 'audio' | 'b' | 'base' | 'bdi' | 'bdo' | 'big' | 'blockquote' | 'body' | 'br' | 'button' | 'canvas' | 'caption' | 'cite' | 'code' | 'col' | 'colgroup' | 'data' | 'datalist' | 'dd' | 'del' | 'details' | 'dfn' | 'dialog' | 'div' | 'dl' | 'dt' | 'em' | 'embed' | 'fieldset' | 'figcaption' | 'figure' | 'footer' | 'form' | 'h1' | 'h2' | 'h3' | 'h4' | 'h5' | 'h6' | 'head' | 'header' | 'hgroup' | 'hr' | 'html' | 'i' | 'iframe' | 'img' | 'input' | 'ins' | 'kbd' | 'keygen' | 'label' | 'legend' | 'li' | 'link' | 'main' | 'map' | 'mark' | 'menu' | 'menuitem' | 'meta' | 'meter' | 'nav' | 'noindex' | 'noscript' | 'object' | 'ol' | 'optgroup' | 'option' | 'output' | 'p' | 'param' | 'picture' | 'pre' | 'progress' | 'q' | 'rp' | 'rt' | 'ruby' | 's' | 'samp' | 'slot' | 'script' | 'section' | 'select' | 'small' | 'source' | 'span' | 'strong' | 'style' | 'sub' | 'summary' | 'sup' | 'table' | 'template' | 'tbody' | 'td' | 'textarea' | 'tfoot' | 'th' | 'thead' | 'time' | 'title' | 'tr' | 'track' | 'u' | 'ul' | 'var' | 'video' | 'wbr' | 'webview' | 'svg' | 'animate' | 'animateMotion' | 'animateTransform' | 'circle' | 'clipPath' | 'defs' | 'desc' | 'ellipse' | 'feBlend' | 'feColorMatrix' | 'feComponentTransfer' | 'feComposite' | 'feConvolveMatrix' | 'feDiffuseLighting' | 'feDisplacementMap' | 'feDistantLight' | 'feDropShadow' | 'feFlood' | 'feFuncA' | 'feFuncB' | 'feFuncG' | 'feFuncR' | 'feGaussianBlur' | 'feImage' | 'feMerge' | 'feMergeNode' | 'feMorphology' | 'feOffset' | 'fePointLight' | 'feSpecularLighting' | 'feSpotLight' | 'feTile' | 'feTurbulence' | 'filter' | 'foreignObject' | 'g' | 'image' | 'line' | 'linearGradient' | 'marker' | 'mask' | 'metadata' | 'mpath' | 'path' | 'pattern' | 'polygon' | 'polyline' | 'radialGradient' | 'rect' | 'stop' | 'switch' | 'symbol' | 'text' | 'textPath' | 'tspan' | 'use' | 'view' ? babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.<global>.JSX.IntrinsicElements[C] extends babel-plugin-react-html-attrs.babel-plugin-react-html-attrs.DOMAttributes<infer E> ? E : never : never
  }}}
  */
@js.native
trait ElementRef[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 178, starting with typings.babelPluginReactHtmlAttrs.mod.ForwardRefExoticComponent[scala.Any], typings.babelPluginReactHtmlAttrs.anon.Instantiable, js.Function2[
/ * props * / scala.Any, 
/ * context * / js.UndefOr[scala.Any], 
(typings.babelPluginReactHtmlAttrs.mod.ReactElement[
  scala.Any, 
  java.lang.String | typings.babelPluginReactHtmlAttrs.mod.JSXElementConstructor[scala.Any]
]) | scala.Null] */ Any */] extends StObject
