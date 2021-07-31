package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardSourceTemplate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: typings.awsSdk.quicksightMod.Arn
  
  /**
    * Dataset references.
    */
  var DataSetReferences: DataSetReferenceList
}
object DashboardSourceTemplate {
  
  @scala.inline
  def apply(Arn: Arn, DataSetReferences: DataSetReferenceList): DashboardSourceTemplate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], DataSetReferences = DataSetReferences.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardSourceTemplate]
  }
  
  @scala.inline
  implicit class DashboardSourceTemplateMutableBuilder[Self <: DashboardSourceTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetReferences(value: DataSetReferenceList): Self = StObject.set(x, "DataSetReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetReferencesVarargs(value: DataSetReference*): Self = StObject.set(x, "DataSetReferences", js.Array(value :_*))
  }
}
