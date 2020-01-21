package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  /**
    * Details of the crawler when the node represents a crawler.
    */
  var CrawlerDetails: js.UndefOr[CrawlerNodeDetails] = js.native
  /**
    * Details of the Job when the node represents a Job.
    */
  var JobDetails: js.UndefOr[JobNodeDetails] = js.native
  /**
    * The name of the AWS Glue component represented by the node.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * Details of the Trigger when the node represents a Trigger.
    */
  var TriggerDetails: js.UndefOr[TriggerNodeDetails] = js.native
  /**
    * The type of AWS Glue component represented by the node.
    */
  var Type: js.UndefOr[NodeType] = js.native
  /**
    * The unique Id assigned to the node within the workflow.
    */
  var UniqueId: js.UndefOr[NameString] = js.native
}

object Node {
  @scala.inline
  def apply(
    CrawlerDetails: CrawlerNodeDetails = null,
    JobDetails: JobNodeDetails = null,
    Name: NameString = null,
    TriggerDetails: TriggerNodeDetails = null,
    Type: NodeType = null,
    UniqueId: NameString = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    if (CrawlerDetails != null) __obj.updateDynamic("CrawlerDetails")(CrawlerDetails.asInstanceOf[js.Any])
    if (JobDetails != null) __obj.updateDynamic("JobDetails")(JobDetails.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (TriggerDetails != null) __obj.updateDynamic("TriggerDetails")(TriggerDetails.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (UniqueId != null) __obj.updateDynamic("UniqueId")(UniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

