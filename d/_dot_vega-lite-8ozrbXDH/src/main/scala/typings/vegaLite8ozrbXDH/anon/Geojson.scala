package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.geojson
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geojson extends StObject {
  
  val geojson: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.geojson
  
  val nominal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nominal
  
  val ordinal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.ordinal
  
  val quantitative: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantitative
  
  val temporal: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.temporal
}
object Geojson {
  
  inline def apply(): Geojson = {
    val __obj = js.Dynamic.literal(geojson = "geojson", nominal = "nominal", ordinal = "ordinal", quantitative = "quantitative", temporal = "temporal")
    __obj.asInstanceOf[Geojson]
  }
  
  extension [Self <: Geojson](x: Self) {
    
    inline def setGeojson(value: geojson): Self = StObject.set(x, "geojson", value.asInstanceOf[js.Any])
    
    inline def setNominal(value: nominal): Self = StObject.set(x, "nominal", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: ordinal): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setQuantitative(value: quantitative): Self = StObject.set(x, "quantitative", value.asInstanceOf[js.Any])
    
    inline def setTemporal(value: temporal): Self = StObject.set(x, "temporal", value.asInstanceOf[js.Any])
  }
}
