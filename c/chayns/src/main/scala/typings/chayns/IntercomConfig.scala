package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic Functions
  * chayns.intercom
  * interfaces
  */
@js.native
trait IntercomConfig extends StObject {
  
  var text: String = js.native
}
object IntercomConfig {
  
  @scala.inline
  def apply(text: String): IntercomConfig = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntercomConfig]
  }
  
  @scala.inline
  implicit class IntercomConfigMutableBuilder[Self <: IntercomConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
