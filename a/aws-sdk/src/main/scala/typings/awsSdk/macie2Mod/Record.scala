package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record extends StObject {
  
  /**
    * The path, as a JSONPath expression, to the field in the record that contains the data. If the name of an element exceeds 20 characters, Amazon Macie truncates the name by removing characters from the beginning of the name. If the resulting full path exceeds 250 characters, Macie also truncates the path, starting with the first element in the path, until the path contains 250 or fewer characters.
    */
  var jsonPath: js.UndefOr[string] = js.native
  
  /**
    * The record index, starting from 0, for the record that contains the data.
    */
  var recordIndex: js.UndefOr[long] = js.native
}
object Record {
  
  @scala.inline
  def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonPath(value: string): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonPathUndefined: Self = StObject.set(x, "jsonPath", js.undefined)
    
    @scala.inline
    def setRecordIndex(value: long): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
  }
}
