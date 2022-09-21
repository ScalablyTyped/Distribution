package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.Reason
import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
import typings.vegaLite8ozrbXDH.splitDTsMod.Explicit
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHBooleans.`true`
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgDomain
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgNonUnionDomain
import typings.vegaTypings.scaleMod.ScaleData
import typings.vegaTypings.scaleMod.SortField
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/domain.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleDomain(model: Model, channel: ScaleChannel): SignalRef | ScaleData | (js.Array[String | Double | Boolean | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleDomain")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[SignalRef | ScaleData | (js.Array[String | Double | Boolean | SignalRef])]
  
  inline def canUseUnaggregatedDomain_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null], scaleType: ScaleType): Reason = (^.asInstanceOf[js.Dynamic].applyDynamic("canUseUnaggregatedDomain")(fieldDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[Reason]
  
  inline def domainSort(model: UnitModel, channel: ScaleChannel, scaleType: ScaleType): js.UndefOr[`true` | SortField] = (^.asInstanceOf[js.Dynamic].applyDynamic("domainSort")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[`true` | SortField]]
  
  inline def getFieldFromDomain(domain: VgDomain): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldFromDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def mergeDomains(domains: js.Array[VgNonUnionDomain]): VgDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeDomains")(domains.asInstanceOf[js.Any]).asInstanceOf[VgDomain]
  
  inline def parseDomainForChannel(model: UnitModel, channel: ScaleChannel): Explicit[js.Array[VgNonUnionDomain]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDomainForChannel")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Explicit[js.Array[VgNonUnionDomain]]]
  
  inline def parseScaleDomain(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleDomain")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
