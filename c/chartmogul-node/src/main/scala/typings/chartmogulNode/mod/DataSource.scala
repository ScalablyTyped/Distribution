package typings.chartmogulNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataSource {
  
  @JSImport("chartmogul-node", "DataSource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(config: Config): js.Promise[DataSources] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataSources]]
  inline def all(config: Config, params: ListDataSourcesParams): js.Promise[DataSources] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DataSources]]
  
  inline def create(config: Config, data: typings.chartmogulNode.mod.DataSource.DataSource): js.Promise[typings.chartmogulNode.mod.DataSource.DataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.DataSource.DataSource]]
  
  inline def destroy(config: Config, uuid: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  inline def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.DataSource.DataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.DataSource.DataSource]]
  
  trait DataSource extends StObject {
    
    var created_at: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var status: js.UndefOr[String] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object DataSource {
    
    inline def apply(name: String): typings.chartmogulNode.mod.DataSource.DataSource = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chartmogulNode.mod.DataSource.DataSource]
    }
    
    extension [Self <: typings.chartmogulNode.mod.DataSource.DataSource](x: Self) {
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait DataSources extends StObject {
    
    var data_sources: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]
  }
  object DataSources {
    
    inline def apply(data_sources: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]): DataSources = {
      val __obj = js.Dynamic.literal(data_sources = data_sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSources]
    }
    
    extension [Self <: DataSources](x: Self) {
      
      inline def setData_sources(value: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]): Self = StObject.set(x, "data_sources", value.asInstanceOf[js.Any])
      
      inline def setData_sourcesVarargs(value: typings.chartmogulNode.mod.DataSource.DataSource*): Self = StObject.set(x, "data_sources", js.Array(value*))
    }
  }
  
  trait ListDataSourcesParams extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
  }
  object ListDataSourcesParams {
    
    inline def apply(): ListDataSourcesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListDataSourcesParams]
    }
    
    extension [Self <: ListDataSourcesParams](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
}
