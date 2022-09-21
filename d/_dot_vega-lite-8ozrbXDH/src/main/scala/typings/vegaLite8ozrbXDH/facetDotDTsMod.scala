package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.ExtendedChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldRefOption
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.EncodingFacetMapping
import typings.vegaLite8ozrbXDH.facetDDotTsMod.FacetFieldDef
import typings.vegaLite8ozrbXDH.facetDDotTsMod.NormalizedFacetSpec
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.modelDTsMod.ModelWithField
import typings.vegaLite8ozrbXDH.sortDTsMod.EncodingSortField
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facetDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/facet.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/facet.d.ts", "FacetModel")
  @js.native
  open class FacetModel protected () extends ModelWithField {
    def this(spec: NormalizedFacetSpec, parent: Model, parentGivenName: String, config: Config[SignalRef]) = this()
    
    /* private */ var assembleFacet: Any = js.native
    
    /* private */ var assembleLabelTitle: Any = js.native
    
    def channelHasField(channel: ExtendedChannel): Boolean = js.native
    
    val child: Model = js.native
    
    /* private */ var columnDistinctSignal: Any = js.native
    
    val facet: EncodingFacetMapping[String, SignalRef] = js.native
    
    /* private */ var facetSortFields: Any = js.native
    
    /* private */ var facetSortOrder: Any = js.native
    
    def fieldDef(channel: ExtendedChannel): TypedFieldDef[String, Any, Boolean | BinParams | binned | Null] = js.native
    
    /**
      * Aggregate cardinality for calculating size
      */
    /* private */ var getCardinalityAggregateForChild: Any = js.native
    
    /* private */ var getHeaderLayoutMixins: Any = js.native
    
    /* private */ var initFacet: Any = js.native
    
    /* private */ var initFacetFieldDef: Any = js.native
  }
  
  inline def facetSortFieldName(fieldDef: FacetFieldDef[String, ExprRef | SignalRef], sort: EncodingSortField[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("facetSortFieldName")(fieldDef.asInstanceOf[js.Any], sort.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def facetSortFieldName(
    fieldDef: FacetFieldDef[String, ExprRef | SignalRef],
    sort: EncodingSortField[String],
    opt: FieldRefOption
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("facetSortFieldName")(fieldDef.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
}
