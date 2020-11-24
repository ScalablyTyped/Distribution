package typings.azureKustoData.mod

import typings.adalNode.mod.UserCodeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
@js.native
class KustoConnectionStringBuilder protected () extends js.Object {
  def this(connectionString: String) = this()
  
  var aadUserId: js.UndefOr[String] = js.native
  
  var applicationCertificate: js.UndefOr[String] = js.native
  
  var applicationCertificateThumbprint: js.UndefOr[String] = js.native
  
  var applicationClientId: js.UndefOr[String] = js.native
  
  var applicationKey: js.UndefOr[String] = js.native
  
  var authorityId: String = js.native
  
  var dataSource: String = js.native
  
  var password: js.UndefOr[String] = js.native
}
/* static members */
@JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
@js.native
object KustoConnectionStringBuilder extends js.Object {
  
  def withAadApplicationCertificateAuthentication(
    connectionString: String,
    aadAppId: String,
    certificate: String,
    thumbprint: String,
    authorityId: String
  ): KustoConnectionStringBuilder = js.native
  
  def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): KustoConnectionStringBuilder = js.native
  
  def withAadDeviceAuthentication(connectionString: String, authorityId: String): KustoConnectionStringBuilder = js.native
  def withAadDeviceAuthentication(
    connectionString: String,
    authorityId: String,
    authCallback: js.Function1[/* tokenReponse */ UserCodeInfo, Unit]
  ): KustoConnectionStringBuilder = js.native
  
  def withAadManagedIdentities(connectionString: String): KustoConnectionStringBuilder = js.native
  def withAadManagedIdentities(connectionString: String, msiEndpoint: js.UndefOr[scala.Nothing], clientId: String): KustoConnectionStringBuilder = js.native
  def withAadManagedIdentities(connectionString: String, msiEndpoint: String): KustoConnectionStringBuilder = js.native
  def withAadManagedIdentities(connectionString: String, msiEndpoint: String, clientId: String): KustoConnectionStringBuilder = js.native
  
  def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): KustoConnectionStringBuilder = js.native
  def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: js.Any): KustoConnectionStringBuilder = js.native
}
