package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinKeyProperties extends StObject {
  
  /**
    * A value that indicates that a row in a table is uniquely identified by the columns in a join key. This is used by Amazon QuickSight to optimize query performance.
    */
  var UniqueKey: js.UndefOr[Boolean] = js.undefined
}
object JoinKeyProperties {
  
  inline def apply(): JoinKeyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinKeyProperties]
  }
  
  extension [Self <: JoinKeyProperties](x: Self) {
    
    inline def setUniqueKey(value: Boolean): Self = StObject.set(x, "UniqueKey", value.asInstanceOf[js.Any])
    
    inline def setUniqueKeyUndefined: Self = StObject.set(x, "UniqueKey", js.undefined)
  }
}
