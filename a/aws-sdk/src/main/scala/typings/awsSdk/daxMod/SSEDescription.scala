package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSEDescription extends StObject {
  
  /**
    * The current state of server-side encryption:    ENABLING - Server-side encryption is being enabled.    ENABLED - Server-side encryption is enabled.    DISABLING - Server-side encryption is being disabled.    DISABLED - Server-side encryption is disabled.  
    */
  var Status: js.UndefOr[SSEStatus] = js.undefined
}
object SSEDescription {
  
  @scala.inline
  def apply(): SSEDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSEDescription]
  }
  
  @scala.inline
  implicit class SSEDescriptionMutableBuilder[Self <: SSEDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: SSEStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
