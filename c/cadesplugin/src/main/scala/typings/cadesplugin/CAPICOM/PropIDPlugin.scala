package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropIDPlugin extends StObject {
  
  val CAPICOM_PROPID_ENHKEY_USAGE: `9`
}
object PropIDPlugin {
  
  @scala.inline
  def apply(): PropIDPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_PROPID_ENHKEY_USAGE = 9)
    __obj.asInstanceOf[PropIDPlugin]
  }
  
  @scala.inline
  implicit class PropIDPluginMutableBuilder[Self <: PropIDPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_PROPID_ENHKEY_USAGE(value: `9`): Self = StObject.set(x, "CAPICOM_PROPID_ENHKEY_USAGE", value.asInstanceOf[js.Any])
  }
}
