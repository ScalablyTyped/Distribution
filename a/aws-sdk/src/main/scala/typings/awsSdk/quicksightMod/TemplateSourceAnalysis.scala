package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateSourceAnalysis extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn
  
  /**
    * A structure containing information about the dataset references used as placeholders in the template.
    */
  var DataSetReferences: DataSetReferenceList
}
object TemplateSourceAnalysis {
  
  inline def apply(Arn: Arn, DataSetReferences: DataSetReferenceList): TemplateSourceAnalysis = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], DataSetReferences = DataSetReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateSourceAnalysis]
  }
  
  extension [Self <: TemplateSourceAnalysis](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setDataSetReferences(value: DataSetReferenceList): Self = StObject.set(x, "DataSetReferences", value.asInstanceOf[js.Any])
    
    inline def setDataSetReferencesVarargs(value: DataSetReference*): Self = StObject.set(x, "DataSetReferences", js.Array(value*))
  }
}
