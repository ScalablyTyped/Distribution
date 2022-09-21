package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportTableOutput extends StObject {
  
  /**
    *  Represents the properties of the table created for the import, and parameters of the import. The import parameters include import status, how many items were processed, and how many errors were encountered. 
    */
  var ImportTableDescription: typings.awsSdk.dynamodbMod.ImportTableDescription
}
object ImportTableOutput {
  
  inline def apply(ImportTableDescription: ImportTableDescription): ImportTableOutput = {
    val __obj = js.Dynamic.literal(ImportTableDescription = ImportTableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTableOutput]
  }
  
  extension [Self <: ImportTableOutput](x: Self) {
    
    inline def setImportTableDescription(value: ImportTableDescription): Self = StObject.set(x, "ImportTableDescription", value.asInstanceOf[js.Any])
  }
}
