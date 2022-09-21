package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupMetadata extends StObject {
  
  var remainingPages: Double
  
  var totalPages: Double
}
object BackupMetadata {
  
  inline def apply(remainingPages: Double, totalPages: Double): BackupMetadata = {
    val __obj = js.Dynamic.literal(remainingPages = remainingPages.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupMetadata]
  }
  
  extension [Self <: BackupMetadata](x: Self) {
    
    inline def setRemainingPages(value: Double): Self = StObject.set(x, "remainingPages", value.asInstanceOf[js.Any])
    
    inline def setTotalPages(value: Double): Self = StObject.set(x, "totalPages", value.asInstanceOf[js.Any])
  }
}
