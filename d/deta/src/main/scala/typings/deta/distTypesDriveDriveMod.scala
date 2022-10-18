package typings.deta

import typings.deta.distTypesTypesDriveRequestMod.ListOptions
import typings.deta.distTypesTypesDriveRequestMod.PutOptions
import typings.deta.distTypesTypesDriveResponseMod.DeleteManyResponse
import typings.deta.distTypesTypesDriveResponseMod.DeleteResponse
import typings.deta.distTypesTypesDriveResponseMod.GetResponse
import typings.deta.distTypesTypesDriveResponseMod.ListResponse
import typings.deta.distTypesTypesDriveResponseMod.PutResponse
import typings.deta.distTypesTypesKeyMod.KeyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDriveDriveMod {
  
  @JSImport("deta/dist/types/drive/drive", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Drive {
    def this(key: String, `type`: KeyType, projectId: String, driveName: String) = this()
    def this(key: String, `type`: KeyType, projectId: String, driveName: String, host: String) = this()
  }
  
  @js.native
  trait Drive extends StObject {
    
    def delete(name: String): js.Promise[DeleteResponse] = js.native
    
    def deleteMany(names: js.Array[String]): js.Promise[DeleteManyResponse] = js.native
    
    def get(name: String): js.Promise[GetResponse] = js.native
    
    def list(): js.Promise[ListResponse] = js.native
    def list(options: ListOptions): js.Promise[ListResponse] = js.native
    
    def put(name: String, options: PutOptions): js.Promise[PutResponse] = js.native
    
    /* private */ var requests: Any = js.native
    
    /* private */ var upload: Any = js.native
  }
}
