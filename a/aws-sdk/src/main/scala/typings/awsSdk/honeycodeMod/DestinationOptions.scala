package typings.awsSdk.honeycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationOptions extends StObject {
  
  /**
    * A map of the column id to the import properties for each column.
    */
  var columnMap: js.UndefOr[ImportColumnMap] = js.undefined
}
object DestinationOptions {
  
  inline def apply(): DestinationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationOptions]
  }
  
  extension [Self <: DestinationOptions](x: Self) {
    
    inline def setColumnMap(value: ImportColumnMap): Self = StObject.set(x, "columnMap", value.asInstanceOf[js.Any])
    
    inline def setColumnMapUndefined: Self = StObject.set(x, "columnMap", js.undefined)
  }
}
