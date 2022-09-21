package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentRequest extends StObject {
  
  /**
    * An optional description of the experiment.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An array of structures that defines the metrics used for the experiment, and whether a higher or lower value for each metric is the goal.
    */
  var metricGoals: MetricGoalConfigList
  
  /**
    * A name for the new experiment.
    */
  var name: ExperimentName
  
  /**
    * A structure that contains the configuration of which variation to use as the "control" version. tThe "control" version is used for comparison with other variations. This structure also specifies how much experiment traffic is allocated to each variation.
    */
  var onlineAbConfig: js.UndefOr[OnlineAbConfig] = js.undefined
  
  /**
    * The name or ARN of the project that you want to create the new experiment in.
    */
  var project: ProjectRef
  
  /**
    * When Evidently assigns a particular user session to an experiment, it must use a randomization ID to determine which variation the user session is served. This randomization ID is a combination of the entity ID and randomizationSalt. If you omit randomizationSalt, Evidently uses the experiment name as the randomizationSalt.
    */
  var randomizationSalt: js.UndefOr[RandomizationSalt] = js.undefined
  
  /**
    * The portion of the available audience that you want to allocate to this experiment, in thousandths of a percent. The available audience is the total audience minus the audience that you have allocated to overrides or current launches of this feature. This is represented in thousandths of a percent. For example, specify 10,000 to allocate 10% of the available audience.
    */
  var samplingRate: js.UndefOr[SplitWeight] = js.undefined
  
  /**
    * Specifies an audience segment to use in the experiment. When a segment is used in an experiment, only user sessions that match the segment pattern are used in the experiment.
    */
  var segment: js.UndefOr[SegmentRef] = js.undefined
  
  /**
    * Assigns one or more tags (key-value pairs) to the experiment. Tags can help you organize and categorize your resources. You can also use them to scope user permissions by granting a user permission to access or change only resources with certain tag values. Tags don't have any semantic meaning to Amazon Web Services and are interpreted strictly as strings of characters.  &lt;p&gt;You can associate as many as 50 tags with an experiment.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href=&quot;https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html&quot;&gt;Tagging Amazon Web Services resources&lt;/a&gt;.&lt;/p&gt; 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * An array of structures that describe the configuration of each feature variation used in the experiment.
    */
  var treatments: TreatmentConfigList
}
object CreateExperimentRequest {
  
  inline def apply(
    metricGoals: MetricGoalConfigList,
    name: ExperimentName,
    project: ProjectRef,
    treatments: TreatmentConfigList
  ): CreateExperimentRequest = {
    val __obj = js.Dynamic.literal(metricGoals = metricGoals.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], treatments = treatments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentRequest]
  }
  
  extension [Self <: CreateExperimentRequest](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMetricGoals(value: MetricGoalConfigList): Self = StObject.set(x, "metricGoals", value.asInstanceOf[js.Any])
    
    inline def setMetricGoalsVarargs(value: MetricGoalConfig*): Self = StObject.set(x, "metricGoals", js.Array(value*))
    
    inline def setName(value: ExperimentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnlineAbConfig(value: OnlineAbConfig): Self = StObject.set(x, "onlineAbConfig", value.asInstanceOf[js.Any])
    
    inline def setOnlineAbConfigUndefined: Self = StObject.set(x, "onlineAbConfig", js.undefined)
    
    inline def setProject(value: ProjectRef): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSalt(value: RandomizationSalt): Self = StObject.set(x, "randomizationSalt", value.asInstanceOf[js.Any])
    
    inline def setRandomizationSaltUndefined: Self = StObject.set(x, "randomizationSalt", js.undefined)
    
    inline def setSamplingRate(value: SplitWeight): Self = StObject.set(x, "samplingRate", value.asInstanceOf[js.Any])
    
    inline def setSamplingRateUndefined: Self = StObject.set(x, "samplingRate", js.undefined)
    
    inline def setSegment(value: SegmentRef): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTreatments(value: TreatmentConfigList): Self = StObject.set(x, "treatments", value.asInstanceOf[js.Any])
    
    inline def setTreatmentsVarargs(value: TreatmentConfig*): Self = StObject.set(x, "treatments", js.Array(value*))
  }
}
