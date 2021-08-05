package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterEndpoint extends StObject {
  
  /**
    * The DNS address of the cluster.
    */
  var Address: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The port that the database engine listens on.
    */
  var Port: js.UndefOr[Integer] = js.undefined
}
object AwsRedshiftClusterEndpoint {
  
  inline def apply(): AwsRedshiftClusterEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterEndpoint]
  }
  
  extension [Self <: AwsRedshiftClusterEndpoint](x: Self) {
    
    inline def setAddress(value: NonEmptyString): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
