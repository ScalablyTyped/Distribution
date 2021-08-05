package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  var Delete: Boolean
  
  var Read: Boolean
  
  var RetentionPolicy: Days
  
  var Version: Double
  
  var Write: Boolean
}
object Delete {
  
  inline def apply(Delete: Boolean, Read: Boolean, RetentionPolicy: Days, Version: Double, Write: Boolean): Delete = {
    val __obj = js.Dynamic.literal(Delete = Delete.asInstanceOf[js.Any], Read = Read.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], Write = Write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  extension [Self <: Delete](x: Self) {
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "Read", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicy(value: Days): Self = StObject.set(x, "RetentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "Write", value.asInstanceOf[js.Any])
  }
}
