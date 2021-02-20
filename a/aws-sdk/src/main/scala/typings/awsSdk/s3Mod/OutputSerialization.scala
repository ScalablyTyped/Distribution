package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputSerialization extends StObject {
  
  /**
    * Describes the serialization of CSV-encoded Select results.
    */
  var CSV: js.UndefOr[CSVOutput] = js.native
  
  /**
    * Specifies JSON as request's output serialization format.
    */
  var JSON: js.UndefOr[JSONOutput] = js.native
}
object OutputSerialization {
  
  @scala.inline
  def apply(): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSerialization]
  }
  
  @scala.inline
  implicit class OutputSerializationMutableBuilder[Self <: OutputSerialization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCSV(value: CSVOutput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
    
    @scala.inline
    def setJSON(value: JSONOutput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
  }
}
