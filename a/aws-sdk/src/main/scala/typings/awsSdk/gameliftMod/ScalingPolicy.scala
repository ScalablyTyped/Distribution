package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalingPolicy extends js.Object {
  /**
    * Comparison operator to use when measuring a metric against the threshold value.
    */
  var ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.native
  /**
    * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
    */
  var EvaluationPeriods: js.UndefOr[PositiveInteger] = js.native
  /**
    * A unique identifier for a fleet that is associated with this scaling policy.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.native
  /**
    * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed descriptions of fleet metrics, see Monitor Amazon GameLift with Amazon CloudWatch.     ActivatingGameSessions -- Game sessions in the process of being created.    ActiveGameSessions -- Game sessions that are currently running.    ActiveInstances -- Fleet instances that are currently running at least one game session.    AvailableGameSessions -- Additional game sessions that fleet could host simultaneously, given current capacity.    AvailablePlayerSessions -- Empty player slots in currently active game sessions. This includes game sessions that are not currently accepting players. Reserved player slots are not included.    CurrentPlayerSessions -- Player slots in active game sessions that are being used by a player or are reserved for a player.     IdleInstances -- Active instances that are currently hosting zero game sessions.     PercentAvailableGameSessions -- Unused percentage of the total number of game sessions that a fleet could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.    PercentIdleInstances -- Percentage of the total number of active instances that are hosting zero game sessions.    QueueDepth -- Pending game session placement requests, in any queue, where the current fleet is the top-priority destination.    WaitTime -- Current wait time for pending game session placement requests, in any queue, where the current fleet is the top-priority destination.   
    */
  var MetricName: js.UndefOr[typings.awsSdk.gameliftMod.MetricName] = js.native
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * The type of scaling policy to create. For a target-based policy, set the parameter MetricName to 'PercentAvailableGameSessions' and specify a TargetConfiguration. For a rule-based policy set the following parameters: MetricName, ComparisonOperator, Threshold, EvaluationPeriods, ScalingAdjustmentType, and ScalingAdjustment.
    */
  var PolicyType: js.UndefOr[typings.awsSdk.gameliftMod.PolicyType] = js.native
  /**
    * Amount of adjustment to make, based on the scaling adjustment type.
    */
  var ScalingAdjustment: js.UndefOr[Integer] = js.native
  /**
    * The type of adjustment to make to a fleet's instance count (see FleetCapacity):    ChangeInCapacity -- add (or subtract) the scaling adjustment value from the current instance count. Positive values scale up while negative values scale down.    ExactCapacity -- set the instance count to the scaling adjustment value.    PercentChangeInCapacity -- increase or reduce the current instance count by the scaling adjustment, read as a percentage. Positive values scale up while negative values scale down.  
    */
  var ScalingAdjustmentType: js.UndefOr[typings.awsSdk.gameliftMod.ScalingAdjustmentType] = js.native
  /**
    * Current status of the scaling policy. The scaling policy can be in force only when in an ACTIVE status. Scaling policies can be suspended for individual fleets (see StopFleetActions; if suspended for a fleet, the policy status does not change. View a fleet's stopped actions by calling DescribeFleetCapacity.    ACTIVE -- The scaling policy can be used for auto-scaling a fleet.    UPDATE_REQUESTED -- A request to update the scaling policy has been received.    UPDATING -- A change is being made to the scaling policy.    DELETE_REQUESTED -- A request to delete the scaling policy has been received.    DELETING -- The scaling policy is being deleted.    DELETED -- The scaling policy has been deleted.    ERROR -- An error occurred in creating the policy. It should be removed and recreated.  
    */
  var Status: js.UndefOr[ScalingStatusType] = js.native
  /**
    * The settings for a target-based scaling policy.
    */
  var TargetConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.TargetConfiguration] = js.native
  /**
    * Metric value used to trigger a scaling event.
    */
  var Threshold: js.UndefOr[Double] = js.native
}

object ScalingPolicy {
  @scala.inline
  def apply(
    ComparisonOperator: ComparisonOperatorType = null,
    EvaluationPeriods: Int | scala.Double = null,
    FleetId: FleetId = null,
    MetricName: MetricName = null,
    Name: NonZeroAndMaxString = null,
    PolicyType: PolicyType = null,
    ScalingAdjustment: Int | scala.Double = null,
    ScalingAdjustmentType: ScalingAdjustmentType = null,
    Status: ScalingStatusType = null,
    TargetConfiguration: TargetConfiguration = null,
    Threshold: Int | scala.Double = null
  ): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (EvaluationPeriods != null) __obj.updateDynamic("EvaluationPeriods")(EvaluationPeriods.asInstanceOf[js.Any])
    if (FleetId != null) __obj.updateDynamic("FleetId")(FleetId.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (PolicyType != null) __obj.updateDynamic("PolicyType")(PolicyType.asInstanceOf[js.Any])
    if (ScalingAdjustment != null) __obj.updateDynamic("ScalingAdjustment")(ScalingAdjustment.asInstanceOf[js.Any])
    if (ScalingAdjustmentType != null) __obj.updateDynamic("ScalingAdjustmentType")(ScalingAdjustmentType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetConfiguration != null) __obj.updateDynamic("TargetConfiguration")(TargetConfiguration.asInstanceOf[js.Any])
    if (Threshold != null) __obj.updateDynamic("Threshold")(Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalingPolicy]
  }
}

