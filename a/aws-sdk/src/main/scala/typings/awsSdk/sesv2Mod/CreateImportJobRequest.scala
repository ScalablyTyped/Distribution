package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImportJobRequest extends js.Object {
  
  /**
    * The data source for the import job.
    */
  var ImportDataSource: typings.awsSdk.sesv2Mod.ImportDataSource = js.native
  
  /**
    * The destination for the import job.
    */
  var ImportDestination: typings.awsSdk.sesv2Mod.ImportDestination = js.native
}
object CreateImportJobRequest {
  
  @scala.inline
  def apply(ImportDataSource: ImportDataSource, ImportDestination: ImportDestination): CreateImportJobRequest = {
    val __obj = js.Dynamic.literal(ImportDataSource = ImportDataSource.asInstanceOf[js.Any], ImportDestination = ImportDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImportJobRequest]
  }
  
  @scala.inline
  implicit class CreateImportJobRequestOps[Self <: CreateImportJobRequest] (val x: Self) extends AnyVal {
    
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
    def setImportDataSource(value: ImportDataSource): Self = this.set("ImportDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDestination(value: ImportDestination): Self = this.set("ImportDestination", value.asInstanceOf[js.Any])
  }
}
