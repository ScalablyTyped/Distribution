package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportOutput extends StObject {
  
  /**
    *  Represents the properties of the table created for the import, and parameters of the import. The import parameters include import status, how many items were processed, and how many errors were encountered. 
    */
  var ImportTableDescription: typings.awsSdk2Types.clientsDynamodbMod.ImportTableDescription
}
object DescribeImportOutput {
  
  inline def apply(ImportTableDescription: ImportTableDescription): DescribeImportOutput = {
    val __obj = js.Dynamic.literal(ImportTableDescription = ImportTableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImportOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImportOutput] (val x: Self) extends AnyVal {
    
    inline def setImportTableDescription(value: ImportTableDescription): Self = StObject.set(x, "ImportTableDescription", value.asInstanceOf[js.Any])
  }
}
