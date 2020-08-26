package typings.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AtRule {
  type FontFeatureSettings = typings.csstype.csstypeStrings.normal | (java.lang.String with js.Object)
  type FontStretch = typings.csstype.mod.DataType.FontStretchAbsolute | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.italic
    - typings.csstype.csstypeStrings.normal
    - typings.csstype.csstypeStrings.oblique
    - java.lang.String with js.Object
  */
  type FontStyle = typings.csstype.mod.AtRule._FontStyle | (java.lang.String with js.Object)
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
    - java.lang.String with js.Object
  */
  type FontVariant = typings.csstype.mod.AtRule._FontVariant | (java.lang.String with js.Object)
  type FontVariationSettings = typings.csstype.csstypeStrings.normal | (java.lang.String with js.Object)
  type FontWeight = typings.csstype.mod.DataType.FontWeightAbsolute | (java.lang.String with js.Object)
  type Height[TLength] = typings.csstype.mod.DataType.ViewportLength[TLength] | (java.lang.String with js.Object)
  type MaxHeight[TLength] = typings.csstype.mod.DataType.ViewportLength[TLength]
  type MaxWidth[TLength] = typings.csstype.mod.DataType.ViewportLength[TLength]
  type MaxZoom = typings.csstype.csstypeStrings.auto | (java.lang.String with js.Object) | (scala.Double with js.Object)
  type MinHeight[TLength] = typings.csstype.mod.DataType.ViewportLength[TLength]
  type MinWidth[TLength] = typings.csstype.mod.DataType.ViewportLength[TLength]
  type MinZoom = typings.csstype.csstypeStrings.auto | (java.lang.String with js.Object) | (scala.Double with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.infinite
    - java.lang.String with js.Object
    - scala.Double with js.Object
  */
  type Range = typings.csstype.mod.AtRule._Range | (java.lang.String with js.Object) | (scala.Double with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.auto
    - typings.csstype.csstypeStrings.bullets
    - typings.csstype.csstypeStrings.numbers
    - typings.csstype.csstypeStrings.`spell-out`
    - typings.csstype.csstypeStrings.words
    - java.lang.String with js.Object
  */
  type SpeakAs = typings.csstype.mod.AtRule._SpeakAs | (java.lang.String with js.Object)
  /* Rewritten from type alias, can be one of: 
    - typings.csstype.csstypeStrings.additive
    - typings.csstype.csstypeStrings.alphabetic
    - typings.csstype.csstypeStrings.cyclic
    - typings.csstype.csstypeStrings.fixed
    - typings.csstype.csstypeStrings.numeric
    - typings.csstype.csstypeStrings.symbolic
    - java.lang.String with js.Object
  */
  type System = typings.csstype.mod.AtRule._System | (java.lang.String with js.Object)
  type Width[TLength] = typings.csstype.mod.DataType.ViewportLength[TLength] | (java.lang.String with js.Object)
  type Zoom = typings.csstype.csstypeStrings.auto | (java.lang.String with js.Object) | (scala.Double with js.Object)
}
