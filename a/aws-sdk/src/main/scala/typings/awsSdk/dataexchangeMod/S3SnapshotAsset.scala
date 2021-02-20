package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3SnapshotAsset extends StObject {
  
  /**
    * The size of the S3 object that is the object.
    */
  var Size: doubleMin0 = js.native
}
object S3SnapshotAsset {
  
  @scala.inline
  def apply(Size: doubleMin0): S3SnapshotAsset = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SnapshotAsset]
  }
  
  @scala.inline
  implicit class S3SnapshotAssetMutableBuilder[Self <: S3SnapshotAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: doubleMin0): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
