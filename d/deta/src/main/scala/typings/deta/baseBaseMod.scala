package typings.deta

import typings.deta.basicMod.CompositeType
import typings.deta.basicMod.DetaType
import typings.deta.basicMod.ObjectType
import typings.deta.keyMod.KeyType
import typings.deta.requestMod.FetchOptions
import typings.deta.requestMod.InsertOptions
import typings.deta.requestMod.PutManyOptions
import typings.deta.requestMod.PutOptions
import typings.deta.requestMod.UpdateOptions
import typings.deta.responseMod.DeleteResponse
import typings.deta.responseMod.FetchResponse
import typings.deta.responseMod.GetResponse
import typings.deta.responseMod.InsertResponse
import typings.deta.responseMod.PutManyResponse
import typings.deta.responseMod.PutResponse
import typings.deta.responseMod.UpdateResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseBaseMod {
  
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
    
    var util: typings.deta.utilsMod.default = js.native
  }
}
