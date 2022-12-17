package typings.csstype.mod.AtRule

import typings.csstype.csstypeStrings.auto
import typings.csstype.csstypeStrings.normal
import typings.csstype.mod.DataType.FontStretchAbsolute
import typings.csstype.mod.DataType.FontWeightAbsolute
import typings.csstype.mod.DataType.ViewportLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AscentOverride = normal | String

type Bleed[TLength] = TLength | auto

type DescentOverride = normal | String

type FontFeatureSettings = normal | String

type FontStretch = FontStretchAbsolute | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.italic
  - typings.csstype.csstypeStrings.normal
  - typings.csstype.csstypeStrings.oblique
  - java.lang.String
*/
type FontStyle = _FontStyle | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.EastAsianVariantValues
  - typings.csstype.csstypeStrings.`all-petite-caps`
  - typings.csstype.csstypeStrings.`all-small-caps`
  - typings.csstype.csstypeStrings.`common-ligatures`
  - typings.csstype.csstypeStrings.contextual
  - typings.csstype.csstypeStrings.`diagonal-fractions`
  - typings.csstype.csstypeStrings.`discretionary-ligatures`
  - typings.csstype.csstypeStrings.`full-width`
  - typings.csstype.csstypeStrings.`historical-forms`
  - typings.csstype.csstypeStrings.`historical-ligatures`
  - typings.csstype.csstypeStrings.`lining-nums`
  - typings.csstype.csstypeStrings.`no-common-ligatures`
  - typings.csstype.csstypeStrings.`no-contextual`
  - typings.csstype.csstypeStrings.`no-discretionary-ligatures`
  - typings.csstype.csstypeStrings.`no-historical-ligatures`
  - typings.csstype.csstypeStrings.none
  - typings.csstype.csstypeStrings.normal
  - typings.csstype.csstypeStrings.`oldstyle-nums`
  - typings.csstype.csstypeStrings.ordinal
  - typings.csstype.csstypeStrings.`petite-caps`
  - typings.csstype.csstypeStrings.`proportional-nums`
  - typings.csstype.csstypeStrings.`proportional-width`
  - typings.csstype.csstypeStrings.ruby
  - typings.csstype.csstypeStrings.`slashed-zero`
  - typings.csstype.csstypeStrings.`small-caps`
  - typings.csstype.csstypeStrings.`stacked-fractions`
  - typings.csstype.csstypeStrings.`tabular-nums`
  - typings.csstype.csstypeStrings.`titling-caps`
  - typings.csstype.csstypeStrings.unicase
  - java.lang.String
*/
type FontVariant = _FontVariant | String

type FontVariationSettings = normal | String

type FontWeight = FontWeightAbsolute | String

type Height[TLength] = ViewportLength[TLength] | String

type LineGapOverride = normal | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.crop
  - typings.csstype.csstypeStrings.cross
  - typings.csstype.csstypeStrings.none
  - java.lang.String
*/
type Marks = _Marks | String

type MaxHeight[TLength] = ViewportLength[TLength]

type MaxWidth[TLength] = ViewportLength[TLength]

type MaxZoom = auto | String | Double

type MinHeight[TLength] = ViewportLength[TLength]

type MinWidth[TLength] = ViewportLength[TLength]

type MinZoom = auto | String | Double

type Range = auto | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.mod.DataType.PageSize
  - TLength
  - typings.csstype.csstypeStrings.auto
  - typings.csstype.csstypeStrings.landscape
  - typings.csstype.csstypeStrings.portrait
  - java.lang.String
*/
type Size[TLength] = _Size[TLength] | TLength | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.auto
  - typings.csstype.csstypeStrings.bullets
  - typings.csstype.csstypeStrings.numbers
  - typings.csstype.csstypeStrings.`spell-out`
  - typings.csstype.csstypeStrings.words
  - java.lang.String
*/
type SpeakAs = _SpeakAs | String

/* Rewritten from type alias, can be one of: 
  - typings.csstype.csstypeStrings.additive
  - typings.csstype.csstypeStrings.alphabetic
  - typings.csstype.csstypeStrings.cyclic
  - typings.csstype.csstypeStrings.fixed
  - typings.csstype.csstypeStrings.numeric
  - typings.csstype.csstypeStrings.symbolic
  - java.lang.String
*/
type System = _System | String

type Width[TLength] = ViewportLength[TLength] | String

type Zoom = auto | String | Double
