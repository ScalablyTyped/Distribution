package typings.deta

import typings.deta.distTypesTypesBaseRequestMod.FetchOptions
import typings.deta.distTypesTypesBaseRequestMod.InsertOptions
import typings.deta.distTypesTypesBaseRequestMod.PutManyOptions
import typings.deta.distTypesTypesBaseRequestMod.PutOptions
import typings.deta.distTypesTypesBaseRequestMod.UpdateOptions
import typings.deta.distTypesTypesBaseResponseMod.DeleteResponse
import typings.deta.distTypesTypesBaseResponseMod.FetchResponse
import typings.deta.distTypesTypesBaseResponseMod.GetResponse
import typings.deta.distTypesTypesBaseResponseMod.InsertResponse
import typings.deta.distTypesTypesBaseResponseMod.PutManyResponse
import typings.deta.distTypesTypesBaseResponseMod.PutResponse
import typings.deta.distTypesTypesBaseResponseMod.UpdateResponse
import typings.deta.distTypesTypesBasicMod.CompositeType
import typings.deta.distTypesTypesBasicMod.DetaType
import typings.deta.distTypesTypesBasicMod.ObjectType
import typings.deta.distTypesTypesKeyMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBaseBaseMod {
  
  @JSImport("deta/dist/types/base/base", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Base {
    def this(key: String, `type`: KeyType, projectId: String, baseName: String) = this()
    def this(key: String, `type`: KeyType, projectId: String, baseName: String, host: String) = this()
  }
  
  @js.native
  trait Base extends StObject {
    
    def delete(key: String): js.Promise[DeleteResponse] = js.native
    
    def fetch(): js.Promise[FetchResponse] = js.native
    def fetch(query: Unit, options: FetchOptions): js.Promise[FetchResponse] = js.native
    def fetch(query: CompositeType): js.Promise[FetchResponse] = js.native
    def fetch(query: CompositeType, options: FetchOptions): js.Promise[FetchResponse] = js.native
    
    def get(key: String): js.Promise[GetResponse] = js.native
    
    def insert(data: DetaType): js.Promise[InsertResponse] = js.native
    def insert(data: DetaType, key: String): js.Promise[InsertResponse] = js.native
    def insert(data: DetaType, key: String, options: InsertOptions): js.Promise[InsertResponse] = js.native
    def insert(data: DetaType, key: Unit, options: InsertOptions): js.Promise[InsertResponse] = js.native
    
    def put(data: DetaType): js.Promise[PutResponse] = js.native
    def put(data: DetaType, key: String): js.Promise[PutResponse] = js.native
    def put(data: DetaType, key: String, options: PutOptions): js.Promise[PutResponse] = js.native
    def put(data: DetaType, key: Unit, options: PutOptions): js.Promise[PutResponse] = js.native
    
    def putMany(items: js.Array[DetaType]): js.Promise[PutManyResponse] = js.native
    def putMany(items: js.Array[DetaType], options: PutManyOptions): js.Promise[PutManyResponse] = js.native
    
    /* private */ var requests: Any = js.native
    
    def update(updates: ObjectType, key: String): js.Promise[UpdateResponse] = js.native
    def update(updates: ObjectType, key: String, options: UpdateOptions): js.Promise[UpdateResponse] = js.native
    
    var util: typings.deta.distTypesBaseUtilsMod.default = js.native
  }
}
