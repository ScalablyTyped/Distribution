package typings.vegaLite8ozrbXDH

import org.scalablytyped.runtime.StringDictionary
import typings.vegaLite8ozrbXDH.anon.AriaRoleDescription
import typings.vegaLite8ozrbXDH.anon.Clip
import typings.vegaLite8ozrbXDH.anon.CornerRadius
import typings.vegaLite8ozrbXDH.anon.CornerRadiusBottomLeft
import typings.vegaLite8ozrbXDH.anon.CornerRadiusBottomRight
import typings.vegaLite8ozrbXDH.anon.CornerRadiusTopLeft
import typings.vegaLite8ozrbXDH.anon.CornerRadiusTopRight
import typings.vegaLite8ozrbXDH.anon.Cursor
import typings.vegaLite8ozrbXDH.anon.DefaultPos
import typings.vegaLite8ozrbXDH.anon.DefaultPos2
import typings.vegaLite8ozrbXDH.anon.DefaultPosDefaultPos2
import typings.vegaLite8ozrbXDH.anon.DefaultRef
import typings.vegaLite8ozrbXDH.anon.Filled
import typings.vegaLite8ozrbXDH.anon.PartialRecordVgEncodeChan
import typings.vegaLite8ozrbXDH.anon.ReactiveGeom
import typings.vegaLite8ozrbXDH.anon.Tooltip
import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ChannelDef
import typings.vegaLite8ozrbXDH.guideDotDTsMod.GuideEncodingConditionalValueDef
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.description
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.href
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ignore
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.include
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.radius
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.theta
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.url
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.x
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.y
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgEncodeEntry
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/base.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseEncodeEntry(model: UnitModel, ignore: Ignore): AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor = (^.asInstanceOf[js.Dynamic].applyDynamic("baseEncodeEntry")(model.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor]
  
  inline def color(model: UnitModel): VgEncodeEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any]).asInstanceOf[VgEncodeEntry]
  inline def color(model: UnitModel, opt: Filled): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("color")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def nonPosition(channel: NonPositionScaleChannel, model: UnitModel): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  inline def nonPosition(channel: NonPositionScaleChannel, model: UnitModel, opt: DefaultRef): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("nonPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def pointOrRangePosition(channel: x | y, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointOrRangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2Range.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def pointPosition(channel: x | y | theta | radius, model: UnitModel, hasDefaultPosVgChannel: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pointPosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosVgChannel.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[VgValueRef | js.Array[VgValueRef]]]
  
  inline def rangePosition(channel: x | y | theta | radius, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rangePosition")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any], hasDefaultPosDefaultPos2.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def rectPosition(model: UnitModel, channel: x | y | theta | radius): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("rectPosition")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def text(model: UnitModel): PartialRecordVgEncodeChan = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan]
  inline def text(
    model: UnitModel,
    channel: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.text | href | url | description
  ): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  inline def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  inline def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  
  inline def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapCondition")(model.asInstanceOf[js.Any], channelDef.asInstanceOf[js.Any], vgChannel.asInstanceOf[js.Any], refFn.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  /* Inlined std.Record<'color' | 'size' | 'orient' | 'align' | 'baseline' | 'theta', 'ignore' | 'include'> */
  trait Ignore extends StObject {
    
    var align: ignore | include
    
    var baseline: ignore | include
    
    var color: ignore | include
    
    var orient: ignore | include
    
    var size: ignore | include
    
    var theta: ignore | include
  }
  object Ignore {
    
    inline def apply(
      align: ignore | include,
      baseline: ignore | include,
      color: ignore | include,
      orient: ignore | include,
      size: ignore | include,
      theta: ignore | include
    ): Ignore = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ignore]
    }
    
    extension [Self <: Ignore](x: Self) {
      
      inline def setAlign(value: ignore | include): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setBaseline(value: ignore | include): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      inline def setColor(value: ignore | include): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setOrient(value: ignore | include): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setSize(value: ignore | include): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTheta(value: ignore | include): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    }
  }
}
