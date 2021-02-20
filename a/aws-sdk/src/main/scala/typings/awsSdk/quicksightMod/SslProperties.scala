package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslProperties extends StObject {
  
  /**
    * A Boolean option to control whether SSL should be disabled.
    */
  var DisableSsl: js.UndefOr[Boolean] = js.native
}
object SslProperties {
  
  @scala.inline
  def apply(): SslProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslProperties]
  }
  
  @scala.inline
  implicit class SslPropertiesMutableBuilder[Self <: SslProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableSsl(value: Boolean): Self = StObject.set(x, "DisableSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSslUndefined: Self = StObject.set(x, "DisableSsl", js.undefined)
  }
}
