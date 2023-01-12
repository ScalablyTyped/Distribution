package typings.chartmogulNode.mod

import typings.chartmogulNode.commonMod.Cursor
import typings.chartmogulNode.commonMod.CursorParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plan {
  
  @JSImport("chartmogul-node", "Plan")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(config: Config): js.Promise[Plans] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Plans]]
  inline def all(config: Config, params: ListPlansParams): js.Promise[Plans] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Plans]]
  
  inline def create(config: Config, data: typings.chartmogulNode.mod.Plan.Plan): js.Promise[typings.chartmogulNode.mod.Plan.Plan] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Plan.Plan]]
  
  inline def destroy(config: Config, uuid: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def modify(config: Config, uuid: String, data: typings.chartmogulNode.mod.Plan.Plan): js.Promise[typings.chartmogulNode.mod.Plan.Plan] = (^.asInstanceOf[js.Dynamic].applyDynamic("modify")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Plan.Plan]]
  
  inline def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.Plan.Plan] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.Plan.Plan]]
  
  trait ListPlansParams
    extends StObject
       with CursorParams {
    
    var data_source_uuid: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
  }
  object ListPlansParams {
    
    inline def apply(): ListPlansParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListPlansParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListPlansParams] (val x: Self) extends AnyVal {
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
  
  trait Plan extends StObject {
    
    var data_source_uuid: js.UndefOr[String] = js.undefined
    
    var external_id: js.UndefOr[String] = js.undefined
    
    var interval_count: js.UndefOr[Double] = js.undefined
    
    var interval_unit: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object Plan {
    
    inline def apply(): typings.chartmogulNode.mod.Plan.Plan = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.chartmogulNode.mod.Plan.Plan]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.chartmogulNode.mod.Plan.Plan] (val x: Self) extends AnyVal {
      
      inline def setData_source_uuid(value: String): Self = StObject.set(x, "data_source_uuid", value.asInstanceOf[js.Any])
      
      inline def setData_source_uuidUndefined: Self = StObject.set(x, "data_source_uuid", js.undefined)
      
      inline def setExternal_id(value: String): Self = StObject.set(x, "external_id", value.asInstanceOf[js.Any])
      
      inline def setExternal_idUndefined: Self = StObject.set(x, "external_id", js.undefined)
      
      inline def setInterval_count(value: Double): Self = StObject.set(x, "interval_count", value.asInstanceOf[js.Any])
      
      inline def setInterval_countUndefined: Self = StObject.set(x, "interval_count", js.undefined)
      
      inline def setInterval_unit(value: String): Self = StObject.set(x, "interval_unit", value.asInstanceOf[js.Any])
      
      inline def setInterval_unitUndefined: Self = StObject.set(x, "interval_unit", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait Plans
    extends StObject
       with Cursor {
    
    var plans: js.Array[typings.chartmogulNode.mod.Plan.Plan]
  }
  object Plans {
    
    inline def apply(plans: js.Array[typings.chartmogulNode.mod.Plan.Plan]): Plans = {
      val __obj = js.Dynamic.literal(plans = plans.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plans]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plans] (val x: Self) extends AnyVal {
      
      inline def setPlans(value: js.Array[typings.chartmogulNode.mod.Plan.Plan]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
      
      inline def setPlansVarargs(value: typings.chartmogulNode.mod.Plan.Plan*): Self = StObject.set(x, "plans", js.Array(value*))
    }
  }
}
