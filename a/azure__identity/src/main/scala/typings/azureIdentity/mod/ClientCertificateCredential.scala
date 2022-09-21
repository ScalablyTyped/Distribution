package typings.azureIdentity.mod

import typings.azureCoreAuth.mod.TokenCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/identity", "ClientCertificateCredential")
@js.native
open class ClientCertificateCredential protected ()
  extends StObject
     with TokenCredential {
  /**
    * Creates an instance of the ClientCertificateCredential with the details
    * needed to authenticate against Azure Active Directory with a certificate.
    *
    * @param tenantId - The Azure Active Directory tenant (directory) ID.
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param certificatePath - The path to a PEM-encoded public/private key certificate on the filesystem.
    * @param options - Options for configuring the client which makes the authentication request.
    */
  def this(tenantId: String, clientId: String, certificatePath: String) = this()
  /**
    * Creates an instance of the ClientCertificateCredential with the details
    * needed to authenticate against Azure Active Directory with a certificate.
    *
    * @param tenantId - The Azure Active Directory tenant (directory) ID.
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param configuration - Other parameters required, including the PEM-encoded certificate as a string.
    *                        If the type is ignored, we will throw the value of the PEM-encoded certificate.
    * @param options - Options for configuring the client which makes the authentication request.
    */
  def this(tenantId: String, clientId: String, configuration: ClientCertificatePEMCertificate) = this()
  /**
    * Creates an instance of the ClientCertificateCredential with the details
    * needed to authenticate against Azure Active Directory with a certificate.
    *
    * @param tenantId - The Azure Active Directory tenant (directory) ID.
    * @param clientId - The client (application) ID of an App Registration in the tenant.
    * @param configuration - Other parameters required, including the path of the certificate on the filesystem.
    *                        If the type is ignored, we will throw the value of the path to a PEM certificate.
    * @param options - Options for configuring the client which makes the authentication request.
    */
  def this(tenantId: String, clientId: String, configuration: ClientCertificatePEMCertificatePath) = this()
  def this(
    tenantId: String,
    clientId: String,
    certificatePath: String,
    options: ClientCertificateCredentialOptions
  ) = this()
  def this(
    tenantId: String,
    clientId: String,
    configuration: ClientCertificatePEMCertificatePath,
    options: ClientCertificateCredentialOptions
  ) = this()
  def this(
    tenantId: String,
    clientId: String,
    configuration: ClientCertificatePEMCertificate,
    options: ClientCertificateCredentialOptions
  ) = this()
  
  /* private */ var additionallyAllowedTenantIds: Any = js.native
  
  /* private */ var msalFlow: Any = js.native
  
  /* private */ var tenantId: Any = js.native
}
