package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathStatement extends StObject {
  
  /**
    * The packet header statement.
    */
  var PacketHeaderStatement: js.UndefOr[typings.awsSdk.ec2Mod.PacketHeaderStatement] = js.undefined
  
  /**
    * The resource statement.
    */
  var ResourceStatement: js.UndefOr[typings.awsSdk.ec2Mod.ResourceStatement] = js.undefined
}
object PathStatement {
  
  inline def apply(): PathStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathStatement]
  }
  
  extension [Self <: PathStatement](x: Self) {
    
    inline def setPacketHeaderStatement(value: PacketHeaderStatement): Self = StObject.set(x, "PacketHeaderStatement", value.asInstanceOf[js.Any])
    
    inline def setPacketHeaderStatementUndefined: Self = StObject.set(x, "PacketHeaderStatement", js.undefined)
    
    inline def setResourceStatement(value: ResourceStatement): Self = StObject.set(x, "ResourceStatement", value.asInstanceOf[js.Any])
    
    inline def setResourceStatementUndefined: Self = StObject.set(x, "ResourceStatement", js.undefined)
  }
}
