package typings.vegaLite8ozrbXDH.dataDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite8ozrbXDH.dataDTsMod.UrlData
  - typings.vegaLite8ozrbXDH.dataDTsMod.InlineData
  - typings.vegaLite8ozrbXDH.dataDTsMod.NamedData
*/
trait DataSource
  extends StObject
     with Data
object DataSource {
  
  inline def InlineData(values: InlineDataset): typings.vegaLite8ozrbXDH.dataDTsMod.InlineData = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.dataDTsMod.InlineData]
  }
  
  inline def NamedData(name: String): typings.vegaLite8ozrbXDH.dataDTsMod.NamedData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.dataDTsMod.NamedData]
  }
  
  inline def UrlData(url: String): typings.vegaLite8ozrbXDH.dataDTsMod.UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite8ozrbXDH.dataDTsMod.UrlData]
  }
}
