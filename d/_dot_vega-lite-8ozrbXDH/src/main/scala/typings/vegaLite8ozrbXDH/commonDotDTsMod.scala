package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channelDTsMod.FacetChannel
import typings.vegaLite8ozrbXDH.componentDotDTsMod.HeaderChannel
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.headerDTsMod.Header
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.format
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.formatType
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelAlign
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelAnchor
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelAngle
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelBaseline
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelColor
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelExpr
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelFont
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelFontSize
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelFontStyle
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelFontWeight
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelLimit
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelLineHeight
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelOrient
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labelPadding
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.labels
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.number
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.orient
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.time
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.title
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleAlign
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleAnchor
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleAngle
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleBaseline
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleColor
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleFont
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleFontSize
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleFontStyle
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleFontWeight
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleLimit
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleLineHeight
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titleOrient
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.titlePadding
import typings.vegaTypings.colorMod.Color
import typings.vegaTypings.encodeMod.Align
import typings.vegaTypings.encodeMod.FontStyle
import typings.vegaTypings.encodeMod.FontWeight
import typings.vegaTypings.encodeMod.Orient
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.encodeMod.TextBaseline
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/header/common.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHeaderChannel(channel: FacetChannel, orient: Orient): HeaderChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderChannel")(channel.asInstanceOf[js.Any], orient.asInstanceOf[js.Any])).asInstanceOf[HeaderChannel]
  
  inline def getHeaderProperties(
    properties: js.Array[
      /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/header.d.ts.Header<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType | title
    ],
    header: Header[SignalRef],
    config: Config[SignalRef],
    channel: FacetChannel
  ): Header[SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperties")(properties.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Header[SignalRef]]
  
  inline def getHeaderProperty_format(prop: format, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Dict[Any]]]
  
  inline def getHeaderProperty_formatType(prop: formatType, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[number | time | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[number | time | String]]
  
  inline def getHeaderProperty_labelAlign(prop: labelAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Align | SignalRef]]
  
  inline def getHeaderProperty_labelAnchor(prop: labelAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TitleAnchor]]
  
  inline def getHeaderProperty_labelAngle(prop: labelAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getHeaderProperty_labelBaseline(prop: labelBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextBaseline | SignalRef]]
  
  inline def getHeaderProperty_labelColor(prop: labelColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Color | SignalRef]]
  
  inline def getHeaderProperty_labelExpr(prop: labelExpr, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getHeaderProperty_labelFont(prop: labelFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | SignalRef]]
  
  inline def getHeaderProperty_labelFontSize(prop: labelFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labelFontStyle(prop: labelFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontStyle | SignalRef]]
  
  inline def getHeaderProperty_labelFontWeight(prop: labelFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontWeight | SignalRef]]
  
  inline def getHeaderProperty_labelLimit(prop: labelLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labelLineHeight(prop: labelLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labelOrient(prop: labelOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Orient]]
  
  inline def getHeaderProperty_labelPadding(prop: labelPadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labels(prop: labels, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getHeaderProperty_orient(prop: orient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Orient]]
  
  inline def getHeaderProperty_title(prop: title, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Text | Null | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Text | Null | SignalRef]]
  
  inline def getHeaderProperty_titleAlign(prop: titleAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Align | SignalRef]]
  
  inline def getHeaderProperty_titleAnchor(prop: titleAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TitleAnchor]]
  
  inline def getHeaderProperty_titleAngle(prop: titleAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getHeaderProperty_titleBaseline(prop: titleBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextBaseline | SignalRef]]
  
  inline def getHeaderProperty_titleColor(prop: titleColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Color | SignalRef]]
  
  inline def getHeaderProperty_titleFont(prop: titleFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | SignalRef]]
  
  inline def getHeaderProperty_titleFontSize(prop: titleFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_titleFontStyle(prop: titleFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontStyle | SignalRef]]
  
  inline def getHeaderProperty_titleFontWeight(prop: titleFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontWeight | SignalRef]]
  
  inline def getHeaderProperty_titleLimit(prop: titleLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_titleLineHeight(prop: titleLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_titleOrient(prop: titleOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Orient]]
  
  inline def getHeaderProperty_titlePadding(prop: titlePadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
}
