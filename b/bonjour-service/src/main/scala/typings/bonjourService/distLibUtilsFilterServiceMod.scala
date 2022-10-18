package typings.bonjourService

import typings.bonjourService.distLibKeyValueMod.KeyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsFilterServiceMod {
  
  @JSImport("bonjour-service/dist/lib/utils/filter-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(service: typings.bonjourService.distLibServiceMod.default): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(service: typings.bonjourService.distLibServiceMod.default, txtQuery: KeyValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(service.asInstanceOf[js.Any], txtQuery.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
