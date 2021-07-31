package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIndexFieldsRequest extends StObject {
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
  
  /**
    * A list of the index fields you want to describe. If not specified, information is returned for all configured index fields.
    */
  var FieldNames: js.UndefOr[DynamicFieldNameList] = js.undefined
}
object DescribeIndexFieldsRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeIndexFieldsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexFieldsRequest]
  }
  
  @scala.inline
  implicit class DescribeIndexFieldsRequestMutableBuilder[Self <: DescribeIndexFieldsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNames(value: DynamicFieldNameList): Self = StObject.set(x, "FieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "FieldNames", js.undefined)
    
    @scala.inline
    def setFieldNamesVarargs(value: DynamicFieldName*): Self = StObject.set(x, "FieldNames", js.Array(value :_*))
  }
}
