package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutScalingPolicyInput extends StObject {
  
  /**
    * Comparison operator to use when measuring the metric against the threshold value.
    */
  var ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.undefined
  
  /**
    * Length of time (in minutes) the metric must be at or beyond the threshold before a scaling event is triggered.
    */
  var EvaluationPeriods: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * A unique identifier for a fleet to apply this policy to. You can use either the fleet ID or ARN value. The fleet cannot be in any of the following statuses: ERROR or DELETING.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * Name of the Amazon GameLift-defined metric that is used to trigger a scaling adjustment. For detailed descriptions of fleet metrics, see Monitor Amazon GameLift with Amazon CloudWatch.     ActivatingGameSessions -- Game sessions in the process of being created.    ActiveGameSessions -- Game sessions that are currently running.    ActiveInstances -- Fleet instances that are currently running at least one game session.    AvailableGameSessions -- Additional game sessions that fleet could host simultaneously, given current capacity.    AvailablePlayerSessions -- Empty player slots in currently active game sessions. This includes game sessions that are not currently accepting players. Reserved player slots are not included.    CurrentPlayerSessions -- Player slots in active game sessions that are being used by a player or are reserved for a player.     IdleInstances -- Active instances that are currently hosting zero game sessions.     PercentAvailableGameSessions -- Unused percentage of the total number of game sessions that a fleet could host simultaneously, given current capacity. Use this metric for a target-based scaling policy.    PercentIdleInstances -- Percentage of the total number of active instances that are hosting zero game sessions.    QueueDepth -- Pending game session placement requests, in any queue, where the current fleet is the top-priority destination.    WaitTime -- Current wait time for pending game session placement requests, in any queue, where the current fleet is the top-priority destination.   
    */
  var MetricName: typings.awsSdk.gameliftMod.MetricName
  
  /**
    * A descriptive label that is associated with a scaling policy. Policy names do not need to be unique. A fleet can have only one scaling policy with the same name.
    */
  var Name: NonZeroAndMaxString
  
  /**
    * The type of scaling policy to create. For a target-based policy, set the parameter MetricName to 'PercentAvailableGameSessions' and specify a TargetConfiguration. For a rule-based policy set the following parameters: MetricName, ComparisonOperator, Threshold, EvaluationPeriods, ScalingAdjustmentType, and ScalingAdjustment.
    */
  var PolicyType: js.UndefOr[typings.awsSdk.gameliftMod.PolicyType] = js.undefined
  
  /**
    * Amount of adjustment to make, based on the scaling adjustment type.
    */
  var ScalingAdjustment: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of adjustment to make to a fleet's instance count (see FleetCapacity):    ChangeInCapacity -- add (or subtract) the scaling adjustment value from the current instance count. Positive values scale up while negative values scale down.    ExactCapacity -- set the instance count to the scaling adjustment value.    PercentChangeInCapacity -- increase or reduce the current instance count by the scaling adjustment, read as a percentage. Positive values scale up while negative values scale down; for example, a value of "-10" scales the fleet down by 10%.  
    */
  var ScalingAdjustmentType: js.UndefOr[typings.awsSdk.gameliftMod.ScalingAdjustmentType] = js.undefined
  
  /**
    * The settings for a target-based scaling policy.
    */
  var TargetConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.TargetConfiguration] = js.undefined
  
  /**
    * Metric value used to trigger a scaling event.
    */
  var Threshold: js.UndefOr[Double] = js.undefined
}
object PutScalingPolicyInput {
  
  @scala.inline
  def apply(FleetId: FleetIdOrArn, MetricName: MetricName, Name: NonZeroAndMaxString): PutScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutScalingPolicyInput]
  }
  
  @scala.inline
  implicit class PutScalingPolicyInputMutableBuilder[Self <: PutScalingPolicyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComparisonOperator(value: ComparisonOperatorType): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    @scala.inline
    def setEvaluationPeriods(value: PositiveInteger): Self = StObject.set(x, "EvaluationPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationPeriodsUndefined: Self = StObject.set(x, "EvaluationPeriods", js.undefined)
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyType(value: PolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    @scala.inline
    def setScalingAdjustment(value: Integer): Self = StObject.set(x, "ScalingAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingAdjustmentType(value: ScalingAdjustmentType): Self = StObject.set(x, "ScalingAdjustmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingAdjustmentTypeUndefined: Self = StObject.set(x, "ScalingAdjustmentType", js.undefined)
    
    @scala.inline
    def setScalingAdjustmentUndefined: Self = StObject.set(x, "ScalingAdjustment", js.undefined)
    
    @scala.inline
    def setTargetConfiguration(value: TargetConfiguration): Self = StObject.set(x, "TargetConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetConfigurationUndefined: Self = StObject.set(x, "TargetConfiguration", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
  }
}
