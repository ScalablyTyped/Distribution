package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowType extends StObject {
  
  /**
    *  The name of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
    */
  var name: Name
  
  /**
    *  The version of the workflow type.  The combination of workflow type name and version must be unique with in a domain. 
    */
  var version: Version
}
object WorkflowType {
  
  inline def apply(name: Name, version: Version): WorkflowType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowType]
  }
  
  extension [Self <: WorkflowType](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
