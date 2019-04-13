package typings
package bpmnDashModdleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bpmnDashModdleLibStrings {
  @js.native
  sealed trait All
    extends bpmnDashModdleLib.bpmnDashModdleMod.MultiInstanceBehaviour
  
  @js.native
  sealed trait Backward
    extends bpmnDashModdleLib.bpmnDashModdleMod.RelationshipDirection
  
  @js.native
  sealed trait Both
    extends bpmnDashModdleLib.bpmnDashModdleMod.AssociationDirection
       with bpmnDashModdleLib.bpmnDashModdleMod.RelationshipDirection
  
  @js.native
  sealed trait Complex
    extends bpmnDashModdleLib.bpmnDashModdleMod.MultiInstanceBehaviour
  
  @js.native
  sealed trait Converging
    extends bpmnDashModdleLib.bpmnDashModdleMod.GatewayDirection
  
  @js.native
  sealed trait Diverging
    extends bpmnDashModdleLib.bpmnDashModdleMod.GatewayDirection
  
  @js.native
  sealed trait Exclusive
    extends bpmnDashModdleLib.bpmnDashModdleMod.EventBasedGatewayType
  
  @js.native
  sealed trait Forward
    extends bpmnDashModdleLib.bpmnDashModdleMod.RelationshipDirection
  
  @js.native
  sealed trait Information
    extends bpmnDashModdleLib.bpmnDashModdleMod.ItemKind
  
  @js.native
  sealed trait Mixed
    extends bpmnDashModdleLib.bpmnDashModdleMod.GatewayDirection
  
  @js.native
  sealed trait MultiInstanceParallel
    extends bpmnDashModdleLib.bpmnDashModdleMod.ChoreographyLoopType
  
  @js.native
  sealed trait MultiInstanceSequential
    extends bpmnDashModdleLib.bpmnDashModdleMod.ChoreographyLoopType
  
  @js.native
  sealed trait None
    extends bpmnDashModdleLib.bpmnDashModdleMod.AssociationDirection
       with bpmnDashModdleLib.bpmnDashModdleMod.ChoreographyLoopType
       with bpmnDashModdleLib.bpmnDashModdleMod.MultiInstanceBehaviour
       with bpmnDashModdleLib.bpmnDashModdleMod.ProcessType
       with bpmnDashModdleLib.bpmnDashModdleMod.RelationshipDirection
  
  @js.native
  sealed trait One
    extends bpmnDashModdleLib.bpmnDashModdleMod.AssociationDirection
       with bpmnDashModdleLib.bpmnDashModdleMod.MultiInstanceBehaviour
  
  @js.native
  sealed trait Parallel
    extends bpmnDashModdleLib.bpmnDashModdleMod.AdHocOrdering
       with bpmnDashModdleLib.bpmnDashModdleMod.EventBasedGatewayType
  
  @js.native
  sealed trait Physical
    extends bpmnDashModdleLib.bpmnDashModdleMod.ItemKind
  
  @js.native
  sealed trait Private
    extends bpmnDashModdleLib.bpmnDashModdleMod.ProcessType
  
  @js.native
  sealed trait Public
    extends bpmnDashModdleLib.bpmnDashModdleMod.ProcessType
  
  @js.native
  sealed trait Sequential
    extends bpmnDashModdleLib.bpmnDashModdleMod.AdHocOrdering
  
  @js.native
  sealed trait Standard
    extends bpmnDashModdleLib.bpmnDashModdleMod.ChoreographyLoopType
  
  @js.native
  sealed trait Unspecified
    extends bpmnDashModdleLib.bpmnDashModdleMod.GatewayDirection
  
  @js.native
  sealed trait `bioc:ColoredEdge`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bioc:ColoredShape`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Activity`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:AdHocSubProcess`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Artifact`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Assignment`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Association`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Auditing`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:BaseElement`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:BoundaryEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:BusinessRuleTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CallActivity`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CallChoreography`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CallConversation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CallableElement`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CancelEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CatchEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Category`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CategoryValue`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Choreography`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ChoreographyActivity`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ChoreographyTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Collaboration`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CompensateEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ComplexBehaviorDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ComplexGateway`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ConditionalEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Conversation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ConversationAssociation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ConversationLink`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ConversationNode`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CorrelationKey`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CorrelationProperty`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CorrelationPropertyBinding`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CorrelationPropertyRetrievalExpression`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:CorrelationSubscription`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataAssociation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataInput`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataInputAssociation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataObject`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataObjectReference`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataOutput`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataOutputAssociation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataState`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataStore`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:DataStoreReference`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Definitions`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Documentation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:EndEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:EndPoint`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Error`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ErrorEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Escalation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:EscalationEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Event`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:EventBasedGateway`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:EventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ExclusiveGateway`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Expression`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Extension`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ExtensionAttributeDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ExtensionDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ExtensionElements`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:FlowElement`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:FlowElementsContainer`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:FlowNode`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:FormalExpression`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Gateway`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:GlobalBusinessRuleTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:GlobalChoreographyTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:GlobalConversation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:GlobalManualTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:GlobalScriptTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:GlobalTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:GlobalUserTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Group`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:HumanPerformer`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ImplicitThrowEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Import`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:InclusiveGateway`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:InputOutputBinding`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:InputOutputSpecification`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:InputSet`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:InteractionNode`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Interface`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:IntermediateCatchEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:IntermediateThrowEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ItemAwareElement`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ItemDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Lane`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:LaneSet`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:LinkEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:LoopCharacteristics`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ManualTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Message`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:MessageEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:MessageFlow`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:MessageFlowAssociation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Monitoring`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:MultiInstanceLoopCharacteristics`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Operation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:OutputSet`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ParallelGateway`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Participant`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ParticipantAssociation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ParticipantMultiplicity`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:PartnerEntity`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:PartnerRole`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Performer`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:PotentialOwner`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Process`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Property`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ReceiveTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Relationship`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Rendering`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Resource`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ResourceAssignmentExpression`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ResourceParameter`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ResourceParameterBinding`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ResourceRole`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:RootElement`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ScriptTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:SendTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:SequenceFlow`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ServiceTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Signal`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:SignalEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:StandardLoopCharacteristics`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:StartEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:SubChoreography`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:SubConversation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:SubProcess`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Task`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:TerminateEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:TextAnnotation`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:ThrowEvent`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:TimerEventDefinition`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:Transaction`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmn:UserTask`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmndi:BPMNDiagram`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmndi:BPMNEdge`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmndi:BPMNLabel`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmndi:BPMNLabelStyle`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmndi:BPMNPlane`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `bpmndi:BPMNShape`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `dc:Bounds`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `dc:Font`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `dc:Point`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `dc:Real`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `dc:boolean`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `dc:number`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `dc:string`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Diagram`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:DiagramElement`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Edge`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Extension`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Label`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:LabeledEdge`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:LabeledShape`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Node`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Plane`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Shape`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @js.native
  sealed trait `di:Style`
    extends bpmnDashModdleLib.bpmnDashModdleMod.ElementType
  
  @scala.inline
  def All: All = "All".asInstanceOf[All]
  @scala.inline
  def Backward: Backward = "Backward".asInstanceOf[Backward]
  @scala.inline
  def Both: Both = "Both".asInstanceOf[Both]
  @scala.inline
  def Complex: Complex = "Complex".asInstanceOf[Complex]
  @scala.inline
  def Converging: Converging = "Converging".asInstanceOf[Converging]
  @scala.inline
  def Diverging: Diverging = "Diverging".asInstanceOf[Diverging]
  @scala.inline
  def Exclusive: Exclusive = "Exclusive".asInstanceOf[Exclusive]
  @scala.inline
  def Forward: Forward = "Forward".asInstanceOf[Forward]
  @scala.inline
  def Information: Information = "Information".asInstanceOf[Information]
  @scala.inline
  def Mixed: Mixed = "Mixed".asInstanceOf[Mixed]
  @scala.inline
  def MultiInstanceParallel: MultiInstanceParallel = "MultiInstanceParallel".asInstanceOf[MultiInstanceParallel]
  @scala.inline
  def MultiInstanceSequential: MultiInstanceSequential = "MultiInstanceSequential".asInstanceOf[MultiInstanceSequential]
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  @scala.inline
  def One: One = "One".asInstanceOf[One]
  @scala.inline
  def Parallel: Parallel = "Parallel".asInstanceOf[Parallel]
  @scala.inline
  def Physical: Physical = "Physical".asInstanceOf[Physical]
  @scala.inline
  def Private: Private = "Private".asInstanceOf[Private]
  @scala.inline
  def Public: Public = "Public".asInstanceOf[Public]
  @scala.inline
  def Sequential: Sequential = "Sequential".asInstanceOf[Sequential]
  @scala.inline
  def Standard: Standard = "Standard".asInstanceOf[Standard]
  @scala.inline
  def Unspecified: Unspecified = "Unspecified".asInstanceOf[Unspecified]
  @scala.inline
  def `bioc:ColoredEdge`: `bioc:ColoredEdge` = "bioc:ColoredEdge".asInstanceOf[`bioc:ColoredEdge`]
  @scala.inline
  def `bioc:ColoredShape`: `bioc:ColoredShape` = "bioc:ColoredShape".asInstanceOf[`bioc:ColoredShape`]
  @scala.inline
  def `bpmn:Activity`: `bpmn:Activity` = "bpmn:Activity".asInstanceOf[`bpmn:Activity`]
  @scala.inline
  def `bpmn:AdHocSubProcess`: `bpmn:AdHocSubProcess` = "bpmn:AdHocSubProcess".asInstanceOf[`bpmn:AdHocSubProcess`]
  @scala.inline
  def `bpmn:Artifact`: `bpmn:Artifact` = "bpmn:Artifact".asInstanceOf[`bpmn:Artifact`]
  @scala.inline
  def `bpmn:Assignment`: `bpmn:Assignment` = "bpmn:Assignment".asInstanceOf[`bpmn:Assignment`]
  @scala.inline
  def `bpmn:Association`: `bpmn:Association` = "bpmn:Association".asInstanceOf[`bpmn:Association`]
  @scala.inline
  def `bpmn:Auditing`: `bpmn:Auditing` = "bpmn:Auditing".asInstanceOf[`bpmn:Auditing`]
  @scala.inline
  def `bpmn:BaseElement`: `bpmn:BaseElement` = "bpmn:BaseElement".asInstanceOf[`bpmn:BaseElement`]
  @scala.inline
  def `bpmn:BoundaryEvent`: `bpmn:BoundaryEvent` = "bpmn:BoundaryEvent".asInstanceOf[`bpmn:BoundaryEvent`]
  @scala.inline
  def `bpmn:BusinessRuleTask`: `bpmn:BusinessRuleTask` = "bpmn:BusinessRuleTask".asInstanceOf[`bpmn:BusinessRuleTask`]
  @scala.inline
  def `bpmn:CallActivity`: `bpmn:CallActivity` = "bpmn:CallActivity".asInstanceOf[`bpmn:CallActivity`]
  @scala.inline
  def `bpmn:CallChoreography`: `bpmn:CallChoreography` = "bpmn:CallChoreography".asInstanceOf[`bpmn:CallChoreography`]
  @scala.inline
  def `bpmn:CallConversation`: `bpmn:CallConversation` = "bpmn:CallConversation".asInstanceOf[`bpmn:CallConversation`]
  @scala.inline
  def `bpmn:CallableElement`: `bpmn:CallableElement` = "bpmn:CallableElement".asInstanceOf[`bpmn:CallableElement`]
  @scala.inline
  def `bpmn:CancelEventDefinition`: `bpmn:CancelEventDefinition` = "bpmn:CancelEventDefinition".asInstanceOf[`bpmn:CancelEventDefinition`]
  @scala.inline
  def `bpmn:CatchEvent`: `bpmn:CatchEvent` = "bpmn:CatchEvent".asInstanceOf[`bpmn:CatchEvent`]
  @scala.inline
  def `bpmn:Category`: `bpmn:Category` = "bpmn:Category".asInstanceOf[`bpmn:Category`]
  @scala.inline
  def `bpmn:CategoryValue`: `bpmn:CategoryValue` = "bpmn:CategoryValue".asInstanceOf[`bpmn:CategoryValue`]
  @scala.inline
  def `bpmn:Choreography`: `bpmn:Choreography` = "bpmn:Choreography".asInstanceOf[`bpmn:Choreography`]
  @scala.inline
  def `bpmn:ChoreographyActivity`: `bpmn:ChoreographyActivity` = "bpmn:ChoreographyActivity".asInstanceOf[`bpmn:ChoreographyActivity`]
  @scala.inline
  def `bpmn:ChoreographyTask`: `bpmn:ChoreographyTask` = "bpmn:ChoreographyTask".asInstanceOf[`bpmn:ChoreographyTask`]
  @scala.inline
  def `bpmn:Collaboration`: `bpmn:Collaboration` = "bpmn:Collaboration".asInstanceOf[`bpmn:Collaboration`]
  @scala.inline
  def `bpmn:CompensateEventDefinition`: `bpmn:CompensateEventDefinition` = "bpmn:CompensateEventDefinition".asInstanceOf[`bpmn:CompensateEventDefinition`]
  @scala.inline
  def `bpmn:ComplexBehaviorDefinition`: `bpmn:ComplexBehaviorDefinition` = "bpmn:ComplexBehaviorDefinition".asInstanceOf[`bpmn:ComplexBehaviorDefinition`]
  @scala.inline
  def `bpmn:ComplexGateway`: `bpmn:ComplexGateway` = "bpmn:ComplexGateway".asInstanceOf[`bpmn:ComplexGateway`]
  @scala.inline
  def `bpmn:ConditionalEventDefinition`: `bpmn:ConditionalEventDefinition` = "bpmn:ConditionalEventDefinition".asInstanceOf[`bpmn:ConditionalEventDefinition`]
  @scala.inline
  def `bpmn:Conversation`: `bpmn:Conversation` = "bpmn:Conversation".asInstanceOf[`bpmn:Conversation`]
  @scala.inline
  def `bpmn:ConversationAssociation`: `bpmn:ConversationAssociation` = "bpmn:ConversationAssociation".asInstanceOf[`bpmn:ConversationAssociation`]
  @scala.inline
  def `bpmn:ConversationLink`: `bpmn:ConversationLink` = "bpmn:ConversationLink".asInstanceOf[`bpmn:ConversationLink`]
  @scala.inline
  def `bpmn:ConversationNode`: `bpmn:ConversationNode` = "bpmn:ConversationNode".asInstanceOf[`bpmn:ConversationNode`]
  @scala.inline
  def `bpmn:CorrelationKey`: `bpmn:CorrelationKey` = "bpmn:CorrelationKey".asInstanceOf[`bpmn:CorrelationKey`]
  @scala.inline
  def `bpmn:CorrelationProperty`: `bpmn:CorrelationProperty` = "bpmn:CorrelationProperty".asInstanceOf[`bpmn:CorrelationProperty`]
  @scala.inline
  def `bpmn:CorrelationPropertyBinding`: `bpmn:CorrelationPropertyBinding` = "bpmn:CorrelationPropertyBinding".asInstanceOf[`bpmn:CorrelationPropertyBinding`]
  @scala.inline
  def `bpmn:CorrelationPropertyRetrievalExpression`: `bpmn:CorrelationPropertyRetrievalExpression` = "bpmn:CorrelationPropertyRetrievalExpression".asInstanceOf[`bpmn:CorrelationPropertyRetrievalExpression`]
  @scala.inline
  def `bpmn:CorrelationSubscription`: `bpmn:CorrelationSubscription` = "bpmn:CorrelationSubscription".asInstanceOf[`bpmn:CorrelationSubscription`]
  @scala.inline
  def `bpmn:DataAssociation`: `bpmn:DataAssociation` = "bpmn:DataAssociation".asInstanceOf[`bpmn:DataAssociation`]
  @scala.inline
  def `bpmn:DataInput`: `bpmn:DataInput` = "bpmn:DataInput".asInstanceOf[`bpmn:DataInput`]
  @scala.inline
  def `bpmn:DataInputAssociation`: `bpmn:DataInputAssociation` = "bpmn:DataInputAssociation".asInstanceOf[`bpmn:DataInputAssociation`]
  @scala.inline
  def `bpmn:DataObject`: `bpmn:DataObject` = "bpmn:DataObject".asInstanceOf[`bpmn:DataObject`]
  @scala.inline
  def `bpmn:DataObjectReference`: `bpmn:DataObjectReference` = "bpmn:DataObjectReference".asInstanceOf[`bpmn:DataObjectReference`]
  @scala.inline
  def `bpmn:DataOutput`: `bpmn:DataOutput` = "bpmn:DataOutput".asInstanceOf[`bpmn:DataOutput`]
  @scala.inline
  def `bpmn:DataOutputAssociation`: `bpmn:DataOutputAssociation` = "bpmn:DataOutputAssociation".asInstanceOf[`bpmn:DataOutputAssociation`]
  @scala.inline
  def `bpmn:DataState`: `bpmn:DataState` = "bpmn:DataState".asInstanceOf[`bpmn:DataState`]
  @scala.inline
  def `bpmn:DataStore`: `bpmn:DataStore` = "bpmn:DataStore".asInstanceOf[`bpmn:DataStore`]
  @scala.inline
  def `bpmn:DataStoreReference`: `bpmn:DataStoreReference` = "bpmn:DataStoreReference".asInstanceOf[`bpmn:DataStoreReference`]
  @scala.inline
  def `bpmn:Definitions`: `bpmn:Definitions` = "bpmn:Definitions".asInstanceOf[`bpmn:Definitions`]
  @scala.inline
  def `bpmn:Documentation`: `bpmn:Documentation` = "bpmn:Documentation".asInstanceOf[`bpmn:Documentation`]
  @scala.inline
  def `bpmn:EndEvent`: `bpmn:EndEvent` = "bpmn:EndEvent".asInstanceOf[`bpmn:EndEvent`]
  @scala.inline
  def `bpmn:EndPoint`: `bpmn:EndPoint` = "bpmn:EndPoint".asInstanceOf[`bpmn:EndPoint`]
  @scala.inline
  def `bpmn:Error`: `bpmn:Error` = "bpmn:Error".asInstanceOf[`bpmn:Error`]
  @scala.inline
  def `bpmn:ErrorEventDefinition`: `bpmn:ErrorEventDefinition` = "bpmn:ErrorEventDefinition".asInstanceOf[`bpmn:ErrorEventDefinition`]
  @scala.inline
  def `bpmn:Escalation`: `bpmn:Escalation` = "bpmn:Escalation".asInstanceOf[`bpmn:Escalation`]
  @scala.inline
  def `bpmn:EscalationEventDefinition`: `bpmn:EscalationEventDefinition` = "bpmn:EscalationEventDefinition".asInstanceOf[`bpmn:EscalationEventDefinition`]
  @scala.inline
  def `bpmn:Event`: `bpmn:Event` = "bpmn:Event".asInstanceOf[`bpmn:Event`]
  @scala.inline
  def `bpmn:EventBasedGateway`: `bpmn:EventBasedGateway` = "bpmn:EventBasedGateway".asInstanceOf[`bpmn:EventBasedGateway`]
  @scala.inline
  def `bpmn:EventDefinition`: `bpmn:EventDefinition` = "bpmn:EventDefinition".asInstanceOf[`bpmn:EventDefinition`]
  @scala.inline
  def `bpmn:ExclusiveGateway`: `bpmn:ExclusiveGateway` = "bpmn:ExclusiveGateway".asInstanceOf[`bpmn:ExclusiveGateway`]
  @scala.inline
  def `bpmn:Expression`: `bpmn:Expression` = "bpmn:Expression".asInstanceOf[`bpmn:Expression`]
  @scala.inline
  def `bpmn:Extension`: `bpmn:Extension` = "bpmn:Extension".asInstanceOf[`bpmn:Extension`]
  @scala.inline
  def `bpmn:ExtensionAttributeDefinition`: `bpmn:ExtensionAttributeDefinition` = "bpmn:ExtensionAttributeDefinition".asInstanceOf[`bpmn:ExtensionAttributeDefinition`]
  @scala.inline
  def `bpmn:ExtensionDefinition`: `bpmn:ExtensionDefinition` = "bpmn:ExtensionDefinition".asInstanceOf[`bpmn:ExtensionDefinition`]
  @scala.inline
  def `bpmn:ExtensionElements`: `bpmn:ExtensionElements` = "bpmn:ExtensionElements".asInstanceOf[`bpmn:ExtensionElements`]
  @scala.inline
  def `bpmn:FlowElement`: `bpmn:FlowElement` = "bpmn:FlowElement".asInstanceOf[`bpmn:FlowElement`]
  @scala.inline
  def `bpmn:FlowElementsContainer`: `bpmn:FlowElementsContainer` = "bpmn:FlowElementsContainer".asInstanceOf[`bpmn:FlowElementsContainer`]
  @scala.inline
  def `bpmn:FlowNode`: `bpmn:FlowNode` = "bpmn:FlowNode".asInstanceOf[`bpmn:FlowNode`]
  @scala.inline
  def `bpmn:FormalExpression`: `bpmn:FormalExpression` = "bpmn:FormalExpression".asInstanceOf[`bpmn:FormalExpression`]
  @scala.inline
  def `bpmn:Gateway`: `bpmn:Gateway` = "bpmn:Gateway".asInstanceOf[`bpmn:Gateway`]
  @scala.inline
  def `bpmn:GlobalBusinessRuleTask`: `bpmn:GlobalBusinessRuleTask` = "bpmn:GlobalBusinessRuleTask".asInstanceOf[`bpmn:GlobalBusinessRuleTask`]
  @scala.inline
  def `bpmn:GlobalChoreographyTask`: `bpmn:GlobalChoreographyTask` = "bpmn:GlobalChoreographyTask".asInstanceOf[`bpmn:GlobalChoreographyTask`]
  @scala.inline
  def `bpmn:GlobalConversation`: `bpmn:GlobalConversation` = "bpmn:GlobalConversation".asInstanceOf[`bpmn:GlobalConversation`]
  @scala.inline
  def `bpmn:GlobalManualTask`: `bpmn:GlobalManualTask` = "bpmn:GlobalManualTask".asInstanceOf[`bpmn:GlobalManualTask`]
  @scala.inline
  def `bpmn:GlobalScriptTask`: `bpmn:GlobalScriptTask` = "bpmn:GlobalScriptTask".asInstanceOf[`bpmn:GlobalScriptTask`]
  @scala.inline
  def `bpmn:GlobalTask`: `bpmn:GlobalTask` = "bpmn:GlobalTask".asInstanceOf[`bpmn:GlobalTask`]
  @scala.inline
  def `bpmn:GlobalUserTask`: `bpmn:GlobalUserTask` = "bpmn:GlobalUserTask".asInstanceOf[`bpmn:GlobalUserTask`]
  @scala.inline
  def `bpmn:Group`: `bpmn:Group` = "bpmn:Group".asInstanceOf[`bpmn:Group`]
  @scala.inline
  def `bpmn:HumanPerformer`: `bpmn:HumanPerformer` = "bpmn:HumanPerformer".asInstanceOf[`bpmn:HumanPerformer`]
  @scala.inline
  def `bpmn:ImplicitThrowEvent`: `bpmn:ImplicitThrowEvent` = "bpmn:ImplicitThrowEvent".asInstanceOf[`bpmn:ImplicitThrowEvent`]
  @scala.inline
  def `bpmn:Import`: `bpmn:Import` = "bpmn:Import".asInstanceOf[`bpmn:Import`]
  @scala.inline
  def `bpmn:InclusiveGateway`: `bpmn:InclusiveGateway` = "bpmn:InclusiveGateway".asInstanceOf[`bpmn:InclusiveGateway`]
  @scala.inline
  def `bpmn:InputOutputBinding`: `bpmn:InputOutputBinding` = "bpmn:InputOutputBinding".asInstanceOf[`bpmn:InputOutputBinding`]
  @scala.inline
  def `bpmn:InputOutputSpecification`: `bpmn:InputOutputSpecification` = "bpmn:InputOutputSpecification".asInstanceOf[`bpmn:InputOutputSpecification`]
  @scala.inline
  def `bpmn:InputSet`: `bpmn:InputSet` = "bpmn:InputSet".asInstanceOf[`bpmn:InputSet`]
  @scala.inline
  def `bpmn:InteractionNode`: `bpmn:InteractionNode` = "bpmn:InteractionNode".asInstanceOf[`bpmn:InteractionNode`]
  @scala.inline
  def `bpmn:Interface`: `bpmn:Interface` = "bpmn:Interface".asInstanceOf[`bpmn:Interface`]
  @scala.inline
  def `bpmn:IntermediateCatchEvent`: `bpmn:IntermediateCatchEvent` = "bpmn:IntermediateCatchEvent".asInstanceOf[`bpmn:IntermediateCatchEvent`]
  @scala.inline
  def `bpmn:IntermediateThrowEvent`: `bpmn:IntermediateThrowEvent` = "bpmn:IntermediateThrowEvent".asInstanceOf[`bpmn:IntermediateThrowEvent`]
  @scala.inline
  def `bpmn:ItemAwareElement`: `bpmn:ItemAwareElement` = "bpmn:ItemAwareElement".asInstanceOf[`bpmn:ItemAwareElement`]
  @scala.inline
  def `bpmn:ItemDefinition`: `bpmn:ItemDefinition` = "bpmn:ItemDefinition".asInstanceOf[`bpmn:ItemDefinition`]
  @scala.inline
  def `bpmn:Lane`: `bpmn:Lane` = "bpmn:Lane".asInstanceOf[`bpmn:Lane`]
  @scala.inline
  def `bpmn:LaneSet`: `bpmn:LaneSet` = "bpmn:LaneSet".asInstanceOf[`bpmn:LaneSet`]
  @scala.inline
  def `bpmn:LinkEventDefinition`: `bpmn:LinkEventDefinition` = "bpmn:LinkEventDefinition".asInstanceOf[`bpmn:LinkEventDefinition`]
  @scala.inline
  def `bpmn:LoopCharacteristics`: `bpmn:LoopCharacteristics` = "bpmn:LoopCharacteristics".asInstanceOf[`bpmn:LoopCharacteristics`]
  @scala.inline
  def `bpmn:ManualTask`: `bpmn:ManualTask` = "bpmn:ManualTask".asInstanceOf[`bpmn:ManualTask`]
  @scala.inline
  def `bpmn:Message`: `bpmn:Message` = "bpmn:Message".asInstanceOf[`bpmn:Message`]
  @scala.inline
  def `bpmn:MessageEventDefinition`: `bpmn:MessageEventDefinition` = "bpmn:MessageEventDefinition".asInstanceOf[`bpmn:MessageEventDefinition`]
  @scala.inline
  def `bpmn:MessageFlow`: `bpmn:MessageFlow` = "bpmn:MessageFlow".asInstanceOf[`bpmn:MessageFlow`]
  @scala.inline
  def `bpmn:MessageFlowAssociation`: `bpmn:MessageFlowAssociation` = "bpmn:MessageFlowAssociation".asInstanceOf[`bpmn:MessageFlowAssociation`]
  @scala.inline
  def `bpmn:Monitoring`: `bpmn:Monitoring` = "bpmn:Monitoring".asInstanceOf[`bpmn:Monitoring`]
  @scala.inline
  def `bpmn:MultiInstanceLoopCharacteristics`: `bpmn:MultiInstanceLoopCharacteristics` = "bpmn:MultiInstanceLoopCharacteristics".asInstanceOf[`bpmn:MultiInstanceLoopCharacteristics`]
  @scala.inline
  def `bpmn:Operation`: `bpmn:Operation` = "bpmn:Operation".asInstanceOf[`bpmn:Operation`]
  @scala.inline
  def `bpmn:OutputSet`: `bpmn:OutputSet` = "bpmn:OutputSet".asInstanceOf[`bpmn:OutputSet`]
  @scala.inline
  def `bpmn:ParallelGateway`: `bpmn:ParallelGateway` = "bpmn:ParallelGateway".asInstanceOf[`bpmn:ParallelGateway`]
  @scala.inline
  def `bpmn:Participant`: `bpmn:Participant` = "bpmn:Participant".asInstanceOf[`bpmn:Participant`]
  @scala.inline
  def `bpmn:ParticipantAssociation`: `bpmn:ParticipantAssociation` = "bpmn:ParticipantAssociation".asInstanceOf[`bpmn:ParticipantAssociation`]
  @scala.inline
  def `bpmn:ParticipantMultiplicity`: `bpmn:ParticipantMultiplicity` = "bpmn:ParticipantMultiplicity".asInstanceOf[`bpmn:ParticipantMultiplicity`]
  @scala.inline
  def `bpmn:PartnerEntity`: `bpmn:PartnerEntity` = "bpmn:PartnerEntity".asInstanceOf[`bpmn:PartnerEntity`]
  @scala.inline
  def `bpmn:PartnerRole`: `bpmn:PartnerRole` = "bpmn:PartnerRole".asInstanceOf[`bpmn:PartnerRole`]
  @scala.inline
  def `bpmn:Performer`: `bpmn:Performer` = "bpmn:Performer".asInstanceOf[`bpmn:Performer`]
  @scala.inline
  def `bpmn:PotentialOwner`: `bpmn:PotentialOwner` = "bpmn:PotentialOwner".asInstanceOf[`bpmn:PotentialOwner`]
  @scala.inline
  def `bpmn:Process`: `bpmn:Process` = "bpmn:Process".asInstanceOf[`bpmn:Process`]
  @scala.inline
  def `bpmn:Property`: `bpmn:Property` = "bpmn:Property".asInstanceOf[`bpmn:Property`]
  @scala.inline
  def `bpmn:ReceiveTask`: `bpmn:ReceiveTask` = "bpmn:ReceiveTask".asInstanceOf[`bpmn:ReceiveTask`]
  @scala.inline
  def `bpmn:Relationship`: `bpmn:Relationship` = "bpmn:Relationship".asInstanceOf[`bpmn:Relationship`]
  @scala.inline
  def `bpmn:Rendering`: `bpmn:Rendering` = "bpmn:Rendering".asInstanceOf[`bpmn:Rendering`]
  @scala.inline
  def `bpmn:Resource`: `bpmn:Resource` = "bpmn:Resource".asInstanceOf[`bpmn:Resource`]
  @scala.inline
  def `bpmn:ResourceAssignmentExpression`: `bpmn:ResourceAssignmentExpression` = "bpmn:ResourceAssignmentExpression".asInstanceOf[`bpmn:ResourceAssignmentExpression`]
  @scala.inline
  def `bpmn:ResourceParameter`: `bpmn:ResourceParameter` = "bpmn:ResourceParameter".asInstanceOf[`bpmn:ResourceParameter`]
  @scala.inline
  def `bpmn:ResourceParameterBinding`: `bpmn:ResourceParameterBinding` = "bpmn:ResourceParameterBinding".asInstanceOf[`bpmn:ResourceParameterBinding`]
  @scala.inline
  def `bpmn:ResourceRole`: `bpmn:ResourceRole` = "bpmn:ResourceRole".asInstanceOf[`bpmn:ResourceRole`]
  @scala.inline
  def `bpmn:RootElement`: `bpmn:RootElement` = "bpmn:RootElement".asInstanceOf[`bpmn:RootElement`]
  @scala.inline
  def `bpmn:ScriptTask`: `bpmn:ScriptTask` = "bpmn:ScriptTask".asInstanceOf[`bpmn:ScriptTask`]
  @scala.inline
  def `bpmn:SendTask`: `bpmn:SendTask` = "bpmn:SendTask".asInstanceOf[`bpmn:SendTask`]
  @scala.inline
  def `bpmn:SequenceFlow`: `bpmn:SequenceFlow` = "bpmn:SequenceFlow".asInstanceOf[`bpmn:SequenceFlow`]
  @scala.inline
  def `bpmn:ServiceTask`: `bpmn:ServiceTask` = "bpmn:ServiceTask".asInstanceOf[`bpmn:ServiceTask`]
  @scala.inline
  def `bpmn:Signal`: `bpmn:Signal` = "bpmn:Signal".asInstanceOf[`bpmn:Signal`]
  @scala.inline
  def `bpmn:SignalEventDefinition`: `bpmn:SignalEventDefinition` = "bpmn:SignalEventDefinition".asInstanceOf[`bpmn:SignalEventDefinition`]
  @scala.inline
  def `bpmn:StandardLoopCharacteristics`: `bpmn:StandardLoopCharacteristics` = "bpmn:StandardLoopCharacteristics".asInstanceOf[`bpmn:StandardLoopCharacteristics`]
  @scala.inline
  def `bpmn:StartEvent`: `bpmn:StartEvent` = "bpmn:StartEvent".asInstanceOf[`bpmn:StartEvent`]
  @scala.inline
  def `bpmn:SubChoreography`: `bpmn:SubChoreography` = "bpmn:SubChoreography".asInstanceOf[`bpmn:SubChoreography`]
  @scala.inline
  def `bpmn:SubConversation`: `bpmn:SubConversation` = "bpmn:SubConversation".asInstanceOf[`bpmn:SubConversation`]
  @scala.inline
  def `bpmn:SubProcess`: `bpmn:SubProcess` = "bpmn:SubProcess".asInstanceOf[`bpmn:SubProcess`]
  @scala.inline
  def `bpmn:Task`: `bpmn:Task` = "bpmn:Task".asInstanceOf[`bpmn:Task`]
  @scala.inline
  def `bpmn:TerminateEventDefinition`: `bpmn:TerminateEventDefinition` = "bpmn:TerminateEventDefinition".asInstanceOf[`bpmn:TerminateEventDefinition`]
  @scala.inline
  def `bpmn:TextAnnotation`: `bpmn:TextAnnotation` = "bpmn:TextAnnotation".asInstanceOf[`bpmn:TextAnnotation`]
  @scala.inline
  def `bpmn:ThrowEvent`: `bpmn:ThrowEvent` = "bpmn:ThrowEvent".asInstanceOf[`bpmn:ThrowEvent`]
  @scala.inline
  def `bpmn:TimerEventDefinition`: `bpmn:TimerEventDefinition` = "bpmn:TimerEventDefinition".asInstanceOf[`bpmn:TimerEventDefinition`]
  @scala.inline
  def `bpmn:Transaction`: `bpmn:Transaction` = "bpmn:Transaction".asInstanceOf[`bpmn:Transaction`]
  @scala.inline
  def `bpmn:UserTask`: `bpmn:UserTask` = "bpmn:UserTask".asInstanceOf[`bpmn:UserTask`]
  @scala.inline
  def `bpmndi:BPMNDiagram`: `bpmndi:BPMNDiagram` = "bpmndi:BPMNDiagram".asInstanceOf[`bpmndi:BPMNDiagram`]
  @scala.inline
  def `bpmndi:BPMNEdge`: `bpmndi:BPMNEdge` = "bpmndi:BPMNEdge".asInstanceOf[`bpmndi:BPMNEdge`]
  @scala.inline
  def `bpmndi:BPMNLabel`: `bpmndi:BPMNLabel` = "bpmndi:BPMNLabel".asInstanceOf[`bpmndi:BPMNLabel`]
  @scala.inline
  def `bpmndi:BPMNLabelStyle`: `bpmndi:BPMNLabelStyle` = "bpmndi:BPMNLabelStyle".asInstanceOf[`bpmndi:BPMNLabelStyle`]
  @scala.inline
  def `bpmndi:BPMNPlane`: `bpmndi:BPMNPlane` = "bpmndi:BPMNPlane".asInstanceOf[`bpmndi:BPMNPlane`]
  @scala.inline
  def `bpmndi:BPMNShape`: `bpmndi:BPMNShape` = "bpmndi:BPMNShape".asInstanceOf[`bpmndi:BPMNShape`]
  @scala.inline
  def `dc:Bounds`: `dc:Bounds` = "dc:Bounds".asInstanceOf[`dc:Bounds`]
  @scala.inline
  def `dc:Font`: `dc:Font` = "dc:Font".asInstanceOf[`dc:Font`]
  @scala.inline
  def `dc:Point`: `dc:Point` = "dc:Point".asInstanceOf[`dc:Point`]
  @scala.inline
  def `dc:Real`: `dc:Real` = "dc:Real".asInstanceOf[`dc:Real`]
  @scala.inline
  def `dc:boolean`: `dc:boolean` = "dc:boolean".asInstanceOf[`dc:boolean`]
  @scala.inline
  def `dc:number`: `dc:number` = "dc:number".asInstanceOf[`dc:number`]
  @scala.inline
  def `dc:string`: `dc:string` = "dc:string".asInstanceOf[`dc:string`]
  @scala.inline
  def `di:Diagram`: `di:Diagram` = "di:Diagram".asInstanceOf[`di:Diagram`]
  @scala.inline
  def `di:DiagramElement`: `di:DiagramElement` = "di:DiagramElement".asInstanceOf[`di:DiagramElement`]
  @scala.inline
  def `di:Edge`: `di:Edge` = "di:Edge".asInstanceOf[`di:Edge`]
  @scala.inline
  def `di:Extension`: `di:Extension` = "di:Extension".asInstanceOf[`di:Extension`]
  @scala.inline
  def `di:Label`: `di:Label` = "di:Label".asInstanceOf[`di:Label`]
  @scala.inline
  def `di:LabeledEdge`: `di:LabeledEdge` = "di:LabeledEdge".asInstanceOf[`di:LabeledEdge`]
  @scala.inline
  def `di:LabeledShape`: `di:LabeledShape` = "di:LabeledShape".asInstanceOf[`di:LabeledShape`]
  @scala.inline
  def `di:Node`: `di:Node` = "di:Node".asInstanceOf[`di:Node`]
  @scala.inline
  def `di:Plane`: `di:Plane` = "di:Plane".asInstanceOf[`di:Plane`]
  @scala.inline
  def `di:Shape`: `di:Shape` = "di:Shape".asInstanceOf[`di:Shape`]
  @scala.inline
  def `di:Style`: `di:Style` = "di:Style".asInstanceOf[`di:Style`]
}

