package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsAggregator extends js.Object {
  
  /**
    * Either a Range or Count aggregator for limiting an OpsItem summary.
    */
  var AggregatorType: js.UndefOr[OpsAggregatorType] = js.native
  
  /**
    * A nested aggregator for viewing counts of OpsItems.
    */
  var Aggregators: js.UndefOr[OpsAggregatorList] = js.native
  
  /**
    * The name of an OpsItem attribute on which to limit the count of OpsItems.
    */
  var AttributeName: js.UndefOr[OpsDataAttributeName] = js.native
  
  /**
    * The aggregator filters.
    */
  var Filters: js.UndefOr[OpsFilterList] = js.native
  
  /**
    * The data type name to use for viewing counts of OpsItems.
    */
  var TypeName: js.UndefOr[OpsDataTypeName] = js.native
  
  /**
    * The aggregator value.
    */
  var Values: js.UndefOr[OpsAggregatorValueMap] = js.native
}
object OpsAggregator {
  
  @scala.inline
  def apply(): OpsAggregator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpsAggregator]
  }
  
  @scala.inline
  implicit class OpsAggregatorOps[Self <: OpsAggregator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregatorType(value: OpsAggregatorType): Self = this.set("AggregatorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregatorType: Self = this.set("AggregatorType", js.undefined)
    
    @scala.inline
    def setAggregatorsVarargs(value: OpsAggregator*): Self = this.set("Aggregators", js.Array(value :_*))
    
    @scala.inline
    def setAggregators(value: OpsAggregatorList): Self = this.set("Aggregators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregators: Self = this.set("Aggregators", js.undefined)
    
    @scala.inline
    def setAttributeName(value: OpsDataAttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeName: Self = this.set("AttributeName", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: OpsFilter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: OpsFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setTypeName(value: OpsDataTypeName): Self = this.set("TypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("TypeName", js.undefined)
    
    @scala.inline
    def setValues(value: OpsAggregatorValueMap): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
}
