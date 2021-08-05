package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tls extends StObject {
  
  /**
    * 
    List of ACM Certificate Authority ARNs.
    
    */
  var CertificateAuthorityArnList: js.UndefOr[listOfString] = js.undefined
}
object Tls {
  
  inline def apply(): Tls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tls]
  }
  
  extension [Self <: Tls](x: Self) {
    
    inline def setCertificateAuthorityArnList(value: listOfString): Self = StObject.set(x, "CertificateAuthorityArnList", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityArnListUndefined: Self = StObject.set(x, "CertificateAuthorityArnList", js.undefined)
    
    inline def setCertificateAuthorityArnListVarargs(value: string*): Self = StObject.set(x, "CertificateAuthorityArnList", js.Array(value :_*))
  }
}
