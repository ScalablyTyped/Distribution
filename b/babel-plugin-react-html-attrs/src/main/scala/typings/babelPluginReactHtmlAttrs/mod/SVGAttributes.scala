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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class SVGAttributesOps[Self <: SVGAttributes[_], T] (val x: Self with SVGAttributes[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAccent-height`(value: Double | String): Self = this.set("accent-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAccent-height`: Self = this.set("accent-height", js.undefined)
    @scala.inline
    def setAccentHeight(value: Double | String): Self = this.set("accentHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccentHeight: Self = this.set("accentHeight", js.undefined)
    @scala.inline
    def setAccumulate(value: none | sum): Self = this.set("accumulate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccumulate: Self = this.set("accumulate", js.undefined)
    @scala.inline
    def setAdditive(value: replace | sum): Self = this.set("additive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditive: Self = this.set("additive", js.undefined)
    @scala.inline
    def `setAlignment-baseline`(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = this.set("alignment-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAlignment-baseline`: Self = this.set("alignment-baseline", js.undefined)
    @scala.inline
    def setAlignmentBaseline(
      value: auto | baseline | `before-edge` | `text-before-edge` | middle | central | `after-edge` | `text-after-edge` | ideographic | alphabetic | hanging | mathematical | inherit
    ): Self = this.set("alignmentBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignmentBaseline: Self = this.set("alignmentBaseline", js.undefined)
    @scala.inline
    def setAllowReorder(value: no | yes): Self = this.set("allowReorder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReorder: Self = this.set("allowReorder", js.undefined)
    @scala.inline
    def setAlphabetic(value: Double | String): Self = this.set("alphabetic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphabetic: Self = this.set("alphabetic", js.undefined)
    @scala.inline
    def setAmplitude(value: Double | String): Self = this.set("amplitude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmplitude: Self = this.set("amplitude", js.undefined)
    @scala.inline
    def `setArabic-form`(value: initial | medial | terminal | isolated): Self = this.set("arabic-form", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteArabic-form`: Self = this.set("arabic-form", js.undefined)
    @scala.inline
    def setArabicForm(value: initial | medial | terminal | isolated): Self = this.set("arabicForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArabicForm: Self = this.set("arabicForm", js.undefined)
    @scala.inline
    def setAscent(value: Double | String): Self = this.set("ascent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscent: Self = this.set("ascent", js.undefined)
    @scala.inline
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setAttributeType(value: String): Self = this.set("attributeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeType: Self = this.set("attributeType", js.undefined)
    @scala.inline
    def setAutoReverse(value: Booleanish): Self = this.set("autoReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoReverse: Self = this.set("autoReverse", js.undefined)
    @scala.inline
    def setAzimuth(value: Double | String): Self = this.set("azimuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAzimuth: Self = this.set("azimuth", js.undefined)
    @scala.inline
    def setBaseFrequency(value: Double | String): Self = this.set("baseFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseFrequency: Self = this.set("baseFrequency", js.undefined)
    @scala.inline
    def setBaseProfile(value: Double | String): Self = this.set("baseProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseProfile: Self = this.set("baseProfile", js.undefined)
    @scala.inline
    def `setBaseline-shift`(value: Double | String): Self = this.set("baseline-shift", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteBaseline-shift`: Self = this.set("baseline-shift", js.undefined)
    @scala.inline
    def setBaselineShift(value: Double | String): Self = this.set("baselineShift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineShift: Self = this.set("baselineShift", js.undefined)
    @scala.inline
    def setBbox(value: Double | String): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    @scala.inline
    def setBegin(value: Double | String): Self = this.set("begin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    @scala.inline
    def setBias(value: Double | String): Self = this.set("bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    @scala.inline
    def setBy(value: Double | String): Self = this.set("by", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    @scala.inline
    def setCalcMode(value: Double | String): Self = this.set("calcMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalcMode: Self = this.set("calcMode", js.undefined)
    @scala.inline
    def `setCap-height`(value: Double | String): Self = this.set("cap-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCap-height`: Self = this.set("cap-height", js.undefined)
    @scala.inline
    def setCapHeight(value: Double | String): Self = this.set("capHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapHeight: Self = this.set("capHeight", js.undefined)
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClip(value: Double | String): Self = this.set("clip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    @scala.inline
    def `setClip-path`(value: String): Self = this.set("clip-path", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-path`: Self = this.set("clip-path", js.undefined)
    @scala.inline
    def `setClip-rule`(value: Double | String): Self = this.set("clip-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteClip-rule`: Self = this.set("clip-rule", js.undefined)
    @scala.inline
    def setClipPath(value: String): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    @scala.inline
    def setClipPathUnits(value: Double | String): Self = this.set("clipPathUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipPathUnits: Self = this.set("clipPathUnits", js.undefined)
    @scala.inline
    def setClipRule(value: Double | String): Self = this.set("clipRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipRule: Self = this.set("clipRule", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def `setColor-interpolation`(value: Double | String): Self = this.set("color-interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-interpolation`: Self = this.set("color-interpolation", js.undefined)
    @scala.inline
    def `setColor-interpolation-filters`(value: auto | sRGB | linearRGB | inherit): Self = this.set("color-interpolation-filters", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-interpolation-filters`: Self = this.set("color-interpolation-filters", js.undefined)
    @scala.inline
    def `setColor-profile`(value: Double | String): Self = this.set("color-profile", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-profile`: Self = this.set("color-profile", js.undefined)
    @scala.inline
    def `setColor-rendering`(value: Double | String): Self = this.set("color-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteColor-rendering`: Self = this.set("color-rendering", js.undefined)
    @scala.inline
    def setColorInterpolation(value: Double | String): Self = this.set("colorInterpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorInterpolation: Self = this.set("colorInterpolation", js.undefined)
    @scala.inline
    def setColorInterpolationFilters(value: auto | sRGB | linearRGB | inherit): Self = this.set("colorInterpolationFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorInterpolationFilters: Self = this.set("colorInterpolationFilters", js.undefined)
    @scala.inline
    def setColorProfile(value: Double | String): Self = this.set("colorProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorProfile: Self = this.set("colorProfile", js.undefined)
    @scala.inline
    def setColorRendering(value: Double | String): Self = this.set("colorRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRendering: Self = this.set("colorRendering", js.undefined)
    @scala.inline
    def setContentScriptType(value: Double | String): Self = this.set("contentScriptType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentScriptType: Self = this.set("contentScriptType", js.undefined)
    @scala.inline
    def setContentStyleType(value: Double | String): Self = this.set("contentStyleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentStyleType: Self = this.set("contentStyleType", js.undefined)
    @scala.inline
    def setCrossOrigin(value: anonymous | `use-credentials` | _empty): Self = this.set("crossOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossOrigin: Self = this.set("crossOrigin", js.undefined)
    @scala.inline
    def setCursor(value: Double | String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setCx(value: Double | String): Self = this.set("cx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCx: Self = this.set("cx", js.undefined)
    @scala.inline
    def setCy(value: Double | String): Self = this.set("cy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    @scala.inline
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setDecelerate(value: Double | String): Self = this.set("decelerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecelerate: Self = this.set("decelerate", js.undefined)
    @scala.inline
    def setDescent(value: Double | String): Self = this.set("descent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescent: Self = this.set("descent", js.undefined)
    @scala.inline
    def setDiffuseConstant(value: Double | String): Self = this.set("diffuseConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiffuseConstant: Self = this.set("diffuseConstant", js.undefined)
    @scala.inline
    def setDirection(value: Double | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisplay(value: Double | String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setDivisor(value: Double | String): Self = this.set("divisor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivisor: Self = this.set("divisor", js.undefined)
    @scala.inline
    def `setDominant-baseline`(value: Double | String): Self = this.set("dominant-baseline", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDominant-baseline`: Self = this.set("dominant-baseline", js.undefined)
    @scala.inline
    def setDominantBaseline(value: Double | String): Self = this.set("dominantBaseline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDominantBaseline: Self = this.set("dominantBaseline", js.undefined)
    @scala.inline
    def setDur(value: Double | String): Self = this.set("dur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDur: Self = this.set("dur", js.undefined)
    @scala.inline
    def setDx(value: Double | String): Self = this.set("dx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    @scala.inline
    def setDy(value: Double | String): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def setEdgeMode(value: Double | String): Self = this.set("edgeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgeMode: Self = this.set("edgeMode", js.undefined)
    @scala.inline
    def setElevation(value: Double | String): Self = this.set("elevation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevation: Self = this.set("elevation", js.undefined)
    @scala.inline
    def `setEnable-background`(value: Double | String): Self = this.set("enable-background", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteEnable-background`: Self = this.set("enable-background", js.undefined)
    @scala.inline
    def setEnableBackground(value: Double | String): Self = this.set("enableBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableBackground: Self = this.set("enableBackground", js.undefined)
    @scala.inline
    def setEnd(value: Double | String): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setExponent(value: Double | String): Self = this.set("exponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponent: Self = this.set("exponent", js.undefined)
    @scala.inline
    def setExternalResourcesRequired(value: Booleanish): Self = this.set("externalResourcesRequired", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalResourcesRequired: Self = this.set("externalResourcesRequired", js.undefined)
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def `setFill-opacity`(value: Double | String): Self = this.set("fill-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-opacity`: Self = this.set("fill-opacity", js.undefined)
    @scala.inline
    def `setFill-rule`(value: nonzero | evenodd | inherit): Self = this.set("fill-rule", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFill-rule`: Self = this.set("fill-rule", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double | String): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setFillRule(value: nonzero | evenodd | inherit): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setFilterRes(value: Double | String): Self = this.set("filterRes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterRes: Self = this.set("filterRes", js.undefined)
    @scala.inline
    def setFilterUnits(value: Double | String): Self = this.set("filterUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterUnits: Self = this.set("filterUnits", js.undefined)
    @scala.inline
    def `setFlood-color`(value: Double | String): Self = this.set("flood-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-color`: Self = this.set("flood-color", js.undefined)
    @scala.inline
    def `setFlood-opacity`(value: Double | String): Self = this.set("flood-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFlood-opacity`: Self = this.set("flood-opacity", js.undefined)
    @scala.inline
    def setFloodColor(value: Double | String): Self = this.set("floodColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodColor: Self = this.set("floodColor", js.undefined)
    @scala.inline
    def setFloodOpacity(value: Double | String): Self = this.set("floodOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodOpacity: Self = this.set("floodOpacity", js.undefined)
    @scala.inline
    def setFocusable(value: Booleanish | auto): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    @scala.inline
    def `setFont-family`(value: String): Self = this.set("font-family", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-family`: Self = this.set("font-family", js.undefined)
    @scala.inline
    def `setFont-size`(value: Double | String): Self = this.set("font-size", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size`: Self = this.set("font-size", js.undefined)
    @scala.inline
    def `setFont-size-adjust`(value: Double | String): Self = this.set("font-size-adjust", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-size-adjust`: Self = this.set("font-size-adjust", js.undefined)
    @scala.inline
    def `setFont-stretch`(value: Double | String): Self = this.set("font-stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-stretch`: Self = this.set("font-stretch", js.undefined)
    @scala.inline
    def `setFont-style`(value: Double | String): Self = this.set("font-style", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-style`: Self = this.set("font-style", js.undefined)
    @scala.inline
    def `setFont-variant`(value: Double | String): Self = this.set("font-variant", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-variant`: Self = this.set("font-variant", js.undefined)
    @scala.inline
    def `setFont-weight`(value: Double | String): Self = this.set("font-weight", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteFont-weight`: Self = this.set("font-weight", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double | String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontSizeAdjust(value: Double | String): Self = this.set("fontSizeAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSizeAdjust: Self = this.set("fontSizeAdjust", js.undefined)
    @scala.inline
    def setFontStretch(value: Double | String): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    @scala.inline
    def setFontStyle(value: Double | String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontVariant(value: Double | String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    @scala.inline
    def setFontWeight(value: Double | String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setFormat(value: Double | String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFrom(value: Double | String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setFx(value: Double | String): Self = this.set("fx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    @scala.inline
    def setFy(value: Double | String): Self = this.set("fy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
    @scala.inline
    def setG1(value: Double | String): Self = this.set("g1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteG1: Self = this.set("g1", js.undefined)
    @scala.inline
    def setG2(value: Double | String): Self = this.set("g2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteG2: Self = this.set("g2", js.undefined)
    @scala.inline
    def `setGlyph-name`(value: Double | String): Self = this.set("glyph-name", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGlyph-name`: Self = this.set("glyph-name", js.undefined)
    @scala.inline
    def `setGlyph-orientation-horizontal`(value: Double | String): Self = this.set("glyph-orientation-horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGlyph-orientation-horizontal`: Self = this.set("glyph-orientation-horizontal", js.undefined)
    @scala.inline
    def `setGlyph-orientation-vertical`(value: Double | String): Self = this.set("glyph-orientation-vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteGlyph-orientation-vertical`: Self = this.set("glyph-orientation-vertical", js.undefined)
    @scala.inline
    def setGlyphName(value: Double | String): Self = this.set("glyphName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphName: Self = this.set("glyphName", js.undefined)
    @scala.inline
    def setGlyphOrientationHorizontal(value: Double | String): Self = this.set("glyphOrientationHorizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphOrientationHorizontal: Self = this.set("glyphOrientationHorizontal", js.undefined)
    @scala.inline
    def setGlyphOrientationVertical(value: Double | String): Self = this.set("glyphOrientationVertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphOrientationVertical: Self = this.set("glyphOrientationVertical", js.undefined)
    @scala.inline
    def setGlyphRef(value: Double | String): Self = this.set("glyphRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlyphRef: Self = this.set("glyphRef", js.undefined)
    @scala.inline
    def setGradientTransform(value: String): Self = this.set("gradientTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientTransform: Self = this.set("gradientTransform", js.undefined)
    @scala.inline
    def setGradientUnits(value: String): Self = this.set("gradientUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGradientUnits: Self = this.set("gradientUnits", js.undefined)
    @scala.inline
    def setHanging(value: Double | String): Self = this.set("hanging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHanging: Self = this.set("hanging", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def `setHoriz-adv-x`(value: Double | String): Self = this.set("horiz-adv-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHoriz-adv-x`: Self = this.set("horiz-adv-x", js.undefined)
    @scala.inline
    def `setHoriz-origin-x`(value: Double | String): Self = this.set("horiz-origin-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteHoriz-origin-x`: Self = this.set("horiz-origin-x", js.undefined)
    @scala.inline
    def setHorizAdvX(value: Double | String): Self = this.set("horizAdvX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizAdvX: Self = this.set("horizAdvX", js.undefined)
    @scala.inline
    def setHorizOriginX(value: Double | String): Self = this.set("horizOriginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizOriginX: Self = this.set("horizOriginX", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdeographic(value: Double | String): Self = this.set("ideographic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdeographic: Self = this.set("ideographic", js.undefined)
    @scala.inline
    def `setImage-rendering`(value: Double | String): Self = this.set("image-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteImage-rendering`: Self = this.set("image-rendering", js.undefined)
    @scala.inline
    def setImageRendering(value: Double | String): Self = this.set("imageRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageRendering: Self = this.set("imageRendering", js.undefined)
    @scala.inline
    def setIn(value: String): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn: Self = this.set("in", js.undefined)
    @scala.inline
    def setIn2(value: Double | String): Self = this.set("in2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIn2: Self = this.set("in2", js.undefined)
    @scala.inline
    def setIntercept(value: Double | String): Self = this.set("intercept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", js.undefined)
    @scala.inline
    def setK(value: Double | String): Self = this.set("k", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    @scala.inline
    def setK1(value: Double | String): Self = this.set("k1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK1: Self = this.set("k1", js.undefined)
    @scala.inline
    def setK2(value: Double | String): Self = this.set("k2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK2: Self = this.set("k2", js.undefined)
    @scala.inline
    def setK3(value: Double | String): Self = this.set("k3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK3: Self = this.set("k3", js.undefined)
    @scala.inline
    def setK4(value: Double | String): Self = this.set("k4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK4: Self = this.set("k4", js.undefined)
    @scala.inline
    def setKernelMatrix(value: Double | String): Self = this.set("kernelMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelMatrix: Self = this.set("kernelMatrix", js.undefined)
    @scala.inline
    def setKernelUnitLength(value: Double | String): Self = this.set("kernelUnitLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelUnitLength: Self = this.set("kernelUnitLength", js.undefined)
    @scala.inline
    def setKerning(value: Double | String): Self = this.set("kerning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    @scala.inline
    def setKeyPoints(value: Double | String): Self = this.set("keyPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPoints: Self = this.set("keyPoints", js.undefined)
    @scala.inline
    def setKeySplines(value: Double | String): Self = this.set("keySplines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySplines: Self = this.set("keySplines", js.undefined)
    @scala.inline
    def setKeyTimes(value: Double | String): Self = this.set("keyTimes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyTimes: Self = this.set("keyTimes", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setLengthAdjust(value: Double | String): Self = this.set("lengthAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthAdjust: Self = this.set("lengthAdjust", js.undefined)
    @scala.inline
    def `setLetter-spacing`(value: Double | String): Self = this.set("letter-spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLetter-spacing`: Self = this.set("letter-spacing", js.undefined)
    @scala.inline
    def setLetterSpacing(value: Double | String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    @scala.inline
    def `setLighting-color`(value: Double | String): Self = this.set("lighting-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLighting-color`: Self = this.set("lighting-color", js.undefined)
    @scala.inline
    def setLightingColor(value: Double | String): Self = this.set("lightingColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLightingColor: Self = this.set("lightingColor", js.undefined)
    @scala.inline
    def setLimitingConeAngle(value: Double | String): Self = this.set("limitingConeAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitingConeAngle: Self = this.set("limitingConeAngle", js.undefined)
    @scala.inline
    def setLocal(value: Double | String): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def `setMarker-end`(value: String): Self = this.set("marker-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-end`: Self = this.set("marker-end", js.undefined)
    @scala.inline
    def `setMarker-mid`(value: String): Self = this.set("marker-mid", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-mid`: Self = this.set("marker-mid", js.undefined)
    @scala.inline
    def `setMarker-start`(value: String): Self = this.set("marker-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMarker-start`: Self = this.set("marker-start", js.undefined)
    @scala.inline
    def setMarkerEnd(value: String): Self = this.set("markerEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerEnd: Self = this.set("markerEnd", js.undefined)
    @scala.inline
    def setMarkerHeight(value: Double | String): Self = this.set("markerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerHeight: Self = this.set("markerHeight", js.undefined)
    @scala.inline
    def setMarkerMid(value: String): Self = this.set("markerMid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerMid: Self = this.set("markerMid", js.undefined)
    @scala.inline
    def setMarkerStart(value: String): Self = this.set("markerStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStart: Self = this.set("markerStart", js.undefined)
    @scala.inline
    def setMarkerUnits(value: Double | String): Self = this.set("markerUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerUnits: Self = this.set("markerUnits", js.undefined)
    @scala.inline
    def setMarkerWidth(value: Double | String): Self = this.set("markerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerWidth: Self = this.set("markerWidth", js.undefined)
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    @scala.inline
    def setMaskContentUnits(value: Double | String): Self = this.set("maskContentUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskContentUnits: Self = this.set("maskContentUnits", js.undefined)
    @scala.inline
    def setMaskUnits(value: Double | String): Self = this.set("maskUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskUnits: Self = this.set("maskUnits", js.undefined)
    @scala.inline
    def setMathematical(value: Double | String): Self = this.set("mathematical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMathematical: Self = this.set("mathematical", js.undefined)
    @scala.inline
    def setMax(value: Double | String): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMedia(value: String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMin(value: Double | String): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMode(value: Double | String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNumOctaves(value: Double | String): Self = this.set("numOctaves", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumOctaves: Self = this.set("numOctaves", js.undefined)
    @scala.inline
    def setOffset(value: Double | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOpacity(value: Double | String): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOperator(value: Double | String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setOrder(value: Double | String): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setOrient(value: Double | String): Self = this.set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    @scala.inline
    def setOrientation(value: Double | String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOrigin(value: Double | String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setOverflow(value: Double | String): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def `setOverline-position`(value: Double | String): Self = this.set("overline-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverline-position`: Self = this.set("overline-position", js.undefined)
    @scala.inline
    def `setOverline-thickness`(value: Double | String): Self = this.set("overline-thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteOverline-thickness`: Self = this.set("overline-thickness", js.undefined)
    @scala.inline
    def setOverlinePosition(value: Double | String): Self = this.set("overlinePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlinePosition: Self = this.set("overlinePosition", js.undefined)
    @scala.inline
    def setOverlineThickness(value: Double | String): Self = this.set("overlineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlineThickness: Self = this.set("overlineThickness", js.undefined)
    @scala.inline
    def `setPaint-order`(value: Double | String): Self = this.set("paint-order", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePaint-order`: Self = this.set("paint-order", js.undefined)
    @scala.inline
    def setPaintOrder(value: Double | String): Self = this.set("paintOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaintOrder: Self = this.set("paintOrder", js.undefined)
    @scala.inline
    def `setPanose-1`(value: Double | String): Self = this.set("panose-1", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePanose-1`: Self = this.set("panose-1", js.undefined)
    @scala.inline
    def setPanose1(value: Double | String): Self = this.set("panose1", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanose1: Self = this.set("panose1", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPathLength(value: Double | String): Self = this.set("pathLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathLength: Self = this.set("pathLength", js.undefined)
    @scala.inline
    def setPatternContentUnits(value: String): Self = this.set("patternContentUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternContentUnits: Self = this.set("patternContentUnits", js.undefined)
    @scala.inline
    def setPatternTransform(value: Double | String): Self = this.set("patternTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternTransform: Self = this.set("patternTransform", js.undefined)
    @scala.inline
    def setPatternUnits(value: String): Self = this.set("patternUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternUnits: Self = this.set("patternUnits", js.undefined)
    @scala.inline
    def `setPointer-events`(value: Double | String): Self = this.set("pointer-events", value.asInstanceOf[js.Any])
    @scala.inline
    def `deletePointer-events`: Self = this.set("pointer-events", js.undefined)
    @scala.inline
    def setPointerEvents(value: Double | String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    @scala.inline
    def setPoints(value: String): Self = this.set("points", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoints: Self = this.set("points", js.undefined)
    @scala.inline
    def setPointsAtX(value: Double | String): Self = this.set("pointsAtX", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsAtX: Self = this.set("pointsAtX", js.undefined)
    @scala.inline
    def setPointsAtY(value: Double | String): Self = this.set("pointsAtY", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsAtY: Self = this.set("pointsAtY", js.undefined)
    @scala.inline
    def setPointsAtZ(value: Double | String): Self = this.set("pointsAtZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointsAtZ: Self = this.set("pointsAtZ", js.undefined)
    @scala.inline
    def setPreserveAlpha(value: Booleanish): Self = this.set("preserveAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAlpha: Self = this.set("preserveAlpha", js.undefined)
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAspectRatio: Self = this.set("preserveAspectRatio", js.undefined)
    @scala.inline
    def setPrimitiveUnits(value: Double | String): Self = this.set("primitiveUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimitiveUnits: Self = this.set("primitiveUnits", js.undefined)
    @scala.inline
    def setR(value: Double | String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setRadius(value: Double | String): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRefX(value: Double | String): Self = this.set("refX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefX: Self = this.set("refX", js.undefined)
    @scala.inline
    def setRefY(value: Double | String): Self = this.set("refY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefY: Self = this.set("refY", js.undefined)
    @scala.inline
    def `setRendering-intent`(value: Double | String): Self = this.set("rendering-intent", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRendering-intent`: Self = this.set("rendering-intent", js.undefined)
    @scala.inline
    def setRenderingIntent(value: Double | String): Self = this.set("renderingIntent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderingIntent: Self = this.set("renderingIntent", js.undefined)
    @scala.inline
    def setRepeatCount(value: Double | String): Self = this.set("repeatCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatCount: Self = this.set("repeatCount", js.undefined)
    @scala.inline
    def setRepeatDur(value: Double | String): Self = this.set("repeatDur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatDur: Self = this.set("repeatDur", js.undefined)
    @scala.inline
    def setRequiredExtensions(value: Double | String): Self = this.set("requiredExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredExtensions: Self = this.set("requiredExtensions", js.undefined)
    @scala.inline
    def setRequiredFeatures(value: Double | String): Self = this.set("requiredFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredFeatures: Self = this.set("requiredFeatures", js.undefined)
    @scala.inline
    def setRestart(value: Double | String): Self = this.set("restart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestart: Self = this.set("restart", js.undefined)
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRotate(value: Double | String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotate: Self = this.set("rotate", js.undefined)
    @scala.inline
    def setRx(value: Double | String): Self = this.set("rx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRx: Self = this.set("rx", js.undefined)
    @scala.inline
    def setRy(value: Double | String): Self = this.set("ry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRy: Self = this.set("ry", js.undefined)
    @scala.inline
    def setScale(value: Double | String): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSeed(value: Double | String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def `setShape-rendering`(value: Double | String): Self = this.set("shape-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteShape-rendering`: Self = this.set("shape-rendering", js.undefined)
    @scala.inline
    def setShapeRendering(value: Double | String): Self = this.set("shapeRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeRendering: Self = this.set("shapeRendering", js.undefined)
    @scala.inline
    def setSlope(value: Double | String): Self = this.set("slope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlope: Self = this.set("slope", js.undefined)
    @scala.inline
    def setSpacing(value: Double | String): Self = this.set("spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    @scala.inline
    def setSpecularConstant(value: Double | String): Self = this.set("specularConstant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecularConstant: Self = this.set("specularConstant", js.undefined)
    @scala.inline
    def setSpecularExponent(value: Double | String): Self = this.set("specularExponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecularExponent: Self = this.set("specularExponent", js.undefined)
    @scala.inline
    def setSpeed(value: Double | String): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    @scala.inline
    def setSpreadMethod(value: String): Self = this.set("spreadMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpreadMethod: Self = this.set("spreadMethod", js.undefined)
    @scala.inline
    def setStartOffset(value: Double | String): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    @scala.inline
    def setStdDeviation(value: Double | String): Self = this.set("stdDeviation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdDeviation: Self = this.set("stdDeviation", js.undefined)
    @scala.inline
    def setStemh(value: Double | String): Self = this.set("stemh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStemh: Self = this.set("stemh", js.undefined)
    @scala.inline
    def setStemv(value: Double | String): Self = this.set("stemv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStemv: Self = this.set("stemv", js.undefined)
    @scala.inline
    def setStitchTiles(value: Double | String): Self = this.set("stitchTiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStitchTiles: Self = this.set("stitchTiles", js.undefined)
    @scala.inline
    def `setStop-color`(value: String): Self = this.set("stop-color", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-color`: Self = this.set("stop-color", js.undefined)
    @scala.inline
    def `setStop-opacity`(value: Double | String): Self = this.set("stop-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStop-opacity`: Self = this.set("stop-opacity", js.undefined)
    @scala.inline
    def setStopColor(value: String): Self = this.set("stopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopColor: Self = this.set("stopColor", js.undefined)
    @scala.inline
    def setStopOpacity(value: Double | String): Self = this.set("stopOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopOpacity: Self = this.set("stopOpacity", js.undefined)
    @scala.inline
    def `setStrikethrough-position`(value: Double | String): Self = this.set("strikethrough-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStrikethrough-position`: Self = this.set("strikethrough-position", js.undefined)
    @scala.inline
    def `setStrikethrough-thickness`(value: Double | String): Self = this.set("strikethrough-thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStrikethrough-thickness`: Self = this.set("strikethrough-thickness", js.undefined)
    @scala.inline
    def setStrikethroughPosition(value: Double | String): Self = this.set("strikethroughPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethroughPosition: Self = this.set("strikethroughPosition", js.undefined)
    @scala.inline
    def setStrikethroughThickness(value: Double | String): Self = this.set("strikethroughThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethroughThickness: Self = this.set("strikethroughThickness", js.undefined)
    @scala.inline
    def setString(value: Double | String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def `setStroke-dasharray`(value: String | Double): Self = this.set("stroke-dasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dasharray`: Self = this.set("stroke-dasharray", js.undefined)
    @scala.inline
    def `setStroke-dashoffset`(value: String | Double): Self = this.set("stroke-dashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-dashoffset`: Self = this.set("stroke-dashoffset", js.undefined)
    @scala.inline
    def `setStroke-linecap`(value: butt | round | square | inherit): Self = this.set("stroke-linecap", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linecap`: Self = this.set("stroke-linecap", js.undefined)
    @scala.inline
    def `setStroke-linejoin`(value: miter | round | bevel | inherit): Self = this.set("stroke-linejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-linejoin`: Self = this.set("stroke-linejoin", js.undefined)
    @scala.inline
    def `setStroke-miterlimit`(value: Double | String): Self = this.set("stroke-miterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-miterlimit`: Self = this.set("stroke-miterlimit", js.undefined)
    @scala.inline
    def `setStroke-opacity`(value: Double | String): Self = this.set("stroke-opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-opacity`: Self = this.set("stroke-opacity", js.undefined)
    @scala.inline
    def `setStroke-width`(value: Double | String): Self = this.set("stroke-width", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteStroke-width`: Self = this.set("stroke-width", js.undefined)
    @scala.inline
    def setStrokeDasharray(value: String | Double): Self = this.set("strokeDasharray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDasharray: Self = this.set("strokeDasharray", js.undefined)
    @scala.inline
    def setStrokeDashoffset(value: String | Double): Self = this.set("strokeDashoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashoffset: Self = this.set("strokeDashoffset", js.undefined)
    @scala.inline
    def setStrokeLinecap(value: butt | round | square | inherit): Self = this.set("strokeLinecap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinecap: Self = this.set("strokeLinecap", js.undefined)
    @scala.inline
    def setStrokeLinejoin(value: miter | round | bevel | inherit): Self = this.set("strokeLinejoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLinejoin: Self = this.set("strokeLinejoin", js.undefined)
    @scala.inline
    def setStrokeMiterlimit(value: Double | String): Self = this.set("strokeMiterlimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterlimit: Self = this.set("strokeMiterlimit", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double | String): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double | String): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSurfaceScale(value: Double | String): Self = this.set("surfaceScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSurfaceScale: Self = this.set("surfaceScale", js.undefined)
    @scala.inline
    def setSystemLanguage(value: Double | String): Self = this.set("systemLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSystemLanguage: Self = this.set("systemLanguage", js.undefined)
    @scala.inline
    def setTabIndex(value: Double): Self = this.set("tabIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabIndex: Self = this.set("tabIndex", js.undefined)
    @scala.inline
    def setTableValues(value: Double | String): Self = this.set("tableValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableValues: Self = this.set("tableValues", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetX(value: Double | String): Self = this.set("targetX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetX: Self = this.set("targetX", js.undefined)
    @scala.inline
    def setTargetY(value: Double | String): Self = this.set("targetY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetY: Self = this.set("targetY", js.undefined)
    @scala.inline
    def `setText-anchor`(value: String): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    @scala.inline
    def `setText-decoration`(value: Double | String): Self = this.set("text-decoration", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-decoration`: Self = this.set("text-decoration", js.undefined)
    @scala.inline
    def `setText-rendering`(value: Double | String): Self = this.set("text-rendering", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteText-rendering`: Self = this.set("text-rendering", js.undefined)
    @scala.inline
    def setTextAnchor(value: String): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    @scala.inline
    def setTextDecoration(value: Double | String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    @scala.inline
    def setTextLength(value: Double | String): Self = this.set("textLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextLength: Self = this.set("textLength", js.undefined)
    @scala.inline
    def setTextRendering(value: Double | String): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    @scala.inline
    def setTo(value: Double | String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setTransform(value: String): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setU1(value: Double | String): Self = this.set("u1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteU1: Self = this.set("u1", js.undefined)
    @scala.inline
    def setU2(value: Double | String): Self = this.set("u2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteU2: Self = this.set("u2", js.undefined)
    @scala.inline
    def `setUnderline-position`(value: Double | String): Self = this.set("underline-position", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnderline-position`: Self = this.set("underline-position", js.undefined)
    @scala.inline
    def `setUnderline-thickness`(value: Double | String): Self = this.set("underline-thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnderline-thickness`: Self = this.set("underline-thickness", js.undefined)
    @scala.inline
    def setUnderlinePosition(value: Double | String): Self = this.set("underlinePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlinePosition: Self = this.set("underlinePosition", js.undefined)
    @scala.inline
    def setUnderlineThickness(value: Double | String): Self = this.set("underlineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineThickness: Self = this.set("underlineThickness", js.undefined)
    @scala.inline
    def setUnicode(value: Double | String): Self = this.set("unicode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicode: Self = this.set("unicode", js.undefined)
    @scala.inline
    def `setUnicode-bidi`(value: Double | String): Self = this.set("unicode-bidi", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnicode-bidi`: Self = this.set("unicode-bidi", js.undefined)
    @scala.inline
    def `setUnicode-range`(value: Double | String): Self = this.set("unicode-range", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnicode-range`: Self = this.set("unicode-range", js.undefined)
    @scala.inline
    def setUnicodeBidi(value: Double | String): Self = this.set("unicodeBidi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeBidi: Self = this.set("unicodeBidi", js.undefined)
    @scala.inline
    def setUnicodeRange(value: Double | String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
    @scala.inline
    def `setUnits-per-em`(value: Double | String): Self = this.set("units-per-em", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteUnits-per-em`: Self = this.set("units-per-em", js.undefined)
    @scala.inline
    def setUnitsPerEm(value: Double | String): Self = this.set("unitsPerEm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitsPerEm: Self = this.set("unitsPerEm", js.undefined)
    @scala.inline
    def `setV-alphabetic`(value: Double | String): Self = this.set("v-alphabetic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteV-alphabetic`: Self = this.set("v-alphabetic", js.undefined)
    @scala.inline
    def `setV-hanging`(value: Double | String): Self = this.set("v-hanging", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteV-hanging`: Self = this.set("v-hanging", js.undefined)
    @scala.inline
    def `setV-ideographic`(value: Double | String): Self = this.set("v-ideographic", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteV-ideographic`: Self = this.set("v-ideographic", js.undefined)
    @scala.inline
    def `setV-mathematical`(value: Double | String): Self = this.set("v-mathematical", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteV-mathematical`: Self = this.set("v-mathematical", js.undefined)
    @scala.inline
    def setVAlphabetic(value: Double | String): Self = this.set("vAlphabetic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVAlphabetic: Self = this.set("vAlphabetic", js.undefined)
    @scala.inline
    def setVHanging(value: Double | String): Self = this.set("vHanging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVHanging: Self = this.set("vHanging", js.undefined)
    @scala.inline
    def setVIdeographic(value: Double | String): Self = this.set("vIdeographic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVIdeographic: Self = this.set("vIdeographic", js.undefined)
    @scala.inline
    def setVMathematical(value: Double | String): Self = this.set("vMathematical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVMathematical: Self = this.set("vMathematical", js.undefined)
    @scala.inline
    def setValues(value: String): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    @scala.inline
    def `setVector-effect`(value: Double | String): Self = this.set("vector-effect", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVector-effect`: Self = this.set("vector-effect", js.undefined)
    @scala.inline
    def setVectorEffect(value: Double | String): Self = this.set("vectorEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVectorEffect: Self = this.set("vectorEffect", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def `setVert-adv-y`(value: Double | String): Self = this.set("vert-adv-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVert-adv-y`: Self = this.set("vert-adv-y", js.undefined)
    @scala.inline
    def `setVert-origin-x`(value: Double | String): Self = this.set("vert-origin-x", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVert-origin-x`: Self = this.set("vert-origin-x", js.undefined)
    @scala.inline
    def `setVert-origin-y`(value: Double | String): Self = this.set("vert-origin-y", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteVert-origin-y`: Self = this.set("vert-origin-y", js.undefined)
    @scala.inline
    def setVertAdvY(value: Double | String): Self = this.set("vertAdvY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertAdvY: Self = this.set("vertAdvY", js.undefined)
    @scala.inline
    def setVertOriginX(value: Double | String): Self = this.set("vertOriginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertOriginX: Self = this.set("vertOriginX", js.undefined)
    @scala.inline
    def setVertOriginY(value: Double | String): Self = this.set("vertOriginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertOriginY: Self = this.set("vertOriginY", js.undefined)
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewBox: Self = this.set("viewBox", js.undefined)
    @scala.inline
    def setViewTarget(value: Double | String): Self = this.set("viewTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewTarget: Self = this.set("viewTarget", js.undefined)
    @scala.inline
    def setVisibility(value: Double | String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWidths(value: Double | String): Self = this.set("widths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidths: Self = this.set("widths", js.undefined)
    @scala.inline
    def `setWord-spacing`(value: Double | String): Self = this.set("word-spacing", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWord-spacing`: Self = this.set("word-spacing", js.undefined)
    @scala.inline
    def setWordSpacing(value: Double | String): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
    @scala.inline
    def `setWriting-mode`(value: Double | String): Self = this.set("writing-mode", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteWriting-mode`: Self = this.set("writing-mode", js.undefined)
    @scala.inline
    def setWritingMode(value: Double | String): Self = this.set("writingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritingMode: Self = this.set("writingMode", js.undefined)
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def `setX-height`(value: Double | String): Self = this.set("x-height", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteX-height`: Self = this.set("x-height", js.undefined)
    @scala.inline
    def setX1(value: Double | String): Self = this.set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    @scala.inline
    def setX2(value: Double | String): Self = this.set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    @scala.inline
    def setXChannelSelector(value: String): Self = this.set("xChannelSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXChannelSelector: Self = this.set("xChannelSelector", js.undefined)
    @scala.inline
    def setXHeight(value: Double | String): Self = this.set("xHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXHeight: Self = this.set("xHeight", js.undefined)
    @scala.inline
    def setXlinkActuate(value: String): Self = this.set("xlinkActuate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkActuate: Self = this.set("xlinkActuate", js.undefined)
    @scala.inline
    def setXlinkArcrole(value: String): Self = this.set("xlinkArcrole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkArcrole: Self = this.set("xlinkArcrole", js.undefined)
    @scala.inline
    def setXlinkColonactuate(value: String): Self = this.set("xlink:actuate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonactuate: Self = this.set("xlink:actuate", js.undefined)
    @scala.inline
    def setXlinkColonarcrole(value: String): Self = this.set("xlink:arcrole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonarcrole: Self = this.set("xlink:arcrole", js.undefined)
    @scala.inline
    def setXlinkColonhref(value: String): Self = this.set("xlink:href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonhref: Self = this.set("xlink:href", js.undefined)
    @scala.inline
    def setXlinkColonrole(value: String): Self = this.set("xlink:role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonrole: Self = this.set("xlink:role", js.undefined)
    @scala.inline
    def setXlinkColonshow(value: String): Self = this.set("xlink:show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColonshow: Self = this.set("xlink:show", js.undefined)
    @scala.inline
    def setXlinkColontitle(value: String): Self = this.set("xlink:title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColontitle: Self = this.set("xlink:title", js.undefined)
    @scala.inline
    def setXlinkColontype(value: String): Self = this.set("xlink:type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkColontype: Self = this.set("xlink:type", js.undefined)
    @scala.inline
    def setXlinkHref(value: String): Self = this.set("xlinkHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkHref: Self = this.set("xlinkHref", js.undefined)
    @scala.inline
    def setXlinkRole(value: String): Self = this.set("xlinkRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkRole: Self = this.set("xlinkRole", js.undefined)
    @scala.inline
    def setXlinkShow(value: String): Self = this.set("xlinkShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkShow: Self = this.set("xlinkShow", js.undefined)
    @scala.inline
    def setXlinkTitle(value: String): Self = this.set("xlinkTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkTitle: Self = this.set("xlinkTitle", js.undefined)
    @scala.inline
    def setXlinkType(value: String): Self = this.set("xlinkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXlinkType: Self = this.set("xlinkType", js.undefined)
    @scala.inline
    def setXmlBase(value: String): Self = this.set("xmlBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlBase: Self = this.set("xmlBase", js.undefined)
    @scala.inline
    def setXmlColonbase(value: String): Self = this.set("xml:base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlColonbase: Self = this.set("xml:base", js.undefined)
    @scala.inline
    def setXmlColonlang(value: String): Self = this.set("xml:lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlColonlang: Self = this.set("xml:lang", js.undefined)
    @scala.inline
    def setXmlColonspace(value: String): Self = this.set("xml:space", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlColonspace: Self = this.set("xml:space", js.undefined)
    @scala.inline
    def setXmlLang(value: String): Self = this.set("xmlLang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlLang: Self = this.set("xmlLang", js.undefined)
    @scala.inline
    def setXmlSpace(value: String): Self = this.set("xmlSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlSpace: Self = this.set("xmlSpace", js.undefined)
    @scala.inline
    def setXmlns(value: String): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
    @scala.inline
    def setXmlnsColonxlink(value: String): Self = this.set("xmlns:xlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlnsColonxlink: Self = this.set("xmlns:xlink", js.undefined)
    @scala.inline
    def setXmlnsXlink(value: String): Self = this.set("xmlnsXlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlnsXlink: Self = this.set("xmlnsXlink", js.undefined)
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setY1(value: Double | String): Self = this.set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    @scala.inline
    def setY2(value: Double | String): Self = this.set("y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
    @scala.inline
    def setYChannelSelector(value: String): Self = this.set("yChannelSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYChannelSelector: Self = this.set("yChannelSelector", js.undefined)
    @scala.inline
    def setZ(value: Double | String): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    @scala.inline
    def setZoomAndPan(value: String): Self = this.set("zoomAndPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomAndPan: Self = this.set("zoomAndPan", js.undefined)
  }
  
}

