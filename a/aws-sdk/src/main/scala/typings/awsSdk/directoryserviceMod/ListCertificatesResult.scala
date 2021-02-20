package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCertificatesResult extends StObject {
  
  /**
    * A list of certificates with basic details including certificate ID, certificate common name, certificate state.
    */
  var CertificatesInfo: js.UndefOr[typings.awsSdk.directoryserviceMod.CertificatesInfo] = js.native
  
  /**
    * Indicates whether another page of certificates is available when the number of available certificates exceeds the page limit.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.native
}
object ListCertificatesResult {
  
  @scala.inline
  def apply(): ListCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResult]
  }
  
  @scala.inline
  implicit class ListCertificatesResultMutableBuilder[Self <: ListCertificatesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificatesInfo(value: CertificatesInfo): Self = StObject.set(x, "CertificatesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesInfoUndefined: Self = StObject.set(x, "CertificatesInfo", js.undefined)
    
    @scala.inline
    def setCertificatesInfoVarargs(value: CertificateInfo*): Self = StObject.set(x, "CertificatesInfo", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
