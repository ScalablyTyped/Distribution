package typings.chartmogulNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataSource {
  
  @JSImport("chartmogul-node", "DataSource.all")
  @js.native
  def all(config: Config): js.Promise[DataSources] = js.native
  @JSImport("chartmogul-node", "DataSource.all")
  @js.native
  def all(config: Config, params: ListDataSourcesParams): js.Promise[DataSources] = js.native
  
  @JSImport("chartmogul-node", "DataSource.create")
  @js.native
  def create(config: Config, data: typings.chartmogulNode.mod.DataSource.DataSource): js.Promise[typings.chartmogulNode.mod.DataSource.DataSource] = js.native
  
  @JSImport("chartmogul-node", "DataSource.destroy")
  @js.native
  def destroy(config: Config, uuid: String): js.Promise[js.Object] = js.native
  
  @JSImport("chartmogul-node", "DataSource.retrieve")
  @js.native
  def retrieve(config: Config, uuid: String): js.Promise[typings.chartmogulNode.mod.DataSource.DataSource] = js.native
  
  @js.native
  trait DataSource extends StObject {
    
    var created_at: js.UndefOr[String] = js.native
    
    var name: String = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var system: js.UndefOr[String] = js.native
    
    var uuid: js.UndefOr[String] = js.native
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
  
  @js.native
  trait DataSources extends StObject {
    
    var data_sources: js.Array[typings.chartmogulNode.mod.DataSource.DataSource] = js.native
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
  
  @js.native
  trait ListDataSourcesParams extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var system: js.UndefOr[String] = js.native
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
