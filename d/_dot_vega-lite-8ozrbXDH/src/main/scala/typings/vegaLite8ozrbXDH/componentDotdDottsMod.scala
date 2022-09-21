package typings.vegaLite8ozrbXDH

import typings.std.Partial
import typings.std.Record
import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.legendDTsMod.LegendInternal
import typings.vegaLite8ozrbXDH.splitDTsMod.Split
import typings.vegaTypings.legendMod.Legend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentDotdDottsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/component.d.ts", "LEGEND_COMPONENT_PROPERTIES")
  @js.native
  val LEGEND_COMPONENT_PROPERTIES: js.Array[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ Any
  ] = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/component.d.ts", "LegendComponent")
  @js.native
  open class LegendComponent () extends Split[LegendComponentProps] {
    def this(explicit: Partial[LegendComponentProps]) = this()
    def this(explicit: Unit, `implicit`: Partial[LegendComponentProps]) = this()
    def this(explicit: Partial[LegendComponentProps], `implicit`: Partial[LegendComponentProps]) = this()
  }
  
  type LegendComponentIndex = Partial[Record[NonPositionScaleChannel, LegendComponent]]
  
  trait LegendComponentProps
    extends StObject
       with Legend {
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var labelExpr: js.UndefOr[String] = js.undefined
    
    var selections: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LegendComponentProps {
    
    inline def apply(): LegendComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendComponentProps]
    }
    
    extension [Self <: LegendComponentProps](x: Self) {
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setLabelExpr(value: String): Self = StObject.set(x, "labelExpr", value.asInstanceOf[js.Any])
      
      inline def setLabelExprUndefined: Self = StObject.set(x, "labelExpr", js.undefined)
      
      inline def setSelections(value: js.Array[String]): Self = StObject.set(x, "selections", value.asInstanceOf[js.Any])
      
      inline def setSelectionsUndefined: Self = StObject.set(x, "selections", js.undefined)
      
      inline def setSelectionsVarargs(value: String*): Self = StObject.set(x, "selections", js.Array(value*))
    }
  }
  
  type LegendInternalIndex = Partial[Record[NonPositionScaleChannel, LegendInternal]]
}
