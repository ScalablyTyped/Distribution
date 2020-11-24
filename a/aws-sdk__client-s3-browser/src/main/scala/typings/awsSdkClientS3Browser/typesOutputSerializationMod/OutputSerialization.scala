package typings.awsSdkClientS3Browser.typesOutputSerializationMod

import typings.awsSdkClientS3Browser.typesCsvoutputMod.CSVOutput
import typings.awsSdkClientS3Browser.typesJsonoutputMod.JSONOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputSerialization extends js.Object {
  
  /**
    * <p>Describes the serialization of CSV-encoded Select results.</p>
    */
  var CSV: js.UndefOr[CSVOutput] = js.native
  
  /**
    * <p>Specifies JSON as request's output serialization format.</p>
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
  implicit class OutputSerializationOps[Self <: OutputSerialization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCSV(value: CSVOutput): Self = this.set("CSV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCSV: Self = this.set("CSV", js.undefined)
    
    @scala.inline
    def setJSON(value: JSONOutput): Self = this.set("JSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJSON: Self = this.set("JSON", js.undefined)
  }
}
