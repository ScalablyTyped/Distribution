package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.AlignString
import typings.vegaLite8ozrbXDH.anon.AlignUndefined
import typings.vegaLite8ozrbXDH.anon.Axes
import typings.vegaLite8ozrbXDH.anon.BaselineUndefined
import typings.vegaLite8ozrbXDH.anon.Dx
import typings.vegaLite8ozrbXDH.anon.Dy
import typings.vegaLite8ozrbXDH.anon.Encode
import typings.vegaLite8ozrbXDH.anon.Font
import typings.vegaLite8ozrbXDH.anon.FontSize
import typings.vegaLite8ozrbXDH.anon.FontStyle
import typings.vegaLite8ozrbXDH.anon.Name
import typings.vegaLite8ozrbXDH.anon.PartialRecordkeyofCoreHea
import typings.vegaLite8ozrbXDH.anon.PartialVgTitle
import typings.vegaLite8ozrbXDH.anon.`1`
import typings.vegaLite8ozrbXDH.anon.`2`
import typings.vegaLite8ozrbXDH.channelDTsMod.FacetChannel
import typings.vegaLite8ozrbXDH.componentDotDTsMod.HeaderChannel
import typings.vegaLite8ozrbXDH.componentDotDTsMod.HeaderComponent
import typings.vegaLite8ozrbXDH.componentDotDTsMod.HeaderType
import typings.vegaLite8ozrbXDH.componentDotDTsMod.LayoutHeaderComponent
import typings.vegaLite8ozrbXDH.componentDotDTsMod.LayoutHeaderComponentIndex
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetFieldDef
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
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
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.orient
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
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.RowCol
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgMarkGroup
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.titleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assembleDDotTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/header/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleHeaderGroup(
    model: Model,
    channel: HeaderChannel,
    headerType: HeaderType,
    layoutHeader: LayoutHeaderComponent,
    headerComponent: HeaderComponent
  ): Axes = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleHeaderGroup")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], headerType.asInstanceOf[js.Any], layoutHeader.asInstanceOf[js.Any], headerComponent.asInstanceOf[js.Any])).asInstanceOf[Axes]
  
  inline def assembleHeaderGroups(model: Model, channel: HeaderChannel): js.Array[VgMarkGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleHeaderGroups")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgMarkGroup]]
  
  inline def assembleHeaderProperties(
    config: Config[SignalRef],
    facetFieldDef: FacetFieldDef[String, SignalRef],
    channel: FacetChannel,
    properties: js.Array[
      /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/header.d.ts.CoreHeader<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType
    ],
    propertiesMap: PartialRecordkeyofCoreHea
  ): PartialVgTitle = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleHeaderProperties")(config.asInstanceOf[js.Any], facetFieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], propertiesMap.asInstanceOf[js.Any])).asInstanceOf[PartialVgTitle]
  
  inline def assembleLabelTitle(facetFieldDef: FacetFieldDef[String, SignalRef], channel: FacetChannel, config: Config[SignalRef]): Dx | Dy | Encode | Font | FontSize | FontStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLabelTitle")(facetFieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Dx | Dy | Encode | Font | FontSize | FontStyle]
  
  inline def assembleLayoutTitleBand(headerComponentIndex: LayoutHeaderComponentIndex, config: Config[SignalRef]): RowCol[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLayoutTitleBand")(headerComponentIndex.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[RowCol[Double]]
  
  inline def assembleTitleGroup(model: Model, channel: FacetChannel): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleTitleGroup")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Name]
  
  inline def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double): AlignString | `1` | AlignUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderGuideAlign")(headerChannel.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[AlignString | `1` | AlignUndefined]
  inline def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double, anchor: TitleAnchor): AlignString | `1` | AlignUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderGuideAlign")(headerChannel.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[AlignString | `1` | AlignUndefined]
  
  inline def defaultHeaderGuideBaseline(angle: Double, channel: FacetChannel): `2` | BaselineUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderGuideBaseline")(angle.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[`2` | BaselineUndefined]
  
  inline def getLayoutTitleBand(titleAnchor: TitleAnchor, headerChannel: HeaderChannel): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutTitleBand")(titleAnchor.asInstanceOf[js.Any], headerChannel.asInstanceOf[js.Any])).asInstanceOf[Any]
}
