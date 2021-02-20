package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveFromGlobalClusterMessage extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster. 
    */
  var DbClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    *  The cluster identifier to detach from the Aurora global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
}
object RemoveFromGlobalClusterMessage {
  
  @scala.inline
  def apply(): RemoveFromGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
  }
  
  @scala.inline
  implicit class RemoveFromGlobalClusterMessageMutableBuilder[Self <: RemoveFromGlobalClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbClusterIdentifier(value: String): Self = StObject.set(x, "DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterIdentifierUndefined: Self = StObject.set(x, "DbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setGlobalClusterIdentifier(value: String): Self = StObject.set(x, "GlobalClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalClusterIdentifierUndefined: Self = StObject.set(x, "GlobalClusterIdentifier", js.undefined)
  }
}
