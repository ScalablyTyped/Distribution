package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationRevisionsResponse extends js.Object {
  /**
    * 
    Paginated results marker.
    
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * 
    List of ConfigurationRevision objects.
    
    */
  var Revisions: js.UndefOr[listOfConfigurationRevision] = js.native
}

object ListConfigurationRevisionsResponse {
  @scala.inline
  def apply(NextToken: string = null, Revisions: listOfConfigurationRevision = null): ListConfigurationRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Revisions != null) __obj.updateDynamic("Revisions")(Revisions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConfigurationRevisionsResponse]
  }
}

