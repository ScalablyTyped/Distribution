package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAssetFromSignedUrlJobErrorDetails extends StObject {
  
  var AssetName: typings.awsSdk.dataexchangeMod.AssetName = js.native
}
object ImportAssetFromSignedUrlJobErrorDetails {
  
  @scala.inline
  def apply(AssetName: AssetName): ImportAssetFromSignedUrlJobErrorDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlJobErrorDetails]
  }
  
  @scala.inline
  implicit class ImportAssetFromSignedUrlJobErrorDetailsMutableBuilder[Self <: ImportAssetFromSignedUrlJobErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssetName(value: AssetName): Self = StObject.set(x, "AssetName", value.asInstanceOf[js.Any])
  }
}
