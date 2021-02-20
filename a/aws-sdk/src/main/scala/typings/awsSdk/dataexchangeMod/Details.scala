package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends StObject {
  
  var ImportAssetFromSignedUrlJobErrorDetails: js.UndefOr[typings.awsSdk.dataexchangeMod.ImportAssetFromSignedUrlJobErrorDetails] = js.native
  
  var ImportAssetsFromS3JobErrorDetails: js.UndefOr[ListOfAssetSourceEntry] = js.native
}
object Details {
  
  @scala.inline
  def apply(): Details = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportAssetFromSignedUrlJobErrorDetails(value: ImportAssetFromSignedUrlJobErrorDetails): Self = StObject.set(x, "ImportAssetFromSignedUrlJobErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportAssetFromSignedUrlJobErrorDetailsUndefined: Self = StObject.set(x, "ImportAssetFromSignedUrlJobErrorDetails", js.undefined)
    
    @scala.inline
    def setImportAssetsFromS3JobErrorDetails(value: ListOfAssetSourceEntry): Self = StObject.set(x, "ImportAssetsFromS3JobErrorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportAssetsFromS3JobErrorDetailsUndefined: Self = StObject.set(x, "ImportAssetsFromS3JobErrorDetails", js.undefined)
    
    @scala.inline
    def setImportAssetsFromS3JobErrorDetailsVarargs(value: AssetSourceEntry*): Self = StObject.set(x, "ImportAssetsFromS3JobErrorDetails", js.Array(value :_*))
  }
}
