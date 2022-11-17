package typings.csstype.mod.AtRule

import typings.csstype.mod.DataType.EastAsianVariantValues
import typings.csstype.mod.DataType.FontStretchAbsolute
import typings.csstype.mod.DataType.FontWeightAbsolute
import typings.csstype.mod.DataType.PageSize
import typings.csstype.mod.DataType.ViewportLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AscentOverride = "normal" | String

type Bleed[TLength] = TLength | "auto"

type DescentOverride = "normal" | String

type FontDisplay = "auto" | "block" | "fallback" | "optional" | "swap"

type FontFeatureSettings = "normal" | String

type FontStretch = FontStretchAbsolute | String

type FontStyle = "italic" | "normal" | "oblique" | String

type FontVariant = EastAsianVariantValues | "all-petite-caps" | "all-small-caps" | "common-ligatures" | "contextual" | "diagonal-fractions" | "discretionary-ligatures" | "full-width" | "historical-forms" | "historical-ligatures" | "lining-nums" | "no-common-ligatures" | "no-contextual" | "no-discretionary-ligatures" | "no-historical-ligatures" | "none" | "normal" | "oldstyle-nums" | "ordinal" | "petite-caps" | "proportional-nums" | "proportional-width" | "ruby" | "slashed-zero" | "small-caps" | "stacked-fractions" | "tabular-nums" | "titling-caps" | "unicase" | String

type FontVariationSettings = "normal" | String

type FontWeight = FontWeightAbsolute | String

type Height[TLength] = ViewportLength[TLength] | String

type Inherits = "false" | "true"

type LineGapOverride = "normal" | String

type Marks = "crop" | "cross" | "none" | String

type MaxHeight[TLength] = ViewportLength[TLength]

type MaxWidth[TLength] = ViewportLength[TLength]

type MaxZoom = "auto" | String | (Double & js.Object)

type MinHeight[TLength] = ViewportLength[TLength]

type MinWidth[TLength] = ViewportLength[TLength]

type MinZoom = "auto" | String | (Double & js.Object)

type Orientation = "auto" | "landscape" | "portrait"

type Range = "auto" | String

type Size[TLength] = PageSize | TLength | "auto" | "landscape" | "portrait" | String

type SpeakAs = "auto" | "bullets" | "numbers" | "spell-out" | "words" | String

type System = "additive" | "alphabetic" | "cyclic" | "fixed" | "numeric" | "symbolic" | String

type UserZoom = "fixed" | "zoom"

type ViewportFit = "auto" | "contain" | "cover"

type Width[TLength] = ViewportLength[TLength] | String

type Zoom = "auto" | String | (Double & js.Object)
