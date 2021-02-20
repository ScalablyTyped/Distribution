package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetSourceEntry extends StObject {
  
  /**
    * The S3 bucket that's part of the source of the asset.
    */
  var Bucket: string = js.native
  
  /**
    * The name of the object in Amazon S3 for the asset.
    */
  var Key: string = js.native
}
object AssetSourceEntry {
  
  @scala.inline
  def apply(Bucket: string, Key: string): AssetSourceEntry = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetSourceEntry]
  }
  
  @scala.inline
  implicit class AssetSourceEntryMutableBuilder[Self <: AssetSourceEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: string): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: string): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
  }
}
