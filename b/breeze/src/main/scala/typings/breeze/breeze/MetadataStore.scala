package typings.breeze.breeze

import typings.breeze.anon.Name
import typings.breeze.breeze.core.ErrorCallback
import typings.breeze.breeze.core.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataStore extends StObject {
  
  def addDataService(dataService: DataService): Unit = js.native
  def addDataService(dataService: DataService, shouldOverwrite: Boolean): Unit = js.native
  
  def addEntityType(structuralType: ComplexType): Unit = js.native
  def addEntityType(structuralType: EntityType): Unit = js.native
  
  var dataServices: js.Array[DataService] = js.native
  
  def exportMetadata(): String = js.native
  
  def fetchMetadata(dataService: String): js.Promise[Any] = js.native
  def fetchMetadata(dataService: String, callback: js.Function1[/* data */ Any, Unit]): js.Promise[Any] = js.native
  def fetchMetadata(dataService: String, callback: js.Function1[/* data */ Any, Unit], errorCallback: ErrorCallback): js.Promise[Any] = js.native
  def fetchMetadata(dataService: String, callback: Unit, errorCallback: ErrorCallback): js.Promise[Any] = js.native
  def fetchMetadata(dataService: DataService): js.Promise[Any] = js.native
  def fetchMetadata(dataService: DataService, callback: js.Function1[/* data */ Any, Unit]): js.Promise[Any] = js.native
  def fetchMetadata(
    dataService: DataService,
    callback: js.Function1[/* data */ Any, Unit],
    errorCallback: ErrorCallback
  ): js.Promise[Any] = js.native
  def fetchMetadata(dataService: DataService, callback: Unit, errorCallback: ErrorCallback): js.Promise[Any] = js.native
  
  def getDataService(serviceName: String): DataService = js.native
  
  def getEntityType(entityTypeName: String): EntityType | ComplexType = js.native
  def getEntityType(entityTypeName: String, okIfNotFound: Boolean): EntityType | ComplexType = js.native
  
  def getEntityTypeNameForResourceName(resourceName: String): String = js.native
  
  def getEntityTypes(): js.Array[EntityType | ComplexType] = js.native
  
  def hasMetadataFor(serviceName: String): Boolean = js.native
  
  def importMetadata(exportedMetadata: Any): MetadataStore = js.native
  def importMetadata(exportedMetadata: Any, allowMerge: Boolean): MetadataStore = js.native
  
  def isEmpty(): Boolean = js.native
  
  var metadataFetched: Event = js.native
  
  var namingConvention: NamingConvention = js.native
  
  def registerEntityTypeCtor(entityTypeName: String, entityCtor: js.Function): Unit = js.native
  def registerEntityTypeCtor(
    entityTypeName: String,
    entityCtor: js.Function,
    initializationFn: js.Function1[/* entity */ Entity, Unit]
  ): Unit = js.native
  def registerEntityTypeCtor(
    entityTypeName: String,
    entityCtor: js.Function,
    initializationFn: js.Function1[/* entity */ Entity, Unit],
    noTrackingFn: js.Function2[/* node */ js.Object, /* entityType */ EntityType, js.Object]
  ): Unit = js.native
  def registerEntityTypeCtor(
    entityTypeName: String,
    entityCtor: js.Function,
    initializationFn: Unit,
    noTrackingFn: js.Function2[/* node */ js.Object, /* entityType */ EntityType, js.Object]
  ): Unit = js.native
  
  def setEntityTypeForResourceName(resourceName: String, entityTypeName: String): Unit = js.native
  def setEntityTypeForResourceName(resourceName: String, entityType: EntityType): Unit = js.native
  
  def setProperties(config: Name): Unit = js.native
  
  def trackUnmappedType(entityCtor: js.Function): Unit = js.native
  def trackUnmappedType(entityCtor: js.Function, interceptor: js.Function): Unit = js.native
}
