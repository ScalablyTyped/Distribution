package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeImportOutput extends StObject {
  
  /**
    * <p> Represents the properties of the table created for the import, and parameters of the
    *             import. The import parameters include import status, how many items were processed, and
    *             how many errors were encountered. </p>
    */
  var ImportTableDescription: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ImportTableDescription] = js.undefined
}
object DescribeImportOutput {
  
  inline def apply(): DescribeImportOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImportOutput] (val x: Self) extends AnyVal {
    
    inline def setImportTableDescription(value: ImportTableDescription): Self = StObject.set(x, "ImportTableDescription", value.asInstanceOf[js.Any])
    
    inline def setImportTableDescriptionUndefined: Self = StObject.set(x, "ImportTableDescription", js.undefined)
  }
}
