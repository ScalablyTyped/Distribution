package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteGlobalClusterMessage extends StObject {
  
  /**
    *  The cluster identifier of the global database cluster being deleted. 
    */
  var GlobalClusterIdentifier: String = js.native
}
object DeleteGlobalClusterMessage {
  
  @scala.inline
  def apply(GlobalClusterIdentifier: String): DeleteGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalClusterMessage]
  }
  
  @scala.inline
  implicit class DeleteGlobalClusterMessageMutableBuilder[Self <: DeleteGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
  }
}
