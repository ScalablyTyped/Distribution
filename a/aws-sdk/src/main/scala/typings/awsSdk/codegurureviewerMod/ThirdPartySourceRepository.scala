package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartySourceRepository extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Web Services CodeStar Connections connection. Its format is arn:aws:codestar-connections:region-id:aws-account_id:connection/connection-id. For more information, see Connection in the Amazon Web Services CodeStar Connections API Reference.
    */
  var ConnectionArn: typings.awsSdk.codegurureviewerMod.ConnectionArn
  
  /**
    * The name of the third party source repository.
    */
  var Name: typings.awsSdk.codegurureviewerMod.Name
  
  /**
    * The owner of the repository. For a GitHub, GitHub Enterprise, or Bitbucket repository, this is the username for the account that owns the repository. For an S3 repository, this can be the username or Amazon Web Services account ID 
    */
  var Owner: typings.awsSdk.codegurureviewerMod.Owner
}
object ThirdPartySourceRepository {
  
  inline def apply(ConnectionArn: ConnectionArn, Name: Name, Owner: Owner): ThirdPartySourceRepository = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Owner = Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThirdPartySourceRepository]
  }
  
  extension [Self <: ThirdPartySourceRepository](x: Self) {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
  }
}
