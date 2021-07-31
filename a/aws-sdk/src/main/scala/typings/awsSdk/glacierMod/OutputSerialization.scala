package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSerialization extends StObject {
  
  /**
    * Describes the serialization of CSV-encoded query results.
    */
  var csv: js.UndefOr[CSVOutput] = js.undefined
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
    def setCsv(value: CSVOutput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
