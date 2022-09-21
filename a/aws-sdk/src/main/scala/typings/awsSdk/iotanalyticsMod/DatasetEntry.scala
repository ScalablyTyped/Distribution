package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetEntry extends StObject {
  
  /**
    * The presigned URI of the dataset item.
    */
  var dataURI: js.UndefOr[PresignedURI] = js.undefined
  
  /**
    * The name of the dataset item.
    */
  var entryName: js.UndefOr[EntryName] = js.undefined
}
object DatasetEntry {
  
  inline def apply(): DatasetEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetEntry]
  }
  
  extension [Self <: DatasetEntry](x: Self) {
    
    inline def setDataURI(value: PresignedURI): Self = StObject.set(x, "dataURI", value.asInstanceOf[js.Any])
    
    inline def setDataURIUndefined: Self = StObject.set(x, "dataURI", js.undefined)
    
    inline def setEntryName(value: EntryName): Self = StObject.set(x, "entryName", value.asInstanceOf[js.Any])
    
    inline def setEntryNameUndefined: Self = StObject.set(x, "entryName", js.undefined)
  }
}
