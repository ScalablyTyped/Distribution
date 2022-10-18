package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityType extends StObject {
  
  /**
    * The name of this activity.  The combination of activity type name and version must be unique within a domain. 
    */
  var name: Name
  
  /**
    * The version of this activity.  The combination of activity type name and version must be unique with in a domain. 
    */
  var version: Version
}
object ActivityType {
  
  inline def apply(name: Name, version: Version): ActivityType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityType]
  }
  
  extension [Self <: ActivityType](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
