package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrestoParameters extends StObject {
  
  /**
    * Catalog.
    */
  var Catalog: typings.awsSdk.quicksightMod.Catalog = js.native
  
  /**
    * Host.
    */
  var Host: typings.awsSdk.quicksightMod.Host = js.native
  
  /**
    * Port.
    */
  var Port: typings.awsSdk.quicksightMod.Port = js.native
}
object PrestoParameters {
  
  @scala.inline
  def apply(Catalog: Catalog, Host: Host, Port: Port): PrestoParameters = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrestoParameters]
  }
  
  @scala.inline
  implicit class PrestoParametersMutableBuilder[Self <: PrestoParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Host): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
  }
}
