package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImportJobRequest extends StObject {
  
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
  implicit class CreateImportJobRequestMutableBuilder[Self <: CreateImportJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportDataSource(value: ImportDataSource): Self = StObject.set(x, "ImportDataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDestination(value: ImportDestination): Self = StObject.set(x, "ImportDestination", value.asInstanceOf[js.Any])
  }
}
