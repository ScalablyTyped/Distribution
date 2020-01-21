package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseLogEventsRequest extends js.Object {
  /**
    * The end of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use an end time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the end time.  
    */
  var endTime: js.UndefOr[IsoDate] = js.native
  /**
    * The name of the log stream. Use the get relational database log streams operation to get a list of available log streams.
    */
  var logStreamName: String = js.native
  /**
    * A token used for advancing to a specific page of results for your get relational database log events request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of your database for which to get log events.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * Parameter to specify if the log should start from head or tail. If true is specified, the log event starts from the head of the log. If false is specified, the log event starts from the tail of the log.  For PostgreSQL, the default value of false is the only option available. 
    */
  var startFromHead: js.UndefOr[Boolean] = js.native
  /**
    * The start of the time interval from which to get log events. Constraints:   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the start time.  
    */
  var startTime: js.UndefOr[IsoDate] = js.native
}

object GetRelationalDatabaseLogEventsRequest {
  @scala.inline
  def apply(
    logStreamName: String,
    relationalDatabaseName: ResourceName,
    endTime: IsoDate = null,
    pageToken: String = null,
    startFromHead: js.UndefOr[Boolean] = js.undefined,
    startTime: IsoDate = null
  ): GetRelationalDatabaseLogEventsRequest = {
    val __obj = js.Dynamic.literal(logStreamName = logStreamName.asInstanceOf[js.Any], relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(startFromHead)) __obj.updateDynamic("startFromHead")(startFromHead.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseLogEventsRequest]
  }
}

