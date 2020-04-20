package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryCredentials extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret containing the private repository credentials.  When you are using the Amazon ECS API, AWS CLI, or AWS SDK, if the secret exists in the same Region as the task that you are launching then you can use either the full ARN or the name of the secret. When you are using the AWS Management Console, you must specify the full ARN of the secret. 
    */
  var credentialsParameter: String = js.native
}

object RepositoryCredentials {
  @scala.inline
  def apply(credentialsParameter: String): RepositoryCredentials = {
    val __obj = js.Dynamic.literal(credentialsParameter = credentialsParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryCredentials]
  }
}

