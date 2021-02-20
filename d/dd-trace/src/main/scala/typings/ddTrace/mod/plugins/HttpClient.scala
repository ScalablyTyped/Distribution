package typings.ddTrace.mod.plugins

import typings.ddTrace.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@js.native
trait HttpClient extends Http_ {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[`0`] = js.native
  
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.native
}
object HttpClient {
  
  @scala.inline
  def apply(): HttpClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClient]
  }
  
  @scala.inline
  implicit class HttpClientMutableBuilder[Self <: HttpClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: `0`): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setSplitByDomain(value: Boolean): Self = StObject.set(x, "splitByDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplitByDomainUndefined: Self = StObject.set(x, "splitByDomain", js.undefined)
  }
}
