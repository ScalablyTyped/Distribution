package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logs extends StObject {
  
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged. Does not apply to RabbitMQ brokers.
    */
  var Audit: js.UndefOr[boolean] = js.native
  
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.native
}
object Logs {
  
  @scala.inline
  def apply(): Logs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Logs]
  }
  
  @scala.inline
  implicit class LogsMutableBuilder[Self <: Logs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudit(value: boolean): Self = StObject.set(x, "Audit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditUndefined: Self = StObject.set(x, "Audit", js.undefined)
    
    @scala.inline
    def setGeneral(value: boolean): Self = StObject.set(x, "General", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralUndefined: Self = StObject.set(x, "General", js.undefined)
  }
}
