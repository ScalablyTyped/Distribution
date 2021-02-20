package typings.babelPluginReactHtmlAttrs.mod

import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings._empty
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`after-edge`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`before-edge`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`text-after-edge`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`text-before-edge`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.`use-credentials`
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.alphabetic
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.anonymous
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.auto
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.baseline
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.bevel
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.butt
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.central
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.evenodd
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.hanging
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.ideographic
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.inherit
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.initial
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.isolated
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.linearRGB
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.mathematical
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.medial
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.middle
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.miter
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.no
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.none
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.nonzero
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.replace
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.round
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.sRGB
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.square
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.sum
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.terminal
import typings.babelPluginReactHtmlAttrs.babelPluginReactHtmlAttrsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// this list is "complete" in that it contains every SVG attribute
// that React supports, but the types can be improved.
// Full list here: https://facebook.github.io/react/docs/dom-elements.html
//
// The three broad type categories are (in order of restrictiveness):
//   - "number | string"
//   - "string"
//   - union of string literals
@js.native
trait SVGAttributes[T]
  extends AriaAttributes
     with DOMAttributes[T] {
  
  var `accent-height`: js.UndefOr[Double | String] = js.native
  
  // SVG Specific attributes
  var accentHeight: js.UndefOr[Double | String] = js.native
  
  var accumulate: js.UndefOr[none | sum] = js.native
  
  var additive: js.UndefOr[replace | sum] = js.native
  
  var `alignment-baseline`: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.native
  
  var alignmentBaseline: js.UndefOr[
    auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
  ] = js.native
  
  var allowReorder: js.UndefOr[no | yes] = js.native
  
  var alphabetic: js.UndefOr[Double | String] = js.native
  
  var amplitude: js.UndefOr[Double | String] = js.native
  
  var `arabic-form`: js.UndefOr[initial | medial | terminal | isolated] = js.native
  
  var arabicForm: js.UndefOr[initial | medial | terminal | isolated] = js.native
  
  var ascent: js.UndefOr[Double | String] = js.native
  
  var attributeName: js.UndefOr[String] = js.native
  
  var attributeType: js.UndefOr[String] = js.native
  
  var autoReverse: js.UndefOr[Booleanish] = js.native
  
  var azimuth: js.UndefOr[Double | String] = js.native
  
  var baseFrequency: js.UndefOr[Double | String] = js.native
  
  var baseProfile: js.UndefOr[Double | String] = js.native
  
  var `baseline-shift`: js.UndefOr[Double | String] = js.native
  
  var baselineShift: js.UndefOr[Double | String] = js.native
  
  var bbox: js.UndefOr[Double | String] = js.native
  
  var begin: js.UndefOr[Double | String] = js.native
  
  var bias: js.UndefOr[Double | String] = js.native
  
  var by: js.UndefOr[Double | String] = js.native
  
  var calcMode: js.UndefOr[Double | String] = js.native
  
  var `cap-height`: js.UndefOr[Double | String] = js.native
  
  var capHeight: js.UndefOr[Double | String] = js.native
  
  var `class`: js.UndefOr[String] = js.native
  
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: js.UndefOr[String] = js.native
  
  var clip: js.UndefOr[Double | String] = js.native
  
  var `clip-path`: js.UndefOr[String] = js.native
  
  var `clip-rule`: js.UndefOr[Double | String] = js.native
  
  var clipPath: js.UndefOr[String] = js.native
  
  var clipPathUnits: js.UndefOr[Double | String] = js.native
  
  var clipRule: js.UndefOr[Double | String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var `color-interpolation`: js.UndefOr[Double | String] = js.native
  
  var `color-interpolation-filters`: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
  
  var `color-profile`: js.UndefOr[Double | String] = js.native
  
  var `color-rendering`: js.UndefOr[Double | String] = js.native
  
  var colorInterpolation: js.UndefOr[Double | String] = js.native
  
  var colorInterpolationFilters: js.UndefOr[auto | sRGB | linearRGB | inherit] = js.native
  
  var colorProfile: js.UndefOr[Double | String] = js.native
  
  var colorRendering: js.UndefOr[Double | String] = js.native
  
  var contentScriptType: js.UndefOr[Double | String] = js.native
  
  var contentStyleType: js.UndefOr[Double | String] = js.native
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var crossorigin: js.UndefOr[anonymous | `use-credentials` | _empty] = js.native
  
  var cursor: js.UndefOr[Double | String] = js.native
  
  var cx: js.UndefOr[Double | String] = js.native
  
  var cy: js.UndefOr[Double | String] = js.native
  
  var d: js.UndefOr[String] = js.native
  
  var decelerate: js.UndefOr[Double | String] = js.native
  
  var descent: js.UndefOr[Double | String] = js.native
  
  var diffuseConstant: js.UndefOr[Double | String] = js.native
  
  var direction: js.UndefOr[Double | String] = js.native
  
  var display: js.UndefOr[Double | String] = js.native
  
  var divisor: js.UndefOr[Double | String] = js.native
  
  var `dominant-baseline`: js.UndefOr[Double | String] = js.native
  
  var dominantBaseline: js.UndefOr[Double | String] = js.native
  
  var dur: js.UndefOr[Double | String] = js.native
  
  var dx: js.UndefOr[Double | String] = js.native
  
  var dy: js.UndefOr[Double | String] = js.native
  
  var edgeMode: js.UndefOr[Double | String] = js.native
  
  var elevation: js.UndefOr[Double | String] = js.native
  
  var `enable-background`: js.UndefOr[Double | String] = js.native
  
  var enableBackground: js.UndefOr[Double | String] = js.native
  
  var end: js.UndefOr[Double | String] = js.native
  
  var exponent: js.UndefOr[Double | String] = js.native
  
  var externalResourcesRequired: js.UndefOr[Booleanish] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var `fill-opacity`: js.UndefOr[Double | String] = js.native
  
  var `fill-rule`: js.UndefOr[nonzero | evenodd | inherit] = js.native
  
  var fillOpacity: js.UndefOr[Double | String] = js.native
  
  var fillRule: js.UndefOr[nonzero | evenodd | inherit] = js.native
  
  var filter: js.UndefOr[String] = js.native
  
  var filterRes: js.UndefOr[Double | String] = js.native
  
  var filterUnits: js.UndefOr[Double | String] = js.native
  
  var `flood-color`: js.UndefOr[Double | String] = js.native
  
  var `flood-opacity`: js.UndefOr[Double | String] = js.native
  
  var floodColor: js.UndefOr[Double | String] = js.native
  
  var floodOpacity: js.UndefOr[Double | String] = js.native
  
  var focusable: js.UndefOr[Booleanish | auto] = js.native
  
  var `font-family`: js.UndefOr[String] = js.native
  
  var `font-size`: js.UndefOr[Double | String] = js.native
  
  var `font-size-adjust`: js.UndefOr[Double | String] = js.native
  
  var `font-stretch`: js.UndefOr[Double | String] = js.native
  
  var `font-style`: js.UndefOr[Double | String] = js.native
  
  var `font-variant`: js.UndefOr[Double | String] = js.native
  
  var `font-weight`: js.UndefOr[Double | String] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double | String] = js.native
  
  var fontSizeAdjust: js.UndefOr[Double | String] = js.native
  
  var fontStretch: js.UndefOr[Double | String] = js.native
  
  var fontStyle: js.UndefOr[Double | String] = js.native
  
  var fontVariant: js.UndefOr[Double | String] = js.native
  
  var fontWeight: js.UndefOr[Double | String] = js.native
  
  var format: js.UndefOr[Double | String] = js.native
  
  var from: js.UndefOr[Double | String] = js.native
  
  var fx: js.UndefOr[Double | String] = js.native
  
  var fy: js.UndefOr[Double | String] = js.native
  
  var g1: js.UndefOr[Double | String] = js.native
  
  var g2: js.UndefOr[Double | String] = js.native
  
  var `glyph-name`: js.UndefOr[Double | String] = js.native
  
  var `glyph-orientation-horizontal`: js.UndefOr[Double | String] = js.native
  
  var `glyph-orientation-vertical`: js.UndefOr[Double | String] = js.native
  
  var glyphName: js.UndefOr[Double | String] = js.native
  
  var glyphOrientationHorizontal: js.UndefOr[Double | String] = js.native
  
  var glyphOrientationVertical: js.UndefOr[Double | String] = js.native
  
  var glyphRef: js.UndefOr[Double | String] = js.native
  
  var gradientTransform: js.UndefOr[String] = js.native
  
  var gradientUnits: js.UndefOr[String] = js.native
  
  var hanging: js.UndefOr[Double | String] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var `horiz-adv-x`: js.UndefOr[Double | String] = js.native
  
  var `horiz-origin-x`: js.UndefOr[Double | String] = js.native
  
  var horizAdvX: js.UndefOr[Double | String] = js.native
  
  var horizOriginX: js.UndefOr[Double | String] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ideographic: js.UndefOr[Double | String] = js.native
  
  var `image-rendering`: js.UndefOr[Double | String] = js.native
  
  var imageRendering: js.UndefOr[Double | String] = js.native
  
  var in: js.UndefOr[String] = js.native
  
  var in2: js.UndefOr[Double | String] = js.native
  
  var intercept: js.UndefOr[Double | String] = js.native
  
  var k: js.UndefOr[Double | String] = js.native
  
  var k1: js.UndefOr[Double | String] = js.native
  
  var k2: js.UndefOr[Double | String] = js.native
  
  var k3: js.UndefOr[Double | String] = js.native
  
  var k4: js.UndefOr[Double | String] = js.native
  
  var kernelMatrix: js.UndefOr[Double | String] = js.native
  
  var kernelUnitLength: js.UndefOr[Double | String] = js.native
  
  var kerning: js.UndefOr[Double | String] = js.native
  
  var keyPoints: js.UndefOr[Double | String] = js.native
  
  var keySplines: js.UndefOr[Double | String] = js.native
  
  var keyTimes: js.UndefOr[Double | String] = js.native
  
  var lang: js.UndefOr[String] = js.native
  
  var lengthAdjust: js.UndefOr[Double | String] = js.native
  
  var `letter-spacing`: js.UndefOr[Double | String] = js.native
  
  var letterSpacing: js.UndefOr[Double | String] = js.native
  
  var `lighting-color`: js.UndefOr[Double | String] = js.native
  
  var lightingColor: js.UndefOr[Double | String] = js.native
  
  var limitingConeAngle: js.UndefOr[Double | String] = js.native
  
  var local: js.UndefOr[Double | String] = js.native
  
  var `marker-end`: js.UndefOr[String] = js.native
  
  var `marker-mid`: js.UndefOr[String] = js.native
  
  var `marker-start`: js.UndefOr[String] = js.native
  
  var markerEnd: js.UndefOr[String] = js.native
  
  var markerHeight: js.UndefOr[Double | String] = js.native
  
  var markerMid: js.UndefOr[String] = js.native
  
  var markerStart: js.UndefOr[String] = js.native
  
  var markerUnits: js.UndefOr[Double | String] = js.native
  
  var markerWidth: js.UndefOr[Double | String] = js.native
  
  var mask: js.UndefOr[String] = js.native
  
  var maskContentUnits: js.UndefOr[Double | String] = js.native
  
  var maskUnits: js.UndefOr[Double | String] = js.native
  
  var mathematical: js.UndefOr[Double | String] = js.native
  
  var max: js.UndefOr[Double | String] = js.native
  
  var media: js.UndefOr[String] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var min: js.UndefOr[Double | String] = js.native
  
  var mode: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var numOctaves: js.UndefOr[Double | String] = js.native
  
  var offset: js.UndefOr[Double | String] = js.native
  
  var opacity: js.UndefOr[Double | String] = js.native
  
  var operator: js.UndefOr[Double | String] = js.native
  
  var order: js.UndefOr[Double | String] = js.native
  
  var orient: js.UndefOr[Double | String] = js.native
  
  var orientation: js.UndefOr[Double | String] = js.native
  
  var origin: js.UndefOr[Double | String] = js.native
  
  var overflow: js.UndefOr[Double | String] = js.native
  
  var `overline-position`: js.UndefOr[Double | String] = js.native
  
  var `overline-thickness`: js.UndefOr[Double | String] = js.native
  
  var overlinePosition: js.UndefOr[Double | String] = js.native
  
  var overlineThickness: js.UndefOr[Double | String] = js.native
  
  var `paint-order`: js.UndefOr[Double | String] = js.native
  
  var paintOrder: js.UndefOr[Double | String] = js.native
  
  var `panose-1`: js.UndefOr[Double | String] = js.native
  
  var panose1: js.UndefOr[Double | String] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var pathLength: js.UndefOr[Double | String] = js.native
  
  var patternContentUnits: js.UndefOr[String] = js.native
  
  var patternTransform: js.UndefOr[Double | String] = js.native
  
  var patternUnits: js.UndefOr[String] = js.native
  
  var `pointer-events`: js.UndefOr[Double | String] = js.native
  
  var pointerEvents: js.UndefOr[Double | String] = js.native
  
  var points: js.UndefOr[String] = js.native
  
  var pointsAtX: js.UndefOr[Double | String] = js.native
  
  var pointsAtY: js.UndefOr[Double | String] = js.native
  
  var pointsAtZ: js.UndefOr[Double | String] = js.native
  
  var preserveAlpha: js.UndefOr[Booleanish] = js.native
  
  var preserveAspectRatio: js.UndefOr[String] = js.native
  
  var primitiveUnits: js.UndefOr[Double | String] = js.native
  
  var r: js.UndefOr[Double | String] = js.native
  
  var radius: js.UndefOr[Double | String] = js.native
  
  var refX: js.UndefOr[Double | String] = js.native
  
  var refY: js.UndefOr[Double | String] = js.native
  
  var `rendering-intent`: js.UndefOr[Double | String] = js.native
  
  var renderingIntent: js.UndefOr[Double | String] = js.native
  
  var repeatCount: js.UndefOr[Double | String] = js.native
  
  var repeatDur: js.UndefOr[Double | String] = js.native
  
  var requiredExtensions: js.UndefOr[Double | String] = js.native
  
  var requiredFeatures: js.UndefOr[Double | String] = js.native
  
  var restart: js.UndefOr[Double | String] = js.native
  
  var result: js.UndefOr[String] = js.native
  
  // Other HTML properties supported by SVG elements in browsers
  var role: js.UndefOr[String] = js.native
  
  var rotate: js.UndefOr[Double | String] = js.native
  
  var rx: js.UndefOr[Double | String] = js.native
  
  var ry: js.UndefOr[Double | String] = js.native
  
  var scale: js.UndefOr[Double | String] = js.native
  
  var seed: js.UndefOr[Double | String] = js.native
  
  var `shape-rendering`: js.UndefOr[Double | String] = js.native
  
  var shapeRendering: js.UndefOr[Double | String] = js.native
  
  var slope: js.UndefOr[Double | String] = js.native
  
  var spacing: js.UndefOr[Double | String] = js.native
  
  var specularConstant: js.UndefOr[Double | String] = js.native
  
  var specularExponent: js.UndefOr[Double | String] = js.native
  
  var speed: js.UndefOr[Double | String] = js.native
  
  var spreadMethod: js.UndefOr[String] = js.native
  
  var startOffset: js.UndefOr[Double | String] = js.native
  
  var stdDeviation: js.UndefOr[Double | String] = js.native
  
  var stemh: js.UndefOr[Double | String] = js.native
  
  var stemv: js.UndefOr[Double | String] = js.native
  
  var stitchTiles: js.UndefOr[Double | String] = js.native
  
  var `stop-color`: js.UndefOr[String] = js.native
  
  var `stop-opacity`: js.UndefOr[Double | String] = js.native
  
  var stopColor: js.UndefOr[String] = js.native
  
  var stopOpacity: js.UndefOr[Double | String] = js.native
  
  var `strikethrough-position`: js.UndefOr[Double | String] = js.native
  
  var `strikethrough-thickness`: js.UndefOr[Double | String] = js.native
  
  var strikethroughPosition: js.UndefOr[Double | String] = js.native
  
  var strikethroughThickness: js.UndefOr[Double | String] = js.native
  
  var string: js.UndefOr[Double | String] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var `stroke-dasharray`: js.UndefOr[String | Double] = js.native
  
  var `stroke-dashoffset`: js.UndefOr[String | Double] = js.native
  
  var `stroke-linecap`: js.UndefOr[butt | round | square | inherit] = js.native
  
  var `stroke-linejoin`: js.UndefOr[miter | round | bevel | inherit] = js.native
  
  var `stroke-miterlimit`: js.UndefOr[Double | String] = js.native
  
  var `stroke-opacity`: js.UndefOr[Double | String] = js.native
  
  var `stroke-width`: js.UndefOr[Double | String] = js.native
  
  var strokeDasharray: js.UndefOr[String | Double] = js.native
  
  var strokeDashoffset: js.UndefOr[String | Double] = js.native
  
  var strokeLinecap: js.UndefOr[butt | round | square | inherit] = js.native
  
  var strokeLinejoin: js.UndefOr[miter | round | bevel | inherit] = js.native
  
  var strokeMiterlimit: js.UndefOr[Double | String] = js.native
  
  var strokeOpacity: js.UndefOr[Double | String] = js.native
  
  var strokeWidth: js.UndefOr[Double | String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var surfaceScale: js.UndefOr[Double | String] = js.native
  
  var systemLanguage: js.UndefOr[Double | String] = js.native
  
  var tabIndex: js.UndefOr[Double] = js.native
  
  var tabindex: js.UndefOr[Double | String] = js.native
  
  var tableValues: js.UndefOr[Double | String] = js.native
  
  var target: js.UndefOr[String] = js.native
  
  var targetX: js.UndefOr[Double | String] = js.native
  
  var targetY: js.UndefOr[Double | String] = js.native
  
  var `text-anchor`: js.UndefOr[String] = js.native
  
  var `text-decoration`: js.UndefOr[Double | String] = js.native
  
  var `text-rendering`: js.UndefOr[Double | String] = js.native
  
  var textAnchor: js.UndefOr[String] = js.native
  
  var textDecoration: js.UndefOr[Double | String] = js.native
  
  var textLength: js.UndefOr[Double | String] = js.native
  
  var textRendering: js.UndefOr[Double | String] = js.native
  
  var to: js.UndefOr[Double | String] = js.native
  
  var transform: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var u1: js.UndefOr[Double | String] = js.native
  
  var u2: js.UndefOr[Double | String] = js.native
  
  var `underline-position`: js.UndefOr[Double | String] = js.native
  
  var `underline-thickness`: js.UndefOr[Double | String] = js.native
  
  var underlinePosition: js.UndefOr[Double | String] = js.native
  
  var underlineThickness: js.UndefOr[Double | String] = js.native
  
  var unicode: js.UndefOr[Double | String] = js.native
  
  var `unicode-bidi`: js.UndefOr[Double | String] = js.native
  
  var `unicode-range`: js.UndefOr[Double | String] = js.native
  
  var unicodeBidi: js.UndefOr[Double | String] = js.native
  
  var unicodeRange: js.UndefOr[Double | String] = js.native
  
  var `units-per-em`: js.UndefOr[Double | String] = js.native
  
  var unitsPerEm: js.UndefOr[Double | String] = js.native
  
  var `v-alphabetic`: js.UndefOr[Double | String] = js.native
  
  var `v-hanging`: js.UndefOr[Double | String] = js.native
  
  var `v-ideographic`: js.UndefOr[Double | String] = js.native
  
  var `v-mathematical`: js.UndefOr[Double | String] = js.native
  
  var vAlphabetic: js.UndefOr[Double | String] = js.native
  
  var vHanging: js.UndefOr[Double | String] = js.native
  
  var vIdeographic: js.UndefOr[Double | String] = js.native
  
  var vMathematical: js.UndefOr[Double | String] = js.native
  
  var values: js.UndefOr[String] = js.native
  
  var `vector-effect`: js.UndefOr[Double | String] = js.native
  
  var vectorEffect: js.UndefOr[Double | String] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  var `vert-adv-y`: js.UndefOr[Double | String] = js.native
  
  var `vert-origin-x`: js.UndefOr[Double | String] = js.native
  
  var `vert-origin-y`: js.UndefOr[Double | String] = js.native
  
  var vertAdvY: js.UndefOr[Double | String] = js.native
  
  var vertOriginX: js.UndefOr[Double | String] = js.native
  
  var vertOriginY: js.UndefOr[Double | String] = js.native
  
  var viewBox: js.UndefOr[String] = js.native
  
  var viewTarget: js.UndefOr[Double | String] = js.native
  
  var visibility: js.UndefOr[Double | String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
  
  var widths: js.UndefOr[Double | String] = js.native
  
  var `word-spacing`: js.UndefOr[Double | String] = js.native
  
  var wordSpacing: js.UndefOr[Double | String] = js.native
  
  var `writing-mode`: js.UndefOr[Double | String] = js.native
  
  var writingMode: js.UndefOr[Double | String] = js.native
  
  var x: js.UndefOr[Double | String] = js.native
  
  var `x-height`: js.UndefOr[Double | String] = js.native
  
  var x1: js.UndefOr[Double | String] = js.native
  
  var x2: js.UndefOr[Double | String] = js.native
  
  var xChannelSelector: js.UndefOr[String] = js.native
  
  var xHeight: js.UndefOr[Double | String] = js.native
  
  var xlinkActuate: js.UndefOr[String] = js.native
  
  var xlinkArcrole: js.UndefOr[String] = js.native
  
  @JSName("xlink:actuate")
  var xlinkColonactuate: js.UndefOr[String] = js.native
  
  @JSName("xlink:arcrole")
  var xlinkColonarcrole: js.UndefOr[String] = js.native
  
  @JSName("xlink:href")
  var xlinkColonhref: js.UndefOr[String] = js.native
  
  @JSName("xlink:role")
  var xlinkColonrole: js.UndefOr[String] = js.native
  
  @JSName("xlink:show")
  var xlinkColonshow: js.UndefOr[String] = js.native
  
  @JSName("xlink:title")
  var xlinkColontitle: js.UndefOr[String] = js.native
  
  @JSName("xlink:type")
  var xlinkColontype: js.UndefOr[String] = js.native
  
  var xlinkHref: js.UndefOr[String] = js.native
  
  var xlinkRole: js.UndefOr[String] = js.native
  
  var xlinkShow: js.UndefOr[String] = js.native
  
  var xlinkTitle: js.UndefOr[String] = js.native
  
  var xlinkType: js.UndefOr[String] = js.native
  
  var xmlBase: js.UndefOr[String] = js.native
  
  @JSName("xml:base")
  var xmlColonbase: js.UndefOr[String] = js.native
  
  @JSName("xml:lang")
  var xmlColonlang: js.UndefOr[String] = js.native
  
  @JSName("xml:space")
  var xmlColonspace: js.UndefOr[String] = js.native
  
  var xmlLang: js.UndefOr[String] = js.native
  
  var xmlSpace: js.UndefOr[String] = js.native
  
  var xmlns: js.UndefOr[String] = js.native
  
  @JSName("xmlns:xlink")
  var xmlnsColonxlink: js.UndefOr[String] = js.native
  
  var xmlnsXlink: js.UndefOr[String] = js.native
  
  var y: js.UndefOr[Double | String] = js.native
  
  var y1: js.UndefOr[Double | String] = js.native
  
  var y2: js.UndefOr[Double | String] = js.native
  
  var yChannelSelector: js.UndefOr[String] = js.native
  
  var z: js.UndefOr[Double | String] = js.native
  
  var zoomAndPan: js.UndefOr[String] = js.native
}
object SVGAttributes {
  
  @scala.inline
  def apply[T](): SVGAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGAttributes[T]]
  }
  
  @scala.inline
  implicit class SVGAttributesMutableBuilder[Self <: SVGAttributes[_], T] (val x: Self with SVGAttributes[T]) extends AnyVal {
    
    @scala.inline
    def `setAccent-height`(value: Double | String): Self = StObject.set(x, "accent-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAccent-heightUndefined`: Self = StObject.set(x, "accent-height", js.undefined)
    
    @scala.inline
    def setAccentHeight(value: Double | String): Self = StObject.set(x, "accentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccentHeightUndefined: Self = StObject.set(x, "accentHeight", js.undefined)
    
    @scala.inline
    def setAccumulate(value: none | sum): Self = StObject.set(x, "accumulate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccumulateUndefined: Self = StObject.set(x, "accumulate", js.undefined)
    
    @scala.inline
    def setAdditive(value: replace | sum): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    @scala.inline
    def `setAlignment-baseline`(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = StObject.set(x, "alignment-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAlignment-baselineUndefined`: Self = StObject.set(x, "alignment-baseline", js.undefined)
    
    @scala.inline
    def setAlignmentBaseline(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    @scala.inline
    def setAllowReorder(value: no | yes): Self = StObject.set(x, "allowReorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReorderUndefined: Self = StObject.set(x, "allowReorder", js.undefined)
    
    @scala.inline
    def setAlphabetic(value: Double | String): Self = StObject.set(x, "alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphabeticUndefined: Self = StObject.set(x, "alphabetic", js.undefined)
    
    @scala.inline
    def setAmplitude(value: Double | String): Self = StObject.set(x, "amplitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmplitudeUndefined: Self = StObject.set(x, "amplitude", js.undefined)
    
    @scala.inline
    def `setArabic-form`(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabic-form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setArabic-formUndefined`: Self = StObject.set(x, "arabic-form", js.undefined)
    
    @scala.inline
    def setArabicForm(value: initial | medial | terminal | isolated): Self = StObject.set(x, "arabicForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArabicFormUndefined: Self = StObject.set(x, "arabicForm", js.undefined)
    
    @scala.inline
    def setAscent(value: Double | String): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
    
    @scala.inline
    def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
    
    @scala.inline
    def setAttributeType(value: String): Self = StObject.set(x, "attributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "attributeType", js.undefined)
    
    @scala.inline
    def setAutoReverse(value: Booleanish): Self = StObject.set(x, "autoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReverseUndefined: Self = StObject.set(x, "autoReverse", js.undefined)
    
    @scala.inline
    def setAzimuth(value: Double | String): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzimuthUndefined: Self = StObject.set(x, "azimuth", js.undefined)
    
    @scala.inline
    def setBaseFrequency(value: Double | String): Self = StObject.set(x, "baseFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseFrequencyUndefined: Self = StObject.set(x, "baseFrequency", js.undefined)
    
    @scala.inline
    def setBaseProfile(value: Double | String): Self = StObject.set(x, "baseProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseProfileUndefined: Self = StObject.set(x, "baseProfile", js.undefined)
    
    @scala.inline
    def `setBaseline-shift`(value: Double | String): Self = StObject.set(x, "baseline-shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBaseline-shiftUndefined`: Self = StObject.set(x, "baseline-shift", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: Double | String): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    @scala.inline
    def setBbox(value: Double | String): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
    
    @scala.inline
    def setBegin(value: Double | String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setBias(value: Double | String): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBiasUndefined: Self = StObject.set(x, "bias", js.undefined)
    
    @scala.inline
    def setBy(value: Double | String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setCalcMode(value: Double | String): Self = StObject.set(x, "calcMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalcModeUndefined: Self = StObject.set(x, "calcMode", js.undefined)
    
    @scala.inline
    def `setCap-height`(value: Double | String): Self = StObject.set(x, "cap-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCap-heightUndefined`: Self = StObject.set(x, "cap-height", js.undefined)
    
    @scala.inline
    def setCapHeight(value: Double | String): Self = StObject.set(x, "capHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapHeightUndefined: Self = StObject.set(x, "capHeight", js.undefined)
    
    @scala.inline
    def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setClip(value: Double | String): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClip-path`(value: String): Self = StObject.set(x, "clip-path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClip-pathUndefined`: Self = StObject.set(x, "clip-path", js.undefined)
    
    @scala.inline
    def `setClip-rule`(value: Double | String): Self = StObject.set(x, "clip-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setClip-ruleUndefined`: Self = StObject.set(x, "clip-rule", js.undefined)
    
    @scala.inline
    def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    @scala.inline
    def setClipPathUnits(value: Double | String): Self = StObject.set(x, "clipPathUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipPathUnitsUndefined: Self = StObject.set(x, "clipPathUnits", js.undefined)
    
    @scala.inline
    def setClipRule(value: Double | String): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-interpolation`(value: Double | String): Self = StObject.set(x, "color-interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-interpolation-filters`(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "color-interpolation-filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-interpolation-filtersUndefined`: Self = StObject.set(x, "color-interpolation-filters", js.undefined)
    
    @scala.inline
    def `setColor-interpolationUndefined`: Self = StObject.set(x, "color-interpolation", js.undefined)
    
    @scala.inline
    def `setColor-profile`(value: Double | String): Self = StObject.set(x, "color-profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-profileUndefined`: Self = StObject.set(x, "color-profile", js.undefined)
    
    @scala.inline
    def `setColor-rendering`(value: Double | String): Self = StObject.set(x, "color-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setColor-renderingUndefined`: Self = StObject.set(x, "color-rendering", js.undefined)
    
    @scala.inline
    def setColorInterpolation(value: Double | String): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = StObject.set(x, "colorInterpolationFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationFiltersUndefined: Self = StObject.set(x, "colorInterpolationFilters", js.undefined)
    
    @scala.inline
    def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorProfile(value: Double | String): Self = StObject.set(x, "colorProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorProfileUndefined: Self = StObject.set(x, "colorProfile", js.undefined)
    
    @scala.inline
    def setColorRendering(value: Double | String): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setContentScriptType(value: Double | String): Self = StObject.set(x, "contentScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentScriptTypeUndefined: Self = StObject.set(x, "contentScriptType", js.undefined)
    
    @scala.inline
    def setContentStyleType(value: Double | String): Self = StObject.set(x, "contentStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentStyleTypeUndefined: Self = StObject.set(x, "contentStyleType", js.undefined)
    
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    @scala.inline
    def setCursor(value: Double | String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setDecelerate(value: Double | String): Self = StObject.set(x, "decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerateUndefined: Self = StObject.set(x, "decelerate", js.undefined)
    
    @scala.inline
    def setDescent(value: Double | String): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
    
    @scala.inline
    def setDiffuseConstant(value: Double | String): Self = StObject.set(x, "diffuseConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiffuseConstantUndefined: Self = StObject.set(x, "diffuseConstant", js.undefined)
    
    @scala.inline
    def setDirection(value: Double | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisplay(value: Double | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDivisor(value: Double | String): Self = StObject.set(x, "divisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDivisorUndefined: Self = StObject.set(x, "divisor", js.undefined)
    
    @scala.inline
    def `setDominant-baseline`(value: Double | String): Self = StObject.set(x, "dominant-baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDominant-baselineUndefined`: Self = StObject.set(x, "dominant-baseline", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: Double | String): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    @scala.inline
    def setDur(value: Double | String): Self = StObject.set(x, "dur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurUndefined: Self = StObject.set(x, "dur", js.undefined)
    
    @scala.inline
    def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setEdgeMode(value: Double | String): Self = StObject.set(x, "edgeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeModeUndefined: Self = StObject.set(x, "edgeMode", js.undefined)
    
    @scala.inline
    def setElevation(value: Double | String): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    @scala.inline
    def `setEnable-background`(value: Double | String): Self = StObject.set(x, "enable-background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setEnable-backgroundUndefined`: Self = StObject.set(x, "enable-background", js.undefined)
    
    @scala.inline
    def setEnableBackground(value: Double | String): Self = StObject.set(x, "enableBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableBackgroundUndefined: Self = StObject.set(x, "enableBackground", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setExponent(value: Double | String): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    @scala.inline
    def setExternalResourcesRequired(value: Booleanish): Self = StObject.set(x, "externalResourcesRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalResourcesRequiredUndefined: Self = StObject.set(x, "externalResourcesRequired", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacity`(value: Double | String): Self = StObject.set(x, "fill-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-opacityUndefined`: Self = StObject.set(x, "fill-opacity", js.undefined)
    
    @scala.inline
    def `setFill-rule`(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fill-rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-ruleUndefined`: Self = StObject.set(x, "fill-rule", js.undefined)
    
    @scala.inline
    def setFillOpacity(value: Double | String): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: nonzero | evenodd | inherit): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterRes(value: Double | String): Self = StObject.set(x, "filterRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterResUndefined: Self = StObject.set(x, "filterRes", js.undefined)
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterUnits(value: Double | String): Self = StObject.set(x, "filterUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUnitsUndefined: Self = StObject.set(x, "filterUnits", js.undefined)
    
    @scala.inline
    def `setFlood-color`(value: Double | String): Self = StObject.set(x, "flood-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlood-colorUndefined`: Self = StObject.set(x, "flood-color", js.undefined)
    
    @scala.inline
    def `setFlood-opacity`(value: Double | String): Self = StObject.set(x, "flood-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFlood-opacityUndefined`: Self = StObject.set(x, "flood-opacity", js.undefined)
    
    @scala.inline
    def setFloodColor(value: Double | String): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: Double | String): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    @scala.inline
    def setFocusable(value: Booleanish | auto): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    @scala.inline
    def `setFont-family`(value: String): Self = StObject.set(x, "font-family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-familyUndefined`: Self = StObject.set(x, "font-family", js.undefined)
    
    @scala.inline
    def `setFont-size`(value: Double | String): Self = StObject.set(x, "font-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-size-adjust`(value: Double | String): Self = StObject.set(x, "font-size-adjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-size-adjustUndefined`: Self = StObject.set(x, "font-size-adjust", js.undefined)
    
    @scala.inline
    def `setFont-sizeUndefined`: Self = StObject.set(x, "font-size", js.undefined)
    
    @scala.inline
    def `setFont-stretch`(value: Double | String): Self = StObject.set(x, "font-stretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-stretchUndefined`: Self = StObject.set(x, "font-stretch", js.undefined)
    
    @scala.inline
    def `setFont-style`(value: Double | String): Self = StObject.set(x, "font-style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-styleUndefined`: Self = StObject.set(x, "font-style", js.undefined)
    
    @scala.inline
    def `setFont-variant`(value: Double | String): Self = StObject.set(x, "font-variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-variantUndefined`: Self = StObject.set(x, "font-variant", js.undefined)
    
    @scala.inline
    def `setFont-weight`(value: Double | String): Self = StObject.set(x, "font-weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFont-weightUndefined`: Self = StObject.set(x, "font-weight", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double | String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = StObject.set(x, "fontSizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeAdjustUndefined: Self = StObject.set(x, "fontSizeAdjust", js.undefined)
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStretch(value: Double | String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: Double | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: Double | String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setFormat(value: Double | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFrom(value: Double | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFx(value: Double | String): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
    
    @scala.inline
    def setFy(value: Double | String): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
    
    @scala.inline
    def setG1(value: Double | String): Self = StObject.set(x, "g1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG1Undefined: Self = StObject.set(x, "g1", js.undefined)
    
    @scala.inline
    def setG2(value: Double | String): Self = StObject.set(x, "g2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG2Undefined: Self = StObject.set(x, "g2", js.undefined)
    
    @scala.inline
    def `setGlyph-name`(value: Double | String): Self = StObject.set(x, "glyph-name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGlyph-nameUndefined`: Self = StObject.set(x, "glyph-name", js.undefined)
    
    @scala.inline
    def `setGlyph-orientation-horizontal`(value: Double | String): Self = StObject.set(x, "glyph-orientation-horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGlyph-orientation-horizontalUndefined`: Self = StObject.set(x, "glyph-orientation-horizontal", js.undefined)
    
    @scala.inline
    def `setGlyph-orientation-vertical`(value: Double | String): Self = StObject.set(x, "glyph-orientation-vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setGlyph-orientation-verticalUndefined`: Self = StObject.set(x, "glyph-orientation-vertical", js.undefined)
    
    @scala.inline
    def setGlyphName(value: Double | String): Self = StObject.set(x, "glyphName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphNameUndefined: Self = StObject.set(x, "glyphName", js.undefined)
    
    @scala.inline
    def setGlyphOrientationHorizontal(value: Double | String): Self = StObject.set(x, "glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationHorizontalUndefined: Self = StObject.set(x, "glyphOrientationHorizontal", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: Double | String): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setGlyphRef(value: Double | String): Self = StObject.set(x, "glyphRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphRefUndefined: Self = StObject.set(x, "glyphRef", js.undefined)
    
    @scala.inline
    def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    @scala.inline
    def setGradientUnits(value: String): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
    
    @scala.inline
    def setHanging(value: Double | String): Self = StObject.set(x, "hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHangingUndefined: Self = StObject.set(x, "hanging", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def `setHoriz-adv-x`(value: Double | String): Self = StObject.set(x, "horiz-adv-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHoriz-adv-xUndefined`: Self = StObject.set(x, "horiz-adv-x", js.undefined)
    
    @scala.inline
    def `setHoriz-origin-x`(value: Double | String): Self = StObject.set(x, "horiz-origin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHoriz-origin-xUndefined`: Self = StObject.set(x, "horiz-origin-x", js.undefined)
    
    @scala.inline
    def setHorizAdvX(value: Double | String): Self = StObject.set(x, "horizAdvX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizAdvXUndefined: Self = StObject.set(x, "horizAdvX", js.undefined)
    
    @scala.inline
    def setHorizOriginX(value: Double | String): Self = StObject.set(x, "horizOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizOriginXUndefined: Self = StObject.set(x, "horizOriginX", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIdeographic(value: Double | String): Self = StObject.set(x, "ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdeographicUndefined: Self = StObject.set(x, "ideographic", js.undefined)
    
    @scala.inline
    def `setImage-rendering`(value: Double | String): Self = StObject.set(x, "image-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setImage-renderingUndefined`: Self = StObject.set(x, "image-rendering", js.undefined)
    
    @scala.inline
    def setImageRendering(value: Double | String): Self = StObject.set(x, "imageRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageRenderingUndefined: Self = StObject.set(x, "imageRendering", js.undefined)
    
    @scala.inline
    def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn2(value: Double | String): Self = StObject.set(x, "in2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIn2Undefined: Self = StObject.set(x, "in2", js.undefined)
    
    @scala.inline
    def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    @scala.inline
    def setIntercept(value: Double | String): Self = StObject.set(x, "intercept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptUndefined: Self = StObject.set(x, "intercept", js.undefined)
    
    @scala.inline
    def setK(value: Double | String): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK1(value: Double | String): Self = StObject.set(x, "k1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK1Undefined: Self = StObject.set(x, "k1", js.undefined)
    
    @scala.inline
    def setK2(value: Double | String): Self = StObject.set(x, "k2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK2Undefined: Self = StObject.set(x, "k2", js.undefined)
    
    @scala.inline
    def setK3(value: Double | String): Self = StObject.set(x, "k3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK3Undefined: Self = StObject.set(x, "k3", js.undefined)
    
    @scala.inline
    def setK4(value: Double | String): Self = StObject.set(x, "k4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setK4Undefined: Self = StObject.set(x, "k4", js.undefined)
    
    @scala.inline
    def setKUndefined: Self = StObject.set(x, "k", js.undefined)
    
    @scala.inline
    def setKernelMatrix(value: Double | String): Self = StObject.set(x, "kernelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelMatrixUndefined: Self = StObject.set(x, "kernelMatrix", js.undefined)
    
    @scala.inline
    def setKernelUnitLength(value: Double | String): Self = StObject.set(x, "kernelUnitLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelUnitLengthUndefined: Self = StObject.set(x, "kernelUnitLength", js.undefined)
    
    @scala.inline
    def setKerning(value: Double | String): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    @scala.inline
    def setKeyPoints(value: Double | String): Self = StObject.set(x, "keyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPointsUndefined: Self = StObject.set(x, "keyPoints", js.undefined)
    
    @scala.inline
    def setKeySplines(value: Double | String): Self = StObject.set(x, "keySplines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySplinesUndefined: Self = StObject.set(x, "keySplines", js.undefined)
    
    @scala.inline
    def setKeyTimes(value: Double | String): Self = StObject.set(x, "keyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTimesUndefined: Self = StObject.set(x, "keyTimes", js.undefined)
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setLengthAdjust(value: Double | String): Self = StObject.set(x, "lengthAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthAdjustUndefined: Self = StObject.set(x, "lengthAdjust", js.undefined)
    
    @scala.inline
    def `setLetter-spacing`(value: Double | String): Self = StObject.set(x, "letter-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLetter-spacingUndefined`: Self = StObject.set(x, "letter-spacing", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double | String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def `setLighting-color`(value: Double | String): Self = StObject.set(x, "lighting-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLighting-colorUndefined`: Self = StObject.set(x, "lighting-color", js.undefined)
    
    @scala.inline
    def setLightingColor(value: Double | String): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    @scala.inline
    def setLimitingConeAngle(value: Double | String): Self = StObject.set(x, "limitingConeAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitingConeAngleUndefined: Self = StObject.set(x, "limitingConeAngle", js.undefined)
    
    @scala.inline
    def setLocal(value: Double | String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def `setMarker-end`(value: String): Self = StObject.set(x, "marker-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMarker-endUndefined`: Self = StObject.set(x, "marker-end", js.undefined)
    
    @scala.inline
    def `setMarker-mid`(value: String): Self = StObject.set(x, "marker-mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMarker-midUndefined`: Self = StObject.set(x, "marker-mid", js.undefined)
    
    @scala.inline
    def `setMarker-start`(value: String): Self = StObject.set(x, "marker-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMarker-startUndefined`: Self = StObject.set(x, "marker-start", js.undefined)
    
    @scala.inline
    def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerHeight(value: Double | String): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setMarkerUnits(value: Double | String): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
    
    @scala.inline
    def setMarkerWidth(value: Double | String): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnits(value: Double | String): Self = StObject.set(x, "maskContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskContentUnitsUndefined: Self = StObject.set(x, "maskContentUnits", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setMaskUnits(value: Double | String): Self = StObject.set(x, "maskUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUnitsUndefined: Self = StObject.set(x, "maskUnits", js.undefined)
    
    @scala.inline
    def setMathematical(value: Double | String): Self = StObject.set(x, "mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMathematicalUndefined: Self = StObject.set(x, "mathematical", js.undefined)
    
    @scala.inline
    def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumOctaves(value: Double | String): Self = StObject.set(x, "numOctaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumOctavesUndefined: Self = StObject.set(x, "numOctaves", js.undefined)
    
    @scala.inline
    def setOffset(value: Double | String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double | String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setOperator(value: Double | String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setOrder(value: Double | String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrient(value: Double | String): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setOrientation(value: Double | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setOrigin(value: Double | String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOverflow(value: Double | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    @scala.inline
    def `setOverline-position`(value: Double | String): Self = StObject.set(x, "overline-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverline-positionUndefined`: Self = StObject.set(x, "overline-position", js.undefined)
    
    @scala.inline
    def `setOverline-thickness`(value: Double | String): Self = StObject.set(x, "overline-thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOverline-thicknessUndefined`: Self = StObject.set(x, "overline-thickness", js.undefined)
    
    @scala.inline
    def setOverlinePosition(value: Double | String): Self = StObject.set(x, "overlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlinePositionUndefined: Self = StObject.set(x, "overlinePosition", js.undefined)
    
    @scala.inline
    def setOverlineThickness(value: Double | String): Self = StObject.set(x, "overlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlineThicknessUndefined: Self = StObject.set(x, "overlineThickness", js.undefined)
    
    @scala.inline
    def `setPaint-order`(value: Double | String): Self = StObject.set(x, "paint-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPaint-orderUndefined`: Self = StObject.set(x, "paint-order", js.undefined)
    
    @scala.inline
    def setPaintOrder(value: Double | String): Self = StObject.set(x, "paintOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintOrderUndefined: Self = StObject.set(x, "paintOrder", js.undefined)
    
    @scala.inline
    def `setPanose-1`(value: Double | String): Self = StObject.set(x, "panose-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPanose-1Undefined`: Self = StObject.set(x, "panose-1", js.undefined)
    
    @scala.inline
    def setPanose1(value: Double | String): Self = StObject.set(x, "panose1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanose1Undefined: Self = StObject.set(x, "panose1", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLength(value: Double | String): Self = StObject.set(x, "pathLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathLengthUndefined: Self = StObject.set(x, "pathLength", js.undefined)
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPatternContentUnits(value: String): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
    
    @scala.inline
    def setPatternTransform(value: Double | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
    
    @scala.inline
    def setPatternUnits(value: String): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
    
    @scala.inline
    def `setPointer-events`(value: Double | String): Self = StObject.set(x, "pointer-events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPointer-eventsUndefined`: Self = StObject.set(x, "pointer-events", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: Double | String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setPoints(value: String): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtX(value: Double | String): Self = StObject.set(x, "pointsAtX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtXUndefined: Self = StObject.set(x, "pointsAtX", js.undefined)
    
    @scala.inline
    def setPointsAtY(value: Double | String): Self = StObject.set(x, "pointsAtY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtYUndefined: Self = StObject.set(x, "pointsAtY", js.undefined)
    
    @scala.inline
    def setPointsAtZ(value: Double | String): Self = StObject.set(x, "pointsAtZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsAtZUndefined: Self = StObject.set(x, "pointsAtZ", js.undefined)
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPreserveAlpha(value: Booleanish): Self = StObject.set(x, "preserveAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAlphaUndefined: Self = StObject.set(x, "preserveAlpha", js.undefined)
    
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
    
    @scala.inline
    def setPrimitiveUnits(value: Double | String): Self = StObject.set(x, "primitiveUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveUnitsUndefined: Self = StObject.set(x, "primitiveUnits", js.undefined)
    
    @scala.inline
    def setR(value: Double | String): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    @scala.inline
    def setRadius(value: Double | String): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRefX(value: Double | String): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
    
    @scala.inline
    def setRefY(value: Double | String): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
    
    @scala.inline
    def `setRendering-intent`(value: Double | String): Self = StObject.set(x, "rendering-intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRendering-intentUndefined`: Self = StObject.set(x, "rendering-intent", js.undefined)
    
    @scala.inline
    def setRenderingIntent(value: Double | String): Self = StObject.set(x, "renderingIntent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderingIntentUndefined: Self = StObject.set(x, "renderingIntent", js.undefined)
    
    @scala.inline
    def setRepeatCount(value: Double | String): Self = StObject.set(x, "repeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCountUndefined: Self = StObject.set(x, "repeatCount", js.undefined)
    
    @scala.inline
    def setRepeatDur(value: Double | String): Self = StObject.set(x, "repeatDur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDurUndefined: Self = StObject.set(x, "repeatDur", js.undefined)
    
    @scala.inline
    def setRequiredExtensions(value: Double | String): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExtensionsUndefined: Self = StObject.set(x, "requiredExtensions", js.undefined)
    
    @scala.inline
    def setRequiredFeatures(value: Double | String): Self = StObject.set(x, "requiredFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredFeaturesUndefined: Self = StObject.set(x, "requiredFeatures", js.undefined)
    
    @scala.inline
    def setRestart(value: Double | String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setRotate(value: Double | String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    @scala.inline
    def setRx(value: Double | String): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
    
    @scala.inline
    def setRy(value: Double | String): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
    
    @scala.inline
    def setScale(value: Double | String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setSeed(value: Double | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
    
    @scala.inline
    def `setShape-rendering`(value: Double | String): Self = StObject.set(x, "shape-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setShape-renderingUndefined`: Self = StObject.set(x, "shape-rendering", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: Double | String): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    @scala.inline
    def setSlope(value: Double | String): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double | String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setSpecularConstant(value: Double | String): Self = StObject.set(x, "specularConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularConstantUndefined: Self = StObject.set(x, "specularConstant", js.undefined)
    
    @scala.inline
    def setSpecularExponent(value: Double | String): Self = StObject.set(x, "specularExponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecularExponentUndefined: Self = StObject.set(x, "specularExponent", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double | String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    @scala.inline
    def setSpreadMethod(value: String): Self = StObject.set(x, "spreadMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadMethodUndefined: Self = StObject.set(x, "spreadMethod", js.undefined)
    
    @scala.inline
    def setStartOffset(value: Double | String): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffsetUndefined: Self = StObject.set(x, "startOffset", js.undefined)
    
    @scala.inline
    def setStdDeviation(value: Double | String): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
    
    @scala.inline
    def setStemh(value: Double | String): Self = StObject.set(x, "stemh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemhUndefined: Self = StObject.set(x, "stemh", js.undefined)
    
    @scala.inline
    def setStemv(value: Double | String): Self = StObject.set(x, "stemv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStemvUndefined: Self = StObject.set(x, "stemv", js.undefined)
    
    @scala.inline
    def setStitchTiles(value: Double | String): Self = StObject.set(x, "stitchTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStitchTilesUndefined: Self = StObject.set(x, "stitchTiles", js.undefined)
    
    @scala.inline
    def `setStop-color`(value: String): Self = StObject.set(x, "stop-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStop-colorUndefined`: Self = StObject.set(x, "stop-color", js.undefined)
    
    @scala.inline
    def `setStop-opacity`(value: Double | String): Self = StObject.set(x, "stop-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStop-opacityUndefined`: Self = StObject.set(x, "stop-opacity", js.undefined)
    
    @scala.inline
    def setStopColor(value: String): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: Double | String): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    @scala.inline
    def `setStrikethrough-position`(value: Double | String): Self = StObject.set(x, "strikethrough-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStrikethrough-positionUndefined`: Self = StObject.set(x, "strikethrough-position", js.undefined)
    
    @scala.inline
    def `setStrikethrough-thickness`(value: Double | String): Self = StObject.set(x, "strikethrough-thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStrikethrough-thicknessUndefined`: Self = StObject.set(x, "strikethrough-thickness", js.undefined)
    
    @scala.inline
    def setStrikethroughPosition(value: Double | String): Self = StObject.set(x, "strikethroughPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughPositionUndefined: Self = StObject.set(x, "strikethroughPosition", js.undefined)
    
    @scala.inline
    def setStrikethroughThickness(value: Double | String): Self = StObject.set(x, "strikethroughThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethroughThicknessUndefined: Self = StObject.set(x, "strikethroughThickness", js.undefined)
    
    @scala.inline
    def setString(value: Double | String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dasharray`(value: String | Double): Self = StObject.set(x, "stroke-dasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dasharrayUndefined`: Self = StObject.set(x, "stroke-dasharray", js.undefined)
    
    @scala.inline
    def `setStroke-dashoffset`(value: String | Double): Self = StObject.set(x, "stroke-dashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-dashoffsetUndefined`: Self = StObject.set(x, "stroke-dashoffset", js.undefined)
    
    @scala.inline
    def `setStroke-linecap`(value: butt | round | square | inherit): Self = StObject.set(x, "stroke-linecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linecapUndefined`: Self = StObject.set(x, "stroke-linecap", js.undefined)
    
    @scala.inline
    def `setStroke-linejoin`(value: miter | round | bevel | inherit): Self = StObject.set(x, "stroke-linejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-linejoinUndefined`: Self = StObject.set(x, "stroke-linejoin", js.undefined)
    
    @scala.inline
    def `setStroke-miterlimit`(value: Double | String): Self = StObject.set(x, "stroke-miterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-miterlimitUndefined`: Self = StObject.set(x, "stroke-miterlimit", js.undefined)
    
    @scala.inline
    def `setStroke-opacity`(value: Double | String): Self = StObject.set(x, "stroke-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-opacityUndefined`: Self = StObject.set(x, "stroke-opacity", js.undefined)
    
    @scala.inline
    def `setStroke-width`(value: Double | String): Self = StObject.set(x, "stroke-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStroke-widthUndefined`: Self = StObject.set(x, "stroke-width", js.undefined)
    
    @scala.inline
    def setStrokeDasharray(value: String | Double): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: String | Double): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: butt | round | square | inherit): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSurfaceScale(value: Double | String): Self = StObject.set(x, "surfaceScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurfaceScaleUndefined: Self = StObject.set(x, "surfaceScale", js.undefined)
    
    @scala.inline
    def setSystemLanguage(value: Double | String): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemLanguageUndefined: Self = StObject.set(x, "systemLanguage", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTableValues(value: Double | String): Self = StObject.set(x, "tableValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableValuesUndefined: Self = StObject.set(x, "tableValues", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetX(value: Double | String): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
    
    @scala.inline
    def setTargetY(value: Double | String): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
    
    @scala.inline
    def `setText-anchor`(value: String): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    @scala.inline
    def `setText-decoration`(value: Double | String): Self = StObject.set(x, "text-decoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-decorationUndefined`: Self = StObject.set(x, "text-decoration", js.undefined)
    
    @scala.inline
    def `setText-rendering`(value: Double | String): Self = StObject.set(x, "text-rendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setText-renderingUndefined`: Self = StObject.set(x, "text-rendering", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: String): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: Double | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setTextLength(value: Double | String): Self = StObject.set(x, "textLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLengthUndefined: Self = StObject.set(x, "textLength", js.undefined)
    
    @scala.inline
    def setTextRendering(value: Double | String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
    
    @scala.inline
    def setTo(value: Double | String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setU1(value: Double | String): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU1Undefined: Self = StObject.set(x, "u1", js.undefined)
    
    @scala.inline
    def setU2(value: Double | String): Self = StObject.set(x, "u2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU2Undefined: Self = StObject.set(x, "u2", js.undefined)
    
    @scala.inline
    def `setUnderline-position`(value: Double | String): Self = StObject.set(x, "underline-position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnderline-positionUndefined`: Self = StObject.set(x, "underline-position", js.undefined)
    
    @scala.inline
    def `setUnderline-thickness`(value: Double | String): Self = StObject.set(x, "underline-thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnderline-thicknessUndefined`: Self = StObject.set(x, "underline-thickness", js.undefined)
    
    @scala.inline
    def setUnderlinePosition(value: Double | String): Self = StObject.set(x, "underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlinePositionUndefined: Self = StObject.set(x, "underlinePosition", js.undefined)
    
    @scala.inline
    def setUnderlineThickness(value: Double | String): Self = StObject.set(x, "underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineThicknessUndefined: Self = StObject.set(x, "underlineThickness", js.undefined)
    
    @scala.inline
    def setUnicode(value: Double | String): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnicode-bidi`(value: Double | String): Self = StObject.set(x, "unicode-bidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnicode-bidiUndefined`: Self = StObject.set(x, "unicode-bidi", js.undefined)
    
    @scala.inline
    def `setUnicode-range`(value: Double | String): Self = StObject.set(x, "unicode-range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnicode-rangeUndefined`: Self = StObject.set(x, "unicode-range", js.undefined)
    
    @scala.inline
    def setUnicodeBidi(value: Double | String): Self = StObject.set(x, "unicodeBidi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeBidiUndefined: Self = StObject.set(x, "unicodeBidi", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: Double | String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
    
    @scala.inline
    def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    
    @scala.inline
    def `setUnits-per-em`(value: Double | String): Self = StObject.set(x, "units-per-em", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnits-per-emUndefined`: Self = StObject.set(x, "units-per-em", js.undefined)
    
    @scala.inline
    def setUnitsPerEm(value: Double | String): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
    
    @scala.inline
    def `setV-alphabetic`(value: Double | String): Self = StObject.set(x, "v-alphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setV-alphabeticUndefined`: Self = StObject.set(x, "v-alphabetic", js.undefined)
    
    @scala.inline
    def `setV-hanging`(value: Double | String): Self = StObject.set(x, "v-hanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setV-hangingUndefined`: Self = StObject.set(x, "v-hanging", js.undefined)
    
    @scala.inline
    def `setV-ideographic`(value: Double | String): Self = StObject.set(x, "v-ideographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setV-ideographicUndefined`: Self = StObject.set(x, "v-ideographic", js.undefined)
    
    @scala.inline
    def `setV-mathematical`(value: Double | String): Self = StObject.set(x, "v-mathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setV-mathematicalUndefined`: Self = StObject.set(x, "v-mathematical", js.undefined)
    
    @scala.inline
    def setVAlphabetic(value: Double | String): Self = StObject.set(x, "vAlphabetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVAlphabeticUndefined: Self = StObject.set(x, "vAlphabetic", js.undefined)
    
    @scala.inline
    def setVHanging(value: Double | String): Self = StObject.set(x, "vHanging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVHangingUndefined: Self = StObject.set(x, "vHanging", js.undefined)
    
    @scala.inline
    def setVIdeographic(value: Double | String): Self = StObject.set(x, "vIdeographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVIdeographicUndefined: Self = StObject.set(x, "vIdeographic", js.undefined)
    
    @scala.inline
    def setVMathematical(value: Double | String): Self = StObject.set(x, "vMathematical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVMathematicalUndefined: Self = StObject.set(x, "vMathematical", js.undefined)
    
    @scala.inline
    def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def `setVector-effect`(value: Double | String): Self = StObject.set(x, "vector-effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVector-effectUndefined`: Self = StObject.set(x, "vector-effect", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: Double | String): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def `setVert-adv-y`(value: Double | String): Self = StObject.set(x, "vert-adv-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVert-adv-yUndefined`: Self = StObject.set(x, "vert-adv-y", js.undefined)
    
    @scala.inline
    def `setVert-origin-x`(value: Double | String): Self = StObject.set(x, "vert-origin-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVert-origin-xUndefined`: Self = StObject.set(x, "vert-origin-x", js.undefined)
    
    @scala.inline
    def `setVert-origin-y`(value: Double | String): Self = StObject.set(x, "vert-origin-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setVert-origin-yUndefined`: Self = StObject.set(x, "vert-origin-y", js.undefined)
    
    @scala.inline
    def setVertAdvY(value: Double | String): Self = StObject.set(x, "vertAdvY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertAdvYUndefined: Self = StObject.set(x, "vertAdvY", js.undefined)
    
    @scala.inline
    def setVertOriginX(value: Double | String): Self = StObject.set(x, "vertOriginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOriginXUndefined: Self = StObject.set(x, "vertOriginX", js.undefined)
    
    @scala.inline
    def setVertOriginY(value: Double | String): Self = StObject.set(x, "vertOriginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertOriginYUndefined: Self = StObject.set(x, "vertOriginY", js.undefined)
    
    @scala.inline
    def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    @scala.inline
    def setViewTarget(value: Double | String): Self = StObject.set(x, "viewTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewTargetUndefined: Self = StObject.set(x, "viewTarget", js.undefined)
    
    @scala.inline
    def setVisibility(value: Double | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWidths(value: Double | String): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    
    @scala.inline
    def `setWord-spacing`(value: Double | String): Self = StObject.set(x, "word-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWord-spacingUndefined`: Self = StObject.set(x, "word-spacing", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: Double | String): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
    
    @scala.inline
    def `setWriting-mode`(value: Double | String): Self = StObject.set(x, "writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWriting-modeUndefined`: Self = StObject.set(x, "writing-mode", js.undefined)
    
    @scala.inline
    def setWritingMode(value: Double | String): Self = StObject.set(x, "writingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingModeUndefined: Self = StObject.set(x, "writingMode", js.undefined)
    
    @scala.inline
    def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-height`(value: Double | String): Self = StObject.set(x, "x-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-heightUndefined`: Self = StObject.set(x, "x-height", js.undefined)
    
    @scala.inline
    def setX1(value: Double | String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
    
    @scala.inline
    def setX2(value: Double | String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
    
    @scala.inline
    def setXChannelSelector(value: String): Self = StObject.set(x, "xChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXChannelSelectorUndefined: Self = StObject.set(x, "xChannelSelector", js.undefined)
    
    @scala.inline
    def setXHeight(value: Double | String): Self = StObject.set(x, "xHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHeightUndefined: Self = StObject.set(x, "xHeight", js.undefined)
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setXlinkActuate(value: String): Self = StObject.set(x, "xlinkActuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkActuateUndefined: Self = StObject.set(x, "xlinkActuate", js.undefined)
    
    @scala.inline
    def setXlinkArcrole(value: String): Self = StObject.set(x, "xlinkArcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkArcroleUndefined: Self = StObject.set(x, "xlinkArcrole", js.undefined)
    
    @scala.inline
    def setXlinkColonactuate(value: String): Self = StObject.set(x, "xlink:actuate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkColonactuateUndefined: Self = StObject.set(x, "xlink:actuate", js.undefined)
    
    @scala.inline
    def setXlinkColonarcrole(value: String): Self = StObject.set(x, "xlink:arcrole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkColonarcroleUndefined: Self = StObject.set(x, "xlink:arcrole", js.undefined)
    
    @scala.inline
    def setXlinkColonhref(value: String): Self = StObject.set(x, "xlink:href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkColonhrefUndefined: Self = StObject.set(x, "xlink:href", js.undefined)
    
    @scala.inline
    def setXlinkColonrole(value: String): Self = StObject.set(x, "xlink:role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkColonroleUndefined: Self = StObject.set(x, "xlink:role", js.undefined)
    
    @scala.inline
    def setXlinkColonshow(value: String): Self = StObject.set(x, "xlink:show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkColonshowUndefined: Self = StObject.set(x, "xlink:show", js.undefined)
    
    @scala.inline
    def setXlinkColontitle(value: String): Self = StObject.set(x, "xlink:title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkColontitleUndefined: Self = StObject.set(x, "xlink:title", js.undefined)
    
    @scala.inline
    def setXlinkColontype(value: String): Self = StObject.set(x, "xlink:type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkColontypeUndefined: Self = StObject.set(x, "xlink:type", js.undefined)
    
    @scala.inline
    def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
    
    @scala.inline
    def setXlinkRole(value: String): Self = StObject.set(x, "xlinkRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkRoleUndefined: Self = StObject.set(x, "xlinkRole", js.undefined)
    
    @scala.inline
    def setXlinkShow(value: String): Self = StObject.set(x, "xlinkShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkShowUndefined: Self = StObject.set(x, "xlinkShow", js.undefined)
    
    @scala.inline
    def setXlinkTitle(value: String): Self = StObject.set(x, "xlinkTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkTitleUndefined: Self = StObject.set(x, "xlinkTitle", js.undefined)
    
    @scala.inline
    def setXlinkType(value: String): Self = StObject.set(x, "xlinkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXlinkTypeUndefined: Self = StObject.set(x, "xlinkType", js.undefined)
    
    @scala.inline
    def setXmlBase(value: String): Self = StObject.set(x, "xmlBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlBaseUndefined: Self = StObject.set(x, "xmlBase", js.undefined)
    
    @scala.inline
    def setXmlColonbase(value: String): Self = StObject.set(x, "xml:base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlColonbaseUndefined: Self = StObject.set(x, "xml:base", js.undefined)
    
    @scala.inline
    def setXmlColonlang(value: String): Self = StObject.set(x, "xml:lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlColonlangUndefined: Self = StObject.set(x, "xml:lang", js.undefined)
    
    @scala.inline
    def setXmlColonspace(value: String): Self = StObject.set(x, "xml:space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlColonspaceUndefined: Self = StObject.set(x, "xml:space", js.undefined)
    
    @scala.inline
    def setXmlLang(value: String): Self = StObject.set(x, "xmlLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlLangUndefined: Self = StObject.set(x, "xmlLang", js.undefined)
    
    @scala.inline
    def setXmlSpace(value: String): Self = StObject.set(x, "xmlSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlSpaceUndefined: Self = StObject.set(x, "xmlSpace", js.undefined)
    
    @scala.inline
    def setXmlns(value: String): Self = StObject.set(x, "xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsColonxlink(value: String): Self = StObject.set(x, "xmlns:xlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsColonxlinkUndefined: Self = StObject.set(x, "xmlns:xlink", js.undefined)
    
    @scala.inline
    def setXmlnsUndefined: Self = StObject.set(x, "xmlns", js.undefined)
    
    @scala.inline
    def setXmlnsXlink(value: String): Self = StObject.set(x, "xmlnsXlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlnsXlinkUndefined: Self = StObject.set(x, "xmlnsXlink", js.undefined)
    
    @scala.inline
    def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double | String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
    
    @scala.inline
    def setY2(value: Double | String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    
    @scala.inline
    def setYChannelSelector(value: String): Self = StObject.set(x, "yChannelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYChannelSelectorUndefined: Self = StObject.set(x, "yChannelSelector", js.undefined)
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    
    @scala.inline
    def setZoomAndPan(value: String): Self = StObject.set(x, "zoomAndPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomAndPanUndefined: Self = StObject.set(x, "zoomAndPan", js.undefined)
  }
}
