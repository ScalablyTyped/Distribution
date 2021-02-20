package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropIDPlugin extends StObject {
  
  val CAPICOM_PROPID_ENHKEY_USAGE: `9` = js.native
}
object PropIDPlugin {
  
  @scala.inline
  def apply(CAPICOM_PROPID_ENHKEY_USAGE: `9`): PropIDPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_PROPID_ENHKEY_USAGE = CAPICOM_PROPID_ENHKEY_USAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropIDPlugin]
  }
  
  @scala.inline
  implicit class PropIDPluginMutableBuilder[Self <: PropIDPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_PROPID_ENHKEY_USAGE(value: `9`): Self = StObject.set(x, "CAPICOM_PROPID_ENHKEY_USAGE", value.asInstanceOf[js.Any])
  }
}
