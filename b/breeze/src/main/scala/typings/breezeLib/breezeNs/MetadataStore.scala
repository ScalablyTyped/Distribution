package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("breeze.MetadataStore")
@js.native
class MetadataStore () extends js.Object {
  def this(config: MetadataStoreOptions) = this()
  var namingConvention: NamingConvention = js.native
  def addDataService(dataService: DataService): scala.Unit = js.native
  def addDataService(dataService: DataService, shouldOverwrite: scala.Boolean): scala.Unit = js.native
  def addEntityType(structuralType: IStructuralType): scala.Unit = js.native
  def exportMetadata(): java.lang.String = js.native
  def fetchMetadata(dataService: DataService): stdLib.Promise[_] = js.native
  def fetchMetadata(dataService: DataService, callback: js.Function1[/* data */ js.Any, scala.Unit]): stdLib.Promise[_] = js.native
  def fetchMetadata(
    dataService: DataService,
    callback: js.Function1[/* data */ js.Any, scala.Unit],
    errorCallback: breezeLib.breezeNs.coreNs.ErrorCallback
  ): stdLib.Promise[_] = js.native
  def fetchMetadata(dataService: java.lang.String): stdLib.Promise[_] = js.native
  def fetchMetadata(dataService: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): stdLib.Promise[_] = js.native
  def fetchMetadata(
    dataService: java.lang.String,
    callback: js.Function1[/* data */ js.Any, scala.Unit],
    errorCallback: breezeLib.breezeNs.coreNs.ErrorCallback
  ): stdLib.Promise[_] = js.native
  def getDataService(serviceName: java.lang.String): DataService = js.native
  def getEntityType(entityTypeName: java.lang.String): IStructuralType = js.native
  def getEntityType(entityTypeName: java.lang.String, okIfNotFound: scala.Boolean): IStructuralType = js.native
  def getEntityTypeNameForResourceName(resourceName: java.lang.String): java.lang.String = js.native
  def getEntityTypes(): js.Array[IStructuralType] = js.native
  def hasMetadataFor(serviceName: java.lang.String): scala.Boolean = js.native
  def importMetadata(exportedString: java.lang.String): MetadataStore = js.native
  def importMetadata(exportedString: java.lang.String, allowMerge: scala.Boolean): MetadataStore = js.native
  def isEmpty(): scala.Boolean = js.native
  def registerEntityTypeCtor(entityTypeName: java.lang.String, entityCtor: js.Function): scala.Unit = js.native
  def registerEntityTypeCtor(
    entityTypeName: java.lang.String,
    entityCtor: js.Function,
    initializationFn: js.Function1[/* entity */ Entity, scala.Unit]
  ): scala.Unit = js.native
  def registerEntityTypeCtor(
    entityTypeName: java.lang.String,
    entityCtor: js.Function,
    initializationFn: js.Function1[/* entity */ Entity, scala.Unit],
    noTrackingFn: js.Function2[/* node */ js.Object, /* entityType */ EntityType, js.Object]
  ): scala.Unit = js.native
  def setEntityTypeForResourceName(resourceName: java.lang.String, entityTypeName: java.lang.String): scala.Unit = js.native
  def setEntityTypeForResourceName(resourceName: java.lang.String, entityType: EntityType): scala.Unit = js.native
  def setProperties(config: breezeLib.Anon_Name): scala.Unit = js.native
  def trackUnmappedType(entityCtor: js.Function): scala.Unit = js.native
  def trackUnmappedType(entityCtor: js.Function, interceptor: js.Function): scala.Unit = js.native
}

@JSGlobal("breeze.MetadataStore")
@js.native
object MetadataStore extends js.Object {
  def importMetadata(exportedString: java.lang.String): breezeLib.breezeNs.MetadataStore = js.native
  def normalizeTypeName(typeName: java.lang.String): java.lang.String = js.native
}

