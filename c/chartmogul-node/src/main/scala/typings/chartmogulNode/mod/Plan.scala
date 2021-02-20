package typings.chartmogulNode.mod

import typings.chartmogulNode.commonMod.Cursor
import typings.chartmogulNode.commonMod.CursorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plan {
  
  @JSImport("chartmogul-node", "Plan.all")
  @js.native
  def all(config: Config): js.Promise[Plans] = js.native
  @JSImport("chartmogul-node", "Plan.all")
  @js.native
  def all(config: Config, params: ListPlansParams): js.Promise[Plans] = js.native
  
  @JSImport("chartmogul-node", "Plan.create")
  @js.native
  def create(config: Config, data: typings.chartmogulNode.mod.Plan.Plan): js.Promise[typings.chartmogulNode.mod.Plan.Plan] = js.native
  
  @JSImport("chartmogul-node", "Plan.destroy")
  @js.native
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = js.native
  
  @JSImport("chartmogul-node", "Plan.modify")
  @js.native
  def modify(config: Config, uuid: String, data: typings.chartmogulNode.mod.Plan.Plan): js.Promise[typings.chartmogulNode.mod.Plan.Plan] = js.native
  
  @JSImport("chartmogul-node", "Plan.retrieve")
  @js.native
  def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.Plan.Plan] = js.native
  
  @js.native
  trait ListPlansParams extends CursorParams {
    
    var data_source_uuid: js.UndefOr[String] = js.native
    
    var external_id: js.UndefOr[String] = js.native
    
    var system: js.UndefOr[String] = js.native
  }
  object ListPlansParams {
    
    @scala.inline
    def apply(): ListPlansParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPlansParams]
    }
    
    @scala.inline
    implicit class ListPlansParamsMutableBuilder[Self <: ListPlansParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
  
  @js.native
  trait Plan extends StObject {
    
    var data_source_uuid: js.UndefOr[String] = js.native
    
    var external_id: js.UndefOr[String] = js.native
    
    var interval_count: js.UndefOr[Double] = js.native
    
    var interval_unit: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var uuid: js.UndefOr[String] = js.native
  }
  object Plan {
    
    @scala.inline
    def apply(): typings.chartmogulNode.mod.Plan.Plan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Plan.Plan]
    }
    
    @scala.inline
    implicit class PlanMutableBuilder[Self <: typings.chartmogulNode.mod.Plan.Plan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      @scala.inline
      def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      @scala.inline
      def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval_countUndefined: Self = StObject.set(x, "interval_count", js.undefined)
      
      @scala.inline
      def setInterval_unit(value: String): Self = StObject.set(x, "interval_unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval_unitUndefined: Self = StObject.set(x, "interval_unit", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  @js.native
  trait Plans extends Cursor {
    
    var plans: js.Array[typings.chartmogulNode.mod.Plan.Plan] = js.native
  }
  object Plans {
    
    @scala.inline
    def apply(plans: js.Array[typings.chartmogulNode.mod.Plan.Plan]): Plans = {
      val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plans]
    }
    
    @scala.inline
    implicit class PlansMutableBuilder[Self <: Plans] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlans(value: js.Array[typings.chartmogulNode.mod.Plan.Plan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlansVarargs(value: typings.chartmogulNode.mod.Plan.Plan*): Self = StObject.set(x, "plans", js.Array(value :_*))
    }
  }
}
