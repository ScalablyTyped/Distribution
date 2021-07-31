package typings.bpmnModdle

import typings.bpmnModdle.mod.AdHocOrdering
import typings.bpmnModdle.mod.AssociationDirection
import typings.bpmnModdle.mod.ChoreographyLoopType
import typings.bpmnModdle.mod.ElementType
import typings.bpmnModdle.mod.EventBasedGatewayType
import typings.bpmnModdle.mod.GatewayDirection
import typings.bpmnModdle.mod.ItemKind
import typings.bpmnModdle.mod.MultiInstanceBehaviour
import typings.bpmnModdle.mod.ProcessType
import typings.bpmnModdle.mod.RelationshipDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bpmnModdleStrings {
  
  @js.native
  sealed trait All
    extends StObject
       with MultiInstanceBehaviour
  @scala.inline
  def All: All = "All".asInstanceOf[All]
  
  @js.native
  sealed trait Backward
    extends StObject
       with RelationshipDirection
  @scala.inline
  def Backward: Backward = "Backward".asInstanceOf[Backward]
  
  @js.native
  sealed trait Both
    extends StObject
       with AssociationDirection
       with RelationshipDirection
  @scala.inline
  def Both: Both = "Both".asInstanceOf[Both]
  
  @js.native
  sealed trait Complex
    extends StObject
       with MultiInstanceBehaviour
  @scala.inline
  def Complex: Complex = "Complex".asInstanceOf[Complex]
  
  @js.native
  sealed trait Converging
    extends StObject
       with GatewayDirection
  @scala.inline
  def Converging: Converging = "Converging".asInstanceOf[Converging]
  
  @js.native
  sealed trait Diverging
    extends StObject
       with GatewayDirection
  @scala.inline
  def Diverging: Diverging = "Diverging".asInstanceOf[Diverging]
  
  @js.native
  sealed trait Exclusive
    extends StObject
       with EventBasedGatewayType
  @scala.inline
  def Exclusive: Exclusive = "Exclusive".asInstanceOf[Exclusive]
  
  @js.native
  sealed trait Forward
    extends StObject
       with RelationshipDirection
  @scala.inline
  def Forward: Forward = "Forward".asInstanceOf[Forward]
  
  @js.native
  sealed trait Information
    extends StObject
       with ItemKind
  @scala.inline
  def Information: Information = "Information".asInstanceOf[Information]
  
  @js.native
  sealed trait Mixed
    extends StObject
       with GatewayDirection
  @scala.inline
  def Mixed: Mixed = "Mixed".asInstanceOf[Mixed]
  
  @js.native
  sealed trait MultiInstanceParallel
    extends StObject
       with ChoreographyLoopType
  @scala.inline
  def MultiInstanceParallel: MultiInstanceParallel = "MultiInstanceParallel".asInstanceOf[MultiInstanceParallel]
  
  @js.native
  sealed trait MultiInstanceSequential
    extends StObject
       with ChoreographyLoopType
  @scala.inline
  def MultiInstanceSequential: MultiInstanceSequential = "MultiInstanceSequential".asInstanceOf[MultiInstanceSequential]
  
  @js.native
  sealed trait None
    extends StObject
       with AssociationDirection
       with ChoreographyLoopType
       with MultiInstanceBehaviour
       with ProcessType
       with RelationshipDirection
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait One
    extends StObject
       with AssociationDirection
       with MultiInstanceBehaviour
  @scala.inline
  def One: One = "One".asInstanceOf[One]
  
  @js.native
  sealed trait Parallel
    extends StObject
       with AdHocOrdering
       with EventBasedGatewayType
  @scala.inline
  def Parallel: Parallel = "Parallel".asInstanceOf[Parallel]
  
  @js.native
  sealed trait Physical
    extends StObject
       with ItemKind
  @scala.inline
  def Physical: Physical = "Physical".asInstanceOf[Physical]
  
  @js.native
  sealed trait Private
    extends StObject
       with ProcessType
  @scala.inline
  def Private: Private = "Private".asInstanceOf[Private]
  
  @js.native
  sealed trait Public
    extends StObject
       with ProcessType
  @scala.inline
  def Public: Public = "Public".asInstanceOf[Public]
  
  @js.native
  sealed trait Sequential
    extends StObject
       with AdHocOrdering
  @scala.inline
  def Sequential: Sequential = "Sequential".asInstanceOf[Sequential]
  
  @js.native
  sealed trait Standard
    extends StObject
       with ChoreographyLoopType
  @scala.inline
  def Standard: Standard = "Standard".asInstanceOf[Standard]
  
  @js.native
  sealed trait Unspecified
    extends StObject
       with GatewayDirection
  @scala.inline
  def Unspecified: Unspecified = "Unspecified".asInstanceOf[Unspecified]
  
  @js.native
  sealed trait biocColonColoredEdge
    extends StObject
       with ElementType
  @scala.inline
  def biocColonColoredEdge: biocColonColoredEdge = "bioc:ColoredEdge".asInstanceOf[biocColonColoredEdge]
  
  @js.native
  sealed trait biocColonColoredShape
    extends StObject
       with ElementType
  @scala.inline
  def biocColonColoredShape: biocColonColoredShape = "bioc:ColoredShape".asInstanceOf[biocColonColoredShape]
  
  @js.native
  sealed trait bpmnColonActivity
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonActivity: bpmnColonActivity = "bpmn:Activity".asInstanceOf[bpmnColonActivity]
  
  @js.native
  sealed trait bpmnColonAdHocSubProcess
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonAdHocSubProcess: bpmnColonAdHocSubProcess = "bpmn:AdHocSubProcess".asInstanceOf[bpmnColonAdHocSubProcess]
  
  @js.native
  sealed trait bpmnColonArtifact
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonArtifact: bpmnColonArtifact = "bpmn:Artifact".asInstanceOf[bpmnColonArtifact]
  
  @js.native
  sealed trait bpmnColonAssignment
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonAssignment: bpmnColonAssignment = "bpmn:Assignment".asInstanceOf[bpmnColonAssignment]
  
  @js.native
  sealed trait bpmnColonAssociation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonAssociation: bpmnColonAssociation = "bpmn:Association".asInstanceOf[bpmnColonAssociation]
  
  @js.native
  sealed trait bpmnColonAuditing
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonAuditing: bpmnColonAuditing = "bpmn:Auditing".asInstanceOf[bpmnColonAuditing]
  
  @js.native
  sealed trait bpmnColonBaseElement
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonBaseElement: bpmnColonBaseElement = "bpmn:BaseElement".asInstanceOf[bpmnColonBaseElement]
  
  @js.native
  sealed trait bpmnColonBoundaryEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonBoundaryEvent: bpmnColonBoundaryEvent = "bpmn:BoundaryEvent".asInstanceOf[bpmnColonBoundaryEvent]
  
  @js.native
  sealed trait bpmnColonBusinessRuleTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonBusinessRuleTask: bpmnColonBusinessRuleTask = "bpmn:BusinessRuleTask".asInstanceOf[bpmnColonBusinessRuleTask]
  
  @js.native
  sealed trait bpmnColonCallActivity
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCallActivity: bpmnColonCallActivity = "bpmn:CallActivity".asInstanceOf[bpmnColonCallActivity]
  
  @js.native
  sealed trait bpmnColonCallChoreography
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCallChoreography: bpmnColonCallChoreography = "bpmn:CallChoreography".asInstanceOf[bpmnColonCallChoreography]
  
  @js.native
  sealed trait bpmnColonCallConversation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCallConversation: bpmnColonCallConversation = "bpmn:CallConversation".asInstanceOf[bpmnColonCallConversation]
  
  @js.native
  sealed trait bpmnColonCallableElement
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCallableElement: bpmnColonCallableElement = "bpmn:CallableElement".asInstanceOf[bpmnColonCallableElement]
  
  @js.native
  sealed trait bpmnColonCancelEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCancelEventDefinition: bpmnColonCancelEventDefinition = "bpmn:CancelEventDefinition".asInstanceOf[bpmnColonCancelEventDefinition]
  
  @js.native
  sealed trait bpmnColonCatchEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCatchEvent: bpmnColonCatchEvent = "bpmn:CatchEvent".asInstanceOf[bpmnColonCatchEvent]
  
  @js.native
  sealed trait bpmnColonCategory
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCategory: bpmnColonCategory = "bpmn:Category".asInstanceOf[bpmnColonCategory]
  
  @js.native
  sealed trait bpmnColonCategoryValue
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCategoryValue: bpmnColonCategoryValue = "bpmn:CategoryValue".asInstanceOf[bpmnColonCategoryValue]
  
  @js.native
  sealed trait bpmnColonChoreography
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonChoreography: bpmnColonChoreography = "bpmn:Choreography".asInstanceOf[bpmnColonChoreography]
  
  @js.native
  sealed trait bpmnColonChoreographyActivity
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonChoreographyActivity: bpmnColonChoreographyActivity = "bpmn:ChoreographyActivity".asInstanceOf[bpmnColonChoreographyActivity]
  
  @js.native
  sealed trait bpmnColonChoreographyTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonChoreographyTask: bpmnColonChoreographyTask = "bpmn:ChoreographyTask".asInstanceOf[bpmnColonChoreographyTask]
  
  @js.native
  sealed trait bpmnColonCollaboration
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCollaboration: bpmnColonCollaboration = "bpmn:Collaboration".asInstanceOf[bpmnColonCollaboration]
  
  @js.native
  sealed trait bpmnColonCompensateEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCompensateEventDefinition: bpmnColonCompensateEventDefinition = "bpmn:CompensateEventDefinition".asInstanceOf[bpmnColonCompensateEventDefinition]
  
  @js.native
  sealed trait bpmnColonComplexBehaviorDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonComplexBehaviorDefinition: bpmnColonComplexBehaviorDefinition = "bpmn:ComplexBehaviorDefinition".asInstanceOf[bpmnColonComplexBehaviorDefinition]
  
  @js.native
  sealed trait bpmnColonComplexGateway
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonComplexGateway: bpmnColonComplexGateway = "bpmn:ComplexGateway".asInstanceOf[bpmnColonComplexGateway]
  
  @js.native
  sealed trait bpmnColonConditionalEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonConditionalEventDefinition: bpmnColonConditionalEventDefinition = "bpmn:ConditionalEventDefinition".asInstanceOf[bpmnColonConditionalEventDefinition]
  
  @js.native
  sealed trait bpmnColonConversation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonConversation: bpmnColonConversation = "bpmn:Conversation".asInstanceOf[bpmnColonConversation]
  
  @js.native
  sealed trait bpmnColonConversationAssociation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonConversationAssociation: bpmnColonConversationAssociation = "bpmn:ConversationAssociation".asInstanceOf[bpmnColonConversationAssociation]
  
  @js.native
  sealed trait bpmnColonConversationLink
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonConversationLink: bpmnColonConversationLink = "bpmn:ConversationLink".asInstanceOf[bpmnColonConversationLink]
  
  @js.native
  sealed trait bpmnColonConversationNode
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonConversationNode: bpmnColonConversationNode = "bpmn:ConversationNode".asInstanceOf[bpmnColonConversationNode]
  
  @js.native
  sealed trait bpmnColonCorrelationKey
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCorrelationKey: bpmnColonCorrelationKey = "bpmn:CorrelationKey".asInstanceOf[bpmnColonCorrelationKey]
  
  @js.native
  sealed trait bpmnColonCorrelationProperty
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCorrelationProperty: bpmnColonCorrelationProperty = "bpmn:CorrelationProperty".asInstanceOf[bpmnColonCorrelationProperty]
  
  @js.native
  sealed trait bpmnColonCorrelationPropertyBinding
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCorrelationPropertyBinding: bpmnColonCorrelationPropertyBinding = "bpmn:CorrelationPropertyBinding".asInstanceOf[bpmnColonCorrelationPropertyBinding]
  
  @js.native
  sealed trait bpmnColonCorrelationPropertyRetrievalExpression
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCorrelationPropertyRetrievalExpression: bpmnColonCorrelationPropertyRetrievalExpression = "bpmn:CorrelationPropertyRetrievalExpression".asInstanceOf[bpmnColonCorrelationPropertyRetrievalExpression]
  
  @js.native
  sealed trait bpmnColonCorrelationSubscription
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonCorrelationSubscription: bpmnColonCorrelationSubscription = "bpmn:CorrelationSubscription".asInstanceOf[bpmnColonCorrelationSubscription]
  
  @js.native
  sealed trait bpmnColonDataAssociation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataAssociation: bpmnColonDataAssociation = "bpmn:DataAssociation".asInstanceOf[bpmnColonDataAssociation]
  
  @js.native
  sealed trait bpmnColonDataInput
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataInput: bpmnColonDataInput = "bpmn:DataInput".asInstanceOf[bpmnColonDataInput]
  
  @js.native
  sealed trait bpmnColonDataInputAssociation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataInputAssociation: bpmnColonDataInputAssociation = "bpmn:DataInputAssociation".asInstanceOf[bpmnColonDataInputAssociation]
  
  @js.native
  sealed trait bpmnColonDataObject
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataObject: bpmnColonDataObject = "bpmn:DataObject".asInstanceOf[bpmnColonDataObject]
  
  @js.native
  sealed trait bpmnColonDataObjectReference
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataObjectReference: bpmnColonDataObjectReference = "bpmn:DataObjectReference".asInstanceOf[bpmnColonDataObjectReference]
  
  @js.native
  sealed trait bpmnColonDataOutput
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataOutput: bpmnColonDataOutput = "bpmn:DataOutput".asInstanceOf[bpmnColonDataOutput]
  
  @js.native
  sealed trait bpmnColonDataOutputAssociation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataOutputAssociation: bpmnColonDataOutputAssociation = "bpmn:DataOutputAssociation".asInstanceOf[bpmnColonDataOutputAssociation]
  
  @js.native
  sealed trait bpmnColonDataState
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataState: bpmnColonDataState = "bpmn:DataState".asInstanceOf[bpmnColonDataState]
  
  @js.native
  sealed trait bpmnColonDataStore
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataStore: bpmnColonDataStore = "bpmn:DataStore".asInstanceOf[bpmnColonDataStore]
  
  @js.native
  sealed trait bpmnColonDataStoreReference
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDataStoreReference: bpmnColonDataStoreReference = "bpmn:DataStoreReference".asInstanceOf[bpmnColonDataStoreReference]
  
  @js.native
  sealed trait bpmnColonDefinitions
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDefinitions: bpmnColonDefinitions = "bpmn:Definitions".asInstanceOf[bpmnColonDefinitions]
  
  @js.native
  sealed trait bpmnColonDocumentation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonDocumentation: bpmnColonDocumentation = "bpmn:Documentation".asInstanceOf[bpmnColonDocumentation]
  
  @js.native
  sealed trait bpmnColonEndEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonEndEvent: bpmnColonEndEvent = "bpmn:EndEvent".asInstanceOf[bpmnColonEndEvent]
  
  @js.native
  sealed trait bpmnColonEndPoint
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonEndPoint: bpmnColonEndPoint = "bpmn:EndPoint".asInstanceOf[bpmnColonEndPoint]
  
  @js.native
  sealed trait bpmnColonError
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonError: bpmnColonError = "bpmn:Error".asInstanceOf[bpmnColonError]
  
  @js.native
  sealed trait bpmnColonErrorEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonErrorEventDefinition: bpmnColonErrorEventDefinition = "bpmn:ErrorEventDefinition".asInstanceOf[bpmnColonErrorEventDefinition]
  
  @js.native
  sealed trait bpmnColonEscalation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonEscalation: bpmnColonEscalation = "bpmn:Escalation".asInstanceOf[bpmnColonEscalation]
  
  @js.native
  sealed trait bpmnColonEscalationEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonEscalationEventDefinition: bpmnColonEscalationEventDefinition = "bpmn:EscalationEventDefinition".asInstanceOf[bpmnColonEscalationEventDefinition]
  
  @js.native
  sealed trait bpmnColonEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonEvent: bpmnColonEvent = "bpmn:Event".asInstanceOf[bpmnColonEvent]
  
  @js.native
  sealed trait bpmnColonEventBasedGateway
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonEventBasedGateway: bpmnColonEventBasedGateway = "bpmn:EventBasedGateway".asInstanceOf[bpmnColonEventBasedGateway]
  
  @js.native
  sealed trait bpmnColonEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonEventDefinition: bpmnColonEventDefinition = "bpmn:EventDefinition".asInstanceOf[bpmnColonEventDefinition]
  
  @js.native
  sealed trait bpmnColonExclusiveGateway
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonExclusiveGateway: bpmnColonExclusiveGateway = "bpmn:ExclusiveGateway".asInstanceOf[bpmnColonExclusiveGateway]
  
  @js.native
  sealed trait bpmnColonExpression
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonExpression: bpmnColonExpression = "bpmn:Expression".asInstanceOf[bpmnColonExpression]
  
  @js.native
  sealed trait bpmnColonExtension
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonExtension: bpmnColonExtension = "bpmn:Extension".asInstanceOf[bpmnColonExtension]
  
  @js.native
  sealed trait bpmnColonExtensionAttributeDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonExtensionAttributeDefinition: bpmnColonExtensionAttributeDefinition = "bpmn:ExtensionAttributeDefinition".asInstanceOf[bpmnColonExtensionAttributeDefinition]
  
  @js.native
  sealed trait bpmnColonExtensionDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonExtensionDefinition: bpmnColonExtensionDefinition = "bpmn:ExtensionDefinition".asInstanceOf[bpmnColonExtensionDefinition]
  
  @js.native
  sealed trait bpmnColonExtensionElements
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonExtensionElements: bpmnColonExtensionElements = "bpmn:ExtensionElements".asInstanceOf[bpmnColonExtensionElements]
  
  @js.native
  sealed trait bpmnColonFlowElement
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonFlowElement: bpmnColonFlowElement = "bpmn:FlowElement".asInstanceOf[bpmnColonFlowElement]
  
  @js.native
  sealed trait bpmnColonFlowElementsContainer
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonFlowElementsContainer: bpmnColonFlowElementsContainer = "bpmn:FlowElementsContainer".asInstanceOf[bpmnColonFlowElementsContainer]
  
  @js.native
  sealed trait bpmnColonFlowNode
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonFlowNode: bpmnColonFlowNode = "bpmn:FlowNode".asInstanceOf[bpmnColonFlowNode]
  
  @js.native
  sealed trait bpmnColonFormalExpression
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonFormalExpression: bpmnColonFormalExpression = "bpmn:FormalExpression".asInstanceOf[bpmnColonFormalExpression]
  
  @js.native
  sealed trait bpmnColonGateway
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGateway: bpmnColonGateway = "bpmn:Gateway".asInstanceOf[bpmnColonGateway]
  
  @js.native
  sealed trait bpmnColonGlobalBusinessRuleTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGlobalBusinessRuleTask: bpmnColonGlobalBusinessRuleTask = "bpmn:GlobalBusinessRuleTask".asInstanceOf[bpmnColonGlobalBusinessRuleTask]
  
  @js.native
  sealed trait bpmnColonGlobalChoreographyTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGlobalChoreographyTask: bpmnColonGlobalChoreographyTask = "bpmn:GlobalChoreographyTask".asInstanceOf[bpmnColonGlobalChoreographyTask]
  
  @js.native
  sealed trait bpmnColonGlobalConversation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGlobalConversation: bpmnColonGlobalConversation = "bpmn:GlobalConversation".asInstanceOf[bpmnColonGlobalConversation]
  
  @js.native
  sealed trait bpmnColonGlobalManualTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGlobalManualTask: bpmnColonGlobalManualTask = "bpmn:GlobalManualTask".asInstanceOf[bpmnColonGlobalManualTask]
  
  @js.native
  sealed trait bpmnColonGlobalScriptTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGlobalScriptTask: bpmnColonGlobalScriptTask = "bpmn:GlobalScriptTask".asInstanceOf[bpmnColonGlobalScriptTask]
  
  @js.native
  sealed trait bpmnColonGlobalTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGlobalTask: bpmnColonGlobalTask = "bpmn:GlobalTask".asInstanceOf[bpmnColonGlobalTask]
  
  @js.native
  sealed trait bpmnColonGlobalUserTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGlobalUserTask: bpmnColonGlobalUserTask = "bpmn:GlobalUserTask".asInstanceOf[bpmnColonGlobalUserTask]
  
  @js.native
  sealed trait bpmnColonGroup
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonGroup: bpmnColonGroup = "bpmn:Group".asInstanceOf[bpmnColonGroup]
  
  @js.native
  sealed trait bpmnColonHumanPerformer
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonHumanPerformer: bpmnColonHumanPerformer = "bpmn:HumanPerformer".asInstanceOf[bpmnColonHumanPerformer]
  
  @js.native
  sealed trait bpmnColonImplicitThrowEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonImplicitThrowEvent: bpmnColonImplicitThrowEvent = "bpmn:ImplicitThrowEvent".asInstanceOf[bpmnColonImplicitThrowEvent]
  
  @js.native
  sealed trait bpmnColonImport
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonImport: bpmnColonImport = "bpmn:Import".asInstanceOf[bpmnColonImport]
  
  @js.native
  sealed trait bpmnColonInclusiveGateway
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonInclusiveGateway: bpmnColonInclusiveGateway = "bpmn:InclusiveGateway".asInstanceOf[bpmnColonInclusiveGateway]
  
  @js.native
  sealed trait bpmnColonInputOutputBinding
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonInputOutputBinding: bpmnColonInputOutputBinding = "bpmn:InputOutputBinding".asInstanceOf[bpmnColonInputOutputBinding]
  
  @js.native
  sealed trait bpmnColonInputOutputSpecification
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonInputOutputSpecification: bpmnColonInputOutputSpecification = "bpmn:InputOutputSpecification".asInstanceOf[bpmnColonInputOutputSpecification]
  
  @js.native
  sealed trait bpmnColonInputSet
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonInputSet: bpmnColonInputSet = "bpmn:InputSet".asInstanceOf[bpmnColonInputSet]
  
  @js.native
  sealed trait bpmnColonInteractionNode
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonInteractionNode: bpmnColonInteractionNode = "bpmn:InteractionNode".asInstanceOf[bpmnColonInteractionNode]
  
  @js.native
  sealed trait bpmnColonInterface
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonInterface: bpmnColonInterface = "bpmn:Interface".asInstanceOf[bpmnColonInterface]
  
  @js.native
  sealed trait bpmnColonIntermediateCatchEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonIntermediateCatchEvent: bpmnColonIntermediateCatchEvent = "bpmn:IntermediateCatchEvent".asInstanceOf[bpmnColonIntermediateCatchEvent]
  
  @js.native
  sealed trait bpmnColonIntermediateThrowEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonIntermediateThrowEvent: bpmnColonIntermediateThrowEvent = "bpmn:IntermediateThrowEvent".asInstanceOf[bpmnColonIntermediateThrowEvent]
  
  @js.native
  sealed trait bpmnColonItemAwareElement
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonItemAwareElement: bpmnColonItemAwareElement = "bpmn:ItemAwareElement".asInstanceOf[bpmnColonItemAwareElement]
  
  @js.native
  sealed trait bpmnColonItemDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonItemDefinition: bpmnColonItemDefinition = "bpmn:ItemDefinition".asInstanceOf[bpmnColonItemDefinition]
  
  @js.native
  sealed trait bpmnColonLane
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonLane: bpmnColonLane = "bpmn:Lane".asInstanceOf[bpmnColonLane]
  
  @js.native
  sealed trait bpmnColonLaneSet
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonLaneSet: bpmnColonLaneSet = "bpmn:LaneSet".asInstanceOf[bpmnColonLaneSet]
  
  @js.native
  sealed trait bpmnColonLinkEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonLinkEventDefinition: bpmnColonLinkEventDefinition = "bpmn:LinkEventDefinition".asInstanceOf[bpmnColonLinkEventDefinition]
  
  @js.native
  sealed trait bpmnColonLoopCharacteristics
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonLoopCharacteristics: bpmnColonLoopCharacteristics = "bpmn:LoopCharacteristics".asInstanceOf[bpmnColonLoopCharacteristics]
  
  @js.native
  sealed trait bpmnColonManualTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonManualTask: bpmnColonManualTask = "bpmn:ManualTask".asInstanceOf[bpmnColonManualTask]
  
  @js.native
  sealed trait bpmnColonMessage
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonMessage: bpmnColonMessage = "bpmn:Message".asInstanceOf[bpmnColonMessage]
  
  @js.native
  sealed trait bpmnColonMessageEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonMessageEventDefinition: bpmnColonMessageEventDefinition = "bpmn:MessageEventDefinition".asInstanceOf[bpmnColonMessageEventDefinition]
  
  @js.native
  sealed trait bpmnColonMessageFlow
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonMessageFlow: bpmnColonMessageFlow = "bpmn:MessageFlow".asInstanceOf[bpmnColonMessageFlow]
  
  @js.native
  sealed trait bpmnColonMessageFlowAssociation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonMessageFlowAssociation: bpmnColonMessageFlowAssociation = "bpmn:MessageFlowAssociation".asInstanceOf[bpmnColonMessageFlowAssociation]
  
  @js.native
  sealed trait bpmnColonMonitoring
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonMonitoring: bpmnColonMonitoring = "bpmn:Monitoring".asInstanceOf[bpmnColonMonitoring]
  
  @js.native
  sealed trait bpmnColonMultiInstanceLoopCharacteristics
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonMultiInstanceLoopCharacteristics: bpmnColonMultiInstanceLoopCharacteristics = "bpmn:MultiInstanceLoopCharacteristics".asInstanceOf[bpmnColonMultiInstanceLoopCharacteristics]
  
  @js.native
  sealed trait bpmnColonOperation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonOperation: bpmnColonOperation = "bpmn:Operation".asInstanceOf[bpmnColonOperation]
  
  @js.native
  sealed trait bpmnColonOutputSet
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonOutputSet: bpmnColonOutputSet = "bpmn:OutputSet".asInstanceOf[bpmnColonOutputSet]
  
  @js.native
  sealed trait bpmnColonParallelGateway
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonParallelGateway: bpmnColonParallelGateway = "bpmn:ParallelGateway".asInstanceOf[bpmnColonParallelGateway]
  
  @js.native
  sealed trait bpmnColonParticipant
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonParticipant: bpmnColonParticipant = "bpmn:Participant".asInstanceOf[bpmnColonParticipant]
  
  @js.native
  sealed trait bpmnColonParticipantAssociation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonParticipantAssociation: bpmnColonParticipantAssociation = "bpmn:ParticipantAssociation".asInstanceOf[bpmnColonParticipantAssociation]
  
  @js.native
  sealed trait bpmnColonParticipantMultiplicity
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonParticipantMultiplicity: bpmnColonParticipantMultiplicity = "bpmn:ParticipantMultiplicity".asInstanceOf[bpmnColonParticipantMultiplicity]
  
  @js.native
  sealed trait bpmnColonPartnerEntity
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonPartnerEntity: bpmnColonPartnerEntity = "bpmn:PartnerEntity".asInstanceOf[bpmnColonPartnerEntity]
  
  @js.native
  sealed trait bpmnColonPartnerRole
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonPartnerRole: bpmnColonPartnerRole = "bpmn:PartnerRole".asInstanceOf[bpmnColonPartnerRole]
  
  @js.native
  sealed trait bpmnColonPerformer
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonPerformer: bpmnColonPerformer = "bpmn:Performer".asInstanceOf[bpmnColonPerformer]
  
  @js.native
  sealed trait bpmnColonPotentialOwner
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonPotentialOwner: bpmnColonPotentialOwner = "bpmn:PotentialOwner".asInstanceOf[bpmnColonPotentialOwner]
  
  @js.native
  sealed trait bpmnColonProcess
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonProcess: bpmnColonProcess = "bpmn:Process".asInstanceOf[bpmnColonProcess]
  
  @js.native
  sealed trait bpmnColonProperty
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonProperty: bpmnColonProperty = "bpmn:Property".asInstanceOf[bpmnColonProperty]
  
  @js.native
  sealed trait bpmnColonReceiveTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonReceiveTask: bpmnColonReceiveTask = "bpmn:ReceiveTask".asInstanceOf[bpmnColonReceiveTask]
  
  @js.native
  sealed trait bpmnColonRelationship
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonRelationship: bpmnColonRelationship = "bpmn:Relationship".asInstanceOf[bpmnColonRelationship]
  
  @js.native
  sealed trait bpmnColonRendering
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonRendering: bpmnColonRendering = "bpmn:Rendering".asInstanceOf[bpmnColonRendering]
  
  @js.native
  sealed trait bpmnColonResource
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonResource: bpmnColonResource = "bpmn:Resource".asInstanceOf[bpmnColonResource]
  
  @js.native
  sealed trait bpmnColonResourceAssignmentExpression
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonResourceAssignmentExpression: bpmnColonResourceAssignmentExpression = "bpmn:ResourceAssignmentExpression".asInstanceOf[bpmnColonResourceAssignmentExpression]
  
  @js.native
  sealed trait bpmnColonResourceParameter
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonResourceParameter: bpmnColonResourceParameter = "bpmn:ResourceParameter".asInstanceOf[bpmnColonResourceParameter]
  
  @js.native
  sealed trait bpmnColonResourceParameterBinding
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonResourceParameterBinding: bpmnColonResourceParameterBinding = "bpmn:ResourceParameterBinding".asInstanceOf[bpmnColonResourceParameterBinding]
  
  @js.native
  sealed trait bpmnColonResourceRole
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonResourceRole: bpmnColonResourceRole = "bpmn:ResourceRole".asInstanceOf[bpmnColonResourceRole]
  
  @js.native
  sealed trait bpmnColonRootElement
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonRootElement: bpmnColonRootElement = "bpmn:RootElement".asInstanceOf[bpmnColonRootElement]
  
  @js.native
  sealed trait bpmnColonScriptTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonScriptTask: bpmnColonScriptTask = "bpmn:ScriptTask".asInstanceOf[bpmnColonScriptTask]
  
  @js.native
  sealed trait bpmnColonSendTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonSendTask: bpmnColonSendTask = "bpmn:SendTask".asInstanceOf[bpmnColonSendTask]
  
  @js.native
  sealed trait bpmnColonSequenceFlow
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonSequenceFlow: bpmnColonSequenceFlow = "bpmn:SequenceFlow".asInstanceOf[bpmnColonSequenceFlow]
  
  @js.native
  sealed trait bpmnColonServiceTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonServiceTask: bpmnColonServiceTask = "bpmn:ServiceTask".asInstanceOf[bpmnColonServiceTask]
  
  @js.native
  sealed trait bpmnColonSignal
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonSignal: bpmnColonSignal = "bpmn:Signal".asInstanceOf[bpmnColonSignal]
  
  @js.native
  sealed trait bpmnColonSignalEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonSignalEventDefinition: bpmnColonSignalEventDefinition = "bpmn:SignalEventDefinition".asInstanceOf[bpmnColonSignalEventDefinition]
  
  @js.native
  sealed trait bpmnColonStandardLoopCharacteristics
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonStandardLoopCharacteristics: bpmnColonStandardLoopCharacteristics = "bpmn:StandardLoopCharacteristics".asInstanceOf[bpmnColonStandardLoopCharacteristics]
  
  @js.native
  sealed trait bpmnColonStartEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonStartEvent: bpmnColonStartEvent = "bpmn:StartEvent".asInstanceOf[bpmnColonStartEvent]
  
  @js.native
  sealed trait bpmnColonSubChoreography
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonSubChoreography: bpmnColonSubChoreography = "bpmn:SubChoreography".asInstanceOf[bpmnColonSubChoreography]
  
  @js.native
  sealed trait bpmnColonSubConversation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonSubConversation: bpmnColonSubConversation = "bpmn:SubConversation".asInstanceOf[bpmnColonSubConversation]
  
  @js.native
  sealed trait bpmnColonSubProcess
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonSubProcess: bpmnColonSubProcess = "bpmn:SubProcess".asInstanceOf[bpmnColonSubProcess]
  
  @js.native
  sealed trait bpmnColonTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonTask: bpmnColonTask = "bpmn:Task".asInstanceOf[bpmnColonTask]
  
  @js.native
  sealed trait bpmnColonTerminateEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonTerminateEventDefinition: bpmnColonTerminateEventDefinition = "bpmn:TerminateEventDefinition".asInstanceOf[bpmnColonTerminateEventDefinition]
  
  @js.native
  sealed trait bpmnColonTextAnnotation
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonTextAnnotation: bpmnColonTextAnnotation = "bpmn:TextAnnotation".asInstanceOf[bpmnColonTextAnnotation]
  
  @js.native
  sealed trait bpmnColonThrowEvent
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonThrowEvent: bpmnColonThrowEvent = "bpmn:ThrowEvent".asInstanceOf[bpmnColonThrowEvent]
  
  @js.native
  sealed trait bpmnColonTimerEventDefinition
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonTimerEventDefinition: bpmnColonTimerEventDefinition = "bpmn:TimerEventDefinition".asInstanceOf[bpmnColonTimerEventDefinition]
  
  @js.native
  sealed trait bpmnColonTransaction
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonTransaction: bpmnColonTransaction = "bpmn:Transaction".asInstanceOf[bpmnColonTransaction]
  
  @js.native
  sealed trait bpmnColonUserTask
    extends StObject
       with ElementType
  @scala.inline
  def bpmnColonUserTask: bpmnColonUserTask = "bpmn:UserTask".asInstanceOf[bpmnColonUserTask]
  
  @js.native
  sealed trait bpmndiColonBPMNDiagram
    extends StObject
       with ElementType
  @scala.inline
  def bpmndiColonBPMNDiagram: bpmndiColonBPMNDiagram = "bpmndi:BPMNDiagram".asInstanceOf[bpmndiColonBPMNDiagram]
  
  @js.native
  sealed trait bpmndiColonBPMNEdge
    extends StObject
       with ElementType
  @scala.inline
  def bpmndiColonBPMNEdge: bpmndiColonBPMNEdge = "bpmndi:BPMNEdge".asInstanceOf[bpmndiColonBPMNEdge]
  
  @js.native
  sealed trait bpmndiColonBPMNLabel
    extends StObject
       with ElementType
  @scala.inline
  def bpmndiColonBPMNLabel: bpmndiColonBPMNLabel = "bpmndi:BPMNLabel".asInstanceOf[bpmndiColonBPMNLabel]
  
  @js.native
  sealed trait bpmndiColonBPMNLabelStyle
    extends StObject
       with ElementType
  @scala.inline
  def bpmndiColonBPMNLabelStyle: bpmndiColonBPMNLabelStyle = "bpmndi:BPMNLabelStyle".asInstanceOf[bpmndiColonBPMNLabelStyle]
  
  @js.native
  sealed trait bpmndiColonBPMNPlane
    extends StObject
       with ElementType
  @scala.inline
  def bpmndiColonBPMNPlane: bpmndiColonBPMNPlane = "bpmndi:BPMNPlane".asInstanceOf[bpmndiColonBPMNPlane]
  
  @js.native
  sealed trait bpmndiColonBPMNShape
    extends StObject
       with ElementType
  @scala.inline
  def bpmndiColonBPMNShape: bpmndiColonBPMNShape = "bpmndi:BPMNShape".asInstanceOf[bpmndiColonBPMNShape]
  
  @js.native
  sealed trait dcColonBounds
    extends StObject
       with ElementType
  @scala.inline
  def dcColonBounds: dcColonBounds = "dc:Bounds".asInstanceOf[dcColonBounds]
  
  @js.native
  sealed trait dcColonFont
    extends StObject
       with ElementType
  @scala.inline
  def dcColonFont: dcColonFont = "dc:Font".asInstanceOf[dcColonFont]
  
  @js.native
  sealed trait dcColonPoint
    extends StObject
       with ElementType
  @scala.inline
  def dcColonPoint: dcColonPoint = "dc:Point".asInstanceOf[dcColonPoint]
  
  @js.native
  sealed trait dcColonReal
    extends StObject
       with ElementType
  @scala.inline
  def dcColonReal: dcColonReal = "dc:Real".asInstanceOf[dcColonReal]
  
  @js.native
  sealed trait dcColonboolean
    extends StObject
       with ElementType
  @scala.inline
  def dcColonboolean: dcColonboolean = "dc:boolean".asInstanceOf[dcColonboolean]
  
  @js.native
  sealed trait dcColonnumber
    extends StObject
       with ElementType
  @scala.inline
  def dcColonnumber: dcColonnumber = "dc:number".asInstanceOf[dcColonnumber]
  
  @js.native
  sealed trait dcColonstring
    extends StObject
       with ElementType
  @scala.inline
  def dcColonstring: dcColonstring = "dc:string".asInstanceOf[dcColonstring]
  
  @js.native
  sealed trait diColonDiagram
    extends StObject
       with ElementType
  @scala.inline
  def diColonDiagram: diColonDiagram = "di:Diagram".asInstanceOf[diColonDiagram]
  
  @js.native
  sealed trait diColonDiagramElement
    extends StObject
       with ElementType
  @scala.inline
  def diColonDiagramElement: diColonDiagramElement = "di:DiagramElement".asInstanceOf[diColonDiagramElement]
  
  @js.native
  sealed trait diColonEdge
    extends StObject
       with ElementType
  @scala.inline
  def diColonEdge: diColonEdge = "di:Edge".asInstanceOf[diColonEdge]
  
  @js.native
  sealed trait diColonExtension
    extends StObject
       with ElementType
  @scala.inline
  def diColonExtension: diColonExtension = "di:Extension".asInstanceOf[diColonExtension]
  
  @js.native
  sealed trait diColonLabel
    extends StObject
       with ElementType
  @scala.inline
  def diColonLabel: diColonLabel = "di:Label".asInstanceOf[diColonLabel]
  
  @js.native
  sealed trait diColonLabeledEdge
    extends StObject
       with ElementType
  @scala.inline
  def diColonLabeledEdge: diColonLabeledEdge = "di:LabeledEdge".asInstanceOf[diColonLabeledEdge]
  
  @js.native
  sealed trait diColonLabeledShape
    extends StObject
       with ElementType
  @scala.inline
  def diColonLabeledShape: diColonLabeledShape = "di:LabeledShape".asInstanceOf[diColonLabeledShape]
  
  @js.native
  sealed trait diColonNode
    extends StObject
       with ElementType
  @scala.inline
  def diColonNode: diColonNode = "di:Node".asInstanceOf[diColonNode]
  
  @js.native
  sealed trait diColonPlane
    extends StObject
       with ElementType
  @scala.inline
  def diColonPlane: diColonPlane = "di:Plane".asInstanceOf[diColonPlane]
  
  @js.native
  sealed trait diColonShape
    extends StObject
       with ElementType
  @scala.inline
  def diColonShape: diColonShape = "di:Shape".asInstanceOf[diColonShape]
  
  @js.native
  sealed trait diColonStyle
    extends StObject
       with ElementType
  @scala.inline
  def diColonStyle: diColonStyle = "di:Style".asInstanceOf[diColonStyle]
}
