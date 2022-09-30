package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropIDPlugin extends StObject {
  
  val CAPICOM_PROPID_ENHKEY_USAGE: `9`
}
object PropIDPlugin {
  
  inline def apply(): PropIDPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_PROPID_ENHKEY_USAGE = 9)
    __obj.asInstanceOf[PropIDPlugin]
  }
  
  extension [Self <: PropIDPlugin](x: Self) {
    
    inline def setCAPICOM_PROPID_ENHKEY_USAGE(value: `9`): Self = StObject.set(x, "CAPICOM_PROPID_ENHKEY_USAGE", value.asInstanceOf[js.Any])
  }
}
