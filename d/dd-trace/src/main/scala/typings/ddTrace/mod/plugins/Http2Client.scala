package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait Http2Client
  extends StObject
     with Http_ {
  
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.undefined
}
object Http2Client {
  
  @scala.inline
  def apply(): Http2Client = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Http2Client]
  }
  
  @scala.inline
  implicit class Http2ClientMutableBuilder[Self <: Http2Client] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSplitByDomain(value: Boolean): Self = StObject.set(x, "splitByDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitByDomainUndefined: Self = StObject.set(x, "splitByDomain", js.undefined)
  }
}
