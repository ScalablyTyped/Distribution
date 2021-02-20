package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object qldbsessionMod {
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.qldbsessionMod.ClientApiVersions
  
  type CommitDigest = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.qldbsessionMod.Blob | java.lang.String
  
  type IonBinary = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.qldbsessionMod.Blob | java.lang.String
  
  type IonText = java.lang.String
  
  type LedgerName = java.lang.String
  
  type PageToken = java.lang.String
  
  type SessionToken = java.lang.String
  
  type Statement = java.lang.String
  
  type StatementParameters = js.Array[typings.awsSdk.qldbsessionMod.ValueHolder]
  
  type TransactionId = java.lang.String
  
  type ValueHolders = js.Array[typings.awsSdk.qldbsessionMod.ValueHolder]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-07-11`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.qldbsessionMod._apiVersion | java.lang.String
}
