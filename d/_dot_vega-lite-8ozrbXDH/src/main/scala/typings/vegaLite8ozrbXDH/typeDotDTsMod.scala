package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.geojson
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "GEOJSON")
  @js.native
  val GEOJSON: geojson = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "NOMINAL")
  @js.native
  val NOMINAL: nominal = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "ORDINAL")
  @js.native
  val ORDINAL: ordinal = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "QUANTITATIVE")
  @js.native
  val QUANTITATIVE: quantitative = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "TEMPORAL")
  @js.native
  val TEMPORAL: temporal = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "TYPES")
  @js.native
  val TYPES: js.Array[ordinal | geojson | quantitative | temporal | nominal] = js.native
  
  /* keyof .vega-lite-8ozrbXDH.anon.Geojson */ /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.geojson
  */
  trait Type extends StObject
  object Type {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "Type.geojson")
    @js.native
    val geojson: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.geojson = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "Type.nominal")
    @js.native
    val nominal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "Type.ordinal")
    @js.native
    val ordinal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "Type.quantitative")
    @js.native
    val quantitative: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/type.d.ts", "Type.temporal")
    @js.native
    val temporal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal = js.native
  }
  
  inline def getFullName(`type`: String): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullName")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]
  inline def getFullName(`type`: Type): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullName")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]
  
  inline def isContinuous(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinuous")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDiscrete(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isType(t: Any): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/type.d.ts.Type */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(t.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/type.d.ts.Type */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal
  */
  trait StandardType extends StObject
  object StandardType {
    
    inline def nominal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal = "nominal".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal]
    
    inline def ordinal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal = "ordinal".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal]
    
    inline def quantitative: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative = "quantitative".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative]
    
    inline def temporal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal = "temporal".asInstanceOf[typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal]
  }
}
