package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessScopePath extends StObject {
  
  /**
    * The destination.
    */
  var Destination: js.UndefOr[PathStatement] = js.undefined
  
  /**
    * The source.
    */
  var Source: js.UndefOr[PathStatement] = js.undefined
  
  /**
    * The through resources.
    */
  var ThroughResources: js.UndefOr[ThroughResourcesStatementList] = js.undefined
}
object AccessScopePath {
  
  inline def apply(): AccessScopePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessScopePath]
  }
  
  extension [Self <: AccessScopePath](x: Self) {
    
    inline def setDestination(value: PathStatement): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setSource(value: PathStatement): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setThroughResources(value: ThroughResourcesStatementList): Self = StObject.set(x, "ThroughResources", value.asInstanceOf[js.Any])
    
    inline def setThroughResourcesUndefined: Self = StObject.set(x, "ThroughResources", js.undefined)
    
    inline def setThroughResourcesVarargs(value: ThroughResourcesStatement*): Self = StObject.set(x, "ThroughResources", js.Array(value*))
  }
}
