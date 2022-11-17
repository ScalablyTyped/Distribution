package typings.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataType {
  
  object AbsoluteSize {
    
    inline def large: "large" = "large".asInstanceOf["large"]
    
    inline def medium: "medium" = "medium".asInstanceOf["medium"]
    
    inline def small: "small" = "small".asInstanceOf["small"]
    
    inline def `x-large`: "x-large" = "x-large".asInstanceOf["x-large"]
    
    inline def `x-small`: "x-small" = "x-small".asInstanceOf["x-small"]
    
    inline def `xx-large`: "xx-large" = "xx-large".asInstanceOf["xx-large"]
    
    inline def `xx-small`: "xx-small" = "xx-small".asInstanceOf["xx-small"]
    
    inline def `xxx-large`: "xxx-large" = "xxx-large".asInstanceOf["xxx-large"]
  }
  type AbsoluteSize = "large" | "medium" | "small" | "x-large" | "x-small" | "xx-large" | "xx-small" | "xxx-large"
  
  type AnimateableFeature = "contents" | "scroll-position" | String
  
  object Attachment {
    
    inline def fixed: "fixed" = "fixed".asInstanceOf["fixed"]
    
    inline def local: "local" = "local".asInstanceOf["local"]
    
    inline def scroll: "scroll" = "scroll".asInstanceOf["scroll"]
  }
  type Attachment = "fixed" | "local" | "scroll"
  
  type BgPosition[TLength] = TLength | "bottom" | "center" | "left" | "right" | "top" | String
  
  type BgSize[TLength] = TLength | "auto" | "contain" | "cover" | String
  
  object BlendMode {
    
    inline def color: "color" = "color".asInstanceOf["color"]
    
    inline def `color-burn`: "color-burn" = "color-burn".asInstanceOf["color-burn"]
    
    inline def `color-dodge`: "color-dodge" = "color-dodge".asInstanceOf["color-dodge"]
    
    inline def darken: "darken" = "darken".asInstanceOf["darken"]
    
    inline def difference: "difference" = "difference".asInstanceOf["difference"]
    
    inline def exclusion: "exclusion" = "exclusion".asInstanceOf["exclusion"]
    
    inline def `hard-light`: "hard-light" = "hard-light".asInstanceOf["hard-light"]
    
    inline def hue: "hue" = "hue".asInstanceOf["hue"]
    
    inline def lighten: "lighten" = "lighten".asInstanceOf["lighten"]
    
    inline def luminosity: "luminosity" = "luminosity".asInstanceOf["luminosity"]
    
    inline def multiply: "multiply" = "multiply".asInstanceOf["multiply"]
    
    inline def normal: "normal" = "normal".asInstanceOf["normal"]
    
    inline def overlay: "overlay" = "overlay".asInstanceOf["overlay"]
    
    inline def saturation: "saturation" = "saturation".asInstanceOf["saturation"]
    
    inline def screen: "screen" = "screen".asInstanceOf["screen"]
    
    inline def `soft-light`: "soft-light" = "soft-light".asInstanceOf["soft-light"]
  }
  type BlendMode = "color" | "color-burn" | "color-dodge" | "darken" | "difference" | "exclusion" | "hard-light" | "hue" | "lighten" | "luminosity" | "multiply" | "normal" | "overlay" | "saturation" | "screen" | "soft-light"
  
  object Box {
    
    inline def `border-box`: "border-box" = "border-box".asInstanceOf["border-box"]
    
    inline def `content-box`: "content-box" = "content-box".asInstanceOf["content-box"]
    
    inline def `padding-box`: "padding-box" = "padding-box".asInstanceOf["padding-box"]
  }
  type Box = "border-box" | "content-box" | "padding-box"
  
  type Color = NamedColor | DeprecatedSystemColor | "currentcolor" | String
  
  object CompatAuto {
    
    inline def button: "button" = "button".asInstanceOf["button"]
    
    inline def checkbox: "checkbox" = "checkbox".asInstanceOf["checkbox"]
    
    inline def listbox: "listbox" = "listbox".asInstanceOf["listbox"]
    
    inline def menulist: "menulist" = "menulist".asInstanceOf["menulist"]
    
    inline def meter: "meter" = "meter".asInstanceOf["meter"]
    
    inline def `progress-bar`: "progress-bar" = "progress-bar".asInstanceOf["progress-bar"]
    
    inline def `push-button`: "push-button" = "push-button".asInstanceOf["push-button"]
    
    inline def radio: "radio" = "radio".asInstanceOf["radio"]
    
    inline def searchfield: "searchfield" = "searchfield".asInstanceOf["searchfield"]
    
    inline def `slider-horizontal`: "slider-horizontal" = "slider-horizontal".asInstanceOf["slider-horizontal"]
    
    inline def `square-button`: "square-button" = "square-button".asInstanceOf["square-button"]
    
    inline def textarea: "textarea" = "textarea".asInstanceOf["textarea"]
  }
  type CompatAuto = "button" | "checkbox" | "listbox" | "menulist" | "meter" | "progress-bar" | "push-button" | "radio" | "searchfield" | "slider-horizontal" | "square-button" | "textarea"
  
  object CompositeStyle {
    
    inline def clear: "clear" = "clear".asInstanceOf["clear"]
    
    inline def copy: "copy" = "copy".asInstanceOf["copy"]
    
    inline def `destination-atop`: "destination-atop" = "destination-atop".asInstanceOf["destination-atop"]
    
    inline def `destination-in`: "destination-in" = "destination-in".asInstanceOf["destination-in"]
    
    inline def `destination-out`: "destination-out" = "destination-out".asInstanceOf["destination-out"]
    
    inline def `destination-over`: "destination-over" = "destination-over".asInstanceOf["destination-over"]
    
    inline def `source-atop`: "source-atop" = "source-atop".asInstanceOf["source-atop"]
    
    inline def `source-in`: "source-in" = "source-in".asInstanceOf["source-in"]
    
    inline def `source-out`: "source-out" = "source-out".asInstanceOf["source-out"]
    
    inline def `source-over`: "source-over" = "source-over".asInstanceOf["source-over"]
    
    inline def xor: "xor" = "xor".asInstanceOf["xor"]
  }
  type CompositeStyle = "clear" | "copy" | "destination-atop" | "destination-in" | "destination-out" | "destination-over" | "source-atop" | "source-in" | "source-out" | "source-over" | "xor"
  
  object CompositingOperator {
    
    inline def add: "add" = "add".asInstanceOf["add"]
    
    inline def exclude: "exclude" = "exclude".asInstanceOf["exclude"]
    
    inline def intersect: "intersect" = "intersect".asInstanceOf["intersect"]
    
    inline def subtract: "subtract" = "subtract".asInstanceOf["subtract"]
  }
  type CompositingOperator = "add" | "exclude" | "intersect" | "subtract"
  
  object ContentDistribution {
    
    inline def `space-around`: "space-around" = "space-around".asInstanceOf["space-around"]
    
    inline def `space-between`: "space-between" = "space-between".asInstanceOf["space-between"]
    
    inline def `space-evenly`: "space-evenly" = "space-evenly".asInstanceOf["space-evenly"]
    
    inline def stretch: "stretch" = "stretch".asInstanceOf["stretch"]
  }
  type ContentDistribution = "space-around" | "space-between" | "space-evenly" | "stretch"
  
  type ContentList = Quote | "contents" | String
  
  object ContentPosition {
    
    inline def center: "center" = "center".asInstanceOf["center"]
    
    inline def end: "end" = "end".asInstanceOf["end"]
    
    inline def `flex-end`: "flex-end" = "flex-end".asInstanceOf["flex-end"]
    
    inline def `flex-start`: "flex-start" = "flex-start".asInstanceOf["flex-start"]
    
    inline def start: "start" = "start".asInstanceOf["start"]
  }
  type ContentPosition = "center" | "end" | "flex-end" | "flex-start" | "start"
  
  type CubicBezierTimingFunction = "ease" | "ease-in" | "ease-in-out" | "ease-out" | String
  
  type Dasharray[TLength] = TLength | String | (Double & js.Object)
  
  object DeprecatedSystemColor {
    
    inline def ActiveBorder: "ActiveBorder" = "ActiveBorder".asInstanceOf["ActiveBorder"]
    
    inline def ActiveCaption: "ActiveCaption" = "ActiveCaption".asInstanceOf["ActiveCaption"]
    
    inline def AppWorkspace: "AppWorkspace" = "AppWorkspace".asInstanceOf["AppWorkspace"]
    
    inline def Background: "Background" = "Background".asInstanceOf["Background"]
    
    inline def ButtonFace: "ButtonFace" = "ButtonFace".asInstanceOf["ButtonFace"]
    
    inline def ButtonHighlight: "ButtonHighlight" = "ButtonHighlight".asInstanceOf["ButtonHighlight"]
    
    inline def ButtonShadow: "ButtonShadow" = "ButtonShadow".asInstanceOf["ButtonShadow"]
    
    inline def ButtonText: "ButtonText" = "ButtonText".asInstanceOf["ButtonText"]
    
    inline def CaptionText: "CaptionText" = "CaptionText".asInstanceOf["CaptionText"]
    
    inline def GrayText: "GrayText" = "GrayText".asInstanceOf["GrayText"]
    
    inline def Highlight: "Highlight" = "Highlight".asInstanceOf["Highlight"]
    
    inline def HighlightText: "HighlightText" = "HighlightText".asInstanceOf["HighlightText"]
    
    inline def InactiveBorder: "InactiveBorder" = "InactiveBorder".asInstanceOf["InactiveBorder"]
    
    inline def InactiveCaption: "InactiveCaption" = "InactiveCaption".asInstanceOf["InactiveCaption"]
    
    inline def InactiveCaptionText: "InactiveCaptionText" = "InactiveCaptionText".asInstanceOf["InactiveCaptionText"]
    
    inline def InfoBackground: "InfoBackground" = "InfoBackground".asInstanceOf["InfoBackground"]
    
    inline def InfoText: "InfoText" = "InfoText".asInstanceOf["InfoText"]
    
    inline def Menu: "Menu" = "Menu".asInstanceOf["Menu"]
    
    inline def MenuText: "MenuText" = "MenuText".asInstanceOf["MenuText"]
    
    inline def Scrollbar: "Scrollbar" = "Scrollbar".asInstanceOf["Scrollbar"]
    
    inline def ThreeDDarkShadow: "ThreeDDarkShadow" = "ThreeDDarkShadow".asInstanceOf["ThreeDDarkShadow"]
    
    inline def ThreeDFace: "ThreeDFace" = "ThreeDFace".asInstanceOf["ThreeDFace"]
    
    inline def ThreeDHighlight: "ThreeDHighlight" = "ThreeDHighlight".asInstanceOf["ThreeDHighlight"]
    
    inline def ThreeDLightShadow: "ThreeDLightShadow" = "ThreeDLightShadow".asInstanceOf["ThreeDLightShadow"]
    
    inline def ThreeDShadow: "ThreeDShadow" = "ThreeDShadow".asInstanceOf["ThreeDShadow"]
    
    inline def Window: "Window" = "Window".asInstanceOf["Window"]
    
    inline def WindowFrame: "WindowFrame" = "WindowFrame".asInstanceOf["WindowFrame"]
    
    inline def WindowText: "WindowText" = "WindowText".asInstanceOf["WindowText"]
  }
  type DeprecatedSystemColor = "ActiveBorder" | "ActiveCaption" | "AppWorkspace" | "Background" | "ButtonFace" | "ButtonHighlight" | "ButtonShadow" | "ButtonText" | "CaptionText" | "GrayText" | "Highlight" | "HighlightText" | "InactiveBorder" | "InactiveCaption" | "InactiveCaptionText" | "InfoBackground" | "InfoText" | "Menu" | "MenuText" | "Scrollbar" | "ThreeDDarkShadow" | "ThreeDFace" | "ThreeDHighlight" | "ThreeDLightShadow" | "ThreeDShadow" | "Window" | "WindowFrame" | "WindowText"
  
  object DisplayInside {
    
    inline def `-ms-flexbox`: "-ms-flexbox" = "-ms-flexbox".asInstanceOf["-ms-flexbox"]
    
    inline def `-ms-grid`: "-ms-grid" = "-ms-grid".asInstanceOf["-ms-grid"]
    
    inline def `-webkit-flex`: "-webkit-flex" = "-webkit-flex".asInstanceOf["-webkit-flex"]
    
    inline def flex: "flex" = "flex".asInstanceOf["flex"]
    
    inline def flow: "flow" = "flow".asInstanceOf["flow"]
    
    inline def `flow-root`: "flow-root" = "flow-root".asInstanceOf["flow-root"]
    
    inline def grid: "grid" = "grid".asInstanceOf["grid"]
    
    inline def ruby: "ruby" = "ruby".asInstanceOf["ruby"]
    
    inline def table: "table" = "table".asInstanceOf["table"]
  }
  type DisplayInside = "-ms-flexbox" | "-ms-grid" | "-webkit-flex" | "flex" | "flow" | "flow-root" | "grid" | "ruby" | "table"
  
  object DisplayInternal {
    
    inline def `ruby-base`: "ruby-base" = "ruby-base".asInstanceOf["ruby-base"]
    
    inline def `ruby-base-container`: "ruby-base-container" = "ruby-base-container".asInstanceOf["ruby-base-container"]
    
    inline def `ruby-text`: "ruby-text" = "ruby-text".asInstanceOf["ruby-text"]
    
    inline def `ruby-text-container`: "ruby-text-container" = "ruby-text-container".asInstanceOf["ruby-text-container"]
    
    inline def `table-caption`: "table-caption" = "table-caption".asInstanceOf["table-caption"]
    
    inline def `table-cell`: "table-cell" = "table-cell".asInstanceOf["table-cell"]
    
    inline def `table-column`: "table-column" = "table-column".asInstanceOf["table-column"]
    
    inline def `table-column-group`: "table-column-group" = "table-column-group".asInstanceOf["table-column-group"]
    
    inline def `table-footer-group`: "table-footer-group" = "table-footer-group".asInstanceOf["table-footer-group"]
    
    inline def `table-header-group`: "table-header-group" = "table-header-group".asInstanceOf["table-header-group"]
    
    inline def `table-row`: "table-row" = "table-row".asInstanceOf["table-row"]
    
    inline def `table-row-group`: "table-row-group" = "table-row-group".asInstanceOf["table-row-group"]
  }
  type DisplayInternal = "ruby-base" | "ruby-base-container" | "ruby-text" | "ruby-text-container" | "table-caption" | "table-cell" | "table-column" | "table-column-group" | "table-footer-group" | "table-header-group" | "table-row" | "table-row-group"
  
  object DisplayLegacy {
    
    inline def `-ms-inline-flexbox`: "-ms-inline-flexbox" = "-ms-inline-flexbox".asInstanceOf["-ms-inline-flexbox"]
    
    inline def `-ms-inline-grid`: "-ms-inline-grid" = "-ms-inline-grid".asInstanceOf["-ms-inline-grid"]
    
    inline def `-webkit-inline-flex`: "-webkit-inline-flex" = "-webkit-inline-flex".asInstanceOf["-webkit-inline-flex"]
    
    inline def `inline-block`: "inline-block" = "inline-block".asInstanceOf["inline-block"]
    
    inline def `inline-flex`: "inline-flex" = "inline-flex".asInstanceOf["inline-flex"]
    
    inline def `inline-grid`: "inline-grid" = "inline-grid".asInstanceOf["inline-grid"]
    
    inline def `inline-list-item`: "inline-list-item" = "inline-list-item".asInstanceOf["inline-list-item"]
    
    inline def `inline-table`: "inline-table" = "inline-table".asInstanceOf["inline-table"]
  }
  type DisplayLegacy = "-ms-inline-flexbox" | "-ms-inline-grid" | "-webkit-inline-flex" | "inline-block" | "inline-flex" | "inline-grid" | "inline-list-item" | "inline-table"
  
  object DisplayOutside {
    
    inline def block: "block" = "block".asInstanceOf["block"]
    
    inline def `inline`: "inline" = "inline".asInstanceOf["inline"]
    
    inline def `run-in`: "run-in" = "run-in".asInstanceOf["run-in"]
  }
  type DisplayOutside = "block" | "inline" | "run-in"
  
  type EasingFunction = CubicBezierTimingFunction | StepTimingFunction | "linear"
  
  object EastAsianVariantValues {
    
    inline def jis04: "jis04" = "jis04".asInstanceOf["jis04"]
    
    inline def jis78: "jis78" = "jis78".asInstanceOf["jis78"]
    
    inline def jis83: "jis83" = "jis83".asInstanceOf["jis83"]
    
    inline def jis90: "jis90" = "jis90".asInstanceOf["jis90"]
    
    inline def simplified: "simplified" = "simplified".asInstanceOf["simplified"]
    
    inline def traditional: "traditional" = "traditional".asInstanceOf["traditional"]
  }
  type EastAsianVariantValues = "jis04" | "jis78" | "jis83" | "jis90" | "simplified" | "traditional"
  
  type FinalBgLayer[TLength] = Color | BgPosition[TLength] | RepeatStyle | Attachment | Box | "none" | String
  
  type FontStretchAbsolute = "condensed" | "expanded" | "extra-condensed" | "extra-expanded" | "normal" | "semi-condensed" | "semi-expanded" | "ultra-condensed" | "ultra-expanded" | String
  
  type FontWeightAbsolute = "bold" | "normal" | (Double & js.Object) | String
  
  object GenericFamily {
    
    inline def cursive: "cursive" = "cursive".asInstanceOf["cursive"]
    
    inline def fantasy: "fantasy" = "fantasy".asInstanceOf["fantasy"]
    
    inline def monospace: "monospace" = "monospace".asInstanceOf["monospace"]
    
    inline def `sans-serif`: "sans-serif" = "sans-serif".asInstanceOf["sans-serif"]
    
    inline def serif: "serif" = "serif".asInstanceOf["serif"]
  }
  type GenericFamily = "cursive" | "fantasy" | "monospace" | "sans-serif" | "serif"
  
  object GeometryBox {
    
    inline def `border-box`: "border-box" = "border-box".asInstanceOf["border-box"]
    
    inline def `content-box`: "content-box" = "content-box".asInstanceOf["content-box"]
    
    inline def `fill-box`: "fill-box" = "fill-box".asInstanceOf["fill-box"]
    
    inline def `margin-box`: "margin-box" = "margin-box".asInstanceOf["margin-box"]
    
    inline def `padding-box`: "padding-box" = "padding-box".asInstanceOf["padding-box"]
    
    inline def `stroke-box`: "stroke-box" = "stroke-box".asInstanceOf["stroke-box"]
    
    inline def `view-box`: "view-box" = "view-box".asInstanceOf["view-box"]
  }
  type GeometryBox = "fill-box" | "margin-box" | "stroke-box" | "view-box" | "border-box" | "content-box" | "padding-box"
  
  type GridLine = "auto" | String | (Double & js.Object)
  
  object LineStyle {
    
    inline def dashed: "dashed" = "dashed".asInstanceOf["dashed"]
    
    inline def dotted: "dotted" = "dotted".asInstanceOf["dotted"]
    
    inline def double: "double" = "double".asInstanceOf["double"]
    
    inline def groove: "groove" = "groove".asInstanceOf["groove"]
    
    inline def hidden: "hidden" = "hidden".asInstanceOf["hidden"]
    
    inline def inset: "inset" = "inset".asInstanceOf["inset"]
    
    inline def none: "none" = "none".asInstanceOf["none"]
    
    inline def outset: "outset" = "outset".asInstanceOf["outset"]
    
    inline def ridge: "ridge" = "ridge".asInstanceOf["ridge"]
    
    inline def solid: "solid" = "solid".asInstanceOf["solid"]
  }
  type LineStyle = "dashed" | "dotted" | "double" | "groove" | "hidden" | "inset" | "none" | "outset" | "ridge" | "solid"
  
  type LineWidth[TLength] = TLength | "medium" | "thick" | "thin"
  
  type MaskLayer[TLength] = Position[TLength] | RepeatStyle | GeometryBox | CompositingOperator | MaskingMode | "no-clip" | "none" | String
  
  object MaskingMode {
    
    inline def alpha: "alpha" = "alpha".asInstanceOf["alpha"]
    
    inline def luminance: "luminance" = "luminance".asInstanceOf["luminance"]
    
    inline def `match-source`: "match-source" = "match-source".asInstanceOf["match-source"]
  }
  type MaskingMode = "alpha" | "luminance" | "match-source"
  
  object NamedColor {
    
    inline def aliceblue: "aliceblue" = "aliceblue".asInstanceOf["aliceblue"]
    
    inline def antiquewhite: "antiquewhite" = "antiquewhite".asInstanceOf["antiquewhite"]
    
    inline def aqua: "aqua" = "aqua".asInstanceOf["aqua"]
    
    inline def aquamarine: "aquamarine" = "aquamarine".asInstanceOf["aquamarine"]
    
    inline def azure: "azure" = "azure".asInstanceOf["azure"]
    
    inline def beige: "beige" = "beige".asInstanceOf["beige"]
    
    inline def bisque: "bisque" = "bisque".asInstanceOf["bisque"]
    
    inline def black: "black" = "black".asInstanceOf["black"]
    
    inline def blanchedalmond: "blanchedalmond" = "blanchedalmond".asInstanceOf["blanchedalmond"]
    
    inline def blue: "blue" = "blue".asInstanceOf["blue"]
    
    inline def blueviolet: "blueviolet" = "blueviolet".asInstanceOf["blueviolet"]
    
    inline def brown: "brown" = "brown".asInstanceOf["brown"]
    
    inline def burlywood: "burlywood" = "burlywood".asInstanceOf["burlywood"]
    
    inline def cadetblue: "cadetblue" = "cadetblue".asInstanceOf["cadetblue"]
    
    inline def chartreuse: "chartreuse" = "chartreuse".asInstanceOf["chartreuse"]
    
    inline def chocolate: "chocolate" = "chocolate".asInstanceOf["chocolate"]
    
    inline def coral: "coral" = "coral".asInstanceOf["coral"]
    
    inline def cornflowerblue: "cornflowerblue" = "cornflowerblue".asInstanceOf["cornflowerblue"]
    
    inline def cornsilk: "cornsilk" = "cornsilk".asInstanceOf["cornsilk"]
    
    inline def crimson: "crimson" = "crimson".asInstanceOf["crimson"]
    
    inline def cyan: "cyan" = "cyan".asInstanceOf["cyan"]
    
    inline def darkblue: "darkblue" = "darkblue".asInstanceOf["darkblue"]
    
    inline def darkcyan: "darkcyan" = "darkcyan".asInstanceOf["darkcyan"]
    
    inline def darkgoldenrod: "darkgoldenrod" = "darkgoldenrod".asInstanceOf["darkgoldenrod"]
    
    inline def darkgray: "darkgray" = "darkgray".asInstanceOf["darkgray"]
    
    inline def darkgreen: "darkgreen" = "darkgreen".asInstanceOf["darkgreen"]
    
    inline def darkgrey: "darkgrey" = "darkgrey".asInstanceOf["darkgrey"]
    
    inline def darkkhaki: "darkkhaki" = "darkkhaki".asInstanceOf["darkkhaki"]
    
    inline def darkmagenta: "darkmagenta" = "darkmagenta".asInstanceOf["darkmagenta"]
    
    inline def darkolivegreen: "darkolivegreen" = "darkolivegreen".asInstanceOf["darkolivegreen"]
    
    inline def darkorange: "darkorange" = "darkorange".asInstanceOf["darkorange"]
    
    inline def darkorchid: "darkorchid" = "darkorchid".asInstanceOf["darkorchid"]
    
    inline def darkred: "darkred" = "darkred".asInstanceOf["darkred"]
    
    inline def darksalmon: "darksalmon" = "darksalmon".asInstanceOf["darksalmon"]
    
    inline def darkseagreen: "darkseagreen" = "darkseagreen".asInstanceOf["darkseagreen"]
    
    inline def darkslateblue: "darkslateblue" = "darkslateblue".asInstanceOf["darkslateblue"]
    
    inline def darkslategray: "darkslategray" = "darkslategray".asInstanceOf["darkslategray"]
    
    inline def darkslategrey: "darkslategrey" = "darkslategrey".asInstanceOf["darkslategrey"]
    
    inline def darkturquoise: "darkturquoise" = "darkturquoise".asInstanceOf["darkturquoise"]
    
    inline def darkviolet: "darkviolet" = "darkviolet".asInstanceOf["darkviolet"]
    
    inline def deeppink: "deeppink" = "deeppink".asInstanceOf["deeppink"]
    
    inline def deepskyblue: "deepskyblue" = "deepskyblue".asInstanceOf["deepskyblue"]
    
    inline def dimgray: "dimgray" = "dimgray".asInstanceOf["dimgray"]
    
    inline def dimgrey: "dimgrey" = "dimgrey".asInstanceOf["dimgrey"]
    
    inline def dodgerblue: "dodgerblue" = "dodgerblue".asInstanceOf["dodgerblue"]
    
    inline def firebrick: "firebrick" = "firebrick".asInstanceOf["firebrick"]
    
    inline def floralwhite: "floralwhite" = "floralwhite".asInstanceOf["floralwhite"]
    
    inline def forestgreen: "forestgreen" = "forestgreen".asInstanceOf["forestgreen"]
    
    inline def fuchsia: "fuchsia" = "fuchsia".asInstanceOf["fuchsia"]
    
    inline def gainsboro: "gainsboro" = "gainsboro".asInstanceOf["gainsboro"]
    
    inline def ghostwhite: "ghostwhite" = "ghostwhite".asInstanceOf["ghostwhite"]
    
    inline def gold: "gold" = "gold".asInstanceOf["gold"]
    
    inline def goldenrod: "goldenrod" = "goldenrod".asInstanceOf["goldenrod"]
    
    inline def gray: "gray" = "gray".asInstanceOf["gray"]
    
    inline def green: "green" = "green".asInstanceOf["green"]
    
    inline def greenyellow: "greenyellow" = "greenyellow".asInstanceOf["greenyellow"]
    
    inline def grey: "grey" = "grey".asInstanceOf["grey"]
    
    inline def honeydew: "honeydew" = "honeydew".asInstanceOf["honeydew"]
    
    inline def hotpink: "hotpink" = "hotpink".asInstanceOf["hotpink"]
    
    inline def indianred: "indianred" = "indianred".asInstanceOf["indianred"]
    
    inline def indigo: "indigo" = "indigo".asInstanceOf["indigo"]
    
    inline def ivory: "ivory" = "ivory".asInstanceOf["ivory"]
    
    inline def khaki: "khaki" = "khaki".asInstanceOf["khaki"]
    
    inline def lavender: "lavender" = "lavender".asInstanceOf["lavender"]
    
    inline def lavenderblush: "lavenderblush" = "lavenderblush".asInstanceOf["lavenderblush"]
    
    inline def lawngreen: "lawngreen" = "lawngreen".asInstanceOf["lawngreen"]
    
    inline def lemonchiffon: "lemonchiffon" = "lemonchiffon".asInstanceOf["lemonchiffon"]
    
    inline def lightblue: "lightblue" = "lightblue".asInstanceOf["lightblue"]
    
    inline def lightcoral: "lightcoral" = "lightcoral".asInstanceOf["lightcoral"]
    
    inline def lightcyan: "lightcyan" = "lightcyan".asInstanceOf["lightcyan"]
    
    inline def lightgoldenrodyellow: "lightgoldenrodyellow" = "lightgoldenrodyellow".asInstanceOf["lightgoldenrodyellow"]
    
    inline def lightgray: "lightgray" = "lightgray".asInstanceOf["lightgray"]
    
    inline def lightgreen: "lightgreen" = "lightgreen".asInstanceOf["lightgreen"]
    
    inline def lightgrey: "lightgrey" = "lightgrey".asInstanceOf["lightgrey"]
    
    inline def lightpink: "lightpink" = "lightpink".asInstanceOf["lightpink"]
    
    inline def lightsalmon: "lightsalmon" = "lightsalmon".asInstanceOf["lightsalmon"]
    
    inline def lightseagreen: "lightseagreen" = "lightseagreen".asInstanceOf["lightseagreen"]
    
    inline def lightskyblue: "lightskyblue" = "lightskyblue".asInstanceOf["lightskyblue"]
    
    inline def lightslategray: "lightslategray" = "lightslategray".asInstanceOf["lightslategray"]
    
    inline def lightslategrey: "lightslategrey" = "lightslategrey".asInstanceOf["lightslategrey"]
    
    inline def lightsteelblue: "lightsteelblue" = "lightsteelblue".asInstanceOf["lightsteelblue"]
    
    inline def lightyellow: "lightyellow" = "lightyellow".asInstanceOf["lightyellow"]
    
    inline def lime: "lime" = "lime".asInstanceOf["lime"]
    
    inline def limegreen: "limegreen" = "limegreen".asInstanceOf["limegreen"]
    
    inline def linen: "linen" = "linen".asInstanceOf["linen"]
    
    inline def magenta: "magenta" = "magenta".asInstanceOf["magenta"]
    
    inline def maroon: "maroon" = "maroon".asInstanceOf["maroon"]
    
    inline def mediumaquamarine: "mediumaquamarine" = "mediumaquamarine".asInstanceOf["mediumaquamarine"]
    
    inline def mediumblue: "mediumblue" = "mediumblue".asInstanceOf["mediumblue"]
    
    inline def mediumorchid: "mediumorchid" = "mediumorchid".asInstanceOf["mediumorchid"]
    
    inline def mediumpurple: "mediumpurple" = "mediumpurple".asInstanceOf["mediumpurple"]
    
    inline def mediumseagreen: "mediumseagreen" = "mediumseagreen".asInstanceOf["mediumseagreen"]
    
    inline def mediumslateblue: "mediumslateblue" = "mediumslateblue".asInstanceOf["mediumslateblue"]
    
    inline def mediumspringgreen: "mediumspringgreen" = "mediumspringgreen".asInstanceOf["mediumspringgreen"]
    
    inline def mediumturquoise: "mediumturquoise" = "mediumturquoise".asInstanceOf["mediumturquoise"]
    
    inline def mediumvioletred: "mediumvioletred" = "mediumvioletred".asInstanceOf["mediumvioletred"]
    
    inline def midnightblue: "midnightblue" = "midnightblue".asInstanceOf["midnightblue"]
    
    inline def mintcream: "mintcream" = "mintcream".asInstanceOf["mintcream"]
    
    inline def mistyrose: "mistyrose" = "mistyrose".asInstanceOf["mistyrose"]
    
    inline def moccasin: "moccasin" = "moccasin".asInstanceOf["moccasin"]
    
    inline def navajowhite: "navajowhite" = "navajowhite".asInstanceOf["navajowhite"]
    
    inline def navy: "navy" = "navy".asInstanceOf["navy"]
    
    inline def oldlace: "oldlace" = "oldlace".asInstanceOf["oldlace"]
    
    inline def olive: "olive" = "olive".asInstanceOf["olive"]
    
    inline def olivedrab: "olivedrab" = "olivedrab".asInstanceOf["olivedrab"]
    
    inline def orange: "orange" = "orange".asInstanceOf["orange"]
    
    inline def orangered: "orangered" = "orangered".asInstanceOf["orangered"]
    
    inline def orchid: "orchid" = "orchid".asInstanceOf["orchid"]
    
    inline def palegoldenrod: "palegoldenrod" = "palegoldenrod".asInstanceOf["palegoldenrod"]
    
    inline def palegreen: "palegreen" = "palegreen".asInstanceOf["palegreen"]
    
    inline def paleturquoise: "paleturquoise" = "paleturquoise".asInstanceOf["paleturquoise"]
    
    inline def palevioletred: "palevioletred" = "palevioletred".asInstanceOf["palevioletred"]
    
    inline def papayawhip: "papayawhip" = "papayawhip".asInstanceOf["papayawhip"]
    
    inline def peachpuff: "peachpuff" = "peachpuff".asInstanceOf["peachpuff"]
    
    inline def peru: "peru" = "peru".asInstanceOf["peru"]
    
    inline def pink: "pink" = "pink".asInstanceOf["pink"]
    
    inline def plum: "plum" = "plum".asInstanceOf["plum"]
    
    inline def powderblue: "powderblue" = "powderblue".asInstanceOf["powderblue"]
    
    inline def purple: "purple" = "purple".asInstanceOf["purple"]
    
    inline def rebeccapurple: "rebeccapurple" = "rebeccapurple".asInstanceOf["rebeccapurple"]
    
    inline def red: "red" = "red".asInstanceOf["red"]
    
    inline def rosybrown: "rosybrown" = "rosybrown".asInstanceOf["rosybrown"]
    
    inline def royalblue: "royalblue" = "royalblue".asInstanceOf["royalblue"]
    
    inline def saddlebrown: "saddlebrown" = "saddlebrown".asInstanceOf["saddlebrown"]
    
    inline def salmon: "salmon" = "salmon".asInstanceOf["salmon"]
    
    inline def sandybrown: "sandybrown" = "sandybrown".asInstanceOf["sandybrown"]
    
    inline def seagreen: "seagreen" = "seagreen".asInstanceOf["seagreen"]
    
    inline def seashell: "seashell" = "seashell".asInstanceOf["seashell"]
    
    inline def sienna: "sienna" = "sienna".asInstanceOf["sienna"]
    
    inline def silver: "silver" = "silver".asInstanceOf["silver"]
    
    inline def skyblue: "skyblue" = "skyblue".asInstanceOf["skyblue"]
    
    inline def slateblue: "slateblue" = "slateblue".asInstanceOf["slateblue"]
    
    inline def slategray: "slategray" = "slategray".asInstanceOf["slategray"]
    
    inline def slategrey: "slategrey" = "slategrey".asInstanceOf["slategrey"]
    
    inline def snow: "snow" = "snow".asInstanceOf["snow"]
    
    inline def springgreen: "springgreen" = "springgreen".asInstanceOf["springgreen"]
    
    inline def steelblue: "steelblue" = "steelblue".asInstanceOf["steelblue"]
    
    inline def tan: "tan" = "tan".asInstanceOf["tan"]
    
    inline def teal: "teal" = "teal".asInstanceOf["teal"]
    
    inline def thistle: "thistle" = "thistle".asInstanceOf["thistle"]
    
    inline def tomato: "tomato" = "tomato".asInstanceOf["tomato"]
    
    inline def transparent: "transparent" = "transparent".asInstanceOf["transparent"]
    
    inline def turquoise: "turquoise" = "turquoise".asInstanceOf["turquoise"]
    
    inline def violet: "violet" = "violet".asInstanceOf["violet"]
    
    inline def wheat: "wheat" = "wheat".asInstanceOf["wheat"]
    
    inline def white: "white" = "white".asInstanceOf["white"]
    
    inline def whitesmoke: "whitesmoke" = "whitesmoke".asInstanceOf["whitesmoke"]
    
    inline def yellow: "yellow" = "yellow".asInstanceOf["yellow"]
    
    inline def yellowgreen: "yellowgreen" = "yellowgreen".asInstanceOf["yellowgreen"]
  }
  type NamedColor = /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 149, starting with "aliceblue", "antiquewhite", "aqua" */ String
  
  object PageSize {
    
    inline def A3: "A3" = "A3".asInstanceOf["A3"]
    
    inline def A4: "A4" = "A4".asInstanceOf["A4"]
    
    inline def A5: "A5" = "A5".asInstanceOf["A5"]
    
    inline def B4: "B4" = "B4".asInstanceOf["B4"]
    
    inline def B5: "B5" = "B5".asInstanceOf["B5"]
    
    inline def `JIS-B4`: "JIS-B4" = "JIS-B4".asInstanceOf["JIS-B4"]
    
    inline def `JIS-B5`: "JIS-B5" = "JIS-B5".asInstanceOf["JIS-B5"]
    
    inline def ledger: "ledger" = "ledger".asInstanceOf["ledger"]
    
    inline def legal: "legal" = "legal".asInstanceOf["legal"]
    
    inline def letter: "letter" = "letter".asInstanceOf["letter"]
  }
  type PageSize = "A3" | "A4" | "A5" | "B4" | "B5" | "JIS-B4" | "JIS-B5" | "ledger" | "legal" | "letter"
  
  type Paint = Color | "child" | "context-fill" | "context-stroke" | "none" | String
  
  type Position[TLength] = TLength | "bottom" | "center" | "left" | "right" | "top" | String
  
  object Quote {
    
    inline def `close-quote`: "close-quote" = "close-quote".asInstanceOf["close-quote"]
    
    inline def `no-close-quote`: "no-close-quote" = "no-close-quote".asInstanceOf["no-close-quote"]
    
    inline def `no-open-quote`: "no-open-quote" = "no-open-quote".asInstanceOf["no-open-quote"]
    
    inline def `open-quote`: "open-quote" = "open-quote".asInstanceOf["open-quote"]
  }
  type Quote = "close-quote" | "no-close-quote" | "no-open-quote" | "open-quote"
  
  type RepeatStyle = "no-repeat" | "repeat" | "repeat-x" | "repeat-y" | "round" | "space" | String
  
  object SelfPosition {
    
    inline def center: "center" = "center".asInstanceOf["center"]
    
    inline def end: "end" = "end".asInstanceOf["end"]
    
    inline def `flex-end`: "flex-end" = "flex-end".asInstanceOf["flex-end"]
    
    inline def `flex-start`: "flex-start" = "flex-start".asInstanceOf["flex-start"]
    
    inline def `self-end`: "self-end" = "self-end".asInstanceOf["self-end"]
    
    inline def `self-start`: "self-start" = "self-start".asInstanceOf["self-start"]
    
    inline def start: "start" = "start".asInstanceOf["start"]
  }
  type SelfPosition = "center" | "end" | "flex-end" | "flex-start" | "self-end" | "self-start" | "start"
  
  type SingleAnimation[TTime] = EasingFunction | SingleAnimationDirection | SingleAnimationFillMode | TTime | "infinite" | "none" | "paused" | "running" | String | (Double & js.Object)
  
  object SingleAnimationDirection {
    
    inline def alternate: "alternate" = "alternate".asInstanceOf["alternate"]
    
    inline def `alternate-reverse`: "alternate-reverse" = "alternate-reverse".asInstanceOf["alternate-reverse"]
    
    inline def normal: "normal" = "normal".asInstanceOf["normal"]
    
    inline def reverse: "reverse" = "reverse".asInstanceOf["reverse"]
  }
  type SingleAnimationDirection = "alternate" | "alternate-reverse" | "normal" | "reverse"
  
  object SingleAnimationFillMode {
    
    inline def backwards: "backwards" = "backwards".asInstanceOf["backwards"]
    
    inline def both: "both" = "both".asInstanceOf["both"]
    
    inline def forwards: "forwards" = "forwards".asInstanceOf["forwards"]
    
    inline def none: "none" = "none".asInstanceOf["none"]
  }
  type SingleAnimationFillMode = "backwards" | "both" | "forwards" | "none"
  
  type SingleAnimationTimeline = "auto" | "none" | String
  
  type SingleTransition[TTime] = EasingFunction | TTime | "all" | "none" | String
  
  type StepTimingFunction = "step-end" | "step-start" | String
  
  type TrackBreadth[TLength] = TLength | "auto" | "max-content" | "min-content" | String
  
  type ViewportLength[TLength] = TLength | "auto" | String
  
  object VisualBox {
    
    inline def `border-box`: "border-box" = "border-box".asInstanceOf["border-box"]
    
    inline def `content-box`: "content-box" = "content-box".asInstanceOf["content-box"]
    
    inline def `padding-box`: "padding-box" = "padding-box".asInstanceOf["padding-box"]
  }
  type VisualBox = "border-box" | "content-box" | "padding-box"
}
