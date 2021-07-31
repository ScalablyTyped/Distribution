package typings.awsSdk.glacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSerialization extends StObject {
  
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var csv: js.UndefOr[CSVInput] = js.undefined
}
object InputSerialization {
  
  @scala.inline
  def apply(): InputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSerialization]
  }
  
  @scala.inline
  implicit class InputSerializationMutableBuilder[Self <: InputSerialization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: CSVInput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
