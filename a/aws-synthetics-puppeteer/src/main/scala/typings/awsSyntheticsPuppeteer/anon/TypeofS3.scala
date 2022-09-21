package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.S3.PresignedPost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofS3 extends StObject {
  
  val ManagedUpload: TypeofManagedUpload
  
  val PresignedPost: Instantiable0[typings.awsSdk.mod.S3.PresignedPost]
  
  val Types: this.type
}
object TypeofS3 {
  
  inline def apply(ManagedUpload: TypeofManagedUpload, PresignedPost: Instantiable0[PresignedPost], Types: TypeofS3): TypeofS3 = {
    val __obj = js.Dynamic.literal(ManagedUpload = ManagedUpload.asInstanceOf[js.Any], PresignedPost = PresignedPost.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofS3]
  }
  
  extension [Self <: TypeofS3](x: Self) {
    
    inline def setManagedUpload(value: TypeofManagedUpload): Self = StObject.set(x, "ManagedUpload", value.asInstanceOf[js.Any])
    
    inline def setPresignedPost(value: Instantiable0[PresignedPost]): Self = StObject.set(x, "PresignedPost", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypeofS3): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
