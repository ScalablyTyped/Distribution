package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetProfileRequest extends js.Object {
  /**
    *  The format of the returned profiling data. The format maps to the Accept and Content-Type headers of the HTTP request. You can specify one of the following: or the default .   &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/json&lt;/code&gt; — standard JSON format &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;application/x-amzn-ion&lt;/code&gt; — the Amazon Ion data format. For more information, see &lt;a href=&quot;http://amzn.github.io/ion-docs/&quot;&gt;Amazon Ion&lt;/a&gt;. &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; 
    */
  var accept: js.UndefOr[String] = js.native
  /**
    *  The end time of the requested profile. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.   If you specify endTime, then you must also specify period or startTime, but not both. 
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  /**
    *  The maximum depth of the stacks in the code that is represented in the aggregated profile. For example, if CodeGuru Profiler finds a method A, which calls method B, which calls method C, which calls method D, then the depth is 4. If the maxDepth is set to 2, then the aggregated profile contains representations of methods A and B. 
    */
  var maxDepth: js.UndefOr[MaxDepth] = js.native
  /**
    *  Used with startTime or endTime to specify the time range for the returned aggregated profile. Specify using the ISO 8601 format. For example, P1DT1H1M1S.   &lt;p&gt; To get the latest aggregated profile, specify only &lt;code&gt;period&lt;/code&gt;. &lt;/p&gt; 
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * The name of the profiling group to get.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * The start time of the profile to get. Specify using the ISO 8601 format. For example, 2020-06-01T13:15:02.001Z represents 1 millisecond past June 1, 2020 1:15:02 PM UTC.  &lt;p&gt; If you specify &lt;code&gt;startTime&lt;/code&gt;, then you must also specify &lt;code&gt;period&lt;/code&gt; or &lt;code&gt;endTime&lt;/code&gt;, but not both. &lt;/p&gt; 
    */
  var startTime: js.UndefOr[Timestamp] = js.native
}

object GetProfileRequest {
  @scala.inline
  def apply(
    profilingGroupName: ProfilingGroupName,
    accept: String = null,
    endTime: Timestamp = null,
    maxDepth: js.UndefOr[MaxDepth] = js.undefined,
    period: Period = null,
    startTime: Timestamp = null
  ): GetProfileRequest = {
    val __obj = js.Dynamic.literal(profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProfileRequest]
  }
}

