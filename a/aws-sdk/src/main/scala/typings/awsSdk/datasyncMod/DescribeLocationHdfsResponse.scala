package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocationHdfsResponse extends StObject {
  
  /**
    * The ARNs of the agents that are used to connect to the HDFS cluster. 
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.undefined
  
  /**
    * The type of authentication used to determine the identity of the user. 
    */
  var AuthenticationType: js.UndefOr[HdfsAuthenticationType] = js.undefined
  
  /**
    * The size of the data blocks to write into the HDFS cluster. 
    */
  var BlockSize: js.UndefOr[HdfsBlockSize] = js.undefined
  
  /**
    * The time that the HDFS location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Kerberos principal with access to the files and folders on the HDFS cluster. This parameter is used if the AuthenticationType is defined as KERBEROS.
    */
  var KerberosPrincipal: js.UndefOr[typings.awsSdk.datasyncMod.KerberosPrincipal] = js.undefined
  
  /**
    *  The URI of the HDFS cluster's Key Management Server (KMS). 
    */
  var KmsKeyProviderUri: js.UndefOr[typings.awsSdk.datasyncMod.KmsKeyProviderUri] = js.undefined
  
  /**
    * The ARN of the HDFS cluster location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.undefined
  
  /**
    * The URI of the HDFS cluster location.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.undefined
  
  /**
    * The NameNode that manage the HDFS namespace. 
    */
  var NameNodes: js.UndefOr[HdfsNameNodeList] = js.undefined
  
  /**
    * The Quality of Protection (QOP) configuration specifies the Remote Procedure Call (RPC) and data transfer protection settings configured on the Hadoop Distributed File System (HDFS) cluster. 
    */
  var QopConfiguration: js.UndefOr[typings.awsSdk.datasyncMod.QopConfiguration] = js.undefined
  
  /**
    * The number of DataNodes to replicate the data to when writing to the HDFS cluster. 
    */
  var ReplicationFactor: js.UndefOr[HdfsReplicationFactor] = js.undefined
  
  /**
    * The user name used to identify the client on the host operating system. This parameter is used if the AuthenticationType is defined as SIMPLE.
    */
  var SimpleUser: js.UndefOr[HdfsUser] = js.undefined
}
object DescribeLocationHdfsResponse {
  
  inline def apply(): DescribeLocationHdfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationHdfsResponse]
  }
  
  extension [Self <: DescribeLocationHdfsResponse](x: Self) {
    
    inline def setAgentArns(value: AgentArnList): Self = StObject.set(x, "AgentArns", value.asInstanceOf[js.Any])
    
    inline def setAgentArnsUndefined: Self = StObject.set(x, "AgentArns", js.undefined)
    
    inline def setAgentArnsVarargs(value: AgentArn*): Self = StObject.set(x, "AgentArns", js.Array(value*))
    
    inline def setAuthenticationType(value: HdfsAuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setBlockSize(value: HdfsBlockSize): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "BlockSize", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setKerberosPrincipal(value: KerberosPrincipal): Self = StObject.set(x, "KerberosPrincipal", value.asInstanceOf[js.Any])
    
    inline def setKerberosPrincipalUndefined: Self = StObject.set(x, "KerberosPrincipal", js.undefined)
    
    inline def setKmsKeyProviderUri(value: KmsKeyProviderUri): Self = StObject.set(x, "KmsKeyProviderUri", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyProviderUriUndefined: Self = StObject.set(x, "KmsKeyProviderUri", js.undefined)
    
    inline def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    inline def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    inline def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    inline def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    inline def setNameNodes(value: HdfsNameNodeList): Self = StObject.set(x, "NameNodes", value.asInstanceOf[js.Any])
    
    inline def setNameNodesUndefined: Self = StObject.set(x, "NameNodes", js.undefined)
    
    inline def setNameNodesVarargs(value: HdfsNameNode*): Self = StObject.set(x, "NameNodes", js.Array(value*))
    
    inline def setQopConfiguration(value: QopConfiguration): Self = StObject.set(x, "QopConfiguration", value.asInstanceOf[js.Any])
    
    inline def setQopConfigurationUndefined: Self = StObject.set(x, "QopConfiguration", js.undefined)
    
    inline def setReplicationFactor(value: HdfsReplicationFactor): Self = StObject.set(x, "ReplicationFactor", value.asInstanceOf[js.Any])
    
    inline def setReplicationFactorUndefined: Self = StObject.set(x, "ReplicationFactor", js.undefined)
    
    inline def setSimpleUser(value: HdfsUser): Self = StObject.set(x, "SimpleUser", value.asInstanceOf[js.Any])
    
    inline def setSimpleUserUndefined: Self = StObject.set(x, "SimpleUser", js.undefined)
  }
}
