package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsOutput extends StObject {
  
  /**
    * <p> A list of <code>ImportSummary</code> objects. </p>
    */
  var ImportSummaryList: js.UndefOr[js.Array[ImportSummary]] = js.undefined
  
  /**
    * <p> If this value is returned, there are additional results to be displayed. To retrieve
    *             them, call <code>ListImports</code> again, with <code>NextToken</code> set to this
    *             value. </p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListImportsOutput {
  
  inline def apply(): ListImportsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportsOutput] (val x: Self) extends AnyVal {
    
    inline def setImportSummaryList(value: js.Array[ImportSummary]): Self = StObject.set(x, "ImportSummaryList", value.asInstanceOf[js.Any])
    
    inline def setImportSummaryListUndefined: Self = StObject.set(x, "ImportSummaryList", js.undefined)
    
    inline def setImportSummaryListVarargs(value: ImportSummary*): Self = StObject.set(x, "ImportSummaryList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
