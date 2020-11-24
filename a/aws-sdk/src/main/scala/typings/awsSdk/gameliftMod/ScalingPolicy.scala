package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ScalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingPolicy]
  }
  
  @scala.inline
  implicit class ScalingPolicyOps[Self <: ScalingPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperatorType): Self = this.set("ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonOperator: Self = this.set("ComparisonOperator", js.undefined)
    
    @scala.inline
    def setEvaluationPeriods(value: PositiveInteger): Self = this.set("EvaluationPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationPeriods: Self = this.set("EvaluationPeriods", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    
    @scala.inline
    def setMetricName(value: MetricName): Self = this.set("MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("MetricName", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setPolicyType(value: PolicyType): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
    
    @scala.inline
    def setScalingAdjustment(value: Integer): Self = this.set("ScalingAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingAdjustment: Self = this.set("ScalingAdjustment", js.undefined)
    
    @scala.inline
    def setScalingAdjustmentType(value: ScalingAdjustmentType): Self = this.set("ScalingAdjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingAdjustmentType: Self = this.set("ScalingAdjustmentType", js.undefined)
    
    @scala.inline
    def setStatus(value: ScalingStatusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTargetConfiguration(value: TargetConfiguration): Self = this.set("TargetConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetConfiguration: Self = this.set("TargetConfiguration", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("Threshold", js.undefined)
  }
}
