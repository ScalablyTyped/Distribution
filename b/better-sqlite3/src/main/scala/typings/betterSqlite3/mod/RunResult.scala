package typings.betterSqlite3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunResult extends StObject {
  
  var changes: Double
  
  var lastInsertRowid: Double | js.BigInt
}
object RunResult {
  
  inline def apply(changes: Double, lastInsertRowid: Double | js.BigInt): RunResult = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], lastInsertRowid = lastInsertRowid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  
  extension [Self <: RunResult](x: Self) {
    
    inline def setChanges(value: Double): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setLastInsertRowid(value: Double | js.BigInt): Self = StObject.set(x, "lastInsertRowid", value.asInstanceOf[js.Any])
  }
}
