package typings.chartmogulNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataSource {
  
  @JSImport("chartmogul-node", "DataSource")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def all(config: Config): js.Promise[DataSources] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataSources]]
  @scala.inline
  def all(config: Config, params: ListDataSourcesParams): js.Promise[DataSources] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(config.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DataSources]]
  
  @scala.inline
  def create(config: Config, data: typings.chartmogulNode.mod.DataSource.DataSource): js.Promise[typings.chartmogulNode.mod.DataSource.DataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.DataSource.DataSource]]
  
  @scala.inline
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Object]]
  
  @scala.inline
  def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.DataSource.DataSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("retrieve")(config.asInstanceOf[js.Any], uuid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.chartmogulNode.mod.DataSource.DataSource]]
  
  trait DataSource extends StObject {
    
    var created_at: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var status: js.UndefOr[String] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
    
    var uuid: js.UndefOr[String] = js.undefined
  }
  object DataSource {
    
    @scala.inline
    def apply(name: String): typings.chartmogulNode.mod.DataSource.DataSource = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.chartmogulNode.mod.DataSource.DataSource]
    }
    
    @scala.inline
    implicit class DataSourceMutableBuilder[Self <: typings.chartmogulNode.mod.DataSource.DataSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    }
  }
  
  trait DataSources extends StObject {
    
    var data_sources: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]
  }
  object DataSources {
    
    @scala.inline
    def apply(data_sources: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]): DataSources = {
      val __obj = js.Dynamic.literal(data_sources = data_sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSources]
    }
    
    @scala.inline
    implicit class DataSourcesMutableBuilder[Self <: DataSources] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData_sources(value: js.Array[typings.chartmogulNode.mod.DataSource.DataSource]): Self = StObject.set(x, "data_sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData_sourcesVarargs(value: typings.chartmogulNode.mod.DataSource.DataSource*): Self = StObject.set(x, "data_sources", js.Array(value :_*))
    }
  }
  
  trait ListDataSourcesParams extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var system: js.UndefOr[String] = js.undefined
  }
  object ListDataSourcesParams {
    
    @scala.inline
    def apply(): ListDataSourcesParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListDataSourcesParams]
    }
    
    @scala.inline
    implicit class ListDataSourcesParamsMutableBuilder[Self <: ListDataSourcesParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
}
