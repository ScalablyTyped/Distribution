package typings.chrome.chrome

import typings.std.KeyAlgorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Platform Keys
////////////////////
/**
  * Use the chrome.platformKeys API to access client certificates managed by the platform. If the user or policy grants the permission, an extension can use such a certficate in its custom authentication protocol. E.g. this allows usage of platform managed certificates in third party VPNs (see chrome.vpnProvider).
  * Permissions:  "platformKeys"
  * Important: This API works only on Chrome OS.
  * @since Chrome 45.
  */
object platformKeys {
  
  trait ClientCertificateSelectDetails extends StObject {
    
    /**
      * Optional.
      * If given, the selectClientCertificates operates on this list. Otherwise, obtains the list of all certificates from the platform's certificate stores that are available to this extensions. Entries that the extension doesn't have permission for or which doesn't match the request, are removed.
      */
    var clientCerts: js.UndefOr[js.Array[js.typedarray.ArrayBuffer]] = js.undefined
    
    /** If true, the filtered list is presented to the user to manually select a certificate and thereby granting the extension access to the certificate(s) and key(s). Only the selected certificate(s) will be returned. If is false, the list is reduced to all certificates that the extension has been granted access to (automatically or manually). */
    var interactive: Boolean
    
    /** Only certificates that match this request will be returned. */
    var request: ClientCertificateSelectRequestDetails
  }
  object ClientCertificateSelectDetails {
    
    inline def apply(interactive: Boolean, request: ClientCertificateSelectRequestDetails): ClientCertificateSelectDetails = {
      val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCertificateSelectDetails]
    }
    
    extension [Self <: ClientCertificateSelectDetails](x: Self) {
      
      inline def setClientCerts(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "clientCerts", value.asInstanceOf[js.Any])
      
      inline def setClientCertsUndefined: Self = StObject.set(x, "clientCerts", js.undefined)
      
      inline def setClientCertsVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "clientCerts", js.Array(value*))
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: ClientCertificateSelectRequestDetails): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClientCertificateSelectRequestDetails extends StObject {
    
    /** List of distinguished names of certificate authorities allowed by the server. Each entry must be a DER-encoded X.509 DistinguishedName. */
    var certificateAuthorities: js.Array[js.typedarray.ArrayBuffer]
    
    /** This field is a list of the types of certificates requested, sorted in order of the server's preference. Only certificates of a type contained in this list will be retrieved. If certificateTypes is the empty list, however, certificates of any type will be returned. */
    var certificateTypes: js.Array[String]
  }
  object ClientCertificateSelectRequestDetails {
    
    inline def apply(certificateAuthorities: js.Array[js.typedarray.ArrayBuffer], certificateTypes: js.Array[String]): ClientCertificateSelectRequestDetails = {
      val __obj = js.Dynamic.literal(certificateAuthorities = certificateAuthorities.asInstanceOf[js.Any], certificateTypes = certificateTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientCertificateSelectRequestDetails]
    }
    
    extension [Self <: ClientCertificateSelectRequestDetails](x: Self) {
      
      inline def setCertificateAuthorities(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "certificateAuthorities", value.asInstanceOf[js.Any])
      
      inline def setCertificateAuthoritiesVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "certificateAuthorities", js.Array(value*))
      
      inline def setCertificateTypes(value: js.Array[String]): Self = StObject.set(x, "certificateTypes", value.asInstanceOf[js.Any])
      
      inline def setCertificateTypesVarargs(value: String*): Self = StObject.set(x, "certificateTypes", js.Array(value*))
    }
  }
  
  trait Match extends StObject {
    
    /** The DER encoding of a X.509 certificate. */
    var certificate: js.typedarray.ArrayBuffer
    
    /** The  KeyAlgorithm of the certified key. This contains algorithm parameters that are inherent to the key of the certificate (e.g. the key length). Other parameters like the hash function used by the sign function are not included. */
    var keyAlgorithm: KeyAlgorithm
  }
  object Match {
    
    inline def apply(certificate: js.typedarray.ArrayBuffer, keyAlgorithm: KeyAlgorithm): Match = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match]
    }
    
    extension [Self <: Match](x: Self) {
      
      inline def setCertificate(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setKeyAlgorithm(value: KeyAlgorithm): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerCertificateVerificationDetails extends StObject {
    
    /** The hostname of the server to verify the certificate for, e.g. the server that presented the serverCertificateChain. */
    var hostname: String
    
    /** Each chain entry must be the DER encoding of a X.509 certificate, the first entry must be the server certificate and each entry must certify the entry preceding it. */
    var serverCertificateChain: js.Array[js.typedarray.ArrayBuffer]
  }
  object ServerCertificateVerificationDetails {
    
    inline def apply(hostname: String, serverCertificateChain: js.Array[js.typedarray.ArrayBuffer]): ServerCertificateVerificationDetails = {
      val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], serverCertificateChain = serverCertificateChain.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerCertificateVerificationDetails]
    }
    
    extension [Self <: ServerCertificateVerificationDetails](x: Self) {
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setServerCertificateChain(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "serverCertificateChain", value.asInstanceOf[js.Any])
      
      inline def setServerCertificateChainVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "serverCertificateChain", js.Array(value*))
    }
  }
  
  trait ServerCertificateVerificationResult extends StObject {
    
    /**
      * If the trust verification failed, this array contains the errors reported by the underlying network layer. Otherwise, this array is empty.
      * Note: This list is meant for debugging only and may not contain all relevant errors. The errors returned may change in future revisions of this API, and are not guaranteed to be forwards or backwards compatible.
      */
    var debug_errors: js.Array[String]
    
    /** The result of the trust verification: true if trust for the given verification details could be established and false if trust is rejected for any reason. */
    var trusted: Boolean
  }
  object ServerCertificateVerificationResult {
    
    inline def apply(debug_errors: js.Array[String], trusted: Boolean): ServerCertificateVerificationResult = {
      val __obj = js.Dynamic.literal(debug_errors = debug_errors.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerCertificateVerificationResult]
    }
    
    extension [Self <: ServerCertificateVerificationResult](x: Self) {
      
      inline def setDebug_errors(value: js.Array[String]): Self = StObject.set(x, "debug_errors", value.asInstanceOf[js.Any])
      
      inline def setDebug_errorsVarargs(value: String*): Self = StObject.set(x, "debug_errors", js.Array(value*))
      
      inline def setTrusted(value: Boolean): Self = StObject.set(x, "trusted", value.asInstanceOf[js.Any])
    }
  }
}
