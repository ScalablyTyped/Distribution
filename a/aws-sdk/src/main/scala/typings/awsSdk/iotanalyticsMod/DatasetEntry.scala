package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetEntry extends StObject {
  
  /**
    * The presigned URI of the data set item.
    */
  var dataURI: js.UndefOr[PresignedURI] = js.undefined
  
  /**
    * The name of the data set item.
    */
  var entryName: js.UndefOr[EntryName] = js.undefined
}
object DatasetEntry {
  
  @scala.inline
  def apply(): DatasetEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetEntry]
  }
  
  @scala.inline
  implicit class DatasetEntryMutableBuilder[Self <: DatasetEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataURI(value: PresignedURI): Self = StObject.set(x, "dataURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataURIUndefined: Self = StObject.set(x, "dataURI", js.undefined)
    
    @scala.inline
    def setEntryName(value: EntryName): Self = StObject.set(x, "entryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryNameUndefined: Self = StObject.set(x, "entryName", js.undefined)
  }
}
